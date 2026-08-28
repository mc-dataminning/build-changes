import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class drm {
   private static final Map<String, drm> k = new Object2ObjectArrayMap();
   public static final Codec<drm> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final drm b = new drm(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(sm.g), Optional.of(sm.n), Optional.of(sm.C), Optional.of(sm.I)
   );
   public static final drm c = new drm(
      "spruce", 0.5F, Optional.of(sm.q), Optional.of(sm.r), Optional.of(sm.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final drm d = new drm(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(sm.x), Optional.of(sm.y), Optional.empty(), Optional.empty()
   );
   public static final drm e = new drm("azalea", Optional.empty(), Optional.of(sm.w), Optional.empty());
   public static final drm f = new drm("birch", Optional.empty(), Optional.of(sm.i), Optional.of(sm.F));
   public static final drm g = new drm("jungle", Optional.of(sm.p), Optional.of(sm.o), Optional.empty());
   public static final drm h = new drm("acacia", Optional.empty(), Optional.of(sm.j), Optional.empty());
   public static final drm i = new drm("cherry", Optional.empty(), Optional.of(sm.z), Optional.of(sm.K));
   public static final drm j = new drm("dark_oak", Optional.of(sm.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ala<eag<?, ?>>> n;
   private final Optional<ala<eag<?, ?>>> o;
   private final Optional<ala<eag<?, ?>>> p;
   private final Optional<ala<eag<?, ?>>> q;
   private final Optional<ala<eag<?, ?>>> r;
   private final Optional<ala<eag<?, ?>>> s;

   public drm(String $$0, Optional<ala<eag<?, ?>>> $$1, Optional<ala<eag<?, ?>>> $$2, Optional<ala<eag<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public drm(
      String $$0,
      float $$1,
      Optional<ala<eag<?, ?>>> $$2,
      Optional<ala<eag<?, ?>>> $$3,
      Optional<ala<eag<?, ?>>> $$4,
      Optional<ala<eag<?, ?>>> $$5,
      Optional<ala<eag<?, ?>>> $$6,
      Optional<ala<eag<?, ?>>> $$7
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
   private ala<eag<?, ?>> a(azc $$0, boolean $$1) {
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
   private ala<eag<?, ?>> a(azc $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(arb $$0, dtu $$1, iz $$2, drx $$3, azc $$4) {
      ala<eag<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ji<eag<?, ?>> $$6 = $$0.H_().d(lq.aC).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     eag<?, ?> $$9 = $$6.a();
                     drx $$10 = dew.a.n();
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

      ala<eag<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ji<eag<?, ?>> $$12 = $$0.H_().d(lq.aC).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            eag<?, ?> $$13 = $$12.a();
            drx $$14 = $$0.b_($$2).g();
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

   private static boolean a(drx $$0, daz $$1, iz $$2, int $$3, int $$4) {
      deu $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dbu $$0, iz $$1) {
      for (iz $$2 : iz.a.c($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(awl.U)) {
            return true;
         }
      }

      return false;
   }
}
