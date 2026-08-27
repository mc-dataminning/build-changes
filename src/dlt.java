import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dlt {
   private static final Map<String, dlt> k = new Object2ObjectArrayMap();
   public static final Codec<dlt> a = avu.a((Function<dlt, String>)($$0 -> $$0.l), k::get);
   public static final dlt b = new dlt(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(qt.g), Optional.of(qt.n), Optional.of(qt.C), Optional.of(qt.I)
   );
   public static final dlt c = new dlt(
      "spruce", 0.5F, Optional.of(qt.q), Optional.of(qt.r), Optional.of(qt.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dlt d = new dlt(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(qt.x), Optional.of(qt.y), Optional.empty(), Optional.empty()
   );
   public static final dlt e = new dlt("azalea", Optional.empty(), Optional.of(qt.w), Optional.empty());
   public static final dlt f = new dlt("birch", Optional.empty(), Optional.of(qt.i), Optional.of(qt.F));
   public static final dlt g = new dlt("jungle", Optional.of(qt.p), Optional.of(qt.o), Optional.empty());
   public static final dlt h = new dlt("acacia", Optional.empty(), Optional.of(qt.j), Optional.empty());
   public static final dlt i = new dlt("cherry", Optional.empty(), Optional.of(qt.z), Optional.of(qt.K));
   public static final dlt j = new dlt("dark_oak", Optional.of(qt.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ajb<duh<?, ?>>> n;
   private final Optional<ajb<duh<?, ?>>> o;
   private final Optional<ajb<duh<?, ?>>> p;
   private final Optional<ajb<duh<?, ?>>> q;
   private final Optional<ajb<duh<?, ?>>> r;
   private final Optional<ajb<duh<?, ?>>> s;

   public dlt(String $$0, Optional<ajb<duh<?, ?>>> $$1, Optional<ajb<duh<?, ?>>> $$2, Optional<ajb<duh<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dlt(
      String $$0,
      float $$1,
      Optional<ajb<duh<?, ?>>> $$2,
      Optional<ajb<duh<?, ?>>> $$3,
      Optional<ajb<duh<?, ?>>> $$4,
      Optional<ajb<duh<?, ?>>> $$5,
      Optional<ajb<duh<?, ?>>> $$6,
      Optional<ajb<duh<?, ?>>> $$7
   ) {
      this.l = $$0;
      this.m = $$1;
      this.n = $$2;
      this.o = $$3;
      this.p = $$4;
      this.q = $$5;
      this.r = $$6;
      this.s = $$7;
      k.put($$0, this);
   }

   @Nullable
   private ajb<duh<?, ?>> a(awt $$0, boolean $$1) {
      if ($$0.i() < this.m) {
         if ($$1 && this.s.isPresent()) {
            return this.s.get();
         }

         if (this.q.isPresent()) {
            return this.q.get();
         }
      }

      return $$1 && this.r.isPresent() ? this.r.get() : this.p.orElse(null);
   }

   @Nullable
   private ajb<duh<?, ?>> a(awt $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(apa $$0, dob $$1, ib $$2, dme $$3, awt $$4) {
      ajb<duh<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         il<duh<?, ?>> $$6 = $$0.I_().d(ki.ax).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     duh<?, ?> $$9 = $$6.a();
                     dme $$10 = czh.a.o();
                     $$0.a($$2.b($$7, 0, $$8), $$10, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$10, 4);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$10, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$10, 4);
                     if ($$9.a($$0, $$1, $$4, $$2.b($$7, 0, $$8))) {
                        return true;
                     }

                     $$0.a($$2.b($$7, 0, $$8), $$3, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$3, 4);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$3, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$3, 4);
                     return false;
                  }
               }
            }
         }
      }

      ajb<duh<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         il<duh<?, ?>> $$12 = $$0.I_().d(ki.ax).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            duh<?, ?> $$13 = $$12.a();
            dme $$14 = $$0.b_($$2).g();
            $$0.a($$2, $$14, 4);
            if ($$13.a($$0, $$1, $$4, $$2)) {
               if ($$0.a_($$2) == $$14) {
                  $$0.a($$2, $$3, $$14, 2);
               }

               return true;
            } else {
               $$0.a($$2, $$3, 4);
               return false;
            }
         }
      }
   }

   private static boolean a(dme $$0, cvk $$1, ib $$2, int $$3, int $$4) {
      czf $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(cwf $$0, ib $$1) {
      for (ib $$2 : ib.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(aue.U)) {
            return true;
         }
      }

      return false;
   }
}
