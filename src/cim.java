import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class cim extends cik {
   protected static final Predicate<bsg> c = $$0 -> $$0 instanceof cim;
   protected jf d;

   protected cim(bsm<? extends cim> $$0, dcf $$1) {
      super($$0, $$1);
      this.d = jf.d;
   }

   protected cim(bsm<? extends cim> $$0, dcf $$1, ja $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected void a(jf $$0) {
      Objects.requireNonNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.s((float)(this.d.e() * 90));
      this.O = this.dG();
      this.p();
   }

   @Override
   protected final void p() {
      if (this.d != null) {
         ewa $$0 = this.a(this.b, this.d);
         ewf $$1 = $$0.f();
         this.p($$1.c, $$1.d, $$1.e);
         this.a($$0);
      }
   }

   protected abstract ewa a(ja var1, jf var2);

   @Override
   public boolean s() {
      if (!this.dQ().g(this)) {
         return false;
      } else {
         boolean $$0 = ja.a(this.B()).allMatch($$0x -> {
            dsk $$1 = this.dQ().a_($$0x);
            return $$1.e() || dhj.m($$1);
         });
         return !$$0 ? false : this.dQ().a(this, this.cL(), c).isEmpty();
      }
   }

   protected ewa B() {
      return this.cL().a(this.d.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jf cI() {
      return this.d;
   }

   public abstract void C();

   @Override
   public ciu a(cuc $$0, float $$1) {
      ciu $$2 = new ciu(
         this.dQ(), this.dv() + (double)((float)this.d.j() * 0.15F), this.dx() + (double)$$1, this.dB() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.v();
      this.dQ().b($$2);
      return $$2;
   }

   @Override
   public float a(dlu $$0) {
      if (this.d.o() != jf.a.b) {
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

      float $$1 = ayg.g(this.dG());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dke $$0) {
      return this.a($$0.a(this.d));
   }
}
