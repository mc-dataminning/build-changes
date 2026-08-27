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

public class fhl implements AutoCloseable {
   private static final ayd a = ayd.a();
   private static final float b = 32.0F;
   private final gmp c;
   private final akf d;
   private fhp e;
   private fhp f;
   private List<evq.a> g = List.of();
   private List<evq> h = List.of();
   private final fhi<fhp> i = new fhi<>(fhp[]::new, fhp[][]::new);
   private final fhi<fhl.a> j = new fhi<>(fhl.a[]::new, fhl.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fhm> l = Lists.newArrayList();

   public fhl(gmp $$0, akf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<evq.a> $$0, Set<fhk> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fhk> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fhr.b.bake(this::a);
      this.f = fhr.a.bake(this::a);
   }

   private List<evq> b(List<evq.a> $$0, Set<fhk> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<evq> $$3 = new ArrayList<>();

      for (evq.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<evq> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (evq $$3x : $$3) {
            evp $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fhr.b) {
                  ((IntList)this.k.computeIfAbsent(axw.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fhm $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(evp $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fhl.a b(int $$0) {
      evp $$1 = null;

      for (evq $$2 : this.h) {
         evp $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fhl.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fhl.a($$1, fhr.b) : fhl.a.c;
   }

   public evp a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fhp c(int $$0) {
      for (evq $$1 : this.h) {
         evp $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fhp a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fhp a(evr $$0) {
      for (fhm $$1 : this.l) {
         fhp $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      akf $$3 = this.d.e("/" + this.l.size());
      boolean $$4 = $$0.c();
      fhn $$5 = $$4 ? fhn.b($$3) : fhn.a($$3);
      fhm $$6 = new fhm($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fhp $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fhp a(evp $$0) {
      IntList $$1 = (IntList)this.k.get(axw.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public akf a() {
      return this.d;
   }

   public fhp b() {
      return this.f;
   }

   static record a(evp a, evp b) {
      static final fhl.a c = new fhl.a(fhr.b, fhr.b);

      evp a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
