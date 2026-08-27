import java.util.List;
import javax.annotation.Nullable;

public class cch extends ccy {
   @Nullable
   private byt e;

   public cch(bly<? extends cch> $$0, cto $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bta(this));
      this.bO.a(1, new cch.b());
      this.bO.a(2, new bsn<>(this, cfh.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new cch.c());
      this.bO.a(5, new cch.a());
      this.bO.a(6, new cch.d());
      this.bO.a(8, new bud(this, 0.6));
      this.bO.a(9, new bto(this, cfh.class, 3.0F, 1.0F));
      this.bO.a(10, new bto(this, bmm.class, 8.0F));
      this.bP.a(1, new buy(this, cgq.class).a());
      this.bP.a(2, new buz<>(this, cfh.class, true).c(300));
      this.bP.a(3, new buz<>(this, cep.class, false).c(300));
      this.bP.a(3, new buz<>(this, byj.class, false));
   }

   public static bnp.a w() {
      return cco.gk().a(bnq.m, 0.5).a(bnq.g, 12.0).a(bnq.l, 24.0);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
   }

   @Override
   public arq af_() {
      return arr.hV;
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public boolean s(blu $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof cdc) {
         return this.s(((cdc)$$0).A());
      } else {
         return $$0 instanceof bmk && ((bmk)$$0).eS() == bmp.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected arq y() {
      return arr.hT;
   }

   @Override
   protected arq n_() {
      return arr.hW;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.hY;
   }

   void a(@Nullable byt $$0) {
      this.e = $$0;
   }

   @Nullable
   byt gx() {
      return this.e;
   }

   @Override
   protected arq ge() {
      return arr.hU;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends ccy.c {
      @Override
      protected int h() {
         return 40;
      }

      @Override
      protected int i() {
         return 100;
      }

      @Override
      protected void k() {
         bmk $$0 = cch.this.q();
         double $$1 = Math.min($$0.dt(), cch.this.dt());
         double $$2 = Math.max($$0.dt(), cch.this.dt()) + 1.0;
         float $$3 = (float)aun.d($$0.dx() - cch.this.dx(), $$0.dr() - cch.this.dr());
         if (cch.this.f((blu)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cch.this.dr() + (double)aun.b($$5) * 1.5, cch.this.dx() + (double)aun.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cch.this.dr() + (double)aun.b($$7) * 2.5, cch.this.dx() + (double)aun.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cch.this.dr() + (double)aun.b($$3) * $$9, cch.this.dx() + (double)aun.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         hx $$6 = hx.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            hx $$9 = $$6.d();
            djg $$10 = cch.this.dM().a_($$9);
            if ($$10.d(cch.this.dM(), $$9, ic.b)) {
               if (!cch.this.dM().u($$6)) {
                  djg $$11 = cch.this.dM().a_($$6);
                  eml $$12 = $$11.k(cch.this.dM(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ic.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= aun.a($$2) - 1);

         if ($$7) {
            cch.this.dM().b(new cfr(cch.this.dM(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cch.this));
            cch.this.dM().a(dnq.t, new els($$0, (double)$$6.v() + $$8, $$1), dnq.a.a(cch.this));
         }
      }

      @Override
      protected arq l() {
         return arr.hZ;
      }

      @Override
      protected ccy.a m() {
         return ccy.a.c;
      }
   }

   class b extends ccy.b {
      @Override
      public void e() {
         if (cch.this.q() != null) {
            cch.this.I().a(cch.this.q(), (float)cch.this.ab(), (float)cch.this.aa());
         } else if (cch.this.gx() != null) {
            cch.this.I().a(cch.this.gx(), (float)cch.this.ab(), (float)cch.this.aa());
         }
      }
   }

   class c extends ccy.c {
      private final bwy e = bwy.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cch.this.dM().a(cdc.class, this.e, cch.this, cch.this.cH().g(16.0)).size();
            return cch.this.ag.a(8) + 1 > $$0;
         }
      }

      @Override
      protected int h() {
         return 100;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         and $$0 = (and)cch.this.dM();
         emr $$1 = cch.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            hx $$3 = cch.this.dm().b(-2 + cch.this.ag.a(5), 1, -2 + cch.this.ag.a(5));
            cdc $$4 = bly.bf.a(cch.this.dM());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cch.this.dM().d_($$3), bmo.f, null, null);
               $$4.a(cch.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cch.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dnq.t, $$3, dnq.a.a(cch.this));
            }
         }
      }

      @Override
      protected arq l() {
         return arr.ia;
      }

      @Override
      protected ccy.a m() {
         return ccy.a.b;
      }
   }

   public class d extends ccy.c {
      private final bwy e = bwy.b().a(16.0).a($$0x -> ((byt)$$0x).w() == cll.l);

      @Override
      public boolean a() {
         if (cch.this.q() != null) {
            return false;
         } else if (cch.this.go()) {
            return false;
         } else if (cch.this.ah < this.c) {
            return false;
         } else if (!cch.this.dM().Z().b(ctk.c)) {
            return false;
         } else {
            List<byt> $$0 = cch.this.dM().a(byt.class, this.e, cch.this, cch.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cch.this.a($$0.get(cch.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cch.this.gx() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cch.this.a(null);
      }

      @Override
      protected void k() {
         byt $$0 = cch.this.gx();
         if ($$0 != null && $$0.bx()) {
            $$0.b(cll.o);
         }
      }

      @Override
      protected int n() {
         return 40;
      }

      @Override
      protected int h() {
         return 60;
      }

      @Override
      protected int i() {
         return 140;
      }

      @Override
      protected arq l() {
         return arr.ib;
      }

      @Override
      protected ccy.a m() {
         return ccy.a.d;
      }
   }
}
