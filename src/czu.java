import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class czu implements cve, djw {
   public static final Codec<jf<czu>> e = mg.g
      .r()
      .validate($$0 -> $$0.a(dac.a.e()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final yy<wl, jf<czu>> f = yw.b(mh.K);
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dnc, czu> g = Maps.newHashMap();
   public static final ali h = ali.b("base_attack_damage");
   public static final ali i = ali.b("base_attack_speed");
   public static final int j = 64;
   public static final int k = 99;
   public static final int l = 13;
   protected static final int m = 72000;
   private final jf.c<czu> b = mg.g.f(this);
   private final kh c;
   @Nullable
   private final czu d;
   protected final String n;
   private final cvh o;

   public static int a(czu $$0) {
      return $$0 == null ? 0 : mg.g.a($$0);
   }

   public static czu b(int $$0) {
      return mg.g.a($$0);
   }

   @Deprecated
   public static czu a(dnc $$0) {
      return g.getOrDefault($$0, dac.a);
   }

   public czu(czu.a $$0) {
      this.n = $$0.d();
      this.c = $$0.a(xa.c(this.n), $$0.e());
      this.d = $$0.d;
      this.o = $$0.e;
      if (ac.aU) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jf.c<czu> e() {
      return this.b;
   }

   public kh f() {
      return this.c;
   }

   public int g() {
      return this.c.a(kk.c, 1);
   }

   public void a(djx $$0, bxu $$1, czy $$2, int $$3) {
   }

   public void a(coc $$0) {
   }

   public void l(czy $$0) {
   }

   public boolean a(czy $$0, ebe $$1, djx $$2, iv $$3, bxu $$4) {
      ddb $$5 = $$0.a(kk.A);
      if ($$5 != null && !$$5.d()) {
         if ($$4 instanceof crx $$6 && $$6.gk().d) {
            return false;
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public czu h() {
      return this;
   }

   public bur a(ddt $$0) {
      return bur.e;
   }

   public float a(czy $$0, ebe $$1) {
      ddb $$2 = $$0.a(kk.A);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      dcd $$4 = $$3.a(kk.w);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dih $$5 = $$3.a(kk.D);
         if ($$5 != null && $$5.h()) {
            return $$5.a($$3, $$1);
         } else {
            dbz $$6 = $$3.a(kk.I);
            if ($$6 != null) {
               $$1.c($$2);
               return bur.c;
            } else {
               return bur.e;
            }
         }
      }
   }

   public czy a(czy $$0, djx $$1, bxu $$2) {
      dcd $$3 = $$0.a(kk.w);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(czy $$0) {
      return $$0.n();
   }

   public int e(czy $$0) {
      return azo.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(czy $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azo.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(czy $$0, cxn $$1, cwa $$2, crx $$3) {
      return false;
   }

   public boolean a(czy $$0, czy $$1, cxn $$2, cwa $$3, crx $$4, byl $$5) {
      return false;
   }

   public float a(bwt $$0, float $$1, bvi $$2) {
      return 0.0F;
   }

   @Nullable
   public bvi a(bxu $$0) {
      return null;
   }

   public void a(czy $$0, bxu $$1, bxu $$2) {
   }

   public void b(czy $$0, bxu $$1, bxu $$2) {
   }

   public boolean a(czy $$0, djx $$1, ebe $$2, iv $$3, bxu $$4) {
      ddb $$5 = $$0.a(kk.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bxd.a);
         }

         return true;
      }
   }

   public boolean b(czy $$0, ebe $$1) {
      ddb $$2 = $$0.a(kk.A);
      return $$2 != null && $$2.b($$1);
   }

   public bur a(czy $$0, crx $$1, bxu $$2, buq $$3) {
      return bur.e;
   }

   @Override
   public String toString() {
      return mg.g.e(this).g();
   }

   public final czy i() {
      return this.d == null ? czy.k : new czy(this.d);
   }

   public void a(czy $$0, ars $$1, bwt $$2, @Nullable bxd $$3) {
   }

   public void a(czy $$0, djx $$1, crx $$2) {
      this.a($$0, $$1);
   }

   public void a(czy $$0, djx $$1) {
   }

   public daa b(czy $$0) {
      dcd $$1 = $$0.a(kk.w);
      if ($$1 != null) {
         return $$1.d();
      } else {
         dbz $$2 = $$0.a(kk.I);
         return $$2 != null ? daa.d : daa.a;
      }
   }

   public int a(czy $$0, bxu $$1) {
      dcd $$2 = $$0.a(kk.w);
      if ($$2 != null) {
         return $$2.a();
      } else {
         dbz $$3 = $$0.a(kk.I);
         return $$3 != null ? 72000 : 0;
      }
   }

   public boolean a(czy $$0, djx $$1, bxu $$2, int $$3) {
      return false;
   }

   @Deprecated
   public void a(czy $$0, czu.b $$1, ddc $$2, Consumer<xa> $$3, dbn $$4) {
   }

   public Optional<cxx> k(czy $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String j() {
      return this.n;
   }

   public final xa l() {
      return this.c.a(kk.h, wz.a);
   }

   public xa a(czy $$0) {
      return $$0.a().a(kk.h, wz.a);
   }

   public boolean d_(czy $$0) {
      return $$0.F();
   }

   protected static ffm a(djx $$0, crx $$1, dje.b $$2) {
      ffq $$3 = $$1.bD();
      ffq $$4 = $$3.e($$1.d($$1.dN(), $$1.dL()).c($$1.gL()));
      return $$0.a(new dje($$3, $$4, dje.a.b, $$2, $$1));
   }

   public boolean e_(czy $$0) {
      return false;
   }

   public czy m() {
      return new czy(this);
   }

   public boolean d() {
      return true;
   }

   @Override
   public cvh k() {
      return this.o;
   }

   public boolean a(czy $$0, @Nullable crx $$1) {
      return false;
   }

   public static class a {
      private static final ala<czu, String> a = $$0 -> ag.a("block", $$0.a());
      private static final ala<czu, String> b = $$0 -> ag.a("item", $$0.a());
      private final kh.a c = kh.a().a(kk.aT);
      @Nullable
      czu d;
      cvh e = cvj.g;
      @Nullable
      private alh<czu> f;
      private ala<czu, String> g = b;
      private ala<czu, ali> h = alh::a;

      public czu.a a(cvn $$0) {
         return this.a($$0, dcf.a);
      }

      public czu.a a(cvn $$0, dcd $$1) {
         return this.a(kk.v, $$0).a(kk.w, $$1);
      }

      public czu.a a(czu $$0) {
         return this.a(kk.x, new ddf(new czy($$0)));
      }

      public czu.a a(float $$0) {
         return this.a(kk.y, new dde($$0));
      }

      public czu.a a(int $$0) {
         return this.a(kk.c, $$0);
      }

      public czu.a b(int $$0) {
         this.a(kk.d, $$0);
         this.a(kk.c, 1);
         this.a(kk.e, 0);
         return this;
      }

      public czu.a b(czu $$0) {
         this.d = $$0;
         return this;
      }

      public czu.a a(dau $$0) {
         return this.a(kk.k, $$0);
      }

      public czu.a a() {
         return this.a(kk.z, new dci(axf.i));
      }

      public czu.a a(alh<dae> $$0) {
         return this.a(kk.ae, new dad(new cyz<>($$0)));
      }

      public czu.a c(int $$0) {
         return this.a(kk.C, new dgj($$0));
      }

      public czu.a c(czu $$0) {
         return this.a(kk.E, new dgt(jj.a($$0.e())));
      }

      public czu.a a(axt<czu> $$0) {
         jg<czu> $$1 = mg.a(mg.g);
         return this.a(kk.E, new dgt($$1.b($$0)));
      }

      public czu.a a(bxd $$0) {
         return this.a(kk.D, dih.a($$0).a());
      }

      public czu.a b(bxd $$0) {
         return this.a(kk.D, dih.a($$0).b(false).a());
      }

      public czu.a a(dbm $$0, axt<dnc> $$1, float $$2, float $$3, float $$4) {
         return $$0.a(this, $$1, $$2, $$3, $$4);
      }

      public czu.a a(dbm $$0, float $$1, float $$2) {
         return this.a($$0, axe.bF, $$1, $$2, 0.0F);
      }

      public czu.a b(dbm $$0, float $$1, float $$2) {
         return this.a($$0, axe.bD, $$1, $$2, 5.0F);
      }

      public czu.a c(dbm $$0, float $$1, float $$2) {
         return this.a($$0, axe.bE, $$1, $$2, 0.0F);
      }

      public czu.a d(dbm $$0, float $$1, float $$2) {
         return this.a($$0, axe.bG, $$1, $$2, 0.0F);
      }

      public czu.a e(dbm $$0, float $$1, float $$2) {
         return $$0.a(this, $$1, $$2);
      }

      public czu.a a(dic $$0, die $$1) {
         return this.b($$1.a($$0.a())).a($$0.a($$1)).c($$0.c()).a(kk.D, dih.a($$1.a()).a($$0.d()).a($$0.h()).a()).a($$0.g());
      }

      public czu.a a(dic $$0) {
         return this.b(die.e.a($$0.a())).a($$0.a(die.e)).a($$0.g()).a(kk.D, dih.a(bxd.g).a($$0.d()).a($$0.h()).a(jj.a(bxc.bN.r())).a()).a(kk.au, awp.DM).a(1);
      }

      public czu.a b(dic $$0) {
         jg<bxc<?>> $$1 = mg.a(mg.f);
         return this.a($$0.a(die.e)).a(kk.D, dih.a(bxd.g).a(awp.nk).a($$0.h()).a($$1.b(axh.K)).c(false).a()).a(1);
      }

      public czu.a b(alh<dil> $$0) {
         return this.a(kk.ac, new dcx($$0));
      }

      public czu.a a(cvf... $$0) {
         this.e = cvj.e.a($$0);
         return this;
      }

      public czu.a c(alh<czu> $$0) {
         this.f = $$0;
         return this;
      }

      public czu.a a(String $$0) {
         this.g = ala.fixed($$0);
         return this;
      }

      public czu.a b() {
         this.g = a;
         return this;
      }

      public czu.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public ali e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> czu.a a(kj<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public czu.a a(dcp $$0) {
         return this.a(kk.o, $$0);
      }

      kh a(xa $$0, ali $$1) {
         kh $$2 = this.c.a(kk.h, $$0).a(kk.i, $$1).a();
         if ($$2.c(kk.e) && $$2.a(kk.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      czu.b a = new czu.b() {
         @Nullable
         @Override
         public jh.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public ezj a(ezh $$0) {
            return null;
         }
      };

      @Nullable
      jh.a a();

      float b();

      @Nullable
      ezj a(ezh var1);

      static czu.b a(@Nullable final djx $$0) {
         return $$0 == null ? a : new czu.b() {
            @Override
            public jh.a a() {
               return $$0.J_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public ezj a(ezh $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static czu.b a(final jh.a $$0) {
         return new czu.b() {
            @Override
            public jh.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public ezj a(ezh $$0x) {
               return null;
            }
         };
      }
   }
}
