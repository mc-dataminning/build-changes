import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class cjz extends cjx {
   protected static final Predicate<btr> c = $$0 -> $$0 instanceof cjz;
   protected jk d;

   protected cjz(bty<? extends cjz> $$0, dej $$1) {
      super($$0, $$1);
      this.d = jk.d;
   }

   protected cjz(bty<? extends cjz> $$0, dej $$1, jf $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected void a(jk $$0) {
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
         eyr $$0 = this.a(this.b, this.d);
         eyw $$1 = $$0.f();
         this.o($$1.d, $$1.e, $$1.f);
         this.a($$0);
      }
   }

   protected abstract eyr a(jf var1, jk var2);

   @Override
   public boolean o() {
      if (!this.dS().g(this)) {
         return false;
      } else {
         boolean $$0 = jf.b(this.A()).allMatch($$0x -> {
            dus $$1 = this.dS().a_($$0x);
            return $$1.e() || djo.n($$1);
         });
         return !$$0 ? false : this.dS().a(this, this.cO(), c).isEmpty();
      }
   }

   protected eyr A() {
      return this.cO().a(this.d.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jk cL() {
      return this.d;
   }

   public abstract void B();

   @Override
   public ckh a(cvs $$0, float $$1) {
      ckh $$2 = new ckh(
         this.dS(), this.dx() + (double)((float)this.d.j() * 0.15F), this.dz() + (double)$$1, this.dD() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.q();
      this.dS().b($$2);
      return $$2;
   }

   @Override
   public float a(doa $$0) {
      if (this.d.o() != jk.a.b) {
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

      float $$1 = azf.h(this.dI());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dmj $$0) {
      return this.a($$0.a(this.d));
   }
}
