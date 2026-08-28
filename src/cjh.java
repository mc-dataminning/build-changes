import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjh extends cin implements bxs {
   private static final akj<Integer> bF = akn.a(cjh.class, akl.b);
   private static final int bG = 1024;
   private static final String bH = "stew_effects";
   @Nullable
   private dca bJ;
   @Nullable
   private UUID bK;

   public cjh(bwm<? extends cjh> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(iu $$0, diy $$1) {
      return $$1.a_($$0.e()).a(dmc.fB) ? 10.0F : $$1.x($$0);
   }

   public static boolean c(bwm<cjh> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cd) && a($$1, $$3);
   }

   @Override
   public void a(arq $$0, bxb $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.bK)) {
         this.a(this.t() == cjh.a.a ? cjh.a.b : cjh.a.a);
         this.bK = $$2;
         this.a(awn.px, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bF, cjh.a.a.g);
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if ($$2.a(czc.pe) && !this.n_()) {
         boolean $$3 = false;
         cyy $$4;
         if (this.bJ != null) {
            $$3 = true;
            $$4 = new cyy(czc.xc);
            $$4.b(kj.T, this.bJ);
            this.bJ = null;
         } else {
            $$4 = new cyy(czc.qc);
         }

         cyy $$6 = czb.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awm $$7;
         if ($$3) {
            $$7 = awn.pA;
         } else {
            $$7 = awn.pz;
         }

         this.a($$7, 1.0F, 1.0F);
         return bub.a;
      } else if ($$2.a(czc.sY) && this.a()) {
         if (this.dV() instanceof arq $$9) {
            this.a($$9, awo.h, $$2);
            this.a(eez.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bub.a;
      } else if (this.t() == cjh.a.b) {
         Optional<dca> $$10 = this.k($$2);
         if ($$10.isEmpty()) {
            return super.b($$0, $$1);
         } else {
            if (this.bJ != null) {
               for (int $$11 = 0; $$11 < 2; $$11++) {
                  this.dV().a(lx.ah, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }
            } else {
               $$2.a(1, $$0);

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  this.dV().a(lx.p, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }

               this.bJ = $$10.get();
               this.a(awn.py, 2.0F, 1.0F);
            }

            return bub.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arq $$0, awo $$1, cyy $$2) {
      $$0.a(null, this, awn.pB, $$1, 1.0F, 1.0F);
      this.a(bwm.C, bvx.a(this, false, false), $$2x -> {
         $$0.a(lx.w, this.dA(), this.e(0.5), this.dG(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, eyv.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new cnd(this.dV(), this.dA(), this.e(1.0), this.dG(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bK() && !this.n_();
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.bJ != null) {
         $$0.a("stew_effects", dca.c, this.bJ);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(cjh.a.a($$0.l("Type")));
      this.bJ = $$0.<dca>a("stew_effects", dca.c).orElse(dca.a);
   }

   private Optional<dca> k(cyy $$0) {
      duk $$1 = duk.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   private void a(cjh.a $$0) {
      this.al.a(bF, $$0.g);
   }

   public cjh.a t() {
      return cjh.a.a(this.al.a(bF));
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aE ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aE);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aE) {
         this.a(c(kj.aE, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cjh b(arq $$0, bvt $$1) {
      cjh $$2 = bwm.aE.a($$0, bwl.e);
      if ($$2 != null) {
         $$2.a(this.a((cjh)$$1));
      }

      return $$2;
   }

   private cjh.a a(cjh $$0) {
      cjh.a $$1 = this.t();
      cjh.a $$2 = $$0.t();
      cjh.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == cjh.a.b ? cjh.a.a : cjh.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bak {
      a("red", 0, dmc.co.m()),
      b("brown", 1, dmc.cn.m());

      public static final bak.a<cjh.a> c = bak.a(cjh.a::values);
      private static final IntFunction<cjh.a> e = ayc.a(cjh.a::b, values(), ayc.a.c);
      public static final yw<ByteBuf, cjh.a> d = yu.a(e, cjh.a::b);
      private final String f;
      final int g;
      private final dzz h;

      private a(final String $$0, final int $$1, final dzz $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
      }

      public dzz a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.f;
      }

      private int b() {
         return this.g;
      }

      static cjh.a a(String $$0) {
         return c.a($$0, a);
      }

      static cjh.a a(int $$0) {
         return e.apply($$0);
      }
   }
}
