import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class duy {
   private static final Map<String, duy> k = new Object2ObjectArrayMap();
   public static final Codec<duy> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final duy b = new duy(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(se.g), Optional.of(se.n), Optional.of(se.C), Optional.of(se.I)
   );
   public static final duy c = new duy(
      "spruce", 0.5F, Optional.of(se.q), Optional.of(se.r), Optional.of(se.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final duy d = new duy(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(se.x), Optional.of(se.y), Optional.empty(), Optional.empty()
   );
   public static final duy e = new duy("azalea", Optional.empty(), Optional.of(se.w), Optional.empty());
   public static final duy f = new duy("birch", Optional.empty(), Optional.of(se.i), Optional.of(se.F));
   public static final duy g = new duy("jungle", Optional.of(se.p), Optional.of(se.o), Optional.empty());
   public static final duy h = new duy("acacia", Optional.empty(), Optional.of(se.j), Optional.empty());
   public static final duy i = new duy("cherry", Optional.empty(), Optional.of(se.z), Optional.of(se.K));
   public static final duy j = new duy("dark_oak", Optional.of(se.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<alh<edx<?, ?>>> n;
   private final Optional<alh<edx<?, ?>>> o;
   private final Optional<alh<edx<?, ?>>> p;
   private final Optional<alh<edx<?, ?>>> q;
   private final Optional<alh<edx<?, ?>>> r;
   private final Optional<alh<edx<?, ?>>> s;

   public duy(String $$0, Optional<alh<edx<?, ?>>> $$1, Optional<alh<edx<?, ?>>> $$2, Optional<alh<edx<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public duy(
      String $$0,
      float $$1,
      Optional<alh<edx<?, ?>>> $$2,
      Optional<alh<edx<?, ?>>> $$3,
      Optional<alh<edx<?, ?>>> $$4,
      Optional<alh<edx<?, ?>>> $$5,
      Optional<alh<edx<?, ?>>> $$6,
      Optional<alh<edx<?, ?>>> $$7
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
   private alh<edx<?, ?>> a(azs $$0, boolean $$1) {
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
   private alh<edx<?, ?>> a(azs $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(arn $$0, dxg $$1, jh $$2, dvj $$3, azs $$4) {
      alh<edx<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jq<edx<?, ?>> $$6 = $$0.H_().e(lz.aJ).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     edx<?, ?> $$9 = $$6.a();
                     dvj $$10 = dig.a.m();
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

      alh<edx<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jq<edx<?, ?>> $$12 = $$0.H_().e(lz.aJ).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            edx<?, ?> $$13 = $$12.a();
            dvj $$14 = $$0.b_($$2).g();
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

   private static boolean a(dvj $$0, deg $$1, jh $$2, int $$3, int $$4) {
      die $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dfc $$0, jh $$1) {
      for (jh $$2 : jh.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(axa.V)) {
            return true;
         }
      }

      return false;
   }
}
