import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class ceu extends cej {
   private static final int bV = 5;
   @Nullable
   private hx bW;
   private int bX;

   public ceu(blt<? extends ceu> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsv(this));
      this.bO.a(0, new bum<>(this, cor.a(new cmr(cmu.sh), cos.i), arm.An, $$0 -> this.dM().Q() && !$$0.ce()));
      this.bO.a(0, new bum<>(this, new cmr(cmu.qB), arm.As, $$0 -> this.dM().P() && $$0.ce()));
      this.bO.a(1, new buk(this));
      this.bO.a(1, new bsi<>(this, cdc.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bsi<>(this, ccc.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bsi<>(this, ccy.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bsi<>(this, ccx.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bsi<>(this, ccm.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bsi<>(this, cch.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bsi<>(this, cdb.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new btu(this, 0.5));
      this.bO.a(1, new btk(this));
      this.bO.a(2, new ceu.a(this, 2.0, 0.35));
      this.bO.a(4, new btp(this, 0.35));
      this.bO.a(8, new buo(this, 0.35));
      this.bO.a(9, new bte(this, cfb.class, 3.0F, 1.0F));
      this.bO.a(10, new btj(this, bmh.class, 8.0F));
   }

   @Nullable
   @Override
   public blk a(amz $$0, blk $$1) {
      return null;
   }

   @Override
   public boolean gh() {
      return false;
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if (!$$2.a(cmu.tE) && this.bx() && !this.gf() && !this.o_()) {
         if ($$1 == bju.a) {
            $$0.a(arw.S);
         }

         if (this.gg().isEmpty()) {
            return bjv.a(this.dM().B);
         } else {
            if (!this.dM().B) {
               this.f($$0);
               this.a($$0, this.Q_(), 1);
            }

            return bjv.a(this.dM().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gl() {
      if (this.dM().I().b(chn.d)) {
         this.go();
      } else {
         ces.g[] $$0 = (ces.g[])ces.b.get(1);
         ces.g[] $$1 = (ces.g[])ces.b.get(2);
         if ($$0 != null && $$1 != null) {
            csh $$2 = this.gg();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            ces.g $$4 = $$1[$$3];
            csg $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void go() {
      csh $$0 = this.gg();

      for (Pair<ces.g[], Integer> $$1 : ces.d) {
         ces.g[] $$2 = (ces.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", ta.a(this.bW));
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = ta.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(csg $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dM().b(new blv(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   @Override
   protected arl y() {
      return this.gf() ? arm.At : arm.Al;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.Aq;
   }

   @Override
   protected arl n_() {
      return arm.Am;
   }

   @Override
   protected arl c(cmr $$0) {
      return $$0.a(cmu.qB) ? arm.Ao : arm.Ap;
   }

   @Override
   protected arl w(boolean $$0) {
      return $$0 ? arm.Au : arm.Ar;
   }

   @Override
   public arl gi() {
      return arm.Au;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int gn() {
      return this.bX;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         this.gp();
      }
   }

   private void gp() {
      if (this.bX > 0 && !this.gf() && --this.bX == 0) {
         this.am();
      }
   }

   public void i(@Nullable hx $$0) {
      this.bW = $$0;
   }

   @Nullable
   hx gr() {
      return this.bW;
   }

   class a extends btb {
      final ceu a;
      final double b;
      final double c;

      a(ceu $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(btb.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         ceu.this.bN.n();
      }

      @Override
      public boolean a() {
         hx $$0 = this.a.gr();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         hx $$0 = this.a.gr();
         if ($$0 != null && ceu.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               elm $$1 = new elm((double)$$0.u() - this.a.dr(), (double)$$0.v() - this.a.dt(), (double)$$0.w() - this.a.dx()).d();
               elm $$2 = $$1.a(10.0).b(this.a.dr(), this.a.dt(), this.a.dx());
               ceu.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               ceu.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(hx $$0, double $$1) {
         return !$$0.a(this.a.dk(), $$1);
      }
   }
}
