import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cxl implements csq, dhh {
   public static final Codec<jq<cxl>> e = ma.g
      .r()
      .validate($$0 -> $$0.a(cxt.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dkm, cxl> f = Maps.newHashMap();
   public static final alz g = alz.b("base_attack_damage");
   public static final alz h = alz.b("base_attack_speed");
   public static final int i = 64;
   public static final int j = 99;
   public static final int k = 13;
   private final jq.c<cxl> b = ma.g.f(this);
   private final kq c;
   @Nullable
   private final cxl d;
   protected final String l;
   private final cst m;

   public static int a(cxl $$0) {
      return $$0 == null ? 0 : ma.g.a($$0);
   }

   public static cxl b(int $$0) {
      return ma.g.a($$0);
   }

   @Deprecated
   public static cxl a(dkm $$0) {
      return f.getOrDefault($$0, cxt.a);
   }

   public cxl(cxl.a $$0) {
      this.l = $$0.d();
      this.c = $$0.a(xv.c(this.l), $$0.e());
      this.d = $$0.d;
      this.m = $$0.e;
      if (ab.aU) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jq.c<cxl> f() {
      return this.b;
   }

   public kq g() {
      return this.c;
   }

   public int h() {
      return this.c.a(ku.c, 1);
   }

   public void a(dhi $$0, bwg $$1, cxp $$2, int $$3) {
   }

   public void a(cmb $$0) {
   }

   public void l(cxp $$0) {
   }

   public boolean a(dxv $$0, dhi $$1, jh $$2, cpx $$3) {
      return true;
   }

   @Override
   public cxl j() {
      return this;
   }

   public btj a(dbi $$0) {
      return btj.e;
   }

   public float a(cxp $$0, dxv $$1) {
      dar $$2 = $$0.a(ku.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public btj a(dhi $$0, cpx $$1, bti $$2) {
      cxp $$3 = $$1.b($$2);
      czv $$4 = $$3.a(ku.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dfu $$5 = $$3.a(ku.D);
         return (btj)($$5 != null && $$5.g() ? $$5.a($$3, $$1) : btj.e);
      }
   }

   public cxp a(cxp $$0, dhi $$1, bwg $$2) {
      czv $$3 = $$0.a(ku.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cxp $$0) {
      return $$0.n();
   }

   public int e(cxp $$0) {
      return bae.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cxp $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return bae.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cxp $$0, cuz $$1, ctm $$2, cpx $$3) {
      return false;
   }

   public boolean a(cxp $$0, cxp $$1, cuz $$2, ctm $$3, cpx $$4, bwy $$5) {
      return false;
   }

   public float a(bvk $$0, float $$1, bua $$2) {
      return 0.0F;
   }

   @Nullable
   public bua a(bwg $$0) {
      return null;
   }

   public boolean a(cxp $$0, bwg $$1, bwg $$2) {
      return false;
   }

   public void b(cxp $$0, bwg $$1, bwg $$2) {
   }

   public boolean a(cxp $$0, dhi $$1, dxv $$2, jh $$3, bwg $$4) {
      dar $$5 = $$0.a(ku.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bvs.a);
         }

         return true;
      }
   }

   public boolean b(cxp $$0, dxv $$1) {
      dar $$2 = $$0.a(ku.B);
      return $$2 != null && $$2.b($$1);
   }

   public btj a(cxp $$0, cpx $$1, bwg $$2, bti $$3) {
      return btj.e;
   }

   @Override
   public String toString() {
      return ma.g.e(this).g();
   }

   public final cxp k() {
      return this.d == null ? cxp.j : new cxp(this.d);
   }

   public void a(cxp $$0, dhi $$1, bvk $$2, int $$3, boolean $$4) {
   }

   public void a(cxp $$0, dhi $$1, cpx $$2) {
      this.a($$0, $$1);
   }

   public void a(cxp $$0, dhi $$1) {
   }

   public cxr b(cxp $$0) {
      czv $$1 = $$0.a(ku.x);
      return $$1 != null ? $$1.d() : cxr.a;
   }

   public int a(cxp $$0, bwg $$1) {
      czv $$2 = $$0.a(ku.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cxp $$0, dhi $$1, bwg $$2, int $$3) {
      return false;
   }

   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
   }

   public Optional<cvj> k(cxp $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String l() {
      return this.l;
   }

   public final xv m() {
      return this.c.a(ku.h, xu.a);
   }

   public xv a(cxp $$0) {
      return $$0.a().a(ku.h, xu.a);
   }

   public boolean c_(cxp $$0) {
      return $$0.E();
   }

   protected static fbu a(dhi $$0, cpx $$1, dgq.b $$2) {
      fby $$3 = $$1.bF();
      fby $$4 = $$3.e($$1.d($$1.dO(), $$1.dM()).c($$1.gJ()));
      return $$0.a(new dgq($$3, $$4, dgq.a.b, $$2, $$1));
   }

   public boolean d_(cxp $$0) {
      return false;
   }

   public cxp n() {
      return new cxp(this);
   }

   public axe a() {
      return axf.nT;
   }

   public boolean e() {
      return true;
   }

   @Override
   public cst i() {
      return this.m;
   }

   public static class a {
      private static final alr<cxl, String> a = $$0 -> ae.a("block", $$0.a());
      private static final alr<cxl, String> b = $$0 -> ae.a("item", $$0.a());
      private final kq.a c = kq.a().a(ku.aq);
      @Nullable
      cxl d;
      cst e = csv.h;
      @Nullable
      private aly<cxl> f;
      private alr<cxl, String> g = b;
      private alr<cxl, alz> h = aly::a;

      public cxl.a a(csz $$0) {
         return this.a($$0, czx.a);
      }

      public cxl.a a(csz $$0, czv $$1) {
         return this.a(ku.w, $$0).a(ku.x, $$1);
      }

      public cxl.a a(cxl $$0) {
         return this.a(ku.y, new dav(new cxp($$0)));
      }

      public cxl.a a(float $$0) {
         return this.a(ku.z, new dau($$0));
      }

      public cxl.a a(int $$0) {
         return this.a(ku.c, $$0);
      }

      public cxl.a b(int $$0) {
         this.a(ku.d, $$0);
         this.a(ku.c, 1);
         this.a(ku.e, 0);
         return this;
      }

      public cxl.a b(cxl $$0) {
         this.d = $$0;
         return this;
      }

      public cxl.a a(cym $$0) {
         return this.a(ku.k, $$0);
      }

      public cxl.a a() {
         return this.a(ku.A, new daa(axw.i));
      }

      public cxl.a a(aly<cxv> $$0) {
         return this.a(ku.ab, new cxu(new cwp<>($$0), true));
      }

      public cxl.a c(int $$0) {
         return this.a(ku.C, new ddx($$0));
      }

      public cxl.a c(cxl $$0) {
         return this.a(ku.E, new deh(ju.a($$0.f())));
      }

      public cxl.a a(ayk<cxl> $$0) {
         jr<cxl> $$1 = ma.a(ma.g);
         return this.a(ku.E, new deh($$1.b($$0)));
      }

      public cxl.a a(bvs $$0) {
         return this.a(ku.D, dfu.a($$0).a());
      }

      public cxl.a b(bvs $$0) {
         return this.a(ku.D, dfu.a($$0).b(false).a());
      }

      public cxl.a a(csr... $$0) {
         this.e = csv.f.a($$0);
         return this;
      }

      public cxl.a b(aly<cxl> $$0) {
         this.f = $$0;
         return this;
      }

      public cxl.a a(String $$0) {
         this.g = alr.fixed($$0);
         return this;
      }

      public cxl.a b() {
         this.g = a;
         return this;
      }

      public cxl.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public cxl.a a(alz $$0) {
         this.h = alr.fixed($$0);
         return this;
      }

      public alz e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cxl.a a(kt<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cxl.a a(dag $$0) {
         return this.a(ku.o, $$0);
      }

      kq a(xv $$0, alz $$1) {
         kq $$2 = this.c.a(ku.h, $$0).a(ku.i, $$1).a();
         if ($$2.b(ku.e) && $$2.a(ku.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cxl.b a = new cxl.b() {
         @Nullable
         @Override
         public js.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public evr a(evp $$0) {
            return null;
         }
      };

      @Nullable
      js.a a();

      float b();

      @Nullable
      evr a(evp var1);

      static cxl.b a(@Nullable final dhi $$0) {
         return $$0 == null ? a : new cxl.b() {
            @Override
            public js.a a() {
               return $$0.K_();
            }

            @Override
            public float b() {
               return $$0.t().f();
            }

            @Override
            public evr a(evp $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cxl.b a(final js.a $$0) {
         return new cxl.b() {
            @Override
            public js.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public evr a(evp $$0x) {
               return null;
            }
         };
      }
   }
}
