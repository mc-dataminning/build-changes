import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class cnu extends cns {
   protected static final Predicate<bwt> b = $$0 -> $$0 instanceof cnu;
   protected jb c = jb.d;

   protected cnu(bxc<? extends cnu> $$0, djx $$1) {
      super($$0, $$1);
   }

   protected cnu(bxc<? extends cnu> $$0, djx $$1, iv $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected void a(jb $$0) {
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
         ffl $$0 = this.a(this.a, this.c);
         ffq $$1 = $$0.f();
         this.o($$1.d, $$1.e, $$1.f);
         this.a($$0);
      }
   }

   protected abstract ffl a(iv var1, jb var2);

   @Override
   public boolean g() {
      if (!this.dV().g(this)) {
         return false;
      } else {
         boolean $$0 = iv.b(this.u()).allMatch($$0x -> {
            ebe $$1 = this.dV().a_($$0x);
            return $$1.e() || dpf.n($$1);
         });
         return !$$0 ? false : this.dV().a(this, this.cR(), b).isEmpty();
      }
   }

   protected ffl u() {
      return this.cR().a(this.c.m().mul(-0.5F)).h(1.0E-7);
   }

   @Override
   public jb cO() {
      return this.c;
   }

   @Override
   public abstract void v();

   @Override
   public coc a(ars $$0, czy $$1, float $$2) {
      coc $$3 = new coc(
         this.dV(), this.dA() + (double)((float)this.c.j() * 0.15F), this.dC() + (double)$$2, this.dG() + (double)((float)this.c.l() * 0.15F), $$1
      );
      $$3.j();
      this.dV().b($$3);
      return $$3;
   }

   @Override
   public float a(dtw $$0) {
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

      float $$1 = azo.h(this.dL());

      return switch ($$0) {
         case c -> $$1 + 180.0F;
         case d -> $$1 + 90.0F;
         case b -> $$1 + 270.0F;
         default -> $$1;
      };
   }

   @Override
   public float a(dsf $$0) {
      return this.a($$0.a(this.c));
   }
}
