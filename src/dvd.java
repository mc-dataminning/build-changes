import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dvd {
   private static final Map<String, dvd> k = new Object2ObjectArrayMap();
   public static final Codec<dvd> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final dvd b = new dvd(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(sh.g), Optional.of(sh.n), Optional.of(sh.C), Optional.of(sh.I)
   );
   public static final dvd c = new dvd(
      "spruce", 0.5F, Optional.of(sh.q), Optional.of(sh.r), Optional.of(sh.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dvd d = new dvd(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(sh.x), Optional.of(sh.y), Optional.empty(), Optional.empty()
   );
   public static final dvd e = new dvd("azalea", Optional.empty(), Optional.of(sh.w), Optional.empty());
   public static final dvd f = new dvd("birch", Optional.empty(), Optional.of(sh.i), Optional.of(sh.F));
   public static final dvd g = new dvd("jungle", Optional.of(sh.p), Optional.of(sh.o), Optional.empty());
   public static final dvd h = new dvd("acacia", Optional.empty(), Optional.of(sh.j), Optional.empty());
   public static final dvd i = new dvd("cherry", Optional.empty(), Optional.of(sh.z), Optional.of(sh.K));
   public static final dvd j = new dvd("dark_oak", Optional.of(sh.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<alk<eeb<?, ?>>> n;
   private final Optional<alk<eeb<?, ?>>> o;
   private final Optional<alk<eeb<?, ?>>> p;
   private final Optional<alk<eeb<?, ?>>> q;
   private final Optional<alk<eeb<?, ?>>> r;
   private final Optional<alk<eeb<?, ?>>> s;

   public dvd(String $$0, Optional<alk<eeb<?, ?>>> $$1, Optional<alk<eeb<?, ?>>> $$2, Optional<alk<eeb<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dvd(
      String $$0,
      float $$1,
      Optional<alk<eeb<?, ?>>> $$2,
      Optional<alk<eeb<?, ?>>> $$3,
      Optional<alk<eeb<?, ?>>> $$4,
      Optional<alk<eeb<?, ?>>> $$5,
      Optional<alk<eeb<?, ?>>> $$6,
      Optional<alk<eeb<?, ?>>> $$7
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
   private alk<eeb<?, ?>> a(azv $$0, boolean $$1) {
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
   private alk<eeb<?, ?>> a(azv $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(arq $$0, dxk $$1, jh $$2, dvo $$3, azv $$4) {
      alk<eeb<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jq<eeb<?, ?>> $$6 = $$0.H_().e(ma.aJ).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     eeb<?, ?> $$9 = $$6.a();
                     dvo $$10 = dil.a.m();
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

      alk<eeb<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jq<eeb<?, ?>> $$12 = $$0.H_().e(ma.aJ).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            eeb<?, ?> $$13 = $$12.a();
            dvo $$14 = $$0.b_($$2).g();
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

   private static boolean a(dvo $$0, dek $$1, jh $$2, int $$3, int $$4) {
      dij $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dfg $$0, jh $$1) {
      for (jh $$2 : jh.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(axd.V)) {
            return true;
         }
      }

      return false;
   }
}
