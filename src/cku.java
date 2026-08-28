import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class cku extends cks {
   protected static final Predicate<bul> b = $$0 -> $$0 instanceof cku;
   protected jm c = jm.d;

   protected cku(bus<? extends cku> $$0, dfm $$1) {
      super($$0, $$1);
   }

   protected cku(bus<? extends cku> $$0, dfm $$1, jh $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected void a(jm $$0) {
      Objects.requireNonNull($$0);
      Validate.isTrue($$0.o().d());
      this.c = $$0;
      this.v((float)(this.c.e() * 90));
      this.N = this.dL();
      this.j();
   }

   @Override
   protected final void j() {
      if (this.c != null) {
         ezt $$0 = this.a(this.a, this.c);
         ezy $$1 = $$0.f();
         this.o($$1.d, $$1.e, $$1.f);
         this.a($$0);
      }
   }

   protected abstract ezt a(jh var1, jm var2);

   @Override
   public boolean l() {
      if (!this.dV().g(this)) {
         return false;
      } else {
         boolean $$0 = jh.b(this.x()).allMatch($$0x -> {
            dvv $$1 = this.dV().a_($$0x);
            return $$1.e() || dks.n($$1);
         });
         return !$$0 ? false : this.dV().a(this, this.cR(), b).isEmpty();
      }
   }

   protected ezt x() {
      return this.cR().a(this.c.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jm cO() {
      return this.c;
   }

   public abstract void y();

   @Override
   public clc a(arp $$0, cwm $$1, float $$2) {
      clc $$3 = new clc(
         this.dV(), this.dA() + (double)((float)this.c.j() * 0.15F), this.dC() + (double)$$2, this.dG() + (double)((float)this.c.l() * 0.15F), $$1
      );
      $$3.n();
      this.dV().b($$3);
      return $$3;
   }

   @Override
   public float a(dpd $$0) {
      if (this.c.o() != jm.a.b) {
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

      float $$1 = azm.h(this.dL());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dnm $$0) {
      return this.a($$0.a(this.c));
   }
}
