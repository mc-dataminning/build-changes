import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class ebe {
   private static final Map<String, ebe> l = new Object2ObjectArrayMap();
   public static final Codec<ebe> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final ebe b = new ebe(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(ro.g), Optional.of(ro.q), Optional.of(ro.F), Optional.of(ro.M)
   );
   public static final ebe c = new ebe(
      "spruce", 0.5F, Optional.of(ro.t), Optional.of(ro.u), Optional.of(ro.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final ebe d = new ebe(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(ro.A), Optional.of(ro.B), Optional.empty(), Optional.empty()
   );
   public static final ebe e = new ebe("azalea", Optional.empty(), Optional.of(ro.z), Optional.empty());
   public static final ebe f = new ebe("birch", Optional.empty(), Optional.of(ro.l), Optional.of(ro.J));
   public static final ebe g = new ebe("jungle", Optional.of(ro.s), Optional.of(ro.r), Optional.empty());
   public static final ebe h = new ebe("acacia", Optional.empty(), Optional.of(ro.m), Optional.empty());
   public static final ebe i = new ebe("cherry", Optional.empty(), Optional.of(ro.C), Optional.of(ro.O));
   public static final ebe j = new ebe("dark_oak", Optional.of(ro.h), Optional.empty(), Optional.empty());
   public static final ebe k = new ebe("pale_oak", Optional.of(ro.j), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<alq<ekh<?, ?>>> o;
   private final Optional<alq<ekh<?, ?>>> p;
   private final Optional<alq<ekh<?, ?>>> q;
   private final Optional<alq<ekh<?, ?>>> r;
   private final Optional<alq<ekh<?, ?>>> s;
   private final Optional<alq<ekh<?, ?>>> t;

   public ebe(String $$0, Optional<alq<ekh<?, ?>>> $$1, Optional<alq<ekh<?, ?>>> $$2, Optional<alq<ekh<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public ebe(
      String $$0,
      float $$1,
      Optional<alq<ekh<?, ?>>> $$2,
      Optional<alq<ekh<?, ?>>> $$3,
      Optional<alq<ekh<?, ?>>> $$4,
      Optional<alq<ekh<?, ?>>> $$5,
      Optional<alq<ekh<?, ?>>> $$6,
      Optional<alq<ekh<?, ?>>> $$7
   ) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
      this.q = $$4;
      this.r = $$5;
      this.s = $$6;
      this.t = $$7;
      l.put($$0, this);
   }

   @Nullable
   private alq<ekh<?, ?>> a(bai $$0, boolean $$1) {
      if ($$0.i() < this.n) {
         if ($$1 && this.t.isPresent()) {
            return this.t.get();
         }

         if (this.r.isPresent()) {
            return this.r.get();
         }
      }

      return $$1 && this.s.isPresent() ? this.s.get() : this.q.orElse(null);
   }

   @Nullable
   private alq<ekh<?, ?>> a(bai $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(asb $$0, edo $$1, iw $$2, ebq $$3, bai $$4) {
      alq<ekh<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jg<ekh<?, ?>> $$6 = $$0.J_().f(mi.aL).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     ekh<?, ?> $$9 = $$6.a();
                     ebq $$10 = dnq.a.m();
                     $$0.a($$2.b($$7, 0, $$8), $$10, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$10, 260);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$10, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$10, 260);
                     if ($$9.a($$0, $$1, $$4, $$2.b($$7, 0, $$8))) {
                        return true;
                     }

                     $$0.a($$2.b($$7, 0, $$8), $$3, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$3, 260);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$3, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$3, 260);
                     return false;
                  }
               }
            }
         }
      }

      alq<ekh<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jg<ekh<?, ?>> $$12 = $$0.J_().f(mi.aL).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            ekh<?, ?> $$13 = $$12.a();
            ebq $$14 = $$0.b_($$2).g();
            $$0.a($$2, $$14, 260);
            if ($$13.a($$0, $$1, $$4, $$2)) {
               if ($$0.a_($$2) == $$14) {
                  $$0.a($$2, $$3, $$14, 2);
               }

               return true;
            } else {
               $$0.a($$2, $$3, 260);
               return false;
            }
         }
      }
   }

   private static boolean a(ebq $$0, djn $$1, iw $$2, int $$3, int $$4) {
      dno $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dkk $$0, iw $$1) {
      for (iw $$2 : iw.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(axn.V)) {
            return true;
         }
      }

      return false;
   }
}
