import java.util.List;
import javax.annotation.Nullable;

public class cjg extends cjx {
   @Nullable
   private cfk e;

   public cjg(bsj<? extends cjg> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzq(this));
      this.bU.a(1, new cjg.b());
      this.bU.a(2, new bzd<>(this, cmh.class, 8.0F, 0.6, 1.0));
      this.bU.a(4, new cjg.c());
      this.bU.a(5, new cjg.a());
      this.bU.a(6, new cjg.d());
      this.bU.a(8, new cat(this, 0.6));
      this.bU.a(9, new cae(this, cmh.class, 3.0F, 1.0F));
      this.bU.a(10, new cae(this, bta.class, 8.0F));
      this.bV.a(1, new cbo(this, cnt.class).a());
      this.bV.a(2, new cbp<>(this, cmh.class, true).c(300));
      this.bV.a(3, new cbp<>(this, clp.class, false).c(300));
      this.bV.a(3, new cbp<>(this, cfa.class, false));
   }

   public static buf.a u() {
      return cjn.gt().a(bug.v, 0.5).a(bug.m, 12.0).a(bug.s, 24.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
   }

   @Override
   public ave ae_() {
      return avf.iz;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public boolean s(bsd $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof ckb $$1 ? this.s($$1.y()) : false;
      }
   }

   @Override
   protected ave v() {
      return avf.ix;
   }

   @Override
   protected ave o_() {
      return avf.iA;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.iC;
   }

   void a(@Nullable cfk $$0) {
      this.e = $$0;
   }

   @Nullable
   cfk gI() {
      return this.e;
   }

   @Override
   protected ave gn() {
      return avf.iy;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cjx.c {
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
         bsy $$0 = cjg.this.p();
         double $$1 = Math.min($$0.dw(), cjg.this.dw());
         double $$2 = Math.max($$0.dw(), cjg.this.dw()) + 1.0;
         float $$3 = (float)aye.d($$0.dA() - cjg.this.dA(), $$0.du() - cjg.this.du());
         if (cjg.this.g((bsd)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cjg.this.du() + (double)aye.b($$5) * 1.5, cjg.this.dA() + (double)aye.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cjg.this.du() + (double)aye.b($$7) * 2.5, cjg.this.dA() + (double)aye.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cjg.this.du() + (double)aye.b($$3) * $$9, cjg.this.dA() + (double)aye.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ja $$6 = ja.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ja $$9 = $$6.d();
            dsh $$10 = cjg.this.dP().a_($$9);
            if ($$10.d(cjg.this.dP(), $$9, jf.b)) {
               if (!cjg.this.dP().u($$6)) {
                  dsh $$11 = cjg.this.dP().a_($$6);
                  ews $$12 = $$11.k(cjg.this.dP(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jf.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= aye.a($$2) - 1);

         if ($$7) {
            cjg.this.dP().b(new cmr(cjg.this.dP(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cjg.this));
            cjg.this.dP().a(dxa.t, new evz($$0, (double)$$6.v() + $$8, $$1), dxa.a.a(cjg.this));
         }
      }

      @Override
      protected ave l() {
         return avf.iD;
      }

      @Override
      protected cjx.a m() {
         return cjx.a.c;
      }
   }

   class b extends cjx.b {
      @Override
      public void e() {
         if (cjg.this.p() != null) {
            cjg.this.G().a(cjg.this.p(), (float)cjg.this.ab(), (float)cjg.this.aa());
         } else if (cjg.this.gI() != null) {
            cjg.this.G().a(cjg.this.gI(), (float)cjg.this.ab(), (float)cjg.this.aa());
         }
      }
   }

   class c extends cjx.c {
      private final cdp e = cdp.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cjg.this.dP().a(ckb.class, this.e, cjg.this, cjg.this.cK().g(16.0)).size();
            return cjg.this.ah.a(8) + 1 > $$0;
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
         aqk $$0 = (aqk)cjg.this.dP();
         ewy $$1 = cjg.this.cj();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ja $$3 = cjg.this.dp().b(-2 + cjg.this.ah.a(5), 1, -2 + cjg.this.ah.a(5));
            ckb $$4 = bsj.bi.a(cjg.this.dP());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cjg.this.dP().d_($$3), btc.f, null);
               $$4.a(cjg.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cjg.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cB(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dxa.t, $$3, dxa.a.a(cjg.this));
            }
         }
      }

      @Override
      protected ave l() {
         return avf.iE;
      }

      @Override
      protected cjx.a m() {
         return cjx.a.b;
      }
   }

   public class d extends cjx.c {
      private final cdp e = cdp.b().a(16.0).a($$0x -> ((cfk)$$0x).u() == cst.l);

      @Override
      public boolean a() {
         if (cjg.this.p() != null) {
            return false;
         } else if (cjg.this.gx()) {
            return false;
         } else if (cjg.this.ai < this.c) {
            return false;
         } else if (!cjg.this.dP().ab().b(dbz.c)) {
            return false;
         } else {
            List<cfk> $$0 = cjg.this.dP().a(cfk.class, this.e, cjg.this, cjg.this.cK().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cjg.this.a($$0.get(cjg.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cjg.this.gI() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cjg.this.a(null);
      }

      @Override
      protected void k() {
         cfk $$0 = cjg.this.gI();
         if ($$0 != null && $$0.bD()) {
            $$0.b(cst.o);
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
      protected ave l() {
         return avf.iF;
      }

      @Override
      protected cjx.a m() {
         return cjx.a.d;
      }
   }
}
