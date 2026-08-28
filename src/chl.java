import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class chl extends chf implements bvy, bwh<chl.a> {
   private static final akm<String> bY = akq.a(chl.class, ako.e);
   private static final int bZ = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private czn cc;
   @Nullable
   private UUID cd;

   public chl(bus<? extends chl> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jh $$0, dfp $$1) {
      return $$1.a_($$0.e()).a(dis.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bus<chl> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.a_($$3.e()).a(axc.cb) && a($$1, $$3);
   }

   @Override
   public void a(arp $$0, bvg $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.cd)) {
         this.a(this.q() == chl.a.a ? chl.a.b : chl.a.a);
         this.cd = $$2;
         this.a(awn.oN, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(bY, chl.a.a.d);
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$2.a(cwq.ou) && !this.e_()) {
         boolean $$3 = false;
         cwm $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cwm(cwq.wo);
            $$4.b(ku.R, this.cc);
            this.cc = null;
         } else {
            $$4 = new cwm(cwq.ps);
         }

         cwm $$6 = cwp.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awm $$7;
         if ($$3) {
            $$7 = awn.oQ;
         } else {
            $$7 = awn.oP;
         }

         this.a($$7, 1.0F, 1.0F);
         return bsk.a;
      } else if ($$2.a(cwq.sm) && this.a()) {
         if (this.dV() instanceof arp $$9) {
            this.a($$9, awo.h, $$2);
            this.a(ear.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsk.a;
      } else if (this.q() == chl.a.b && $$2.a(axl.O)) {
         if (this.cc != null) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               this.dV().a(ls.ae, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
            }
         } else {
            Optional<czn> $$11 = this.i($$2);
            if ($$11.isEmpty()) {
               return bsk.e;
            }

            $$2.a(1, $$0);

            for (int $$12 = 0; $$12 < 4; $$12++) {
               this.dV().a(ls.p, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
            }

            this.cc = $$11.get();
            this.a(awn.oO, 2.0F, 1.0F);
         }

         return bsk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arp $$0, awo $$1, cwm $$2) {
      $$0.a(null, this, awn.oR, $$1, 1.0F, 1.0F);
      this.a(bus.C, bug.a(this, false, false), $$2x -> {
         $$0.a(ls.w, this.dA(), this.e(0.5), this.dG(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, euj.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.L(); $$2xx++) {
               $$0xx.b(new clc(this.dV(), this.dA(), this.e(1.0), this.dG(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bL() && !this.e_();
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Type", this.q().c());
      if (this.cc != null) {
         czn.c.encodeStart(uz.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a(chl.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         czn.c.parse(uz.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<czn> i(cwm $$0) {
      dqs $$1 = dqs.a($$0.h());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(chl.a $$0) {
      this.al.a(bY, $$0.d);
   }

   public chl.a q() {
      return chl.a.a(this.al.a(bY));
   }

   @Nullable
   public chl c(arp $$0, buc $$1) {
      chl $$2 = bus.aD.a($$0, bur.e);
      if ($$2 != null) {
         $$2.a(this.a((chl)$$1));
      }

      return $$2;
   }

   private chl.a a(chl $$0) {
      chl.a $$1 = this.q();
      chl.a $$2 = $$0.q();
      chl.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == chl.a.b ? chl.a.a : chl.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bai {
      a("red", dis.cg.m()),
      b("brown", dis.cf.m());

      public static final bai.a<chl.a> c = bai.a(chl.a::values);
      final String d;
      private final dvv e;

      private a(final String $$0, final dvv $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dvv a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static chl.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
