import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class cmf extends cmd {
   protected static final Predicate<bvs> b = $$0 -> $$0 instanceof cmf;
   protected jo c = jo.d;

   protected cmf(bwb<? extends cmf> $$0, dhp $$1) {
      super($$0, $$1);
   }

   protected cmf(bwb<? extends cmf> $$0, dhp $$1, jj $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected void a(jo $$0) {
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
         fcp $$0 = this.a(this.a, this.c);
         fcu $$1 = $$0.f();
         this.o($$1.d, $$1.e, $$1.f);
         this.a($$0);
      }
   }

   protected abstract fcp a(jj var1, jo var2);

   @Override
   public boolean g() {
      if (!this.dV().g(this)) {
         return false;
      } else {
         boolean $$0 = jj.b(this.u()).allMatch($$0x -> {
            dym $$1 = this.dV().a_($$0x);
            return $$1.e() || dmx.n($$1);
         });
         return !$$0 ? false : this.dV().a(this, this.cR(), b).isEmpty();
      }
   }

   protected fcp u() {
      return this.cR().a(this.c.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jo cO() {
      return this.c;
   }

   @Override
   public abstract void v();

   @Override
   public cmn a(arn $$0, cxy $$1, float $$2) {
      cmn $$3 = new cmn(
         this.dV(), this.dA() + (double)((float)this.c.j() * 0.15F), this.dC() + (double)$$2, this.dG() + (double)((float)this.c.l() * 0.15F), $$1
      );
      $$3.j();
      this.dV().b($$3);
      return $$3;
   }

   @Override
   public float a(drm $$0) {
      if (this.c.o() != jo.a.b) {
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

      float $$1 = azk.h(this.dL());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dpv $$0) {
      return this.a($$0.a(this.c));
   }
}
