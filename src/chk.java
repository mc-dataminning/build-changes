import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class chk extends che implements bvx, bwg<chk.a> {
   private static final ajx<String> bY = akb.a(chk.class, ajz.e);
   private static final int bZ = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private czq cc;
   @Nullable
   private UUID cd;

   public chk(bur<? extends chk> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      return $$1.a_($$0.e()).a(djo.fA) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bur<chk> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cc) && a($$1, $$3);
   }

   @Override
   public void a(arc $$0, bvf $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.cd)) {
         this.a(this.t() == chk.a.a ? chk.a.b : chk.a.a);
         this.cd = $$2;
         this.a(awa.pm, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bY, chk.a.a.d);
   }

   @Override
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if ($$2.a(cwt.oY) && !this.e_()) {
         boolean $$3 = false;
         cwp $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cwp(cwt.wW);
            $$4.b(kv.R, this.cc);
            this.cc = null;
         } else {
            $$4 = new cwp(cwt.pW);
         }

         cwp $$6 = cws.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avz $$7;
         if ($$3) {
            $$7 = awa.pp;
         } else {
            $$7 = awa.po;
         }

         this.a($$7, 1.0F, 1.0F);
         return bsj.a;
      } else if ($$2.a(cwt.sS) && this.a()) {
         if (this.dW() instanceof arc $$9) {
            this.a($$9, awb.h, $$2);
            this.a(ebt.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsj.a;
      } else if (this.t() == chk.a.b) {
         Optional<czq> $$10 = this.i($$2);
         if ($$10.isEmpty()) {
            return super.b($$0, $$1);
         } else {
            if (this.cc != null) {
               for (int $$11 = 0; $$11 < 2; $$11++) {
                  this.dW().a(lt.ag, this.dB() + this.ae.j() / 2.0, this.e(0.5), this.dH() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }
            } else {
               $$2.a(1, $$0);

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  this.dW().a(lt.p, this.dB() + this.ae.j() / 2.0, this.e(0.5), this.dH() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
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
   public void a(arc $$0, awb $$1, cwp $$2) {
      $$0.a(null, this, awa.pq, $$1, 1.0F, 1.0F);
      this.a(bur.C, buf.a(this, false, false), $$2x -> {
         $$0.a(lt.w, this.dB(), this.e(0.5), this.dH(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, evn.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new clb(this.dW(), this.dB(), this.e(1.0), this.dH(), $$1xx.c(1)));
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
         czq.c.encodeStart(ue.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(chk.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         czq.c.parse(ue.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<czq> i(cwp $$0) {
      drt $$1 = drt.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   public void a(chk.a $$0) {
      this.al.a(bY, $$0.d);
   }

   public chk.a t() {
      return chk.a.a(this.al.a(bY));
   }

   @Nullable
   public chk c(arc $$0, bub $$1) {
      chk $$2 = bur.aF.a($$0, buq.e);
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
      a("red", djo.cn.m()),
      b("brown", djo.cm.m());

      public static final azv.a<chk.a> c = azv.a(chk.a::values);
      final String d;
      private final dwx e;

      private a(final String $$0, final dwx $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dwx a() {
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
