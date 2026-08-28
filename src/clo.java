import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class clo extends clm {
   protected static final Predicate<bva> b = $$0 -> $$0 instanceof clo;
   protected jn c = jn.d;

   protected clo(bvi<? extends clo> $$0, dgz $$1) {
      super($$0, $$1);
   }

   protected clo(bvi<? extends clo> $$0, dgz $$1, ji $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected void a(jn $$0) {
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
         fbs $$0 = this.a(this.a, this.c);
         fbx $$1 = $$0.f();
         this.o($$1.d, $$1.e, $$1.f);
         this.a($$0);
      }
   }

   protected abstract fbs a(ji var1, jn var2);

   @Override
   public boolean g() {
      if (!this.dU().g(this)) {
         return false;
      } else {
         boolean $$0 = ji.b(this.u()).allMatch($$0x -> {
            dxq $$1 = this.dU().a_($$0x);
            return $$1.e() || dmh.n($$1);
         });
         return !$$0 ? false : this.dU().a(this, this.cQ(), b).isEmpty();
      }
   }

   protected fbs u() {
      return this.cQ().a(this.c.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jn cN() {
      return this.c;
   }

   public abstract void v();

   @Override
   public clw a(ard $$0, cxh $$1, float $$2) {
      clw $$3 = new clw(
         this.dU(), this.dz() + (double)((float)this.c.j() * 0.15F), this.dB() + (double)$$2, this.dF() + (double)((float)this.c.l() * 0.15F), $$1
      );
      $$3.j();
      this.dU().b($$3);
      return $$3;
   }

   @Override
   public float a(dqw $$0) {
      if (this.c.o() != jn.a.b) {
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

      float $$1 = ayz.h(this.dK());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dpf $$0) {
      return this.a($$0.a(this.c));
   }
}
