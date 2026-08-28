import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dlr extends dlq implements dih {
   protected dlr(dvi.d $$0, jm $$1, fah $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dlr> a();

   protected dvj a(dvj $$0, dvj $$1) {
      return $$1;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dls $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, erl.c, erl.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb(this.c());
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      Optional<jh> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      Optional<jh> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dvj $$5 = $$0.a_($$4.get());
         ((dls)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<jh> a(deg $$0, jh $$1, die $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dvj $$0, czs $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().j()) ? false : $$2;
   }

   @Override
   protected die b() {
      return this;
   }
}
