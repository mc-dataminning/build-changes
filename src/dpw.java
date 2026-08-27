import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dpw {
   private static final Map<String, dpw> k = new Object2ObjectArrayMap();
   public static final Codec<dpw> a = axh.a((Function<dpw, String>)($$0 -> $$0.l), k::get);
   public static final dpw b = new dpw(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rv.g), Optional.of(rv.n), Optional.of(rv.C), Optional.of(rv.I)
   );
   public static final dpw c = new dpw(
      "spruce", 0.5F, Optional.of(rv.q), Optional.of(rv.r), Optional.of(rv.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dpw d = new dpw(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rv.x), Optional.of(rv.y), Optional.empty(), Optional.empty()
   );
   public static final dpw e = new dpw("azalea", Optional.empty(), Optional.of(rv.w), Optional.empty());
   public static final dpw f = new dpw("birch", Optional.empty(), Optional.of(rv.i), Optional.of(rv.F));
   public static final dpw g = new dpw("jungle", Optional.of(rv.p), Optional.of(rv.o), Optional.empty());
   public static final dpw h = new dpw("acacia", Optional.empty(), Optional.of(rv.j), Optional.empty());
   public static final dpw i = new dpw("cherry", Optional.empty(), Optional.of(rv.z), Optional.of(rv.K));
   public static final dpw j = new dpw("dark_oak", Optional.of(rv.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<akg<dyq<?, ?>>> n;
   private final Optional<akg<dyq<?, ?>>> o;
   private final Optional<akg<dyq<?, ?>>> p;
   private final Optional<akg<dyq<?, ?>>> q;
   private final Optional<akg<dyq<?, ?>>> r;
   private final Optional<akg<dyq<?, ?>>> s;

   public dpw(String $$0, Optional<akg<dyq<?, ?>>> $$1, Optional<akg<dyq<?, ?>>> $$2, Optional<akg<dyq<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dpw(
      String $$0,
      float $$1,
      Optional<akg<dyq<?, ?>>> $$2,
      Optional<akg<dyq<?, ?>>> $$3,
      Optional<akg<dyq<?, ?>>> $$4,
      Optional<akg<dyq<?, ?>>> $$5,
      Optional<akg<dyq<?, ?>>> $$6,
      Optional<akg<dyq<?, ?>>> $$7
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
   private akg<dyq<?, ?>> a(ayg $$0, boolean $$1) {
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
   private akg<dyq<?, ?>> a(ayg $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(aqh $$0, dse $$1, in $$2, dqh $$3, ayg $$4) {
      akg<dyq<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         iw<dyq<?, ?>> $$6 = $$0.H_().d(le.aC).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dyq<?, ?> $$9 = $$6.a();
                     dqh $$10 = ddg.a.n();
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

      akg<dyq<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         iw<dyq<?, ?>> $$12 = $$0.H_().d(le.aC).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dyq<?, ?> $$13 = $$12.a();
            dqh $$14 = $$0.b_($$2).g();
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

   private static boolean a(dqh $$0, czj $$1, in $$2, int $$3, int $$4) {
      dde $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dae $$0, in $$1) {
      for (in $$2 : in.a.c($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(avr.U)) {
            return true;
         }
      }

      return false;
   }
}
