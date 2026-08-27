import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class byt extends bzk implements bzo {
   private final brd<byt> b = new brd<>(this, 1.0, 20, 15.0F);
   private final bqn c = new bqn(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         byt.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         byt.this.v(true);
      }
   };

   protected byt(biw<? extends byt> $$0, cpx $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bO.a(2, new brg(this));
      this.bO.a(3, new bpw(this, 1.0));
      this.bO.a(3, new bpk<>(this, bvw.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new brq(this, 1.0));
      this.bO.a(6, new bql(this, cbw.class, 8.0F));
      this.bO.a(6, new bqy(this));
      this.bP.a(1, new brv(this));
      this.bP.a(2, new brw<>(this, cbw.class, true));
      this.bP.a(3, new brw<>(this, bvf.class, true));
      this.bP.a(3, new brw<>(this, bvu.class, 10, true, false, bvu.bU));
   }

   public static bkn.a s() {
      return bzk.gj().a(bko.d, 0.25);
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract ape t();

   @Override
   public bjn eR() {
      return bjn.b;
   }

   @Override
   public void b_() {
      boolean $$0 = this.fX();
      if ($$0) {
         cjh $$1 = this.c(bix.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(bix.f);
                  this.a(bix.f, cjh.b);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.b_();
   }

   @Override
   public void by() {
      super.by();
      if (this.cZ() instanceof bjr $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(ase $$0, bgy $$1) {
      super.a($$0, $$1);
      this.a(bix.a, new cjh(cjk.nG));
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      ase $$5 = $$0.D_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.y();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bix.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bix.f, new cjh($$5.i() < 0.1F ? csy.eg : csy.ef));
            this.bR[bix.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dL() != null && !this.dL().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         cjh $$0 = this.b(ccp.a(this, cjk.nG));
         if ($$0.a(cjk.nG)) {
            int $$1 = 20;
            if (this.dL().ai() != bgx.d) {
               $$1 = 40;
            }

            this.b.c($$1);
            this.bO.a(4, this.b);
         } else {
            this.bO.a(4, this.c);
         }
      }
   }

   @Override
   public void a(bji $$0, float $$1) {
      cjh $$2 = this.g(this.b(ccp.a(this, cjk.nG)));
      ccc $$3 = this.b($$2, $$1);
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.e(0.3333333333333333) - $$3.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(apf.vA, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$3);
   }

   protected ccc b(cjh $$0, float $$1) {
      return ccp.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cjx $$0) {
      return $$0 == cjk.nG;
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bix $$0, cjh $$1) {
      super.a($$0, $$1);
      if (!this.dL().B) {
         this.y();
      }
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 1.74F;
   }

   @Override
   protected float l(bis $$0) {
      return -0.7F;
   }

   public boolean gd() {
      return this.ck();
   }
}
