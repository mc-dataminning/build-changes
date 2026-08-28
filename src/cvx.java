import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cvx implements crc, dfa {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<die, cvx> e = Maps.newHashMap();
   public static final ali f = ali.b("base_attack_damage");
   public static final ali g = ali.b("base_attack_speed");
   public static final int h = 64;
   public static final int i = 99;
   public static final int j = 13;
   private final jq.c<cvx> b = ly.g.f(this);
   private final kq c;
   @Nullable
   private final cvx d;
   protected final String k;
   private final crf l;

   public static int a(cvx $$0) {
      return $$0 == null ? 0 : ly.g.a($$0);
   }

   public static cvx b(int $$0) {
      return ly.g.a($$0);
   }

   @Deprecated
   public static cvx a(die $$0) {
      return e.getOrDefault($$0, cwf.a);
   }

   public cvx(cvx.a $$0) {
      this.k = $$0.d();
      this.c = $$0.a(xi.c(this.k), $$0.e());
      this.d = $$0.d;
      this.l = $$0.e;
      if (ab.aV) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jq.c<cvx> f() {
      return this.b;
   }

   public kq g() {
      return this.c;
   }

   public int h() {
      return this.c.a(ku.c, 1);
   }

   public void a(dfb $$0, bva $$1, cwb $$2, int $$3) {
   }

   public void a(ckv $$0) {
   }

   public void l(cwb $$0) {
   }

   public boolean a(dvj $$0, dfb $$1, jh $$2, com $$3) {
      return true;
   }

   @Override
   public cvx j() {
      return this;
   }

   public bsd a(czu $$0) {
      return bsd.e;
   }

   public float a(cwb $$0, dvj $$1) {
      czd $$2 = $$0.a(ku.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = $$1.b($$2);
      cyh $$4 = $$3.a(ku.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         ddn $$5 = $$3.a(ku.D);
         return (bsd)($$5 != null && $$5.f() ? $$5.a($$3, $$1) : bsd.e);
      }
   }

   public cwb a(cwb $$0, dfb $$1, bva $$2) {
      cyh $$3 = $$0.a(ku.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cwb $$0) {
      return $$0.n();
   }

   public int e(cwb $$0) {
      return azk.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cwb $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azk.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cwb $$0, ctl $$1, cry $$2, com $$3) {
      return false;
   }

   public boolean a(cwb $$0, cwb $$1, ctl $$2, cry $$3, com $$4, bvs $$5) {
      return false;
   }

   public float a(bue $$0, float $$1, bsu $$2) {
      return 0.0F;
   }

   @Nullable
   public bsu a(bva $$0) {
      return null;
   }

   public boolean a(cwb $$0, bva $$1, bva $$2) {
      return false;
   }

   public void b(cwb $$0, bva $$1, bva $$2) {
   }

   public boolean a(cwb $$0, dfb $$1, dvj $$2, jh $$3, bva $$4) {
      czd $$5 = $$0.a(ku.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bum.a);
         }

         return true;
      }
   }

   public boolean b(cwb $$0, dvj $$1) {
      czd $$2 = $$0.a(ku.B);
      return $$2 != null && $$2.b($$1);
   }

   public bsd a(cwb $$0, com $$1, bva $$2, bsc $$3) {
      return bsd.e;
   }

   @Override
   public String toString() {
      return ly.g.e(this).g();
   }

   @Nullable
   public final cvx k() {
      return this.d;
   }

   public boolean l() {
      return this.d != null;
   }

   public void a(cwb $$0, dfb $$1, bue $$2, int $$3, boolean $$4) {
   }

   public void a(cwb $$0, dfb $$1, com $$2) {
      this.a($$0, $$1);
   }

   public void a(cwb $$0, dfb $$1) {
   }

   public cwd b(cwb $$0) {
      cyh $$1 = $$0.a(ku.x);
      return $$1 != null ? $$1.d() : cwd.a;
   }

   public int a(cwb $$0, bva $$1) {
      cyh $$2 = $$0.a(ku.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cwb $$0, dfb $$1, bva $$2, int $$3) {
      return false;
   }

   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
   }

   public Optional<ctv> k(cwb $$0) {
      return Optional.empty();
   }

   public final String m() {
      return this.k;
   }

   public final xi n() {
      return this.c.a(ku.h, xh.a);
   }

   public xi a(cwb $$0) {
      return $$0.a().a(ku.h, xh.a);
   }

   public boolean c_(cwb $$0) {
      return $$0.E();
   }

   protected static ezj a(dfb $$0, com $$1, dej.b $$2) {
      ezn $$3 = $$1.bG();
      ezn $$4 = $$3.e($$1.c($$1.dP(), $$1.dN()).c($$1.gK()));
      return $$0.a(new dej($$3, $$4, dej.a.b, $$2, $$1));
   }

   public boolean d_(cwb $$0) {
      return false;
   }

   public cwb o() {
      return new cwb(this);
   }

   public awk a() {
      return awl.nA;
   }

   public boolean e() {
      return true;
   }

   @Override
   public crf i() {
      return this.l;
   }

   public static class a {
      private static final ala<cvx, String> a = $$0 -> ae.a("block", $$0.a());
      private static final ala<cvx, String> b = $$0 -> ae.a("item", $$0.a());
      private final kq.a c = kq.a().a(ku.aq);
      @Nullable
      cvx d;
      crf e = crh.h;
      @Nullable
      private alh<cvx> f;
      private ala<cvx, String> g = b;
      private ala<cvx, ali> h = alh::a;

      public cvx.a a(crl $$0) {
         return this.a($$0, cyj.a);
      }

      public cvx.a a(crl $$0, cyh $$1) {
         return this.a(ku.w, $$0).a(ku.x, $$1);
      }

      public cvx.a a(cvx $$0) {
         return this.a(ku.y, new czh(new cwb($$0)));
      }

      public cvx.a a(float $$0) {
         return this.a(ku.z, new czg($$0));
      }

      public cvx.a a(int $$0) {
         return this.a(ku.c, $$0);
      }

      public cvx.a b(int $$0) {
         this.a(ku.d, $$0);
         this.a(ku.c, 1);
         this.a(ku.e, 0);
         return this;
      }

      public cvx.a b(cvx $$0) {
         this.d = $$0;
         return this;
      }

      public cvx.a a(cwy $$0) {
         return this.a(ku.k, $$0);
      }

      public cvx.a a() {
         return this.a(ku.A, new cym(axc.i));
      }

      public cvx.a a(alh<cwh> $$0) {
         return this.a(ku.ab, new cwg(new cvb<>($$0), true));
      }

      public cvx.a c(int $$0) {
         return this.a(ku.C, new dbq($$0));
      }

      public cvx.a c(cvx $$0) {
         return this.a(ku.E, new dca(ju.a($$0.f())));
      }

      public cvx.a a(axq<cvx> $$0) {
         jr<cvx> $$1 = ly.a(ly.g);
         return this.a(ku.E, new dca($$1.b($$0)));
      }

      public cvx.a a(bum $$0) {
         return this.a(ku.D, ddn.a($$0).a());
      }

      public cvx.a b(bum $$0) {
         return this.a(ku.D, ddn.a($$0).b(false).a());
      }

      public cvx.a a(crd... $$0) {
         this.e = crh.f.a($$0);
         return this;
      }

      public cvx.a b(alh<cvx> $$0) {
         this.f = $$0;
         return this;
      }

      public cvx.a a(String $$0) {
         this.g = ala.fixed($$0);
         return this;
      }

      public cvx.a b() {
         this.g = a;
         return this;
      }

      public cvx.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public cvx.a a(ali $$0) {
         this.h = ala.fixed($$0);
         return this;
      }

      public ali e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cvx.a a(kt<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cvx.a a(cys $$0) {
         return this.a(ku.o, $$0);
      }

      kq a(xi $$0, ali $$1) {
         kq $$2 = this.c.a(ku.h, $$0).a(ku.i, $$1).a();
         if ($$2.b(ku.e) && $$2.a(ku.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cvx.b a = new cvx.b() {
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
         public ete a(etc $$0) {
            return null;
         }
      };

      @Nullable
      js.a a();

      float b();

      @Nullable
      ete a(etc var1);

      static cvx.b a(@Nullable final dfb $$0) {
         return $$0 == null ? a : new cvx.b() {
            @Override
            public js.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public ete a(etc $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cvx.b a(final js.a $$0) {
         return new cvx.b() {
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
            public ete a(etc $$0x) {
               return null;
            }
         };
      }
   }
}
