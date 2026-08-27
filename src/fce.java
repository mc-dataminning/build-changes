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

public class fce implements AutoCloseable {
   private static final awp a = awp.a();
   private static final float b = 32.0F;
   private final ghc c;
   private final aiy d;
   private fci e;
   private fci f;
   private final List<eqk> g = Lists.newArrayList();
   private final fcc<fci> h = new fcc<>(fci[]::new, fci[][]::new);
   private final fcc<fce.a> i = new fcc<>(fce.a[]::new, fce.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<fcf> k = Lists.newArrayList();

   public fce(ghc $$0, aiy $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eqk> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = fck.b.bake(this::a);
      this.f = fck.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (eqk $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<eqk> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (eqk $$3x : $$0) {
            eqj $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != fck.b) {
                  ((IntList)this.j.computeIfAbsent(awi.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (eqk $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (fcf $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(eqj $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fce.a b(int $$0) {
      eqj $$1 = null;

      for (eqk $$2 : this.g) {
         eqj $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fce.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fce.a($$1, fck.b) : fce.a.c;
   }

   public eqj a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private fci c(int $$0) {
      for (eqk $$1 : this.g) {
         eqj $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fci a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private fci a(eql $$0) {
      for (fcf $$1 : this.k) {
         fci $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      aiy $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      fcg $$5 = $$4 ? fcg.b($$3) : fcg.a($$3);
      fcf $$6 = new fcf($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      fci $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fci a(eqj $$0) {
      IntList $$1 = (IntList)this.j.get(awi.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public fci a() {
      return this.f;
   }

   static record a(eqj a, eqj b) {
      static final fce.a c = new fce.a(fck.b, fck.b);

      eqj a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
