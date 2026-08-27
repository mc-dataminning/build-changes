import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cdn extends cdc {
   private static final int bV = 5;
   @Nullable
   private ht bW;
   private int bX;

   public cdn(bku<? extends cdn> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new brv(this));
      this.bO.a(0, new btm<>(this, cni.a(new clj(clm.sh), cnj.i), aqr.zS, $$0 -> this.dN().P() && !$$0.ce()));
      this.bO.a(0, new btm<>(this, new clj(clm.qB), aqr.zX, $$0 -> this.dN().O() && $$0.ce()));
      this.bO.a(1, new btk(this));
      this.bO.a(1, new bri<>(this, ccb.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bri<>(this, cbb.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bri<>(this, cbx.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bri<>(this, cbw.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bri<>(this, cbl.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bri<>(this, cbg.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bri<>(this, cca.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bsu(this, 0.5));
      this.bO.a(1, new bsk(this));
      this.bO.a(2, new cdn.a(this, 2.0, 0.35));
      this.bO.a(4, new bsp(this, 0.35));
      this.bO.a(8, new bto(this, 0.35));
      this.bO.a(9, new bse(this, cdu.class, 3.0F, 1.0F));
      this.bO.a(10, new bsj(this, bli.class, 8.0F));
   }

   @Nullable
   @Override
   public bkl a(ame $$0, bkl $$1) {
      return null;
   }

   @Override
   public boolean gi() {
      return false;
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if (!$$2.a(clm.tD) && this.bx() && !this.gg() && !this.n_()) {
         if ($$1 == biw.a) {
            $$0.a(arb.S);
         }

         if (this.gh().isEmpty()) {
            return bix.a(this.dN().B);
         } else {
            if (!this.dN().B) {
               this.f($$0);
               this.a($$0, this.P_(), 1);
            }

            return bix.a(this.dN().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gm() {
      if (this.dN().H().b(cgf.d)) {
         this.gp();
      } else {
         cdl.g[] $$0 = (cdl.g[])cdl.b.get(1);
         cdl.g[] $$1 = (cdl.g[])cdl.b.get(2);
         if ($$0 != null && $$1 != null) {
            cqz $$2 = this.gh();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cdl.g $$4 = $$1[$$3];
            cqy $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gp() {
      cqz $$0 = this.gh();

      for (Pair<cdl.g[], Integer> $$1 : cdl.d) {
         cdl.g[] $$2 = (cdl.g[])$$1.getLeft();
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
   protected void b(cqy $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dN().b(new bkw(this.dN(), this.ds(), this.du() + 0.5, this.dy(), $$1));
      }
   }

   @Override
   protected aqq y() {
      return this.gg() ? aqr.zY : aqr.zQ;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.zV;
   }

   @Override
   protected aqq m_() {
      return aqr.zR;
   }

   @Override
   protected aqq c(clj $$0) {
      return $$0.a(clm.qB) ? aqr.zT : aqr.zU;
   }

   @Override
   protected aqq w(boolean $$0) {
      return $$0 ? aqr.zZ : aqr.zW;
   }

   @Override
   public aqq gj() {
      return aqr.zZ;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int go() {
      return this.bX;
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dN().B) {
         this.gq();
      }
   }

   private void gq() {
      if (this.bX > 0 && !this.gg() && --this.bX == 0) {
         this.am();
      }
   }

   public void i(@Nullable ht $$0) {
      this.bW = $$0;
   }

   @Nullable
   ht gs() {
      return this.bW;
   }

   class a extends bsb {
      final cdn a;
      final double b;
      final double c;

      a(cdn $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bsb.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cdn.this.bN.n();
      }

      @Override
      public boolean a() {
         ht $$0 = this.a.gs();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         ht $$0 = this.a.gs();
         if ($$0 != null && cdn.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               eju $$1 = new eju((double)$$0.u() - this.a.ds(), (double)$$0.v() - this.a.du(), (double)$$0.w() - this.a.dy()).d();
               eju $$2 = $$1.a(10.0).b(this.a.ds(), this.a.du(), this.a.dy());
               cdn.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cdn.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ht $$0, double $$1) {
         return !$$0.a(this.a.dl(), $$1);
      }
   }
}
