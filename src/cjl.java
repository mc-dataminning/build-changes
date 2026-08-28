import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjl extends cip implements bxu {
   private static final akj<Integer> bG = akn.a(cjl.class, akl.b);
   private static final int bH = 1024;
   private static final String bI = "stew_effects";
   @Nullable
   private dcf bK;
   @Nullable
   private UUID bL;

   public cjl(bwo<? extends cjl> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(iu $$0, djd $$1) {
      return $$1.a_($$0.e()).a(dmh.fE) ? 10.0F : $$1.x($$0);
   }

   public static boolean c(bwo<cjl> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.ce) && a($$1, $$3);
   }

   @Override
   public void a(arq $$0, bxd $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.bL)) {
         this.a(this.t() == cjl.a.a ? cjl.a.b : cjl.a.a);
         this.bL = $$2;
         this.a(awn.pA, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, cjl.a.a.g);
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ($$2.a(czh.ph) && !this.n_()) {
         boolean $$3 = false;
         czd $$4;
         if (this.bK != null) {
            $$3 = true;
            $$4 = new czd(czh.xh);
            $$4.b(kj.T, this.bK);
            this.bK = null;
         } else {
            $$4 = new czd(czh.qf);
         }

         czd $$6 = czg.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awm $$7;
         if ($$3) {
            $$7 = awn.pD;
         } else {
            $$7 = awn.pC;
         }

         this.a($$7, 1.0F, 1.0F);
         return bud.a;
      } else if ($$2.a(czh.td) && this.a()) {
         if (this.dV() instanceof arq $$9) {
            this.a($$9, awo.h, $$2);
            this.a(efh.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bud.a;
      } else if (this.t() == cjl.a.b) {
         Optional<dcf> $$10 = this.j($$2);
         if ($$10.isEmpty()) {
            return super.b($$0, $$1);
         } else {
            if (this.bK != null) {
               for (int $$11 = 0; $$11 < 2; $$11++) {
                  this.dV().a(lx.ah, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }
            } else {
               $$2.a(1, $$0);

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  this.dV().a(lx.p, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }

               this.bK = $$10.get();
               this.a(awn.pB, 2.0F, 1.0F);
            }

            return bud.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arq $$0, awo $$1, czd $$2) {
      $$0.a(null, this, awn.pE, $$1, 1.0F, 1.0F);
      this.a(bwo.C, bvz.a(this, false, false), $$2x -> {
         $$0.a(lx.w, this.dA(), this.e(0.5), this.dG(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, ezd.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new cnh(this.dV(), this.dA(), this.e(1.0), this.dG(), $$1xx.c(1)));
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
      if (this.bK != null) {
         $$0.a("stew_effects", dcf.c, this.bK);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(cjl.a.a($$0.l("Type")));
      this.bK = $$0.<dcf>a("stew_effects", dcf.c).orElse(dcf.a);
   }

   private Optional<dcf> j(czd $$0) {
      dur $$1 = dur.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   private void a(cjl.a $$0) {
      this.al.a(bG, $$0.g);
   }

   public cjl.a t() {
      return cjl.a.a(this.al.a(bG));
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
   public cjl b(arq $$0, bvv $$1) {
      cjl $$2 = bwo.aE.a($$0, bwn.e);
      if ($$2 != null) {
         $$2.a(this.a((cjl)$$1));
      }

      return $$2;
   }

   private cjl.a a(cjl $$0) {
      cjl.a $$1 = this.t();
      cjl.a $$2 = $$0.t();
      cjl.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == cjl.a.b ? cjl.a.a : cjl.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bak {
      a("red", 0, dmh.cq.m()),
      b("brown", 1, dmh.cp.m());

      public static final bak.a<cjl.a> c = bak.a(cjl.a::values);
      private static final IntFunction<cjl.a> e = ayc.a(cjl.a::b, values(), ayc.a.c);
      public static final yw<ByteBuf, cjl.a> d = yu.a(e, cjl.a::b);
      private final String f;
      final int g;
      private final eah h;

      private a(final String $$0, final int $$1, final eah $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
      }

      public eah a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.f;
      }

      private int b() {
         return this.g;
      }

      static cjl.a a(String $$0) {
         return c.a($$0, a);
      }

      static cjl.a a(int $$0) {
         return e.apply($$0);
      }
   }
}
