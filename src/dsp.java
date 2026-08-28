import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dsp {
   private static final Map<String, dsp> k = new Object2ObjectArrayMap();
   public static final Codec<dsp> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final dsp b = new dsp(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rv.g), Optional.of(rv.n), Optional.of(rv.C), Optional.of(rv.I)
   );
   public static final dsp c = new dsp(
      "spruce", 0.5F, Optional.of(rv.q), Optional.of(rv.r), Optional.of(rv.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dsp d = new dsp(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rv.x), Optional.of(rv.y), Optional.empty(), Optional.empty()
   );
   public static final dsp e = new dsp("azalea", Optional.empty(), Optional.of(rv.w), Optional.empty());
   public static final dsp f = new dsp("birch", Optional.empty(), Optional.of(rv.i), Optional.of(rv.F));
   public static final dsp g = new dsp("jungle", Optional.of(rv.p), Optional.of(rv.o), Optional.empty());
   public static final dsp h = new dsp("acacia", Optional.empty(), Optional.of(rv.j), Optional.empty());
   public static final dsp i = new dsp("cherry", Optional.empty(), Optional.of(rv.z), Optional.of(rv.K));
   public static final dsp j = new dsp("dark_oak", Optional.of(rv.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<akp<ebn<?, ?>>> n;
   private final Optional<akp<ebn<?, ?>>> o;
   private final Optional<akp<ebn<?, ?>>> p;
   private final Optional<akp<ebn<?, ?>>> q;
   private final Optional<akp<ebn<?, ?>>> r;
   private final Optional<akp<ebn<?, ?>>> s;

   public dsp(String $$0, Optional<akp<ebn<?, ?>>> $$1, Optional<akp<ebn<?, ?>>> $$2, Optional<akp<ebn<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dsp(
      String $$0,
      float $$1,
      Optional<akp<ebn<?, ?>>> $$2,
      Optional<akp<ebn<?, ?>>> $$3,
      Optional<akp<ebn<?, ?>>> $$4,
      Optional<akp<ebn<?, ?>>> $$5,
      Optional<akp<ebn<?, ?>>> $$6,
      Optional<akp<ebn<?, ?>>> $$7
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
   private akp<ebn<?, ?>> a(ayv $$0, boolean $$1) {
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
   private akp<ebn<?, ?>> a(ayv $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(aqt $$0, dux $$1, jd $$2, dta $$3, ayv $$4) {
      akp<ebn<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jm<ebn<?, ?>> $$6 = $$0.H_().d(lu.aI).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     ebn<?, ?> $$9 = $$6.a();
                     dta $$10 = dfy.a.o();
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

      akp<ebn<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jm<ebn<?, ?>> $$12 = $$0.H_().d(lu.aI).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            ebn<?, ?> $$13 = $$12.a();
            dta $$14 = $$0.b_($$2).g();
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

   private static boolean a(dta $$0, dca $$1, jd $$2, int $$3, int $$4) {
      dfw $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dcv $$0, jd $$1) {
      for (jd $$2 : jd.a.c($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(awd.U)) {
            return true;
         }
      }

      return false;
   }
}
