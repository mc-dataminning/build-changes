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

public class cxu implements ctb, dho {
   public static final Codec<js<cxu>> e = md.g
      .r()
      .validate($$0 -> $$0.a(cyc.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final yt<wg, js<cxu>> f = yr.b(me.K);
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dku, cxu> g = Maps.newHashMap();
   public static final ald h = ald.b("base_attack_damage");
   public static final ald i = ald.b("base_attack_speed");
   public static final int j = 64;
   public static final int k = 99;
   public static final int l = 13;
   private final js.c<cxu> b = md.g.f(this);
   private final kt c;
   @Nullable
   private final cxu d;
   protected final String m;
   private final cte n;

   public static int a(cxu $$0) {
      return $$0 == null ? 0 : md.g.a($$0);
   }

   public static cxu b(int $$0) {
      return md.g.a($$0);
   }

   @Deprecated
   public static cxu a(dku $$0) {
      return g.getOrDefault($$0, cyc.a);
   }

   public cxu(cxu.a $$0) {
      this.m = $$0.d();
      this.c = $$0.a(wv.c(this.m), $$0.e());
      this.d = $$0.d;
      this.n = $$0.e;
      if (ab.aU) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public js.c<cxu> f() {
      return this.b;
   }

   public kt g() {
      return this.c;
   }

   public int h() {
      return this.c.a(kx.c, 1);
   }

   public void a(dhp $$0, bwr $$1, cxy $$2, int $$3) {
   }

   public void a(cmn $$0) {
   }

   public void l(cxy $$0) {
   }

   public boolean a(cxy $$0, dym $$1, dhp $$2, jj $$3, bwr $$4) {
      dax $$5 = $$0.a(kx.B);
      if ($$5 != null && !$$5.d()) {
         if ($$4 instanceof cqi $$6 && $$6.gj().d) {
            return false;
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public cxu i() {
      return this;
   }

   public btq a(dbp $$0) {
      return btq.e;
   }

   public float a(cxy $$0, dym $$1) {
      dax $$2 = $$0.a(kx.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      dab $$4 = $$3.a(kx.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dgc $$5 = $$3.a(kx.E);
         return (btq)($$5 != null && $$5.h() ? $$5.a($$3, $$1) : btq.e);
      }
   }

   public cxy a(cxy $$0, dhp $$1, bwr $$2) {
      dab $$3 = $$0.a(kx.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cxy $$0) {
      return $$0.n();
   }

   public int e(cxy $$0) {
      return azk.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cxy $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azk.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cxy $$0, cvk $$1, ctx $$2, cqi $$3) {
      return false;
   }

   public boolean a(cxy $$0, cxy $$1, cvk $$2, ctx $$3, cqi $$4, bxi $$5) {
      return false;
   }

   public float a(bvs $$0, float $$1, buh $$2) {
      return 0.0F;
   }

   @Nullable
   public buh a(bwr $$0) {
      return null;
   }

   public void a(cxy $$0, bwr $$1, bwr $$2) {
   }

   public void b(cxy $$0, bwr $$1, bwr $$2) {
   }

   public boolean a(cxy $$0, dhp $$1, dym $$2, jj $$3, bwr $$4) {
      dax $$5 = $$0.a(kx.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bwc.a);
         }

         return true;
      }
   }

   public boolean b(cxy $$0, dym $$1) {
      dax $$2 = $$0.a(kx.B);
      return $$2 != null && $$2.b($$1);
   }

   public btq a(cxy $$0, cqi $$1, bwr $$2, btp $$3) {
      return btq.e;
   }

   @Override
   public String toString() {
      return md.g.e(this).g();
   }

   public final cxy j() {
      return this.d == null ? cxy.k : new cxy(this.d);
   }

   public void a(cxy $$0, dhp $$1, bvs $$2, int $$3, boolean $$4) {
   }

   public void a(cxy $$0, dhp $$1, cqi $$2) {
      this.a($$0, $$1);
   }

   public void a(cxy $$0, dhp $$1) {
   }

   public cya b(cxy $$0) {
      dab $$1 = $$0.a(kx.x);
      return $$1 != null ? $$1.d() : cya.a;
   }

   public int a(cxy $$0, bwr $$1) {
      dab $$2 = $$0.a(kx.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cxy $$0, dhp $$1, bwr $$2, int $$3) {
      return false;
   }

   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
   }

   public Optional<cvu> k(cxy $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String l() {
      return this.m;
   }

   public final wv m() {
      return this.c.a(kx.h, wu.a);
   }

   public wv a(cxy $$0) {
      return $$0.a().a(kx.h, wu.a);
   }

   public boolean c_(cxy $$0) {
      return $$0.F();
   }

   protected static fcq a(dhp $$0, cqi $$1, dgy.b $$2) {
      fcu $$3 = $$1.bE();
      fcu $$4 = $$3.e($$1.d($$1.dN(), $$1.dL()).c($$1.gK()));
      return $$0.a(new dgy($$3, $$4, dgy.a.b, $$2, $$1));
   }

   public boolean d_(cxy $$0) {
      return false;
   }

   public cxy n() {
      return new cxy(this);
   }

   public awj a() {
      return awk.oe;
   }

   public boolean e() {
      return true;
   }

   @Override
   public cte k() {
      return this.n;
   }

   public boolean a(cxy $$0, @Nullable cqi $$1) {
      return false;
   }

   public static class a {
      private static final akv<cxu, String> a = $$0 -> af.a("block", $$0.a());
      private static final akv<cxu, String> b = $$0 -> af.a("item", $$0.a());
      private final kt.a c = kt.a().a(kx.aN);
      @Nullable
      cxu d;
      cte e = ctg.g;
      @Nullable
      private alc<cxu> f;
      private akv<cxu, String> g = b;
      private akv<cxu, ald> h = alc::a;

      public cxu.a a(ctk $$0) {
         return this.a($$0, dad.a);
      }

      public cxu.a a(ctk $$0, dab $$1) {
         return this.a(kx.w, $$0).a(kx.x, $$1);
      }

      public cxu.a a(cxu $$0) {
         return this.a(kx.y, new dbb(new cxy($$0)));
      }

      public cxu.a a(float $$0) {
         return this.a(kx.z, new dba($$0));
      }

      public cxu.a a(int $$0) {
         return this.a(kx.c, $$0);
      }

      public cxu.a b(int $$0) {
         this.a(kx.d, $$0);
         this.a(kx.c, 1);
         this.a(kx.e, 0);
         return this;
      }

      public cxu.a b(cxu $$0) {
         this.d = $$0;
         return this;
      }

      public cxu.a a(cyu $$0) {
         return this.a(kx.k, $$0);
      }

      public cxu.a a() {
         return this.a(kx.A, new dag(axb.i));
      }

      public cxu.a a(alc<cye> $$0) {
         return this.a(kx.ad, new cyd(new cwy<>($$0), true));
      }

      public cxu.a c(int $$0) {
         return this.a(kx.D, new def($$0));
      }

      public cxu.a c(cxu $$0) {
         return this.a(kx.F, new dep(jw.a($$0.f())));
      }

      public cxu.a a(axp<cxu> $$0) {
         jt<cxu> $$1 = md.a(md.g);
         return this.a(kx.F, new dep($$1.b($$0)));
      }

      public cxu.a a(bwc $$0) {
         return this.a(kx.E, dgc.a($$0).a());
      }

      public cxu.a b(bwc $$0) {
         return this.a(kx.E, dgc.a($$0).b(false).a());
      }

      public cxu.a a(czm $$0, axp<dku> $$1, float $$2, float $$3, boolean $$4) {
         return $$0.a(this, $$1, $$2, $$3, $$4);
      }

      public cxu.a a(czm $$0, float $$1, float $$2) {
         return this.a($$0, awz.bE, $$1, $$2, false);
      }

      public cxu.a b(czm $$0, float $$1, float $$2) {
         return $$0.a(this, $$1, $$2);
      }

      public cxu.a a(dfx $$0, dfz $$1) {
         return this.b($$1.a($$0.a())).a($$0.a($$1)).c($$0.c()).a(kx.E, dgc.a($$1.a()).a($$0.d()).a($$0.h()).a()).a($$0.g());
      }

      public cxu.a a(ctc... $$0) {
         this.e = ctg.e.a($$0);
         return this;
      }

      public cxu.a b(alc<cxu> $$0) {
         this.f = $$0;
         return this;
      }

      public cxu.a a(String $$0) {
         this.g = akv.fixed($$0);
         return this;
      }

      public cxu.a b() {
         this.g = a;
         return this;
      }

      public cxu.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public ald e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cxu.a a(kw<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cxu.a a(dam $$0) {
         return this.a(kx.o, $$0);
      }

      kt a(wv $$0, ald $$1) {
         kt $$2 = this.c.a(kx.h, $$0).a(kx.i, $$1).a();
         if ($$2.c(kx.e) && $$2.a(kx.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cxu.b a = new cxu.b() {
         @Nullable
         @Override
         public ju.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public ewn a(ewl $$0) {
            return null;
         }
      };

      @Nullable
      ju.a a();

      float b();

      @Nullable
      ewn a(ewl var1);

      static cxu.b a(@Nullable final dhp $$0) {
         return $$0 == null ? a : new cxu.b() {
            @Override
            public ju.a a() {
               return $$0.F_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public ewn a(ewl $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cxu.b a(final ju.a $$0) {
         return new cxu.b() {
            @Override
            public ju.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public ewn a(ewl $$0x) {
               return null;
            }
         };
      }
   }
}
