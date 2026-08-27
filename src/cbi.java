import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cbi extends cax {
   private static final int bV = 5;
   @Nullable
   private gw bW;
   private int bX;

   public cbi(bip<? extends cbi> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpq(this));
      this.bO.a(0, new brh<>(this, ckz.a(new cja(cjd.rv), cla.i), aoz.zn, $$0 -> this.dK().O() && !$$0.cd()));
      this.bO.a(0, new brh<>(this, new cja(cjd.pQ), aoz.zs, $$0 -> this.dK().N() && $$0.cd()));
      this.bO.a(1, new brf(this));
      this.bO.a(1, new bpd<>(this, bzw.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpd<>(this, byw.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bpd<>(this, bzs.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpd<>(this, bzr.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpd<>(this, bzg.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bpd<>(this, bzb.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bpd<>(this, bzv.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bqp(this, 0.5));
      this.bO.a(1, new bqf(this));
      this.bO.a(2, new cbi.a(this, 2.0, 0.35));
      this.bO.a(4, new bqk(this, 0.35));
      this.bO.a(8, new brj(this, 0.35));
      this.bO.a(9, new bpz(this, cbp.class, 3.0F, 1.0F));
      this.bO.a(10, new bqe(this, bjd.class, 8.0F));
   }

   @Nullable
   @Override
   public big a(akn $$0, big $$1) {
      return null;
   }

   @Override
   public boolean gd() {
      return false;
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if (!$$2.a(cjd.sR) && this.bv() && !this.gb() && !this.i_()) {
         if ($$1 == bgs.a) {
            $$0.a(apj.S);
         }

         if (this.gc().isEmpty()) {
            return bgt.a(this.dK().B);
         } else {
            if (!this.dK().B) {
               this.f($$0);
               this.a($$0, this.H_(), 1);
            }

            return bgt.a(this.dK().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gh() {
      if (this.dK().G().b(cdz.c)) {
         this.gk();
      } else {
         cbg.f[] $$0 = (cbg.f[])cbg.b.get(1);
         cbg.f[] $$1 = (cbg.f[])cbg.b.get(2);
         if ($$0 != null && $$1 != null) {
            cop $$2 = this.gc();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cbg.f $$4 = $$1[$$3];
            coo $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gk() {
      cop $$0 = this.gc();

      for (Pair<cbg.f[], Integer> $$1 : cbg.d) {
         cbg.f[] $$2 = (cbg.f[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", rg.a(this.bW));
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = rg.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(coo $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dK().b(new bir(this.dK(), this.dp(), this.dr() + 0.5, this.dv(), $$1));
      }
   }

   @Override
   protected aoy r() {
      return this.gb() ? aoz.zt : aoz.zl;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.zq;
   }

   @Override
   protected aoy h_() {
      return aoz.zm;
   }

   @Override
   protected aoy c(cja $$0) {
      return $$0.a(cjd.pQ) ? aoz.zo : aoz.zp;
   }

   @Override
   protected aoy w(boolean $$0) {
      return $$0 ? aoz.zu : aoz.zr;
   }

   @Override
   public aoy ge() {
      return aoz.zu;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int gj() {
      return this.bX;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         this.gl();
      }
   }

   private void gl() {
      if (this.bX > 0 && !this.gb() && --this.bX == 0) {
         this.ak();
      }
   }

   public void i(@Nullable gw $$0) {
      this.bW = $$0;
   }

   @Nullable
   gw gn() {
      return this.bW;
   }

   class a extends bpw {
      final cbi a;
      final double b;
      final double c;

      a(cbi $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bpw.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cbi.this.bN.n();
      }

      @Override
      public boolean a() {
         gw $$0 = this.a.gn();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         gw $$0 = this.a.gn();
         if ($$0 != null && cbi.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               ehi $$1 = new ehi((double)$$0.u() - this.a.dp(), (double)$$0.v() - this.a.dr(), (double)$$0.w() - this.a.dv()).d();
               ehi $$2 = $$1.a(10.0).b(this.a.dp(), this.a.dr(), this.a.dv());
               cbi.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cbi.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(gw $$0, double $$1) {
         return !$$0.a(this.a.di(), $$1);
      }
   }
}
