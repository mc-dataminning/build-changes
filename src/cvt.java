import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cvt implements cqx, deu {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dhy, cvt> e = Maps.newHashMap();
   public static final alh f = alh.b("base_attack_damage");
   public static final alh g = alh.b("base_attack_speed");
   public static final int h = 64;
   public static final int i = 99;
   public static final int j = 13;
   private final jp.c<cvt> b = lx.g.f(this);
   private final kp c;
   @Nullable
   private final cvt d;
   protected final String k;
   private final cra l;

   public static int a(cvt $$0) {
      return $$0 == null ? 0 : lx.g.a($$0);
   }

   public static cvt b(int $$0) {
      return lx.g.a($$0);
   }

   @Deprecated
   public static cvt a(dhy $$0) {
      return e.getOrDefault($$0, cwb.a);
   }

   public cvt(cvt.a $$0) {
      this.k = $$0.d();
      this.c = $$0.a(xh.c(this.k), $$0.e());
      this.d = $$0.d;
      this.l = $$0.e;
      if (ab.aW) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jp.c<cvt> f() {
      return this.b;
   }

   public kp g() {
      return this.c;
   }

   public int h() {
      return this.c.a(kt.c, 1);
   }

   public void a(dev $$0, buv $$1, cvx $$2, int $$3) {
   }

   public void a(ckq $$0) {
   }

   public void l(cvx $$0) {
   }

   public boolean a(dvd $$0, dev $$1, jg $$2, coh $$3) {
      return true;
   }

   @Override
   public cvt j() {
      return this;
   }

   public bry a(czo $$0) {
      return bry.e;
   }

   public float a(cvx $$0, dvd $$1) {
      cyx $$2 = $$0.a(kt.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      cyd $$4 = $$3.a(kt.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         ddh $$5 = $$3.a(kt.D);
         return (bry)($$5 != null ? $$5.a($$3, $$1) : bry.e);
      }
   }

   public cvx a(cvx $$0, dev $$1, buv $$2) {
      cyd $$3 = $$0.a(kt.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean c(cvx $$0) {
      return $$0.n();
   }

   public int d(cvx $$0) {
      return azj.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int e(cvx $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azj.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cvx $$0, ctg $$1, crt $$2, coh $$3) {
      return false;
   }

   public boolean a(cvx $$0, cvx $$1, ctg $$2, crt $$3, coh $$4, bvn $$5) {
      return false;
   }

   public float a(btz $$0, float $$1, bsp $$2) {
      return 0.0F;
   }

   public boolean a(cvx $$0, buv $$1, buv $$2) {
      return false;
   }

   public void b(cvx $$0, buv $$1, buv $$2) {
   }

   public boolean a(cvx $$0, dev $$1, dvd $$2, jg $$3, buv $$4) {
      cyx $$5 = $$0.a(kt.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, buh.a);
         }

         return true;
      }
   }

   public boolean b(cvx $$0, dvd $$1) {
      cyx $$2 = $$0.a(kt.B);
      return $$2 != null && $$2.b($$1);
   }

   public bry a(cvx $$0, coh $$1, buv $$2, brx $$3) {
      return bry.e;
   }

   @Override
   public String toString() {
      return lx.g.e(this).g();
   }

   @Nullable
   public final cvt k() {
      return this.d;
   }

   public boolean l() {
      return this.d != null;
   }

   public void a(cvx $$0, dev $$1, btz $$2, int $$3, boolean $$4) {
   }

   public void b(cvx $$0, dev $$1, coh $$2) {
      this.a($$0, $$1);
   }

   public void a(cvx $$0, dev $$1) {
   }

   public boolean ap_() {
      return false;
   }

   public cvz a(cvx $$0) {
      cyd $$1 = $$0.a(kt.x);
      return $$1 != null ? $$1.d() : cvz.a;
   }

   public int a(cvx $$0, buv $$1) {
      cyd $$2 = $$0.a(kt.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cvx $$0, dev $$1, buv $$2, int $$3) {
      return false;
   }

   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
   }

   public Optional<ctq> j(cvx $$0) {
      return Optional.empty();
   }

   public final String m() {
      return this.k;
   }

   public final xh n() {
      return this.c.a(kt.h, xg.a);
   }

   public xh c_(cvx $$0) {
      return $$0.a().a(kt.h, xg.a);
   }

   public boolean d_(cvx $$0) {
      return $$0.E();
   }

   protected static ezd a(dev $$0, coh $$1, ded.b $$2) {
      ezh $$3 = $$1.bG();
      ezh $$4 = $$3.e($$1.c($$1.dP(), $$1.dN()).c($$1.gK()));
      return $$0.a(new ded($$3, $$4, ded.a.b, $$2, $$1));
   }

   public boolean k(cvx $$0) {
      return false;
   }

   public cvx o() {
      return new cvx(this);
   }

   public awj a() {
      return awk.nA;
   }

   public boolean e() {
      return true;
   }

   @Override
   public cra i() {
      return this.l;
   }

   public static class a {
      private static final akz<cvt, String> a = $$0 -> ad.a("block", $$0.a());
      private static final akz<cvt, String> b = $$0 -> ad.a("item", $$0.a());
      private final kp.a c = kp.a().a(kt.ap);
      @Nullable
      cvt d;
      cra e = crc.h;
      @Nullable
      private alg<cvt> f;
      private akz<cvt, String> g = b;
      private akz<cvt, alh> h = alg::a;

      public cvt.a a(crg $$0) {
         return this.a($$0, cyf.a);
      }

      public cvt.a a(crg $$0, cyd $$1) {
         return this.a(kt.w, $$0).a(kt.x, $$1);
      }

      public cvt.a a(cvt $$0) {
         return this.a(kt.y, new czb(new cvx($$0)));
      }

      public cvt.a a(float $$0) {
         return this.a(kt.z, new cza($$0));
      }

      public cvt.a a(int $$0) {
         return this.a(kt.c, $$0);
      }

      public cvt.a b(int $$0) {
         this.a(kt.d, $$0);
         this.a(kt.c, 1);
         this.a(kt.e, 0);
         return this;
      }

      public cvt.a b(cvt $$0) {
         this.d = $$0;
         return this;
      }

      public cvt.a a(cwu $$0) {
         return this.a(kt.k, $$0);
      }

      public cvt.a a() {
         return this.a(kt.A, bao.a);
      }

      public cvt.a a(alg<cwd> $$0) {
         return this.a(kt.aa, new cwc(new cux<>($$0), true));
      }

      public cvt.a c(int $$0) {
         return this.a(kt.C, new dbk($$0));
      }

      public cvt.a c(cvt $$0) {
         return this.a(kt.E, new dbu(jt.a($$0.f())));
      }

      public cvt.a a(axp<cvt> $$0) {
         jq<cvt> $$1 = lx.a(lx.g);
         return this.a(kt.E, new dbu($$1.b($$0)));
      }

      public cvt.a a(buh $$0, jp<awj> $$1, alh $$2) {
         return this.a(kt.D, new ddh($$0, $$1, Optional.of($$2), Optional.empty(), true));
      }

      public cvt.a a(buh $$0) {
         return this.a(kt.D, new ddh($$0, awk.as, Optional.empty(), Optional.empty(), true));
      }

      public cvt.a a(cqy... $$0) {
         this.e = crc.f.a($$0);
         return this;
      }

      public cvt.a b(alg<cvt> $$0) {
         this.f = $$0;
         return this;
      }

      public cvt.a a(String $$0) {
         this.g = akz.fixed($$0);
         return this;
      }

      public cvt.a b() {
         this.g = a;
         return this;
      }

      public cvt.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public cvt.a a(alh $$0) {
         this.h = akz.fixed($$0);
         return this;
      }

      public alh e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cvt.a a(ks<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cvt.a a(cym $$0) {
         return this.a(kt.o, $$0);
      }

      kp a(xh $$0, alh $$1) {
         kp $$2 = this.c.a(kt.h, $$0).a(kt.i, $$1).a();
         if ($$2.b(kt.e) && $$2.a(kt.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cvt.b a = new cvt.b() {
         @Nullable
         @Override
         public jr.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public esy a(esw $$0) {
            return null;
         }
      };

      @Nullable
      jr.a a();

      float b();

      @Nullable
      esy a(esw var1);

      static cvt.b a(@Nullable final dev $$0) {
         return $$0 == null ? a : new cvt.b() {
            @Override
            public jr.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public esy a(esw $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cvt.b a(final jr.a $$0) {
         return new cvt.b() {
            @Override
            public jr.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public esy a(esw $$0x) {
               return null;
            }
         };
      }
   }
}
