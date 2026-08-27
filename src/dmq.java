import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dmq {
   private static final Map<String, dmq> k = new Object2ObjectArrayMap();
   public static final Codec<dmq> a = awe.a((Function<dmq, String>)($$0 -> $$0.l), k::get);
   public static final dmq b = new dmq(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(qv.g), Optional.of(qv.n), Optional.of(qv.C), Optional.of(qv.I)
   );
   public static final dmq c = new dmq(
      "spruce", 0.5F, Optional.of(qv.q), Optional.of(qv.r), Optional.of(qv.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dmq d = new dmq(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(qv.x), Optional.of(qv.y), Optional.empty(), Optional.empty()
   );
   public static final dmq e = new dmq("azalea", Optional.empty(), Optional.of(qv.w), Optional.empty());
   public static final dmq f = new dmq("birch", Optional.empty(), Optional.of(qv.i), Optional.of(qv.F));
   public static final dmq g = new dmq("jungle", Optional.of(qv.p), Optional.of(qv.o), Optional.empty());
   public static final dmq h = new dmq("acacia", Optional.empty(), Optional.of(qv.j), Optional.empty());
   public static final dmq i = new dmq("cherry", Optional.empty(), Optional.of(qv.z), Optional.of(qv.K));
   public static final dmq j = new dmq("dark_oak", Optional.of(qv.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ajg<dvf<?, ?>>> n;
   private final Optional<ajg<dvf<?, ?>>> o;
   private final Optional<ajg<dvf<?, ?>>> p;
   private final Optional<ajg<dvf<?, ?>>> q;
   private final Optional<ajg<dvf<?, ?>>> r;
   private final Optional<ajg<dvf<?, ?>>> s;

   public dmq(String $$0, Optional<ajg<dvf<?, ?>>> $$1, Optional<ajg<dvf<?, ?>>> $$2, Optional<ajg<dvf<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dmq(
      String $$0,
      float $$1,
      Optional<ajg<dvf<?, ?>>> $$2,
      Optional<ajg<dvf<?, ?>>> $$3,
      Optional<ajg<dvf<?, ?>>> $$4,
      Optional<ajg<dvf<?, ?>>> $$5,
      Optional<ajg<dvf<?, ?>>> $$6,
      Optional<ajg<dvf<?, ?>>> $$7
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
   private ajg<dvf<?, ?>> a(axd $$0, boolean $$1) {
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
   private ajg<dvf<?, ?>> a(axd $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(apf $$0, doy $$1, ib $$2, dnb $$3, axd $$4) {
      ajg<dvf<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         il<dvf<?, ?>> $$6 = $$0.H_().d(kj.ax).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dvf<?, ?> $$9 = $$6.a();
                     dnb $$10 = dae.a.o();
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

      ajg<dvf<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         il<dvf<?, ?>> $$12 = $$0.H_().d(kj.ax).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dvf<?, ?> $$13 = $$12.a();
            dnb $$14 = $$0.b_($$2).g();
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

   private static boolean a(dnb $$0, cwh $$1, ib $$2, int $$3, int $$4) {
      dac $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(cxc $$0, ib $$1) {
      for (ib $$2 : ib.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(aun.U)) {
            return true;
         }
      }

      return false;
   }
}
