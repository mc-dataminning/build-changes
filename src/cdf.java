import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cdf extends ccu {
   private static final int bV = 5;
   @Nullable
   private ht bW;
   private int bX;

   public cdf(bkm<? extends cdf> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new brn(this));
      this.bO.a(0, new bte<>(this, cna.a(new clb(cle.rw), cnb.i), aqn.zr, $$0 -> this.dL().O() && !$$0.cd()));
      this.bO.a(0, new bte<>(this, new clb(cle.pQ), aqn.zw, $$0 -> this.dL().N() && $$0.cd()));
      this.bO.a(1, new btc(this));
      this.bO.a(1, new bra<>(this, cbt.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bra<>(this, cat.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bra<>(this, cbp.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bra<>(this, cbo.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bra<>(this, cbd.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bra<>(this, cay.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bra<>(this, cbs.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bsm(this, 0.5));
      this.bO.a(1, new bsc(this));
      this.bO.a(2, new cdf.a(this, 2.0, 0.35));
      this.bO.a(4, new bsh(this, 0.35));
      this.bO.a(8, new btg(this, 0.35));
      this.bO.a(9, new brw(this, cdm.class, 3.0F, 1.0F));
      this.bO.a(10, new bsb(this, bla.class, 8.0F));
   }

   @Nullable
   @Override
   public bkd a(ama $$0, bkd $$1) {
      return null;
   }

   @Override
   public boolean gh() {
      return false;
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if (!$$2.a(cle.sS) && this.bv() && !this.gf() && !this.n_()) {
         if ($$1 == bip.a) {
            $$0.a(aqx.S);
         }

         if (this.gg().isEmpty()) {
            return biq.a(this.dL().B);
         } else {
            if (!this.dL().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return biq.a(this.dL().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gl() {
      if (this.dL().G().b(cfx.d)) {
         this.go();
      } else {
         cdd.g[] $$0 = (cdd.g[])cdd.b.get(1);
         cdd.g[] $$1 = (cdd.g[])cdd.b.get(2);
         if ($$0 != null && $$1 != null) {
            cqr $$2 = this.gg();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cdd.g $$4 = $$1[$$3];
            cqq $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void go() {
      cqr $$0 = this.gg();

      for (Pair<cdd.g[], Integer> $$1 : cdd.d) {
         cdd.g[] $$2 = (cdd.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", so.a(this.bW));
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = so.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(cqq $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dL().b(new bko(this.dL(), this.dq(), this.ds() + 0.5, this.dw(), $$1));
      }
   }

   @Override
   protected aqm w() {
      return this.gf() ? aqn.zx : aqn.zp;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.zu;
   }

   @Override
   protected aqm m_() {
      return aqn.zq;
   }

   @Override
   protected aqm c(clb $$0) {
      return $$0.a(cle.pQ) ? aqn.zs : aqn.zt;
   }

   @Override
   protected aqm w(boolean $$0) {
      return $$0 ? aqn.zy : aqn.zv;
   }

   @Override
   public aqm gi() {
      return aqn.zy;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int gn() {
      return this.bX;
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dL().B) {
         this.gp();
      }
   }

   private void gp() {
      if (this.bX > 0 && !this.gf() && --this.bX == 0) {
         this.ak();
      }
   }

   public void i(@Nullable ht $$0) {
      this.bW = $$0;
   }

   @Nullable
   ht gr() {
      return this.bW;
   }

   class a extends brt {
      final cdf a;
      final double b;
      final double c;

      a(cdf $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cdf.this.bN.n();
      }

      @Override
      public boolean a() {
         ht $$0 = this.a.gr();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         ht $$0 = this.a.gr();
         if ($$0 != null && cdf.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               eji $$1 = new eji((double)$$0.u() - this.a.dq(), (double)$$0.v() - this.a.ds(), (double)$$0.w() - this.a.dw()).d();
               eji $$2 = $$1.a(10.0).b(this.a.dq(), this.a.ds(), this.a.dw());
               cdf.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cdf.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ht $$0, double $$1) {
         return !$$0.a(this.a.dj(), $$1);
      }
   }
}
