import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.List;
import java.util.Set;

public class evg implements AutoCloseable {
   private static final ase a = ase.a();
   private static final float b = 32.0F;
   private final fzh c;
   private final aey d;
   private evk e;
   private evk f;
   private final List<eju> g = Lists.newArrayList();
   private final eve<evk> h = new eve<>(evk[]::new, evk[][]::new);
   private final eve<evg.a> i = new eve<>(evg.a[]::new, evg.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<evh> k = Lists.newArrayList();

   public evg(fzh $$0, aey $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eju> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = evm.b.bake(this::a);
      this.f = evm.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (eju $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<eju> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (eju $$3x : $$0) {
            ejt $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != evm.b) {
                  ((IntList)this.j.computeIfAbsent(ary.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
               }
               break;
            }
         }
      });
      $$0.stream().filter($$3::contains).forEach(this.g::add);
   }

   @Override
   public void close() {
      this.b();
      this.c();
   }

   private void b() {
      for (eju $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (evh $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(ejt $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private evg.a b(int $$0) {
      ejt $$1 = null;

      for (eju $$2 : this.g) {
         ejt $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new evg.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new evg.a($$1, evm.b) : evg.a.c;
   }

   public ejt a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private evk c(int $$0) {
      for (eju $$1 : this.g) {
         ejt $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public evk a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private evk a(ejv $$0) {
      for (evh $$1 : this.k) {
         evk $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      aey $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      evi $$5 = $$4 ? evi.b($$3) : evi.a($$3);
      evh $$6 = new evh($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      evk $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public evk a(ejt $$0) {
      IntList $$1 = (IntList)this.j.get(ary.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public evk a() {
      return this.f;
   }

   static record a(ejt a, ejt b) {
      static final evg.a c = new evg.a(evm.b, evm.b);

      ejt a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
