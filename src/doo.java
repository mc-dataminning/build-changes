import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class doo {
   private static final Map<String, doo> k = new Object2ObjectArrayMap();
   public static final Codec<doo> a = aws.a((Function<doo, String>)($$0 -> $$0.l), k::get);
   public static final doo b = new doo(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rh.g), Optional.of(rh.n), Optional.of(rh.C), Optional.of(rh.I)
   );
   public static final doo c = new doo(
      "spruce", 0.5F, Optional.of(rh.q), Optional.of(rh.r), Optional.of(rh.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final doo d = new doo(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rh.x), Optional.of(rh.y), Optional.empty(), Optional.empty()
   );
   public static final doo e = new doo("azalea", Optional.empty(), Optional.of(rh.w), Optional.empty());
   public static final doo f = new doo("birch", Optional.empty(), Optional.of(rh.i), Optional.of(rh.F));
   public static final doo g = new doo("jungle", Optional.of(rh.p), Optional.of(rh.o), Optional.empty());
   public static final doo h = new doo("acacia", Optional.empty(), Optional.of(rh.j), Optional.empty());
   public static final doo i = new doo("cherry", Optional.empty(), Optional.of(rh.z), Optional.of(rh.K));
   public static final doo j = new doo("dark_oak", Optional.of(rh.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ajs<dxi<?, ?>>> n;
   private final Optional<ajs<dxi<?, ?>>> o;
   private final Optional<ajs<dxi<?, ?>>> p;
   private final Optional<ajs<dxi<?, ?>>> q;
   private final Optional<ajs<dxi<?, ?>>> r;
   private final Optional<ajs<dxi<?, ?>>> s;

   public doo(String $$0, Optional<ajs<dxi<?, ?>>> $$1, Optional<ajs<dxi<?, ?>>> $$2, Optional<ajs<dxi<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public doo(
      String $$0,
      float $$1,
      Optional<ajs<dxi<?, ?>>> $$2,
      Optional<ajs<dxi<?, ?>>> $$3,
      Optional<ajs<dxi<?, ?>>> $$4,
      Optional<ajs<dxi<?, ?>>> $$5,
      Optional<ajs<dxi<?, ?>>> $$6,
      Optional<ajs<dxi<?, ?>>> $$7
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
   private ajs<dxi<?, ?>> a(axr $$0, boolean $$1) {
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
   private ajs<dxi<?, ?>> a(axr $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(aps $$0, dqw $$1, ib $$2, doz $$3, axr $$4) {
      ajs<dxi<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         il<dxi<?, ?>> $$6 = $$0.H_().d(ks.ay).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dxi<?, ?> $$9 = $$6.a();
                     doz $$10 = dca.a.n();
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

      ajs<dxi<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         il<dxi<?, ?>> $$12 = $$0.H_().d(ks.ay).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dxi<?, ?> $$13 = $$12.a();
            doz $$14 = $$0.b_($$2).g();
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

   private static boolean a(doz $$0, cyd $$1, ib $$2, int $$3, int $$4) {
      dby $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(cyy $$0, ib $$1) {
      for (ib $$2 : ib.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(avc.U)) {
            return true;
         }
      }

      return false;
   }
}
