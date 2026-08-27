import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cds extends cdh {
   private static final int bV = 5;
   @Nullable
   private hx bW;
   private int bX;

   public cds(bkz<? extends cds> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsa(this));
      this.bO.a(0, new btr<>(this, cnn.a(new clo(clr.sh), cno.i), aqv.zS, $$0 -> this.dN().P() && !$$0.ce()));
      this.bO.a(0, new btr<>(this, new clo(clr.qB), aqv.zX, $$0 -> this.dN().O() && $$0.ce()));
      this.bO.a(1, new btp(this));
      this.bO.a(1, new brn<>(this, ccg.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new brn<>(this, cbg.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new brn<>(this, ccc.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new brn<>(this, ccb.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new brn<>(this, cbq.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new brn<>(this, cbl.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new brn<>(this, ccf.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bsz(this, 0.5));
      this.bO.a(1, new bsp(this));
      this.bO.a(2, new cds.a(this, 2.0, 0.35));
      this.bO.a(4, new bsu(this, 0.35));
      this.bO.a(8, new btt(this, 0.35));
      this.bO.a(9, new bsj(this, cdz.class, 3.0F, 1.0F));
      this.bO.a(10, new bso(this, bln.class, 8.0F));
   }

   @Nullable
   @Override
   public bkq a(ami $$0, bkq $$1) {
      return null;
   }

   @Override
   public boolean gi() {
      return false;
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if (!$$2.a(clr.tD) && this.bx() && !this.gg() && !this.o_()) {
         if ($$1 == bja.a) {
            $$0.a(arf.S);
         }

         if (this.gh().isEmpty()) {
            return bjb.a(this.dN().B);
         } else {
            if (!this.dN().B) {
               this.f($$0);
               this.a($$0, this.Q_(), 1);
            }

            return bjb.a(this.dN().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gm() {
      if (this.dN().H().b(cgk.d)) {
         this.gp();
      } else {
         cdq.g[] $$0 = (cdq.g[])cdq.b.get(1);
         cdq.g[] $$1 = (cdq.g[])cdq.b.get(2);
         if ($$0 != null && $$1 != null) {
            cre $$2 = this.gh();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cdq.g $$4 = $$1[$$3];
            crd $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gp() {
      cre $$0 = this.gh();

      for (Pair<cdq.g[], Integer> $$1 : cdq.d) {
         cdq.g[] $$2 = (cdq.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", ss.a(this.bW));
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = ss.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(crd $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dN().b(new blb(this.dN(), this.ds(), this.du() + 0.5, this.dy(), $$1));
      }
   }

   @Override
   protected aqu y() {
      return this.gg() ? aqv.zY : aqv.zQ;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.zV;
   }

   @Override
   protected aqu n_() {
      return aqv.zR;
   }

   @Override
   protected aqu c(clo $$0) {
      return $$0.a(clr.qB) ? aqv.zT : aqv.zU;
   }

   @Override
   protected aqu w(boolean $$0) {
      return $$0 ? aqv.zZ : aqv.zW;
   }

   @Override
   public aqu gj() {
      return aqv.zZ;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int go() {
      return this.bX;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dN().B) {
         this.gq();
      }
   }

   private void gq() {
      if (this.bX > 0 && !this.gg() && --this.bX == 0) {
         this.am();
      }
   }

   public void i(@Nullable hx $$0) {
      this.bW = $$0;
   }

   @Nullable
   hx gs() {
      return this.bW;
   }

   class a extends bsg {
      final cds a;
      final double b;
      final double c;

      a(cds $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cds.this.bN.n();
      }

      @Override
      public boolean a() {
         hx $$0 = this.a.gs();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         hx $$0 = this.a.gs();
         if ($$0 != null && cds.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               ejz $$1 = new ejz((double)$$0.u() - this.a.ds(), (double)$$0.v() - this.a.du(), (double)$$0.w() - this.a.dy()).d();
               ejz $$2 = $$1.a(10.0).b(this.a.ds(), this.a.du(), this.a.dy());
               cds.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cds.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(hx $$0, double $$1) {
         return !$$0.a(this.a.dl(), $$1);
      }
   }
}
