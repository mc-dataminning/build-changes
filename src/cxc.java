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

public class cxc implements csh, dgy {
   public static final Codec<jq<cxc>> e = ma.g
      .r()
      .validate($$0 -> $$0.a(cxk.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dkd, cxc> f = Maps.newHashMap();
   public static final alp g = alp.b("base_attack_damage");
   public static final alp h = alp.b("base_attack_speed");
   public static final int i = 64;
   public static final int j = 99;
   public static final int k = 13;
   private final jq.c<cxc> b = ma.g.f(this);
   private final kq c;
   @Nullable
   private final cxc d;
   protected final String l;
   private final csk m;

   public static int a(cxc $$0) {
      return $$0 == null ? 0 : ma.g.a($$0);
   }

   public static cxc b(int $$0) {
      return ma.g.a($$0);
   }

   @Deprecated
   public static cxc a(dkd $$0) {
      return f.getOrDefault($$0, cxk.a);
   }

   public cxc(cxc.a $$0) {
      this.l = $$0.d();
      this.c = $$0.a(xk.c(this.l), $$0.e());
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
   public jq.c<cxc> f() {
      return this.b;
   }

   public kq g() {
      return this.c;
   }

   public int h() {
      return this.c.a(ku.c, 1);
   }

   public void a(dgz $$0, bvx $$1, cxg $$2, int $$3) {
   }

   public void a(cls $$0) {
   }

   public void l(cxg $$0) {
   }

   public boolean a(dxo $$0, dgz $$1, jh $$2, cpo $$3) {
      return true;
   }

   @Override
   public cxc j() {
      return this;
   }

   public bta a(daz $$0) {
      return bta.e;
   }

   public float a(cxg $$0, dxo $$1) {
      dai $$2 = $$0.a(ku.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      czm $$4 = $$3.a(ku.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dfl $$5 = $$3.a(ku.D);
         return (bta)($$5 != null && $$5.g() ? $$5.a($$3, $$1) : bta.e);
      }
   }

   public cxg a(cxg $$0, dgz $$1, bvx $$2) {
      czm $$3 = $$0.a(ku.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cxg $$0) {
      return $$0.n();
   }

   public int e(cxg $$0) {
      return azu.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cxg $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azu.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cxg $$0, cuq $$1, ctd $$2, cpo $$3) {
      return false;
   }

   public boolean a(cxg $$0, cxg $$1, cuq $$2, ctd $$3, cpo $$4, bwp $$5) {
      return false;
   }

   public float a(bvb $$0, float $$1, btr $$2) {
      return 0.0F;
   }

   @Nullable
   public btr a(bvx $$0) {
      return null;
   }

   public boolean a(cxg $$0, bvx $$1, bvx $$2) {
      return false;
   }

   public void b(cxg $$0, bvx $$1, bvx $$2) {
   }

   public boolean a(cxg $$0, dgz $$1, dxo $$2, jh $$3, bvx $$4) {
      dai $$5 = $$0.a(ku.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bvj.a);
         }

         return true;
      }
   }

   public boolean b(cxg $$0, dxo $$1) {
      dai $$2 = $$0.a(ku.B);
      return $$2 != null && $$2.b($$1);
   }

   public bta a(cxg $$0, cpo $$1, bvx $$2, bsz $$3) {
      return bta.e;
   }

   @Override
   public String toString() {
      return ma.g.e(this).g();
   }

   public final cxg k() {
      return this.d == null ? cxg.j : new cxg(this.d);
   }

   public void a(cxg $$0, dgz $$1, bvb $$2, int $$3, boolean $$4) {
   }

   public void a(cxg $$0, dgz $$1, cpo $$2) {
      this.a($$0, $$1);
   }

   public void a(cxg $$0, dgz $$1) {
   }

   public cxi b(cxg $$0) {
      czm $$1 = $$0.a(ku.x);
      return $$1 != null ? $$1.d() : cxi.a;
   }

   public int a(cxg $$0, bvx $$1) {
      czm $$2 = $$0.a(ku.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cxg $$0, dgz $$1, bvx $$2, int $$3) {
      return false;
   }

   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
   }

   public Optional<cva> k(cxg $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String l() {
      return this.l;
   }

   public final xk m() {
      return this.c.a(ku.h, xj.a);
   }

   public xk a(cxg $$0) {
      return $$0.a().a(ku.h, xj.a);
   }

   public boolean c_(cxg $$0) {
      return $$0.F();
   }

   protected static fbn a(dgz $$0, cpo $$1, dgh.b $$2) {
      fbr $$3 = $$1.bF();
      fbr $$4 = $$3.e($$1.d($$1.dO(), $$1.dM()).c($$1.gJ()));
      return $$0.a(new dgh($$3, $$4, dgh.a.b, $$2, $$1));
   }

   public boolean d_(cxg $$0) {
      return false;
   }

   public cxg n() {
      return new cxg(this);
   }

   public awu a() {
      return awv.nZ;
   }

   public boolean e() {
      return true;
   }

   @Override
   public csk i() {
      return this.m;
   }

   public static class a {
      private static final alh<cxc, String> a = $$0 -> ae.a("block", $$0.a());
      private static final alh<cxc, String> b = $$0 -> ae.a("item", $$0.a());
      private final kq.a c = kq.a().a(ku.aq);
      @Nullable
      cxc d;
      csk e = csm.g;
      @Nullable
      private alo<cxc> f;
      private alh<cxc, String> g = b;
      private alh<cxc, alp> h = alo::a;

      public cxc.a a(csq $$0) {
         return this.a($$0, czo.a);
      }

      public cxc.a a(csq $$0, czm $$1) {
         return this.a(ku.w, $$0).a(ku.x, $$1);
      }

      public cxc.a a(cxc $$0) {
         return this.a(ku.y, new dam(new cxg($$0)));
      }

      public cxc.a a(float $$0) {
         return this.a(ku.z, new dal($$0));
      }

      public cxc.a a(int $$0) {
         return this.a(ku.c, $$0);
      }

      public cxc.a b(int $$0) {
         this.a(ku.d, $$0);
         this.a(ku.c, 1);
         this.a(ku.e, 0);
         return this;
      }

      public cxc.a b(cxc $$0) {
         this.d = $$0;
         return this;
      }

      public cxc.a a(cyd $$0) {
         return this.a(ku.k, $$0);
      }

      public cxc.a a() {
         return this.a(ku.A, new czr(axm.i));
      }

      public cxc.a a(alo<cxm> $$0) {
         return this.a(ku.ab, new cxl(new cwg<>($$0), true));
      }

      public cxc.a c(int $$0) {
         return this.a(ku.C, new ddo($$0));
      }

      public cxc.a c(cxc $$0) {
         return this.a(ku.E, new ddy(ju.a($$0.f())));
      }

      public cxc.a a(aya<cxc> $$0) {
         jr<cxc> $$1 = ma.a(ma.g);
         return this.a(ku.E, new ddy($$1.b($$0)));
      }

      public cxc.a a(bvj $$0) {
         return this.a(ku.D, dfl.a($$0).a());
      }

      public cxc.a b(bvj $$0) {
         return this.a(ku.D, dfl.a($$0).b(false).a());
      }

      public cxc.a a(csi... $$0) {
         this.e = csm.e.a($$0);
         return this;
      }

      public cxc.a b(alo<cxc> $$0) {
         this.f = $$0;
         return this;
      }

      public cxc.a a(String $$0) {
         this.g = alh.fixed($$0);
         return this;
      }

      public cxc.a b() {
         this.g = a;
         return this;
      }

      public cxc.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public cxc.a a(alp $$0) {
         this.h = alh.fixed($$0);
         return this;
      }

      public alp e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cxc.a a(kt<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cxc.a a(czx $$0) {
         return this.a(ku.o, $$0);
      }

      kq a(xk $$0, alp $$1) {
         kq $$2 = this.c.a(ku.h, $$0).a(ku.i, $$1).a();
         if ($$2.b(ku.e) && $$2.a(ku.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cxc.b a = new cxc.b() {
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
         public evk a(evi $$0) {
            return null;
         }

         @Override
         public int c() {
            return 0;
         }
      };

      @Nullable
      js.a a();

      float b();

      @Nullable
      evk a(evi var1);

      int c();

      static cxc.b a(@Nullable final dgz $$0, @Nullable cpo $$1) {
         if ($$0 == null) {
            return a;
         } else {
            final int $$2 = $$1 != null ? $$1.G() : 0;
            return new cxc.b() {
               @Override
               public js.a a() {
                  return $$0.K_();
               }

               @Override
               public float b() {
                  return $$0.u().f();
               }

               @Override
               public evk a(evi $$0x) {
                  return $$0.a($$0);
               }

               @Override
               public int c() {
                  return $$2;
               }
            };
         }
      }

      static cxc.b a(final js.a $$0) {
         return new cxc.b() {
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
            public evk a(evi $$0x) {
               return null;
            }

            @Override
            public int c() {
               return 0;
            }
         };
      }
   }
}
