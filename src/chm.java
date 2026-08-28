import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class chm extends chg implements bvz, bwi<chm.a> {
   private static final ajy<String> bY = akc.a(chm.class, aka.e);
   private static final int bZ = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private czr cc;
   @Nullable
   private UUID cd;

   public chm(but<? extends chm> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ji $$0, dgm $$1) {
      return $$1.a_($$0.e()).a(djp.fA) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(but<chm> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cc) && a($$1, $$3);
   }

   @Override
   public void a(ard $$0, bvh $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.cd)) {
         this.a(this.t() == chm.a.a ? chm.a.b : chm.a.a);
         this.cd = $$2;
         this.a(awa.pm, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bY, chm.a.a.d);
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      if ($$2.a(cwu.oY) && !this.e_()) {
         boolean $$3 = false;
         cwq $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cwq(cwu.wW);
            $$4.b(kv.R, this.cc);
            this.cc = null;
         } else {
            $$4 = new cwq(cwu.pW);
         }

         cwq $$6 = cwt.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avz $$7;
         if ($$3) {
            $$7 = awa.pp;
         } else {
            $$7 = awa.po;
         }

         this.a($$7, 1.0F, 1.0F);
         return bsl.a;
      } else if ($$2.a(cwu.sS) && this.a()) {
         if (this.dV() instanceof ard $$9) {
            this.a($$9, awb.h, $$2);
            this.a(ebu.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsl.a;
      } else if (this.t() == chm.a.b) {
         Optional<czr> $$10 = this.i($$2);
         if ($$10.isEmpty()) {
            return super.b($$0, $$1);
         } else {
            if (this.cc != null) {
               for (int $$11 = 0; $$11 < 2; $$11++) {
                  this.dV().a(lt.ag, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }
            } else {
               $$2.a(1, $$0);

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  this.dV().a(lt.p, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }

               this.cc = $$10.get();
               this.a(awa.pn, 2.0F, 1.0F);
            }

            return bsl.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ard $$0, awb $$1, cwq $$2) {
      $$0.a(null, this, awa.pq, $$1, 1.0F, 1.0F);
      this.a(but.C, buh.a(this, false, false), $$2x -> {
         $$0.a(lt.w, this.dA(), this.e(0.5), this.dG(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, evo.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new cld(this.dV(), this.dA(), this.e(1.0), this.dG(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bL() && !this.e_();
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.cc != null) {
         czr.c.encodeStart(ue.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(chm.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         czr.c.parse(ue.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<czr> i(cwq $$0) {
      dru $$1 = dru.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   public void a(chm.a $$0) {
      this.al.a(bY, $$0.d);
   }

   public chm.a t() {
      return chm.a.a(this.al.a(bY));
   }

   @Nullable
   public chm c(ard $$0, bud $$1) {
      chm $$2 = but.aE.a($$0, bus.e);
      if ($$2 != null) {
         $$2.a(this.a((chm)$$1));
      }

      return $$2;
   }

   private chm.a a(chm $$0) {
      chm.a $$1 = this.t();
      chm.a $$2 = $$0.t();
      chm.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == chm.a.b ? chm.a.a : chm.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azv {
      a("red", djp.cn.m()),
      b("brown", djp.cm.m());

      public static final azv.a<chm.a> c = azv.a(chm.a::values);
      final String d;
      private final dwy e;

      private a(final String $$0, final dwy $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dwy a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static chm.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
