import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cal extends bzk {
   protected static final aeg<Boolean> b = aej.a(cal.class, aei.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public cal(biw<? extends cal> $$0, cpx $$1) {
      super($$0, $$1);
      this.s(true);
      this.y();
      this.a(eaz.n, 16.0F);
      this.a(eaz.o, -1.0F);
   }

   private void y() {
      if (btz.a(this)) {
         ((bsq)this.L()).b(true);
      }
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 1.79F;
   }

   @Override
   protected float l(bis $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   protected abstract boolean s();

   public void w(boolean $$0) {
      this.al().b(b, $$0);
   }

   protected boolean t() {
      return this.al().b(b);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.e);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.e = $$0.h("TimeInOverworld");
   }

   @Override
   protected void X() {
      super.X();
      if (this.gd()) {
         this.e++;
      } else {
         this.e = 0;
      }

      if (this.e > 300) {
         this.gh();
         this.c((aks)this.dL());
      }
   }

   public boolean gd() {
      return !this.dL().C_().b() && !this.t() && !this.fT();
   }

   protected void c(aks $$0) {
      caf $$1 = this.a(biw.bs, true);
      if ($$1 != null) {
         $$1.b(new bif(bih.i, 200, 0));
      }
   }

   public boolean ge() {
      return !this.m_();
   }

   public abstract cao gf();

   @Nullable
   @Override
   public bji q() {
      return this.bz.c(bsj.o).orElse(null);
   }

   protected boolean gg() {
      return this.eS().d() instanceof ckv;
   }

   @Override
   public void P() {
      if (can.d(this)) {
         super.P();
      }
   }

   @Override
   protected void W() {
      super.W();
      abd.a(this);
   }

   protected abstract void gh();
}
