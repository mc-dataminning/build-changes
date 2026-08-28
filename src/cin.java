import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class cin extends cil {
   protected static final Predicate<bsh> c = $$0 -> $$0 instanceof cin;
   protected jf d;

   protected cin(bsn<? extends cin> $$0, dcg $$1) {
      super($$0, $$1);
      this.d = jf.d;
   }

   protected cin(bsn<? extends cin> $$0, dcg $$1, ja $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected void a(jf $$0) {
      Objects.requireNonNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.s((float)(this.d.e() * 90));
      this.O = this.dH();
      this.p();
   }

   @Override
   protected final void p() {
      if (this.d != null) {
         ewc $$0 = this.a(this.b, this.d);
         ewh $$1 = $$0.f();
         this.p($$1.c, $$1.d, $$1.e);
         this.a($$0);
      }
   }

   protected abstract ewc a(ja var1, jf var2);

   @Override
   public boolean s() {
      if (!this.dR().g(this)) {
         return false;
      } else {
         boolean $$0 = ja.a(this.B()).allMatch($$0x -> {
            dsl $$1 = this.dR().a_($$0x);
            return $$1.e() || dhk.m($$1);
         });
         return !$$0 ? false : this.dR().a(this, this.cM(), c).isEmpty();
      }
   }

   protected ewc B() {
      return this.cM().a(this.d.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jf cJ() {
      return this.d;
   }

   public abstract void C();

   @Override
   public civ a(cud $$0, float $$1) {
      civ $$2 = new civ(
         this.dR(), this.dw() + (double)((float)this.d.j() * 0.15F), this.dy() + (double)$$1, this.dC() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.v();
      this.dR().b($$2);
      return $$2;
   }

   @Override
   public float a(dlv $$0) {
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

      float $$1 = ayg.g(this.dH());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dkf $$0) {
      return this.a($$0.a(this.d));
   }
}
