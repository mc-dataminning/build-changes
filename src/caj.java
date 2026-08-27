import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class caj extends bzi {
   protected static final aee<Boolean> b = aeh.a(caj.class, aeg.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public caj(biu<? extends caj> $$0, cpv $$1) {
      super($$0, $$1);
      this.s(true);
      this.y();
      this.a(eax.n, 16.0F);
      this.a(eax.o, -1.0F);
   }

   private void y() {
      if (btx.a(this)) {
         ((bso)this.L()).b(true);
      }
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 1.79F;
   }

   @Override
   protected float l(biq $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
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
      if (this.gd()) {
         this.e++;
      } else {
         this.e = 0;
      }

      if (this.e > 300) {
         this.gh();
         this.c((akq)this.dL());
      }
   }

   public boolean gd() {
      return !this.dL().C_().b() && !this.t() && !this.fT();
   }

   protected void c(akq $$0) {
      cad $$1 = this.a(biu.bs, true);
      if ($$1 != null) {
         $$1.b(new bid(bif.i, 200, 0));
      }
   }

   public boolean ge() {
      return !this.m_();
   }

   public abstract cam gf();

   @Nullable
   @Override
   public bjg q() {
      return this.bz.c(bsh.o).orElse(null);
   }

   protected boolean gg() {
      return this.eS().d() instanceof ckt;
   }

   @Override
   public void P() {
      if (cal.d(this)) {
         super.P();
      }
   }

   @Override
   protected void W() {
      super.W();
      abb.a(this);
   }

   protected abstract void gh();
}
