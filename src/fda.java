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

public class fda implements AutoCloseable {
   private static final awt a = awt.a();
   private static final float b = 32.0F;
   private final gia c;
   private final ajc d;
   private fde e;
   private fde f;
   private final List<erg> g = Lists.newArrayList();
   private final fcy<fde> h = new fcy<>(fde[]::new, fde[][]::new);
   private final fcy<fda.a> i = new fcy<>(fda.a[]::new, fda.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<fdb> k = Lists.newArrayList();

   public fda(gia $$0, ajc $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<erg> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = fdg.b.bake(this::a);
      this.f = fdg.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (erg $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<erg> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (erg $$3x : $$0) {
            erf $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != fdg.b) {
                  ((IntList)this.j.computeIfAbsent(awm.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (erg $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (fdb $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(erf $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fda.a b(int $$0) {
      erf $$1 = null;

      for (erg $$2 : this.g) {
         erf $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fda.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fda.a($$1, fdg.b) : fda.a.c;
   }

   public erf a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private fde c(int $$0) {
      for (erg $$1 : this.g) {
         erf $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fde a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private fde a(erh $$0) {
      for (fdb $$1 : this.k) {
         fde $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ajc $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      fdc $$5 = $$4 ? fdc.b($$3) : fdc.a($$3);
      fdb $$6 = new fdb($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      fde $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fde a(erf $$0) {
      IntList $$1 = (IntList)this.j.get(awm.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public fde a() {
      return this.f;
   }

   static record a(erf a, erf b) {
      static final fda.a c = new fda.a(fdg.b, fdg.b);

      erf a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
