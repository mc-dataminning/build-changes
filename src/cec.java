import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cec extends cdw implements bsq, bsz<cec.a> {
   private static final ajm<String> bY = ajq.a(cec.class, ajo.e);
   private static final int bZ = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private cwb cc;
   @Nullable
   private UUID cd;

   public cec(brn<? extends cec> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(in $$0, dag $$1) {
      return $$1.a_($$0.d()).a(ddg.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(brn<cec> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.a_($$3.d()).a(avr.ca) && a($$1, $$3);
   }

   @Override
   public void a(aqh $$0, brz $$1) {
      UUID $$2 = $$1.cx();
      if (!$$2.equals(this.cd)) {
         this.a(this.u() == cec.a.a ? cec.a.b : cec.a.a);
         this.cd = $$2;
         this.a(avc.oE, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(bY, cec.a.a.d);
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$2.a(ctc.pq) && !this.p_()) {
         boolean $$3 = false;
         csz $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new csz(ctc.vU);
            $$4.b(ka.F, this.cc);
            this.cc = null;
         } else {
            $$4 = new csz(ctc.pr);
         }

         csz $$6 = ctb.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avb $$7;
         if ($$3) {
            $$7 = avc.oH;
         } else {
            $$7 = avc.oG;
         }

         this.a($$7, 1.0F, 1.0F);
         return bpm.a(this.dN().B);
      } else if ($$2.a(ctc.rV) && this.a()) {
         this.a(avd.h);
         this.a(dva.M, $$0);
         if (!this.dN().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bpm.a(this.dN().B);
      } else if (this.u() == cec.a.b && $$2.a(avz.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dN().a(kx.ab, this.ds() + this.ah.j() / 2.0, this.e(0.5), this.dy() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cwb> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bpm.d;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dN().a(kx.p, this.ds() + this.ah.j() / 2.0, this.e(0.5), this.dy() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(avc.oF, 2.0F, 1.0F);
         }

         return bpm.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avd $$0) {
      this.dN().a(null, this, avc.oI, $$0, 1.0F, 1.0F);
      if (!this.dN().x_()) {
         cdw $$1 = brn.w.a(this.dN());
         if ($$1 != null) {
            ((aqh)this.dN()).a(kx.w, this.ds(), this.e(0.5), this.dy(), 1, 0.0, 0.0, 0.0, 0.0);
            this.am();
            $$1.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$1.t(this.ey());
            $$1.aZ = this.aZ;
            if (this.ae()) {
               $$1.b(this.af());
               $$1.o(this.cC());
            }

            if (this.fV()) {
               $$1.fT();
            }

            $$1.n(this.cs());
            this.dN().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dN().b(new chr(this.dN(), this.ds(), this.e(1.0), this.dy(), new csz(this.u().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bB() && !this.p_();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Type", this.u().c());
      if (this.cc != null) {
         cwb.b.encodeStart(uo.a, this.cc).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(cec.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cwb.b.parse(uo.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.cc = $$0x);
      }
   }

   private Optional<cwb> n(csz $$0) {
      dlg $$1 = dlg.a($$0.f());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cec.a $$0) {
      this.ao.a(bY, $$0.d);
   }

   public cec.a u() {
      return cec.a.a(this.ao.a(bY));
   }

   @Nullable
   public cec c(aqh $$0, brb $$1) {
      cec $$2 = brn.ar.a((dad)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cec)$$1));
      }

      return $$2;
   }

   private cec.a a(cec $$0) {
      cec.a $$1 = this.u();
      cec.a $$2 = $$0.u();
      cec.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cec.a.b ? cec.a.a : cec.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements ayt {
      a("red", ddg.cg.n()),
      b("brown", ddg.cf.n());

      public static final ayt.a<cec.a> c = ayt.a(cec.a::values);
      final String d;
      final dqh e;

      private a(String $$0, dqh $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dqh a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cec.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
