import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cdg extends cbz {
   protected static final afz<Boolean> b = agc.a(cdg.class, agb.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public cdg(blj<? extends cdg> $$0, csy $$1) {
      super($$0, $$1);
      this.s(true);
      this.A();
      this.a(eek.n, 16.0F);
      this.a(eek.o, -1.0F);
   }

   private void A() {
      if (bwo.a(this)) {
         ((bve)this.N()).b(true);
      }
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 1.79F;
   }

   @Override
   protected float l(blf $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected abstract boolean u();

   public void w(boolean $$0) {
      this.an().b(b, $$0);
   }

   protected boolean w() {
      return this.an().b(b);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      if (this.w()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.e);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.e = $$0.h("TimeInOverworld");
   }

   @Override
   protected void Z() {
      super.Z();
      if (this.ge()) {
         this.e++;
      } else {
         this.e = 0;
      }

      if (this.e > 300) {
         this.gi();
         this.c((amp)this.dM());
      }
   }

   public boolean ge() {
      return !this.dM().E_().b() && !this.w() && !this.fU();
   }

   protected void c(amp $$0) {
      ccu $$1 = this.a(blj.bu, true);
      if ($$1 != null) {
         $$1.b(new bks(bku.i, 200, 0));
      }
   }

   public boolean gf() {
      return !this.o_();
   }

   public abstract cdj gg();

   @Nullable
   @Override
   public blv q() {
      return this.bz.c(bux.o).orElse(null);
   }

   protected boolean gh() {
      return this.eT().d() instanceof cnv;
   }

   @Override
   public void R() {
      if (cdi.d(this)) {
         super.R();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
   }

   protected abstract void gi();
}
