import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckn extends cjr {
   private static final int cc = 20;
   private static final int cd = 1;
   private static final int ce = 20;
   private static final int cf = 3;
   private static final int cg = 5;
   private static final int ch = 10;
   private static final float ci = 3.0F;
   private static final int cj = 1;
   private static final int ck = 80;
   public bsc b = new bsc();
   public bsc c = new bsc();
   public bsc d = new bsc();
   public bsc e = new bsc();
   public bsc ca = new bsc();
   public bsc cb = new bsc();
   private int cl = 0;
   private int cm = 0;
   private static final cne cn = ($$0, $$1, $$2) -> {
      $$1.dR().a(null, $$1, avh.cF, $$1.dg(), 1.0F, 1.0F);
      cne.b.deflect($$0, $$1, $$2);
   };

   public static buj.a s() {
      return bte.A().a(buk.v, 0.63F).a(buk.s, 30.0).a(buk.m, 24.0).a(buk.c, 3.0);
   }

   public ckn(bsn<? extends cjr> $$0, dcg $$1) {
      super($$0, $$1);
      this.a(epa.z, -1.0F);
      this.a(epa.o, -1.0F);
      this.bP = 10;
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return cko.a(this.dW().a($$0));
   }

   @Override
   public bue<ckn> dV() {
      return (bue<ckn>)super.dV();
   }

   @Override
   protected bue.b<ckn> dW() {
      return bue.a(cko.f, cko.e);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (this.dR().x_() && at.equals($$0)) {
         this.gq();
         bto $$1 = this.at();
         switch ($$1) {
            case q:
               this.ca.b(this.ai);
               break;
            case r:
               this.e.b(this.ai);
               break;
            case p:
               this.c.b(this.ai);
         }
      }

      super.a($$0);
   }

   private void gq() {
      this.ca.a();
      this.b.a();
      this.cb.a();
      this.e.a();
   }

   @Override
   public void l() {
      bto $$0 = this.at();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.t().b(1 + this.dU().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.x();
      }

      if ($$0 != bto.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.cm = this.cm == 0 ? this.ah.a(1, 80) : this.cm - 1;
      if (this.cm == 0) {
         this.gn();
      }

      super.l();
   }

   public ckn t() {
      this.cl = 0;
      return this;
   }

   public void x() {
      if (++this.cl <= 5) {
         dsl $$0 = !this.ds().i() ? this.ds() : this.br();
         ewh $$1 = this.du();
         ewh $$2 = this.dp().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dR().a(new lb(lj.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bT()) {
         ewh $$1 = this.cM().f();
         ewh $$2 = new ewh($$1.c, this.dp().d, $$1.e);
         dsl $$3 = !this.ds().i() ? this.ds() : this.br();
         if ($$3.l() != dlo.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dR().a(new lb(lj.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void Q() {
      if (this.p() == null || !this.aG()) {
         this.dR().a(this, this.v(), this.dg(), 1.0F, 1.0F);
      }
   }

   public void gn() {
      float $$0 = 0.7F + 0.4F * this.ah.i();
      float $$1 = 0.8F + 0.2F * this.ah.i();
      this.dR().a(this, avh.cP, this.dg(), $$1, $$0);
   }

   @Override
   public cne a(cnd $$0) {
      return $$0.am() != bsn.n && $$0.am() != bsn.bn ? cn : cne.a;
   }

   @Override
   public avi dg() {
      return avi.f;
   }

   @Override
   protected avg n_() {
      return avh.cN;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.cO;
   }

   @Override
   protected avg v() {
      return this.aG() ? avh.cH : avh.cI;
   }

   public Optional<btc> go() {
      return this.dV().c(ccg.x).map(bra::d).filter($$0 -> $$0 instanceof btc).map($$0 -> (btc)$$0);
   }

   public boolean b(ewh $$0) {
      ewh $$1 = this.dr().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Z() {
      this.dR().ag().a("breezeBrain");
      this.dV().a((aqm)this.dR(), this);
      this.dR().ag().b("breezeActivityUpdate");
      cko.a(this);
      this.dR().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a((btc)this);
      afy.a(this);
   }

   @Override
   public boolean a(bsn<?> $$0) {
      return $$0 == bsn.by || $$0 == bsn.af;
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   public int ae() {
      return 25;
   }

   public double gp() {
      return this.dA() - 0.4;
   }

   @Override
   public boolean b(bra $$0) {
      return $$0.a(avy.b) || $$0.d() instanceof ckn || super.b($$0);
   }

   @Override
   public double dk() {
      return (double)this.cN();
   }

   @Override
   public boolean a(float $$0, float $$1, bra $$2) {
      if ($$0 > 3.0F) {
         this.a(avh.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.c;
   }

   @Nullable
   @Override
   public btc p() {
      return this.N();
   }
}
