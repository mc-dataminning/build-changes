import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bvk extends bve implements bkd, bkk<bvk.a> {
   private static final aef<String> bT = aei.a(bvk.class, aeh.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<dbc.a> bX;
   @Nullable
   private UUID bY;

   public bvk(bja<? extends bvk> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(gw $$0, cqe $$1) {
      return $$1.a_($$0.d()).a(cte.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(bja<bvk> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.a_($$3.d()).a(apv.bS) && a($$1, $$3);
   }

   @Override
   public void a(akt $$0, bjl $$1) {
      UUID $$2 = $$1.cv();
      if (!$$2.equals(this.bY)) {
         this.a(this.t() == bvk.a.a ? bvk.a.b : bvk.a.a);
         this.bY = $$2;
         this.a(apg.nj, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, bvk.a.a.d);
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if ($$2.a(cjo.oC) && !this.m_()) {
         boolean $$3 = false;
         cjl $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new cjl(cjo.va);
            ckv.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new cjl(cjo.oD);
         }

         cjl $$6 = cjn.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         apf $$7;
         if ($$3) {
            $$7 = apg.nm;
         } else {
            $$7 = apg.nl;
         }

         this.a($$7, 1.0F, 1.0F);
         return bhe.a(this.dL().B);
      } else if ($$2.a(cjo.rg) && this.a()) {
         this.a(aph.h);
         this.a(djn.M, $$0);
         if (!this.dL().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bhe.a(this.dL().B);
      } else if (this.t() == bvk.a.b && $$2.a(aqd.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dL().a(iv.Z, this.dq() + this.ag.j() / 2.0, this.e(0.5), this.dw() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dbc.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bhe.d;
            }

            if (!$$0.fT().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dL().a(iv.q, this.dq() + this.ag.j() / 2.0, this.e(0.5), this.dw() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(apg.nk, 2.0F, 1.0F);
         }

         return bhe.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aph $$0) {
      this.dL().a(null, this, apg.nn, $$0, 1.0F, 1.0F);
      if (!this.dL().w_()) {
         bve $$1 = bja.t.a(this.dL());
         if ($$1 != null) {
            ((akt)this.dL()).a(iv.x, this.dq(), this.e(0.5), this.dw(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ak();
            $$1.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$1.c(this.eu());
            $$1.aU = this.aU;
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            if (this.fL()) {
               $$1.fJ();
            }

            $$1.m(this.cq());
            this.dL().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dL().b(new byt(this.dL(), this.dq(), this.e(1.0), this.dw(), new cjl(this.t().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bv() && !this.m_();
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.bX != null) {
         dbc.a.b.encodeStart(ri.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a(bvk.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dbc.a.b.parse(ri.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<dbc.a>> l(cjl $$0) {
      dbc $$1 = dbc.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(bvk.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public bvk.a t() {
      return bvk.a.a(this.an.b(bT));
   }

   @Nullable
   public bvk c(akt $$0, bir $$1) {
      bvk $$2 = bja.ao.a((cqb)$$0);
      if ($$2 != null) {
         $$2.a(this.a((bvk)$$1));
      }

      return $$2;
   }

   private bvk.a a(bvk $$0) {
      bvk.a $$1 = this.t();
      bvk.a $$2 = $$0.t();
      bvk.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == bvk.a.b ? bvk.a.a : bvk.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements asu {
      a("red", cte.cg.o()),
      b("brown", cte.cf.o());

      public static final asu.a<bvk.a> c = asu.a(bvk.a::values);
      final String d;
      final dfd e;

      private a(String $$0, dfd $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dfd a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static bvk.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
