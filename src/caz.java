import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class caz extends cat implements bpn, bpw<caz.a> {
   private static final aii<String> bV = ail.a(caz.class, aik.e);
   private static final int bW = 1024;
   private static final String bY = "stew_effects";
   @Nullable
   private List<dhg.a> bZ;
   @Nullable
   private UUID ca;

   public caz(bol<? extends caz> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ib $$0, cwh $$1) {
      return $$1.a_($$0.d()).a(czh.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bol<caz> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.a_($$3.d()).a(aue.bT) && a($$1, $$3);
   }

   @Override
   public void a(apa $$0, bow $$1) {
      UUID $$2 = $$1.ct();
      if (!$$2.equals(this.ca)) {
         this.a(this.w() == caz.a.a ? caz.a.b : caz.a.a);
         this.ca = $$2;
         this.a(atp.on, 2.0F, 1.0F);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bV, caz.a.a.d);
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ($$2.a(cpt.pp) && !this.o_()) {
         boolean $$3 = false;
         cpq $$4;
         if (this.bZ != null) {
            $$3 = true;
            $$4 = new cpq(cpt.vQ);
            cra.a($$4, this.bZ);
            this.bZ = null;
         } else {
            $$4 = new cpq(cpt.pq);
         }

         cpq $$6 = cps.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         ato $$7;
         if ($$3) {
            $$7 = atp.oq;
         } else {
            $$7 = atp.op;
         }

         this.a($$7, 1.0F, 1.0F);
         return bml.a(this.dJ().B);
      } else if ($$2.a(cpt.rU) && this.a()) {
         this.a(atq.h);
         this.a(dqr.M, $$0);
         if (!this.dJ().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bml.a(this.dJ().B);
      } else if (this.w() == caz.a.b && $$2.a(aum.O)) {
         if (this.bZ != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dJ().a(kb.ab, this.do() + this.af.j() / 2.0, this.e(0.5), this.du() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dhg.a>> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bml.d;
            }

            if (!$$0.fW().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dJ().a(kb.q, this.do() + this.af.j() / 2.0, this.e(0.5), this.du() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }

            this.bZ = $$10.get();
            this.a(atp.oo, 2.0F, 1.0F);
         }

         return bml.a(this.dJ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(atq $$0) {
      this.dJ().a(null, this, atp.or, $$0, 1.0F, 1.0F);
      if (!this.dJ().y_()) {
         cat $$1 = bol.v.a(this.dJ());
         if ($$1 != null) {
            ((apa)this.dJ()).a(kb.x, this.do(), this.e(0.5), this.du(), 1, 0.0, 0.0, 0.0, 0.0);
            this.am();
            $$1.b(this.do(), this.dq(), this.du(), this.dz(), this.dB());
            $$1.t(this.eu());
            $$1.aV = this.aV;
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cy());
            }

            if (this.fS()) {
               $$1.fQ();
            }

            $$1.m(this.co());
            this.dJ().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dJ().b(new cel(this.dJ(), this.do(), this.e(1.0), this.du(), new cpq(this.w().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.o_();
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Type", this.w().c());
      if (this.bZ != null) {
         dhg.a.b.encodeStart(tm.a, this.bZ).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a(caz.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dhg.a.b.parse(tm.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bZ = $$0x);
      }
   }

   private Optional<List<dhg.a>> n(cpq $$0) {
      dhg $$1 = dhg.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(caz.a $$0) {
      this.am.b(bV, $$0.d);
   }

   public caz.a w() {
      return caz.a.a(this.am.b(bV));
   }

   @Nullable
   public caz c(apa $$0, boa $$1) {
      caz $$2 = bol.aq.a((cwe)$$0);
      if ($$2 != null) {
         $$2.a(this.a((caz)$$1));
      }

      return $$2;
   }

   private caz.a a(caz $$0) {
      caz.a $$1 = this.w();
      caz.a $$2 = $$0.w();
      caz.a $$3;
      if ($$1 == $$2 && this.af.a(1024) == 0) {
         $$3 = $$1 == caz.a.b ? caz.a.a : caz.a.b;
      } else {
         $$3 = this.af.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements axg {
      a("red", czh.cg.o()),
      b("brown", czh.cf.o());

      public static final axg.a<caz.a> c = axg.a(caz.a::values);
      final String d;
      final dme e;

      private a(String $$0, dme $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dme a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static caz.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
