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

public class euz implements AutoCloseable {
   private static final ash a = ash.a();
   private static final float b = 32.0F;
   private final fzb c;
   private final aez d;
   private evd e;
   private evd f;
   private final List<ejm> g = Lists.newArrayList();
   private final eux<evd> h = new eux<>(evd[]::new, evd[][]::new);
   private final eux<euz.a> i = new eux<>(euz.a[]::new, euz.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<eva> k = Lists.newArrayList();

   public euz(fzb $$0, aez $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<ejm> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = evf.b.bake(this::a);
      this.f = evf.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (ejm $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<ejm> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (ejm $$3x : $$0) {
            ejl $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != evf.b) {
                  ((IntList)this.j.computeIfAbsent(asb.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (ejm $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (eva $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(ejl $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private euz.a b(int $$0) {
      ejl $$1 = null;

      for (ejm $$2 : this.g) {
         ejl $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new euz.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new euz.a($$1, evf.b) : euz.a.c;
   }

   public ejl a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private evd c(int $$0) {
      for (ejm $$1 : this.g) {
         ejl $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public evd a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private evd a(ejn $$0) {
      for (eva $$1 : this.k) {
         evd $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      aez $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      evb $$5 = $$4 ? evb.b($$3) : evb.a($$3);
      eva $$6 = new eva($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      evd $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public evd a(ejl $$0) {
      IntList $$1 = (IntList)this.j.get(asb.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public evd a() {
      return this.f;
   }

   static record a(ejl a, ejl b) {
      static final euz.a c = new euz.a(evf.b, evf.b);

      ejl a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
