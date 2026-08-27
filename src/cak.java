import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cak extends cae implements boy, bph<cak.a> {
   private static final aie<String> bT = aih.a(cak.class, aig.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<dgt.a> bX;
   @Nullable
   private UUID bY;

   public cak(bnw<? extends cak> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(hz $$0, cvu $$1) {
      return $$1.a_($$0.d()).a(cyu.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bnw<cak> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.a_($$3.d()).a(aua.bT) && a($$1, $$3);
   }

   @Override
   public void a(aow $$0, boh $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.bY)) {
         this.a(this.w() == cak.a.a ? cak.a.b : cak.a.a);
         this.bY = $$2;
         this.a(atl.on, 2.0F, 1.0F);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bT, cak.a.a.d);
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ($$2.a(cpg.pp) && !this.o_()) {
         boolean $$3 = false;
         cpd $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new cpd(cpg.vQ);
            cqn.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new cpd(cpg.pq);
         }

         cpd $$6 = cpf.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         atk $$7;
         if ($$3) {
            $$7 = atl.oq;
         } else {
            $$7 = atl.op;
         }

         this.a($$7, 1.0F, 1.0F);
         return blw.a(this.dM().B);
      } else if ($$2.a(cpg.rU) && this.a()) {
         this.a(atm.h);
         this.a(dpw.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return blw.a(this.dM().B);
      } else if (this.w() == cak.a.b && $$2.a(aui.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dM().a(jz.ab, this.dr() + this.af.j() / 2.0, this.e(0.5), this.dx() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dgt.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return blw.d;
            }

            if (!$$0.fU().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dM().a(jz.q, this.dr() + this.af.j() / 2.0, this.e(0.5), this.dx() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(atl.oo, 2.0F, 1.0F);
         }

         return blw.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(atm $$0) {
      this.dM().a(null, this, atl.or, $$0, 1.0F, 1.0F);
      if (!this.dM().y_()) {
         cae $$1 = bnw.v.a(this.dM());
         if ($$1 != null) {
            ((aow)this.dM()).a(jz.x, this.dr(), this.e(0.5), this.dx(), 1, 0.0, 0.0, 0.0, 0.0);
            this.am();
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.t(this.ew());
            $$1.aU = this.aU;
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            if (this.fN()) {
               $$1.fL();
            }

            $$1.m(this.cr());
            this.dM().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dM().b(new cdw(this.dM(), this.dr(), this.e(1.0), this.dx(), new cpd(this.w().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.o_();
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Type", this.w().c());
      if (this.bX != null) {
         dgt.a.b.encodeStart(tk.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a(cak.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dgt.a.b.parse(tk.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<dgt.a>> l(cpd $$0) {
      dgt $$1 = dgt.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cak.a $$0) {
      this.am.b(bT, $$0.d);
   }

   public cak.a w() {
      return cak.a.a(this.am.b(bT));
   }

   @Nullable
   public cak c(aow $$0, bnl $$1) {
      cak $$2 = bnw.aq.a((cvr)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cak)$$1));
      }

      return $$2;
   }

   private cak.a a(cak $$0) {
      cak.a $$1 = this.w();
      cak.a $$2 = $$0.w();
      cak.a $$3;
      if ($$1 == $$2 && this.af.a(1024) == 0) {
         $$3 = $$1 == cak.a.b ? cak.a.a : cak.a.b;
      } else {
         $$3 = this.af.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements axc {
      a("red", cyu.cg.o()),
      b("brown", cyu.cf.o());

      public static final axc.a<cak.a> c = axc.a(cak.a::values);
      final String d;
      final dlj e;

      private a(String $$0, dlj $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dlj a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cak.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
