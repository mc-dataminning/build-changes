import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dll extends dlk implements dib {
   protected dll(dvc.d $$0, jl $$1, fab $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dll> a();

   protected dvd a(dvd $$0, dvd $$1) {
      return $$1;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dlm $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, erf.c, erf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx(this.c());
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      Optional<jg> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      Optional<jg> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dvd $$5 = $$0.a_($$4.get());
         ((dlm)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<jg> a(dea $$0, jg $$1, dhy $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dvd $$0, czm $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().j()) ? false : $$2;
   }

   @Override
   protected dhy b() {
      return this;
   }
}
