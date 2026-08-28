import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class cjw extends cju {
   protected static final Predicate<bto> c = $$0 -> $$0 instanceof cjw;
   protected jj d;

   protected cjw(btv<? extends cjw> $$0, deg $$1) {
      super($$0, $$1);
      this.d = jj.d;
   }

   protected cjw(btv<? extends cjw> $$0, deg $$1, je $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected void a(jj $$0) {
      Objects.requireNonNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.v((float)(this.d.e() * 90));
      this.O = this.dI();
      this.m();
   }

   @Override
   protected final void m() {
      if (this.d != null) {
         eyn $$0 = this.a(this.b, this.d);
         eys $$1 = $$0.f();
         this.o($$1.d, $$1.e, $$1.f);
         this.a($$0);
      }
   }

   protected abstract eyn a(je var1, jj var2);

   @Override
   public boolean o() {
      if (!this.dS().g(this)) {
         return false;
      } else {
         boolean $$0 = je.b(this.A()).allMatch($$0x -> {
            duo $$1 = this.dS().a_($$0x);
            return $$1.e() || djl.n($$1);
         });
         return !$$0 ? false : this.dS().a(this, this.cO(), c).isEmpty();
      }
   }

   protected eyn A() {
      return this.cO().a(this.d.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jj cL() {
      return this.d;
   }

   public abstract void B();

   @Override
   public cke a(cvp $$0, float $$1) {
      cke $$2 = new cke(
         this.dS(), this.dx() + (double)((float)this.d.j() * 0.15F), this.dz() + (double)$$1, this.dD() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.q();
      this.dS().b($$2);
      return $$2;
   }

   @Override
   public float a(dnx $$0) {
      if (this.d.o() != jj.a.b) {
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

      float $$1 = azd.g(this.dI());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dmg $$0) {
      return this.a($$0.a(this.d));
   }
}
