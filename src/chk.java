import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class chk extends che implements bvx, bwg<chk.a> {
   private static final ajy<String> bY = akc.a(chk.class, aka.e);
   private static final int bZ = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private czp cc;
   @Nullable
   private UUID cd;

   public chk(bur<? extends chk> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ji $$0, dgk $$1) {
      return $$1.a_($$0.e()).a(djn.fA) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bur<chk> $$0, dgi $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cc) && a($$1, $$3);
   }

   @Override
   public void a(ard $$0, bvf $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.cd)) {
         this.a(this.t() == chk.a.a ? chk.a.b : chk.a.a);
         this.cd = $$2;
         this.a(awa.pm, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bY, chk.a.a.d);
   }

   @Override
   public bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      if ($$2.a(cws.oY) && !this.e_()) {
         boolean $$3 = false;
         cwo $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cwo(cws.wW);
            $$4.b(kv.R, this.cc);
            this.cc = null;
         } else {
            $$4 = new cwo(cws.pW);
         }

         cwo $$6 = cwr.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avz $$7;
         if ($$3) {
            $$7 = awa.pp;
         } else {
            $$7 = awa.po;
         }

         this.a($$7, 1.0F, 1.0F);
         return bsj.a;
      } else if ($$2.a(cws.sS) && this.a()) {
         if (this.dV() instanceof ard $$9) {
            this.a($$9, awb.h, $$2);
            this.a(ebs.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsj.a;
      } else if (this.t() == chk.a.b) {
         Optional<czp> $$10 = this.i($$2);
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

            return bsj.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ard $$0, awb $$1, cwo $$2) {
      $$0.a(null, this, awa.pq, $$1, 1.0F, 1.0F);
      this.a(bur.C, buf.a(this, false, false), $$2x -> {
         $$0.a(lt.w, this.dA(), this.e(0.5), this.dG(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, evm.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new clb(this.dV(), this.dA(), this.e(1.0), this.dG(), $$1xx.c(1)));
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
         czp.c.encodeStart(ue.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(chk.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         czp.c.parse(ue.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<czp> i(cwo $$0) {
      drs $$1 = drs.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   public void a(chk.a $$0) {
      this.al.a(bY, $$0.d);
   }

   public chk.a t() {
      return chk.a.a(this.al.a(bY));
   }

   @Nullable
   public chk c(ard $$0, bub $$1) {
      chk $$2 = bur.aE.a($$0, buq.e);
      if ($$2 != null) {
         $$2.a(this.a((chk)$$1));
      }

      return $$2;
   }

   private chk.a a(chk $$0) {
      chk.a $$1 = this.t();
      chk.a $$2 = $$0.t();
      chk.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == chk.a.b ? chk.a.a : chk.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azv {
      a("red", djn.cn.m()),
      b("brown", djn.cm.m());

      public static final azv.a<chk.a> c = azv.a(chk.a::values);
      final String d;
      private final dww e;

      private a(final String $$0, final dww $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dww a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static chk.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
