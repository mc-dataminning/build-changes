import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cht extends chi {
   private static final int bX = 5;
   @Nullable
   private ib bY;
   private int bZ;

   public cht(bol<? extends cht> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(0, new bvo(this));
      this.bP.a(0, new bxf<>(this, cro.a(new cpq(cpt.sj), crp.i), atp.AQ, $$0 -> this.dJ().Q() && !$$0.cb()));
      this.bP.a(0, new bxf<>(this, new cpq(cpt.qD), atp.AV, $$0 -> this.dJ().P() && $$0.cb()));
      this.bP.a(1, new bxd(this));
      this.bP.a(1, new bvb<>(this, cfz.class, 8.0F, 0.5, 0.5));
      this.bP.a(1, new bvb<>(this, cez.class, 12.0F, 0.5, 0.5));
      this.bP.a(1, new bvb<>(this, cfv.class, 8.0F, 0.5, 0.5));
      this.bP.a(1, new bvb<>(this, cfu.class, 8.0F, 0.5, 0.5));
      this.bP.a(1, new bvb<>(this, cfj.class, 15.0F, 0.5, 0.5));
      this.bP.a(1, new bvb<>(this, cfe.class, 12.0F, 0.5, 0.5));
      this.bP.a(1, new bvb<>(this, cfy.class, 10.0F, 0.5, 0.5));
      this.bP.a(1, new bwn(this, 0.5));
      this.bP.a(1, new bwd(this));
      this.bP.a(2, new cht.a(this, 2.0, 0.35));
      this.bP.a(4, new bwi(this, 0.35));
      this.bP.a(8, new bxh(this, 0.35));
      this.bP.a(9, new bvx(this, cia.class, 3.0F, 1.0F));
      this.bP.a(10, new bwc(this, boz.class, 8.0F));
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      return null;
   }

   @Override
   public boolean go() {
      return false;
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if (!$$2.a(cpt.tH) && this.bx() && !this.gm() && !this.o_()) {
         if ($$1 == bmk.a) {
            $$0.a(atz.S);
         }

         if (this.gn().isEmpty()) {
            return bml.a(this.dJ().B);
         } else {
            if (!this.dJ().B) {
               this.f($$0);
               this.a($$0, this.Q_(), 1);
            }

            return bml.a(this.dJ().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gs() {
      if (this.dJ().I().b(ckn.d)) {
         this.gv();
      } else {
         chr.g[] $$0 = (chr.g[])chr.b.get(1);
         chr.g[] $$1 = (chr.g[])chr.b.get(2);
         if ($$0 != null && $$1 != null) {
            cvd $$2 = this.gn();
            this.a($$2, $$0, 5);
            int $$3 = this.af.a($$1.length);
            chr.g $$4 = $$1[$$3];
            cvc $$5 = $$4.a(this, this.af);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gv() {
      cvd $$0 = this.gn();

      for (Pair<chr.g[], Integer> $$1 : chr.d) {
         chr.g[] $$2 = (chr.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bZ);
      if (this.bY != null) {
         $$0.a("WanderTarget", tn.a(this.bY));
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bZ = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bY = tn.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(cvc $$0) {
      if ($$0.t()) {
         int $$1 = 3 + this.af.a(4);
         this.dJ().b(new bon(this.dJ(), this.do(), this.dq() + 0.5, this.du(), $$1));
      }
   }

   @Override
   protected ato y() {
      return this.gm() ? atp.AW : atp.AO;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.AT;
   }

   @Override
   protected ato n_() {
      return atp.AP;
   }

   @Override
   protected ato c(cpq $$0) {
      return $$0.a(cpt.qD) ? atp.AR : atp.AS;
   }

   @Override
   protected ato w(boolean $$0) {
      return $$0 ? atp.AX : atp.AU;
   }

   @Override
   public ato gp() {
      return atp.AX;
   }

   public void v(int $$0) {
      this.bZ = $$0;
   }

   public int gu() {
      return this.bZ;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dJ().B) {
         this.gw();
      }
   }

   private void gw() {
      if (this.bZ > 0 && !this.gm() && --this.bZ == 0) {
         this.am();
      }
   }

   public void i(@Nullable ib $$0) {
      this.bY = $$0;
   }

   @Nullable
   ib gy() {
      return this.bY;
   }

   class a extends bvu {
      final cht a;
      final double b;
      final double c;

      a(cht $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cht.this.bO.n();
      }

      @Override
      public boolean a() {
         ib $$0 = this.a.gy();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         ib $$0 = this.a.gy();
         if ($$0 != null && cht.this.bO.l()) {
            if (this.a($$0, 10.0)) {
               eov $$1 = new eov((double)$$0.u() - this.a.do(), (double)$$0.v() - this.a.dq(), (double)$$0.w() - this.a.du()).d();
               eov $$2 = $$1.a(10.0).b(this.a.do(), this.a.dq(), this.a.du());
               cht.this.bO.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cht.this.bO.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ib $$0, double $$1) {
         return !$$0.a(this.a.dh(), $$1);
      }
   }
}
