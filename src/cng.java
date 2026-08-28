import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class cng extends cne {
   protected static final Predicate<bwi> b = $$0 -> $$0 instanceof cng;
   protected jb c = jb.d;

   protected cng(bwr<? extends cng> $$0, djh $$1) {
      super($$0, $$1);
   }

   protected cng(bwr<? extends cng> $$0, djh $$1, iv $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected void a(jb $$0) {
      Objects.requireNonNull($$0);
      Validate.isTrue($$0.o().d());
      this.c = $$0;
      this.w((float)(this.c.e() * 90));
      this.N = this.dK();
      this.f();
   }

   @Override
   protected final void f() {
      if (this.c != null) {
         fes $$0 = this.a(this.a, this.c);
         fex $$1 = $$0.f();
         this.o($$1.d, $$1.e, $$1.f);
         this.a($$0);
      }
   }

   protected abstract fes a(iv var1, jb var2);

   @Override
   public boolean g() {
      if (!this.dU().g(this)) {
         return false;
      } else {
         boolean $$0 = iv.b(this.u()).allMatch($$0x -> {
            eao $$1 = this.dU().a_($$0x);
            return $$1.e() || dop.n($$1);
         });
         return !$$0 ? false : this.dU().a(this, this.cQ(), b).isEmpty();
      }
   }

   protected fes u() {
      return this.cQ().a(this.c.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jb cN() {
      return this.c;
   }

   @Override
   public abstract void v();

   @Override
   public cno a(arq $$0, czk $$1, float $$2) {
      cno $$3 = new cno(
         this.dU(), this.dz() + (double)((float)this.c.j() * 0.15F), this.dB() + (double)$$2, this.dF() + (double)((float)this.c.l() * 0.15F), $$1
      );
      $$3.j();
      this.dU().b($$3);
      return $$3;
   }

   @Override
   public float a(dtg $$0) {
      if (this.c.o() != jb.a.b) {
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

      float $$1 = azm.h(this.dK());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(drp $$0) {
      return this.a($$0.a(this.c));
   }
}
