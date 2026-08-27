import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cbt extends cbi {
   private static final int bV = 5;
   @Nullable
   private gw bW;
   private int bX;

   public cbt(bja<? extends cbt> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqb(this));
      this.bO.a(0, new brs<>(this, clk.a(new cjl(cjo.rv), cll.i), apg.zn, $$0 -> this.dL().O() && !$$0.cd()));
      this.bO.a(0, new brs<>(this, new cjl(cjo.pQ), apg.zs, $$0 -> this.dL().N() && $$0.cd()));
      this.bO.a(1, new brq(this));
      this.bO.a(1, new bpo<>(this, cah.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpo<>(this, bzh.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bpo<>(this, cad.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpo<>(this, cac.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpo<>(this, bzr.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bpo<>(this, bzm.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bpo<>(this, cag.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bra(this, 0.5));
      this.bO.a(1, new bqq(this));
      this.bO.a(2, new cbt.a(this, 2.0, 0.35));
      this.bO.a(4, new bqv(this, 0.35));
      this.bO.a(8, new bru(this, 0.35));
      this.bO.a(9, new bqk(this, cca.class, 3.0F, 1.0F));
      this.bO.a(10, new bqp(this, bjo.class, 8.0F));
   }

   @Nullable
   @Override
   public bir a(akt $$0, bir $$1) {
      return null;
   }

   @Override
   public boolean gh() {
      return false;
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if (!$$2.a(cjo.sR) && this.bv() && !this.gf() && !this.m_()) {
         if ($$1 == bhd.a) {
            $$0.a(apq.S);
         }

         if (this.gg().isEmpty()) {
            return bhe.a(this.dL().B);
         } else {
            if (!this.dL().B) {
               this.f($$0);
               this.a($$0, this.N_(), 1);
            }

            return bhe.a(this.dL().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gl() {
      if (this.dL().G().b(cek.c)) {
         this.go();
      } else {
         cbr.g[] $$0 = (cbr.g[])cbr.b.get(1);
         cbr.g[] $$1 = (cbr.g[])cbr.b.get(2);
         if ($$0 != null && $$1 != null) {
            cpa $$2 = this.gg();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cbr.g $$4 = $$1[$$3];
            coz $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void go() {
      cpa $$0 = this.gg();

      for (Pair<cbr.g[], Integer> $$1 : cbr.d) {
         cbr.g[] $$2 = (cbr.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", rj.a(this.bW));
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = rj.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(coz $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dL().b(new bjc(this.dL(), this.dq(), this.ds() + 0.5, this.dw(), $$1));
      }
   }

   @Override
   protected apf w() {
      return this.gf() ? apg.zt : apg.zl;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.zq;
   }

   @Override
   protected apf l_() {
      return apg.zm;
   }

   @Override
   protected apf c(cjl $$0) {
      return $$0.a(cjo.pQ) ? apg.zo : apg.zp;
   }

   @Override
   protected apf w(boolean $$0) {
      return $$0 ? apg.zu : apg.zr;
   }

   @Override
   public apf gi() {
      return apg.zu;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int gn() {
      return this.bX;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B) {
         this.gp();
      }
   }

   private void gp() {
      if (this.bX > 0 && !this.gf() && --this.bX == 0) {
         this.ak();
      }
   }

   public void i(@Nullable gw $$0) {
      this.bW = $$0;
   }

   @Nullable
   gw gr() {
      return this.bW;
   }

   class a extends bqh {
      final cbt a;
      final double b;
      final double c;

      a(cbt $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bqh.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cbt.this.bN.n();
      }

      @Override
      public boolean a() {
         gw $$0 = this.a.gr();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         gw $$0 = this.a.gr();
         if ($$0 != null && cbt.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               ehh $$1 = new ehh((double)$$0.u() - this.a.dq(), (double)$$0.v() - this.a.ds(), (double)$$0.w() - this.a.dw()).d();
               ehh $$2 = $$1.a(10.0).b(this.a.dq(), this.a.ds(), this.a.dw());
               cbt.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cbt.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(gw $$0, double $$1) {
         return !$$0.a(this.a.dj(), $$1);
      }
   }
}
