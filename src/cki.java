import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class cki extends ckg {
   protected static final Predicate<btz> c = $$0 -> $$0 instanceof cki;
   protected jl d;

   protected cki(bug<? extends cki> $$0, dev $$1) {
      super($$0, $$1);
      this.d = jl.d;
   }

   protected cki(bug<? extends cki> $$0, dev $$1, jg $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected void a(jl $$0) {
      Objects.requireNonNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.v((float)(this.d.e() * 90));
      this.O = this.dN();
      this.m();
   }

   @Override
   protected final void m() {
      if (this.d != null) {
         ezc $$0 = this.a(this.b, this.d);
         ezh $$1 = $$0.f();
         this.o($$1.d, $$1.e, $$1.f);
         this.a($$0);
      }
   }

   protected abstract ezc a(jg var1, jl var2);

   @Override
   public boolean o() {
      if (!this.dX().g(this)) {
         return false;
      } else {
         boolean $$0 = jg.b(this.A()).allMatch($$0x -> {
            dvd $$1 = this.dX().a_($$0x);
            return $$1.e() || dka.n($$1);
         });
         return !$$0 ? false : this.dX().a(this, this.cS(), c).isEmpty();
      }
   }

   protected ezc A() {
      return this.cS().a(this.d.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jl cP() {
      return this.d;
   }

   public abstract void B();

   @Override
   public ckq a(cvx $$0, float $$1) {
      ckq $$2 = new ckq(
         this.dX(), this.dC() + (double)((float)this.d.j() * 0.15F), this.dE() + (double)$$1, this.dI() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.q();
      this.dX().b($$2);
      return $$2;
   }

   @Override
   public float a(dol $$0) {
      if (this.d.o() != jl.a.b) {
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

      float $$1 = azj.h(this.dN());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dmu $$0) {
      return this.a($$0.a(this.d));
   }
}
