import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class ckt extends ckr {
   protected static final Predicate<buk> b = $$0 -> $$0 instanceof ckt;
   protected jn c = jn.d;

   protected ckt(bur<? extends ckt> $$0, dgh $$1) {
      super($$0, $$1);
   }

   protected ckt(bur<? extends ckt> $$0, dgh $$1, ji $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected void a(jn $$0) {
      Objects.requireNonNull($$0);
      Validate.isTrue($$0.o().d());
      this.c = $$0;
      this.v((float)(this.c.e() * 90));
      this.N = this.dL();
      this.l();
   }

   @Override
   protected final void l() {
      if (this.c != null) {
         fau $$0 = this.a(this.a, this.c);
         faz $$1 = $$0.f();
         this.o($$1.d, $$1.e, $$1.f);
         this.a($$0);
      }
   }

   protected abstract fau a(ji var1, jn var2);

   @Override
   public boolean m() {
      if (!this.dV().g(this)) {
         return false;
      } else {
         boolean $$0 = ji.b(this.y()).allMatch($$0x -> {
            dww $$1 = this.dV().a_($$0x);
            return $$1.e() || dlo.n($$1);
         });
         return !$$0 ? false : this.dV().a(this, this.cR(), b).isEmpty();
      }
   }

   protected fau y() {
      return this.cR().a(this.c.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jn cO() {
      return this.c;
   }

   public abstract void z();

   @Override
   public clb a(ard $$0, cwo $$1, float $$2) {
      clb $$3 = new clb(
         this.dV(), this.dA() + (double)((float)this.c.j() * 0.15F), this.dC() + (double)$$2, this.dG() + (double)((float)this.c.l() * 0.15F), $$1
      );
      $$3.s();
      this.dV().b($$3);
      return $$3;
   }

   @Override
   public float a(dqd $$0) {
      if (this.c.o() != jn.a.b) {
         switch ($$0) {
            case c:
               this.c = this.c.g();
               break;
            case d:
               this.c = this.c.i();
               break;
            case b:
               this.c = this.c.h();
         }
      }

      float $$1 = ayz.h(this.dL());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dok $$0) {
      return this.a($$0.a(this.c));
   }
}
