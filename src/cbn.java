import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cbn extends cbc {
   private static final int bV = 5;
   @Nullable
   private gw bW;
   private int bX;

   public cbn(biu<? extends cbn> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpv(this));
      this.bO.a(0, new brm<>(this, cle.a(new cjf(cji.rv), clf.i), ape.zn, $$0 -> this.dL().O() && !$$0.cd()));
      this.bO.a(0, new brm<>(this, new cjf(cji.pQ), ape.zs, $$0 -> this.dL().N() && $$0.cd()));
      this.bO.a(1, new brk(this));
      this.bO.a(1, new bpi<>(this, cab.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpi<>(this, bzb.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bpi<>(this, bzx.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpi<>(this, bzw.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpi<>(this, bzl.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bpi<>(this, bzg.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bpi<>(this, caa.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bqu(this, 0.5));
      this.bO.a(1, new bqk(this));
      this.bO.a(2, new cbn.a(this, 2.0, 0.35));
      this.bO.a(4, new bqp(this, 0.35));
      this.bO.a(8, new bro(this, 0.35));
      this.bO.a(9, new bqe(this, cbu.class, 3.0F, 1.0F));
      this.bO.a(10, new bqj(this, bji.class, 8.0F));
   }

   @Nullable
   @Override
   public bil a(akr $$0, bil $$1) {
      return null;
   }

   @Override
   public boolean gg() {
      return false;
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if (!$$2.a(cji.sR) && this.bv() && !this.ge() && !this.m_()) {
         if ($$1 == bgx.a) {
            $$0.a(apo.S);
         }

         if (this.gf().isEmpty()) {
            return bgy.a(this.dL().B);
         } else {
            if (!this.dL().B) {
               this.f($$0);
               this.a($$0, this.N_(), 1);
            }

            return bgy.a(this.dL().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gk() {
      if (this.dL().G().b(cee.c)) {
         this.gn();
      } else {
         cbl.g[] $$0 = (cbl.g[])cbl.b.get(1);
         cbl.g[] $$1 = (cbl.g[])cbl.b.get(2);
         if ($$0 != null && $$1 != null) {
            cou $$2 = this.gf();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cbl.g $$4 = $$1[$$3];
            cot $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gn() {
      cou $$0 = this.gf();

      for (Pair<cbl.g[], Integer> $$1 : cbl.d) {
         cbl.g[] $$2 = (cbl.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", rk.a(this.bW));
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = rk.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(cot $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dL().b(new biw(this.dL(), this.dq(), this.ds() + 0.5, this.dw(), $$1));
      }
   }

   @Override
   protected apd w() {
      return this.ge() ? ape.zt : ape.zl;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.zq;
   }

   @Override
   protected apd l_() {
      return ape.zm;
   }

   @Override
   protected apd c(cjf $$0) {
      return $$0.a(cji.pQ) ? ape.zo : ape.zp;
   }

   @Override
   protected apd w(boolean $$0) {
      return $$0 ? ape.zu : ape.zr;
   }

   @Override
   public apd gh() {
      return ape.zu;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int gm() {
      return this.bX;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B) {
         this.go();
      }
   }

   private void go() {
      if (this.bX > 0 && !this.ge() && --this.bX == 0) {
         this.ak();
      }
   }

   public void i(@Nullable gw $$0) {
      this.bW = $$0;
   }

   @Nullable
   gw gq() {
      return this.bW;
   }

   class a extends bqb {
      final cbn a;
      final double b;
      final double c;

      a(cbn $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bqb.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cbn.this.bN.n();
      }

      @Override
      public boolean a() {
         gw $$0 = this.a.gq();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         gw $$0 = this.a.gq();
         if ($$0 != null && cbn.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               ehn $$1 = new ehn((double)$$0.u() - this.a.dq(), (double)$$0.v() - this.a.ds(), (double)$$0.w() - this.a.dw()).d();
               ehn $$2 = $$1.a(10.0).b(this.a.dq(), this.a.ds(), this.a.dw());
               cbn.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cbn.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(gw $$0, double $$1) {
         return !$$0.a(this.a.dj(), $$1);
      }
   }
}
