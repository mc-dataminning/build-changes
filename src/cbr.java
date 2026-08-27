import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cbr extends cbl implements bqf, bqo<cbr.a> {
   private static final aim<String> bX = aiq.a(cbr.class, aio.e);
   private static final int bY = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private List<did.a> cb;
   @Nullable
   private UUID cc;

   public cbr(bpd<? extends cbr> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ib $$0, cxe $$1) {
      return $$1.a_($$0.d()).a(dae.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bpd<cbr> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bU) && a($$1, $$3);
   }

   @Override
   public void a(apf $$0, bpo $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.cc)) {
         this.a(this.s() == cbr.a.a ? cbr.a.b : cbr.a.a);
         this.cc = $$2;
         this.a(aty.ou, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bX, cbr.a.a.d);
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if ($$2.a(cqp.pp) && !this.o_()) {
         boolean $$3 = false;
         cqm $$4;
         if (this.cb != null) {
            $$3 = true;
            $$4 = new cqm(cqp.vS);
            crw.a($$4, this.cb);
            this.cb = null;
         } else {
            $$4 = new cqm(cqp.pq);
         }

         cqm $$6 = cqo.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         atx $$7;
         if ($$3) {
            $$7 = aty.ox;
         } else {
            $$7 = aty.ow;
         }

         this.a($$7, 1.0F, 1.0F);
         return bnd.a(this.dM().B);
      } else if ($$2.a(cqp.rU) && this.a()) {
         this.a(atz.h);
         this.a(drp.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bnd.a(this.dM().B);
      } else if (this.s() == cbr.a.b && $$2.a(auv.O)) {
         if (this.cb != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dM().a(kc.ac, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<did.a>> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bnd.d;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dM().a(kc.q, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.cb = $$10.get();
            this.a(aty.ov, 2.0F, 1.0F);
         }

         return bnd.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(atz $$0) {
      this.dM().a(null, this, aty.oy, $$0, 1.0F, 1.0F);
      if (!this.dM().x_()) {
         cbl $$1 = bpd.x.a(this.dM());
         if ($$1 != null) {
            ((apf)this.dM()).a(kc.x, this.dr(), this.e(0.5), this.dx(), 1, 0.0, 0.0, 0.0, 0.0);
            this.am();
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.t(this.ex());
            $$1.aX = this.aX;
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            if (this.fU()) {
               $$1.fS();
            }

            $$1.m(this.cr());
            this.dM().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dM().b(new cfe(this.dM(), this.dr(), this.e(1.0), this.dx(), new cqm(this.s().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bA() && !this.o_();
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Type", this.s().c());
      if (this.cb != null) {
         did.a.b.encodeStart(to.a, this.cb).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a(cbr.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         did.a.b.parse(to.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.cb = $$0x);
      }
   }

   private Optional<List<did.a>> n(cqm $$0) {
      did $$1 = did.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cbr.a $$0) {
      this.an.a(bX, $$0.d);
   }

   public cbr.a s() {
      return cbr.a.a(this.an.a(bX));
   }

   @Nullable
   public cbr c(apf $$0, bos $$1) {
      cbr $$2 = bpd.as.a((cxb)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cbr)$$1));
      }

      return $$2;
   }

   private cbr.a a(cbr $$0) {
      cbr.a $$1 = this.s();
      cbr.a $$2 = $$0.s();
      cbr.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == cbr.a.b ? cbr.a.a : cbr.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements axq {
      a("red", dae.cg.o()),
      b("brown", dae.cf.o());

      public static final axq.a<cbr.a> c = axq.a(cbr.a::values);
      final String d;
      final dnb e;

      private a(String $$0, dnb $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dnb a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cbr.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
