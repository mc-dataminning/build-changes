import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cgc extends cfg {
   private static final int bX = 20;
   private static final int bY = 1;
   private static final int bZ = 20;
   private static final int ca = 3;
   private static final int cb = 5;
   private static final int cc = 10;
   private static final float cd = 3.0F;
   private static final int ce = 1;
   private static final int cf = 80;
   public bob b = new bob();
   public bob c = new bob();
   public bob d = new bob();
   public bob e = new bob();
   public bob bV = new bob();
   public bob bW = new bob();
   private int cg = 0;
   private int ch = 0;
   private static final cit ci = ($$0, $$1, $$2) -> {
      $$1.dJ().a($$1, atp.cy, $$1.cY(), 1.0F, 1.0F);
      cit.b.deflect($$0, $$1, $$2);
   };

   public static bqd.a u() {
      return boz.C().a(bqe.o, 0.63F).a(bqe.n, 30.0).a(bqe.i, 24.0).a(bqe.c, 3.0);
   }

   public cgc(bol<? extends cfg> $$0, cwe $$1) {
      super($$0, $$1);
      this.a(eic.z, -1.0F);
      this.a(eic.o, -1.0F);
      this.bK = 10;
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return cgd.a(this.dN().a($$0));
   }

   @Override
   public bpy<cgc> dM() {
      return (bpy<cgc>)super.dM();
   }

   @Override
   protected bpy.b<cgc> dN() {
      return bpy.a(cgd.f, cgd.e);
   }

   @Override
   public void a(aii<?> $$0) {
      if (this.dJ().y_() && ar.equals($$0)) {
         this.go();
         bpi $$1 = this.ap();
         switch ($$1) {
            case q:
               this.bV.b(this.ag);
               break;
            case r:
               this.e.b(this.ag);
               break;
            case p:
               this.c.b(this.ag);
         }
      }

      super.a($$0);
   }

   private void go() {
      this.bV.a();
      this.b.a();
      this.bW.a();
      this.e.a();
   }

   @Override
   public void l() {
      bpi $$0 = this.ap();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.w().b(1 + this.ef().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.A();
      }

      if ($$0 != bpi.p && this.c.c()) {
         this.d.a(this.ag);
         this.c.a();
      }

      this.ch = this.ch == 0 ? this.af.a(1, 80) : this.ch - 1;
      if (this.ch == 0) {
         this.gl();
      }

      super.l();
   }

   public cgc w() {
      this.cg = 0;
      return this;
   }

   public void A() {
      if (++this.cg <= 5) {
         dme $$0 = !this.dk().i() ? this.dk() : this.bk();
         eov $$1 = this.dm();
         eov $$2 = this.dh().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dJ().a(new jt(kb.c, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bL()) {
         eov $$1 = this.cE().f();
         eov $$2 = new eov($$1.c, this.dh().d, $$1.e);
         dme $$3 = !this.dk().i() ? this.dk() : this.bk();
         if ($$3.l() != dfk.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dJ().a(new jt(kb.c, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void R() {
      if (this.q() == null || !this.aC()) {
         this.dJ().a(this, this.y(), this.cY(), 1.0F, 1.0F);
      }
   }

   public void gl() {
      float $$0 = 0.7F + 0.4F * this.af.i();
      float $$1 = 0.8F + 0.2F * this.af.i();
      this.dJ().a(this, atp.cI, this.cY(), $$1, $$0);
   }

   @Override
   public cit a(cis $$0) {
      return $$0.ai() == bol.bl && Optional.ofNullable($$0.w()).map(bof::ai).map($$0x -> $$0x == bol.bw).orElse(false) ? cit.a : ci;
   }

   @Override
   public atq cY() {
      return atq.f;
   }

   @Override
   protected ato n_() {
      return atp.cG;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.cH;
   }

   @Override
   protected ato y() {
      return this.aC() ? atp.cA : atp.cB;
   }

   public Optional<box> gm() {
      return this.dM().c(bya.x).map(bne::d).filter($$0 -> $$0 instanceof box).map($$0 -> (box)$$0);
   }

   public boolean j(eov $$0) {
      eov $$1 = this.dj().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("breezeBrain");
      this.dM().a((apa)this.dJ(), this);
      this.dJ().ae().b("breezeActivityUpdate");
      cgd.a(this);
      this.dJ().ae().c();
      super.aa();
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a((box)this);
      aes.a(this);
   }

   @Override
   public boolean a(bol<?> $$0) {
      return $$0 == bol.bw || $$0 == bol.ae;
   }

   @Override
   public int fJ() {
      return 30;
   }

   @Override
   public int fL() {
      return 25;
   }

   public double gn() {
      return this.ds() - 0.4;
   }

   @Override
   public boolean b(bne $$0) {
      return $$0.a(aug.b) || $$0.d() instanceof cgc || super.b($$0);
   }

   @Override
   public double dc() {
      return (double)this.cF();
   }

   @Override
   public boolean a(float $$0, float $$1, bne $$2) {
      if ($$0 > 3.0F) {
         this.a(atp.cE, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bof.b aW() {
      return bof.b.c;
   }
}
