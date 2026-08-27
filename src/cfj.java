import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cfj extends cey {
   private static final int bW = 5;
   @Nullable
   private hx bX;
   private int bY;

   public cfj(bmc<? extends cfj> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(0, new bte(this));
      this.bP.a(0, new buv<>(this, cpg.a(new cng(cnj.sj), cph.i), art.AC, $$0 -> this.dL().Q() && !$$0.ce()));
      this.bP.a(0, new buv<>(this, new cng(cnj.qD), art.AH, $$0 -> this.dL().P() && $$0.ce()));
      this.bP.a(1, new but(this));
      this.bP.a(1, new bsr<>(this, cdp.class, 8.0F, 0.5, 0.5));
      this.bP.a(1, new bsr<>(this, ccp.class, 12.0F, 0.5, 0.5));
      this.bP.a(1, new bsr<>(this, cdl.class, 8.0F, 0.5, 0.5));
      this.bP.a(1, new bsr<>(this, cdk.class, 8.0F, 0.5, 0.5));
      this.bP.a(1, new bsr<>(this, ccz.class, 15.0F, 0.5, 0.5));
      this.bP.a(1, new bsr<>(this, ccu.class, 12.0F, 0.5, 0.5));
      this.bP.a(1, new bsr<>(this, cdo.class, 10.0F, 0.5, 0.5));
      this.bP.a(1, new bud(this, 0.5));
      this.bP.a(1, new btt(this));
      this.bP.a(2, new cfj.a(this, 2.0, 0.35));
      this.bP.a(4, new bty(this, 0.35));
      this.bP.a(8, new bux(this, 0.35));
      this.bP.a(9, new btn(this, cfq.class, 3.0F, 1.0F));
      this.bP.a(10, new bts(this, bmq.class, 8.0F));
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      return null;
   }

   @Override
   public boolean gi() {
      return false;
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if (!$$2.a(cnj.tH) && this.bx() && !this.gg() && !this.o_()) {
         if ($$1 == bkb.a) {
            $$0.a(asd.S);
         }

         if (this.gh().isEmpty()) {
            return bkc.a(this.dL().B);
         } else {
            if (!this.dL().B) {
               this.f($$0);
               this.a($$0, this.Q_(), 1);
            }

            return bkc.a(this.dL().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gm() {
      if (this.dL().I().b(cic.d)) {
         this.gp();
      } else {
         cfh.g[] $$0 = (cfh.g[])cfh.b.get(1);
         cfh.g[] $$1 = (cfh.g[])cfh.b.get(2);
         if ($$0 != null && $$1 != null) {
            csw $$2 = this.gh();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cfh.g $$4 = $$1[$$3];
            csv $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gp() {
      csw $$0 = this.gh();

      for (Pair<cfh.g[], Integer> $$1 : cfh.d) {
         cfh.g[] $$2 = (cfh.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bY);
      if (this.bX != null) {
         $$0.a("WanderTarget", td.a(this.bX));
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bY = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bX = td.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(csv $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dL().b(new bme(this.dL(), this.dq(), this.ds() + 0.5, this.dw(), $$1));
      }
   }

   @Override
   protected ars y() {
      return this.gg() ? art.AI : art.AA;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.AF;
   }

   @Override
   protected ars n_() {
      return art.AB;
   }

   @Override
   protected ars c(cng $$0) {
      return $$0.a(cnj.qD) ? art.AD : art.AE;
   }

   @Override
   protected ars w(boolean $$0) {
      return $$0 ? art.AJ : art.AG;
   }

   @Override
   public ars gj() {
      return art.AJ;
   }

   public void u(int $$0) {
      this.bY = $$0;
   }

   public int go() {
      return this.bY;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dL().B) {
         this.gq();
      }
   }

   private void gq() {
      if (this.bY > 0 && !this.gg() && --this.bY == 0) {
         this.am();
      }
   }

   public void i(@Nullable hx $$0) {
      this.bX = $$0;
   }

   @Nullable
   hx gs() {
      return this.bX;
   }

   class a extends btk {
      final cfj a;
      final double b;
      final double c;

      a(cfj $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cfj.this.bO.n();
      }

      @Override
      public boolean a() {
         hx $$0 = this.a.gs();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         hx $$0 = this.a.gs();
         if ($$0 != null && cfj.this.bO.l()) {
            if (this.a($$0, 10.0)) {
               emc $$1 = new emc((double)$$0.u() - this.a.dq(), (double)$$0.v() - this.a.ds(), (double)$$0.w() - this.a.dw()).d();
               emc $$2 = $$1.a(10.0).b(this.a.dq(), this.a.ds(), this.a.dw());
               cfj.this.bO.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cfj.this.bO.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(hx $$0, double $$1) {
         return !$$0.a(this.a.dj(), $$1);
      }
   }
}
