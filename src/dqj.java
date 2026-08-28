import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dqj extends dqi implements dmu {
   protected dqj(eas.d $$0, jb $$1, ffw $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dqj> a();

   protected eat a(eat $$0, eat $$1) {
      return $$1;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dqk $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, exb.c, exb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn(this.c());
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      Optional<iv> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      Optional<iv> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         eat $$5 = $$0.a_($$4.get());
         ((dqk)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<iv> a(diq $$0, iv $$1, dmr $$2) {
      return m.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(eat $$0, ddg $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().h()) ? false : $$2;
   }

   @Override
   protected dmr b() {
      return this;
   }
}
