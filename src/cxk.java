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

public class cxk implements csp, dhg {
   public static final Codec<jq<cxk>> e = ma.g
      .r()
      .validate($$0 -> $$0.a(cxs.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dkl, cxk> f = Maps.newHashMap();
   public static final alz g = alz.b("base_attack_damage");
   public static final alz h = alz.b("base_attack_speed");
   public static final int i = 64;
   public static final int j = 99;
   public static final int k = 13;
   private final jq.c<cxk> b = ma.g.f(this);
   private final kq c;
   @Nullable
   private final cxk d;
   protected final String l;
   private final css m;

   public static int a(cxk $$0) {
      return $$0 == null ? 0 : ma.g.a($$0);
   }

   public static cxk b(int $$0) {
      return ma.g.a($$0);
   }

   @Deprecated
   public static cxk a(dkl $$0) {
      return f.getOrDefault($$0, cxs.a);
   }

   public cxk(cxk.a $$0) {
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
   public jq.c<cxk> f() {
      return this.b;
   }

   public kq g() {
      return this.c;
   }

   public int h() {
      return this.c.a(ku.c, 1);
   }

   public void a(dhh $$0, bwf $$1, cxo $$2, int $$3) {
   }

   public void a(cma $$0) {
   }

   public void l(cxo $$0) {
   }

   public boolean a(dxu $$0, dhh $$1, jh $$2, cpw $$3) {
      return true;
   }

   @Override
   public cxk j() {
      return this;
   }

   public bti a(dbh $$0) {
      return bti.e;
   }

   public float a(cxo $$0, dxu $$1) {
      daq $$2 = $$0.a(ku.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      czu $$4 = $$3.a(ku.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dft $$5 = $$3.a(ku.D);
         return (bti)($$5 != null && $$5.g() ? $$5.a($$3, $$1) : bti.e);
      }
   }

   public cxo a(cxo $$0, dhh $$1, bwf $$2) {
      czu $$3 = $$0.a(ku.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cxo $$0) {
      return $$0.n();
   }

   public int e(cxo $$0) {
      return bae.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cxo $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return bae.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cxo $$0, cuy $$1, ctl $$2, cpw $$3) {
      return false;
   }

   public boolean a(cxo $$0, cxo $$1, cuy $$2, ctl $$3, cpw $$4, bwx $$5) {
      return false;
   }

   public float a(bvj $$0, float $$1, btz $$2) {
      return 0.0F;
   }

   @Nullable
   public btz a(bwf $$0) {
      return null;
   }

   public boolean a(cxo $$0, bwf $$1, bwf $$2) {
      return false;
   }

   public void b(cxo $$0, bwf $$1, bwf $$2) {
   }

   public boolean a(cxo $$0, dhh $$1, dxu $$2, jh $$3, bwf $$4) {
      daq $$5 = $$0.a(ku.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bvr.a);
         }

         return true;
      }
   }

   public boolean b(cxo $$0, dxu $$1) {
      daq $$2 = $$0.a(ku.B);
      return $$2 != null && $$2.b($$1);
   }

   public bti a(cxo $$0, cpw $$1, bwf $$2, bth $$3) {
      return bti.e;
   }

   @Override
   public String toString() {
      return ma.g.e(this).g();
   }

   public final cxo k() {
      return this.d == null ? cxo.j : new cxo(this.d);
   }

   public void a(cxo $$0, dhh $$1, bvj $$2, int $$3, boolean $$4) {
   }

   public void a(cxo $$0, dhh $$1, cpw $$2) {
      this.a($$0, $$1);
   }

   public void a(cxo $$0, dhh $$1) {
   }

   public cxq b(cxo $$0) {
      czu $$1 = $$0.a(ku.x);
      return $$1 != null ? $$1.d() : cxq.a;
   }

   public int a(cxo $$0, bwf $$1) {
      czu $$2 = $$0.a(ku.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cxo $$0, dhh $$1, bwf $$2, int $$3) {
      return false;
   }

   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
   }

   public Optional<cvi> k(cxo $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String l() {
      return this.l;
   }

   public final xv m() {
      return this.c.a(ku.h, xu.a);
   }

   public xv a(cxo $$0) {
      return $$0.a().a(ku.h, xu.a);
   }

   public boolean c_(cxo $$0) {
      return $$0.E();
   }

   protected static fbt a(dhh $$0, cpw $$1, dgp.b $$2) {
      fbx $$3 = $$1.bF();
      fbx $$4 = $$3.e($$1.d($$1.dO(), $$1.dM()).c($$1.gJ()));
      return $$0.a(new dgp($$3, $$4, dgp.a.b, $$2, $$1));
   }

   public boolean d_(cxo $$0) {
      return false;
   }

   public cxo n() {
      return new cxo(this);
   }

   public axe a() {
      return axf.nT;
   }

   public boolean e() {
      return true;
   }

   @Override
   public css i() {
      return this.m;
   }

   public static class a {
      private static final alr<cxk, String> a = $$0 -> ae.a("block", $$0.a());
      private static final alr<cxk, String> b = $$0 -> ae.a("item", $$0.a());
      private final kq.a c = kq.a().a(ku.aq);
      @Nullable
      cxk d;
      css e = csu.h;
      @Nullable
      private aly<cxk> f;
      private alr<cxk, String> g = b;
      private alr<cxk, alz> h = aly::a;

      public cxk.a a(csy $$0) {
         return this.a($$0, czw.a);
      }

      public cxk.a a(csy $$0, czu $$1) {
         return this.a(ku.w, $$0).a(ku.x, $$1);
      }

      public cxk.a a(cxk $$0) {
         return this.a(ku.y, new dau(new cxo($$0)));
      }

      public cxk.a a(float $$0) {
         return this.a(ku.z, new dat($$0));
      }

      public cxk.a a(int $$0) {
         return this.a(ku.c, $$0);
      }

      public cxk.a b(int $$0) {
         this.a(ku.d, $$0);
         this.a(ku.c, 1);
         this.a(ku.e, 0);
         return this;
      }

      public cxk.a b(cxk $$0) {
         this.d = $$0;
         return this;
      }

      public cxk.a a(cyl $$0) {
         return this.a(ku.k, $$0);
      }

      public cxk.a a() {
         return this.a(ku.A, new czz(axw.i));
      }

      public cxk.a a(aly<cxu> $$0) {
         return this.a(ku.ab, new cxt(new cwo<>($$0), true));
      }

      public cxk.a c(int $$0) {
         return this.a(ku.C, new ddw($$0));
      }

      public cxk.a c(cxk $$0) {
         return this.a(ku.E, new deg(ju.a($$0.f())));
      }

      public cxk.a a(ayk<cxk> $$0) {
         jr<cxk> $$1 = ma.a(ma.g);
         return this.a(ku.E, new deg($$1.b($$0)));
      }

      public cxk.a a(bvr $$0) {
         return this.a(ku.D, dft.a($$0).a());
      }

      public cxk.a b(bvr $$0) {
         return this.a(ku.D, dft.a($$0).b(false).a());
      }

      public cxk.a a(csq... $$0) {
         this.e = csu.f.a($$0);
         return this;
      }

      public cxk.a b(aly<cxk> $$0) {
         this.f = $$0;
         return this;
      }

      public cxk.a a(String $$0) {
         this.g = alr.fixed($$0);
         return this;
      }

      public cxk.a b() {
         this.g = a;
         return this;
      }

      public cxk.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public cxk.a a(alz $$0) {
         this.h = alr.fixed($$0);
         return this;
      }

      public alz e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cxk.a a(kt<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cxk.a a(daf $$0) {
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
      cxk.b a = new cxk.b() {
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
         public evq a(evo $$0) {
            return null;
         }
      };

      @Nullable
      js.a a();

      float b();

      @Nullable
      evq a(evo var1);

      static cxk.b a(@Nullable final dhh $$0) {
         return $$0 == null ? a : new cxk.b() {
            @Override
            public js.a a() {
               return $$0.K_();
            }

            @Override
            public float b() {
               return $$0.t().f();
            }

            @Override
            public evq a(evo $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cxk.b a(final js.a $$0) {
         return new cxk.b() {
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
            public evq a(evo $$0x) {
               return null;
            }
         };
      }
   }
}
