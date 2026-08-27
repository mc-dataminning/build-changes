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

public class fbx implements AutoCloseable {
   private static final awo a = awo.a();
   private static final float b = 32.0F;
   private final ggu c;
   private final aiy d;
   private fcb e;
   private fcb f;
   private final List<eqd> g = Lists.newArrayList();
   private final fbv<fcb> h = new fbv<>(fcb[]::new, fcb[][]::new);
   private final fbv<fbx.a> i = new fbv<>(fbx.a[]::new, fbx.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<fby> k = Lists.newArrayList();

   public fbx(ggu $$0, aiy $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eqd> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = fcd.b.bake(this::a);
      this.f = fcd.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (eqd $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<eqd> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (eqd $$3x : $$0) {
            eqc $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != fcd.b) {
                  ((IntList)this.j.computeIfAbsent(awh.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (eqd $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (fby $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(eqc $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fbx.a b(int $$0) {
      eqc $$1 = null;

      for (eqd $$2 : this.g) {
         eqc $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fbx.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fbx.a($$1, fcd.b) : fbx.a.c;
   }

   public eqc a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private fcb c(int $$0) {
      for (eqd $$1 : this.g) {
         eqc $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fcb a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private fcb a(eqe $$0) {
      for (fby $$1 : this.k) {
         fcb $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      aiy $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      fbz $$5 = $$4 ? fbz.b($$3) : fbz.a($$3);
      fby $$6 = new fby($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      fcb $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fcb a(eqc $$0) {
      IntList $$1 = (IntList)this.j.get(awh.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public fcb a() {
      return this.f;
   }

   static record a(eqc a, eqc b) {
      static final fbx.a c = new fbx.a(fcd.b, fcd.b);

      eqc a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
