import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dku {
   private static final Map<String, dku> k = new Object2ObjectArrayMap();
   public static final Codec<dku> a = avp.a((Function<dku, String>)($$0 -> $$0.l), k::get);
   public static final dku b = new dku(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(qr.g), Optional.of(qr.n), Optional.of(qr.C), Optional.of(qr.I)
   );
   public static final dku c = new dku(
      "spruce", 0.5F, Optional.of(qr.q), Optional.of(qr.r), Optional.of(qr.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dku d = new dku(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(qr.x), Optional.of(qr.y), Optional.empty(), Optional.empty()
   );
   public static final dku e = new dku("azalea", Optional.empty(), Optional.of(qr.w), Optional.empty());
   public static final dku f = new dku("birch", Optional.empty(), Optional.of(qr.i), Optional.of(qr.F));
   public static final dku g = new dku("jungle", Optional.of(qr.p), Optional.of(qr.o), Optional.empty());
   public static final dku h = new dku("acacia", Optional.empty(), Optional.of(qr.j), Optional.empty());
   public static final dku i = new dku("cherry", Optional.empty(), Optional.of(qr.z), Optional.of(qr.K));
   public static final dku j = new dku("dark_oak", Optional.of(qr.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<aix<dtf<?, ?>>> n;
   private final Optional<aix<dtf<?, ?>>> o;
   private final Optional<aix<dtf<?, ?>>> p;
   private final Optional<aix<dtf<?, ?>>> q;
   private final Optional<aix<dtf<?, ?>>> r;
   private final Optional<aix<dtf<?, ?>>> s;

   public dku(String $$0, Optional<aix<dtf<?, ?>>> $$1, Optional<aix<dtf<?, ?>>> $$2, Optional<aix<dtf<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dku(
      String $$0,
      float $$1,
      Optional<aix<dtf<?, ?>>> $$2,
      Optional<aix<dtf<?, ?>>> $$3,
      Optional<aix<dtf<?, ?>>> $$4,
      Optional<aix<dtf<?, ?>>> $$5,
      Optional<aix<dtf<?, ?>>> $$6,
      Optional<aix<dtf<?, ?>>> $$7
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
   private aix<dtf<?, ?>> a(awo $$0, boolean $$1) {
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
   private aix<dtf<?, ?>> a(awo $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(aov $$0, dnc $$1, hz $$2, dlf $$3, awo $$4) {
      aix<dtf<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ij<dtf<?, ?>> $$6 = $$0.I_().d(kg.aw).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dtf<?, ?> $$9 = $$6.a();
                     dlf $$10 = cyq.a.o();
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

      aix<dtf<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ij<dtf<?, ?>> $$12 = $$0.I_().d(kg.aw).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dtf<?, ?> $$13 = $$12.a();
            dlf $$14 = $$0.b_($$2).g();
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

   private static boolean a(dlf $$0, cut $$1, hz $$2, int $$3, int $$4) {
      cyo $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(cvo $$0, hz $$1) {
      for (hz $$2 : hz.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(atz.U)) {
            return true;
         }
      }

      return false;
   }
}
