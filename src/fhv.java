import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class fhv implements AutoCloseable {
   private static final ayg a = ayg.a();
   private static final float b = 32.0F;
   private final gmz c;
   private final akh d;
   private fhz e;
   private fhz f;
   private List<ewa.a> g = List.of();
   private List<ewa> h = List.of();
   private final fhs<fhz> i = new fhs<>(fhz[]::new, fhz[][]::new);
   private final fhs<fhv.a> j = new fhs<>(fhv.a[]::new, fhv.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fhw> l = Lists.newArrayList();

   public fhv(gmz $$0, akh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<ewa.a> $$0, Set<fhu> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fhu> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fib.b.bake(this::a);
      this.f = fib.a.bake(this::a);
   }

   private List<ewa> b(List<ewa.a> $$0, Set<fhu> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<ewa> $$3 = new ArrayList<>();

      for (ewa.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<ewa> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (ewa $$3x : $$3) {
            evz $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fib.b) {
                  ((IntList)this.k.computeIfAbsent(axz.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
               }
               break;
            }
         }
      });
      return $$3.stream().filter($$5::contains).toList();
   }

   @Override
   public void close() {
      this.d();
   }

   private void d() {
      for (fhw $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(evz $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fhv.a b(int $$0) {
      evz $$1 = null;

      for (ewa $$2 : this.h) {
         evz $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fhv.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fhv.a($$1, fib.b) : fhv.a.c;
   }

   public evz a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fhz c(int $$0) {
      for (ewa $$1 : this.h) {
         evz $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fhz a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fhz a(ewb $$0) {
      for (fhw $$1 : this.l) {
         fhz $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      akh $$3 = this.d.e("/" + this.l.size());
      boolean $$4 = $$0.c();
      fhx $$5 = $$4 ? fhx.b($$3) : fhx.a($$3);
      fhw $$6 = new fhw($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fhz $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fhz a(evz $$0) {
      IntList $$1 = (IntList)this.k.get(axz.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public akh a() {
      return this.d;
   }

   public fhz b() {
      return this.f;
   }

   static record a(evz a, evz b) {
      static final fhv.a c = new fhv.a(fib.b, fib.b);

      evz a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
