import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class cnw extends cnu {
   protected static final Predicate<bwv> b = $$0 -> $$0 instanceof cnw;
   protected jc c = jc.d;

   protected cnw(bxe<? extends cnw> $$0, djz $$1) {
      super($$0, $$1);
   }

   protected cnw(bxe<? extends cnw> $$0, djz $$1, iw $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected void a(jc $$0) {
      Objects.requireNonNull($$0);
      Validate.isTrue($$0.o().d());
      this.c = $$0;
      this.w((float)(this.c.e() * 90));
      this.N = this.dL();
      this.f();
   }

   @Override
   protected final void f() {
      if (this.c != null) {
         ffn $$0 = this.a(this.a, this.c);
         ffs $$1 = $$0.f();
         this.o($$1.d, $$1.e, $$1.f);
         this.a($$0);
      }
   }

   protected abstract ffn a(iw var1, jc var2);

   @Override
   public boolean g() {
      if (!this.dV().g(this)) {
         return false;
      } else {
         boolean $$0 = iw.b(this.u()).allMatch($$0x -> {
            ebg $$1 = this.dV().a_($$0x);
            return $$1.e() || dph.n($$1);
         });
         return !$$0 ? false : this.dV().a(this, this.cR(), b).isEmpty();
      }
   }

   protected ffn u() {
      return this.cR().a(this.c.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jc cO() {
      return this.c;
   }

   @Override
   public abstract void v();

   @Override
   public coe a(aru $$0, daa $$1, float $$2) {
      coe $$3 = new coe(
         this.dV(), this.dA() + (double)((float)this.c.j() * 0.15F), this.dC() + (double)$$2, this.dG() + (double)((float)this.c.l() * 0.15F), $$1
      );
      $$3.j();
      this.dV().b($$3);
      return $$3;
   }

   @Override
   public float a(dty $$0) {
      if (this.c.o() != jc.a.b) {
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

      float $$1 = azq.h(this.dL());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dsh $$0) {
      return this.a($$0.a(this.c));
   }
}
