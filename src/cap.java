import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cap extends bzo {
   protected static final aef<Boolean> b = aei.a(cap.class, aeh.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public cap(bja<? extends cap> $$0, cqb $$1) {
      super($$0, $$1);
      this.s(true);
      this.y();
      this.a(ear.n, 16.0F);
      this.a(ear.o, -1.0F);
   }

   private void y() {
      if (bud.a(this)) {
         ((bsu)this.L()).b(true);
      }
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return 1.79F;
   }

   @Override
   protected float l(biw $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
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
   public void b(qw $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.e);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.e = $$0.h("TimeInOverworld");
   }

   @Override
   protected void X() {
      super.X();
      if (this.ge()) {
         this.e++;
      } else {
         this.e = 0;
      }

      if (this.e > 300) {
         this.gi();
         this.c((akt)this.dL());
      }
   }

   public boolean ge() {
      return !this.dL().C_().b() && !this.t() && !this.fU();
   }

   protected void c(akt $$0) {
      caj $$1 = this.a(bja.bs, true);
      if ($$1 != null) {
         $$1.b(new bij(bil.i, 200, 0));
      }
   }

   public boolean gf() {
      return !this.m_();
   }

   public abstract cas gg();

   @Nullable
   @Override
   public bjm q() {
      return this.bz.c(bsn.o).orElse(null);
   }

   protected boolean gh() {
      return this.eS().d() instanceof ckz;
   }

   @Override
   public void P() {
      if (car.d(this)) {
         super.P();
      }
   }

   @Override
   protected void W() {
      super.W();
      abc.a(this);
   }

   protected abstract void gi();
}
