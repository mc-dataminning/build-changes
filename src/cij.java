import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class cij extends cih {
   protected static final Predicate<bsd> c = $$0 -> $$0 instanceof cij;
   protected jf d;

   protected cij(bsj<? extends cij> $$0, dcd $$1) {
      super($$0, $$1);
      this.d = jf.d;
   }

   protected cij(bsj<? extends cij> $$0, dcd $$1, ja $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected void a(jf $$0) {
      Objects.requireNonNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.s((float)(this.d.e() * 90));
      this.O = this.dF();
      this.p();
   }

   @Override
   protected final void p() {
      if (this.d != null) {
         evu $$0 = this.a(this.b, this.d);
         evz $$1 = $$0.f();
         this.p($$1.c, $$1.d, $$1.e);
         this.a($$0);
      }
   }

   protected abstract evu a(ja var1, jf var2);

   @Override
   public boolean s() {
      if (!this.dP().g(this)) {
         return false;
      } else {
         boolean $$0 = ja.a(this.B()).allMatch($$0x -> {
            dsh $$1 = this.dP().a_($$0x);
            return $$1.e() || dhh.m($$1);
         });
         return !$$0 ? false : this.dP().a(this, this.cK(), c).isEmpty();
      }
   }

   protected evu B() {
      return this.cK().a(this.d.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jf cH() {
      return this.d;
   }

   public abstract void C();

   @Override
   public cir a(cua $$0, float $$1) {
      cir $$2 = new cir(
         this.dP(), this.du() + (double)((float)this.d.j() * 0.15F), this.dw() + (double)$$1, this.dA() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.v();
      this.dP().b($$2);
      return $$2;
   }

   @Override
   public float a(dls $$0) {
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

      float $$1 = aye.g(this.dF());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dkc $$0) {
      return this.a($$0.a(this.d));
   }
}
