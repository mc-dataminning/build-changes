import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class ciz extends cix {
   protected static final Predicate<bsr> c = $$0 -> $$0 instanceof ciz;
   protected ji d;

   protected ciz(bsx<? extends ciz> $$0, dcw $$1) {
      super($$0, $$1);
      this.d = ji.d;
   }

   protected ciz(bsx<? extends ciz> $$0, dcw $$1, jd $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected void a(ji $$0) {
      Objects.requireNonNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.t((float)(this.d.e() * 90));
      this.O = this.dF();
      this.p();
   }

   @Override
   protected final void p() {
      if (this.d != null) {
         ewv $$0 = this.a(this.b, this.d);
         exa $$1 = $$0.f();
         this.o($$1.c, $$1.d, $$1.e);
         this.a($$0);
      }
   }

   protected abstract ewv a(jd var1, ji var2);

   @Override
   public boolean s() {
      if (!this.dP().g(this)) {
         return false;
      } else {
         boolean $$0 = jd.a(this.B()).allMatch($$0x -> {
            dtc $$1 = this.dP().a_($$0x);
            return $$1.e() || dia.m($$1);
         });
         return !$$0 ? false : this.dP().a(this, this.cL(), c).isEmpty();
      }
   }

   protected ewv B() {
      return this.cL().a(this.d.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public ji cI() {
      return this.d;
   }

   public abstract void C();

   @Override
   public cjh a(cuq $$0, float $$1) {
      cjh $$2 = new cjh(
         this.dP(), this.du() + (double)((float)this.d.j() * 0.15F), this.dw() + (double)$$1, this.dA() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.v();
      this.dP().b($$2);
      return $$2;
   }

   @Override
   public float a(dmm $$0) {
      if (this.d.o() != ji.a.b) {
         switch ($$0) {
            case c:
               this.d = this.d.g();
               break;
            case d:
               this.d = this.d.i();
               break;
            case b:
               this.d = this.d.h();
         }
      }

      float $$1 = ayo.g(this.dF());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dkv $$0) {
      return this.a($$0.a(this.d));
   }
}
