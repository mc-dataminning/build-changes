import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class ckr extends ckp {
   protected static final Predicate<bui> c = $$0 -> $$0 instanceof ckr;
   protected jm d;

   protected ckr(bup<? extends ckr> $$0, dff $$1) {
      super($$0, $$1);
      this.d = jm.d;
   }

   protected ckr(bup<? extends ckr> $$0, dff $$1, jh $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected void a(jm $$0) {
      Objects.requireNonNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.v((float)(this.d.e() * 90));
      this.O = this.dO();
      this.m();
   }

   @Override
   protected final void m() {
      if (this.d != null) {
         ezm $$0 = this.a(this.b, this.d);
         ezr $$1 = $$0.f();
         this.o($$1.d, $$1.e, $$1.f);
         this.a($$0);
      }
   }

   protected abstract ezm a(jh var1, jm var2);

   @Override
   public boolean o() {
      if (!this.dY().g(this)) {
         return false;
      } else {
         boolean $$0 = jh.b(this.A()).allMatch($$0x -> {
            dvo $$1 = this.dY().a_($$0x);
            return $$1.e() || dkl.n($$1);
         });
         return !$$0 ? false : this.dY().a(this, this.cT(), c).isEmpty();
      }
   }

   protected ezm A() {
      return this.cT().a(this.d.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jm cQ() {
      return this.d;
   }

   public abstract void B();

   @Override
   public ckz a(cwf $$0, float $$1) {
      ckz $$2 = new ckz(
         this.dY(), this.dD() + (double)((float)this.d.j() * 0.15F), this.dF() + (double)$$1, this.dJ() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.q();
      this.dY().b($$2);
      return $$2;
   }

   @Override
   public float a(dow $$0) {
      if (this.d.o() != jm.a.b) {
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

      float $$1 = azn.h(this.dO());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dnf $$0) {
      return this.a($$0.a(this.d));
   }
}
