import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlq extends die {
   protected final jm a;
   protected final boolean b;
   protected final fah d;

   protected dlq(dvi.d $$0, jm $$1, fah $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dlq> a();

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dvj $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().m();
   }

   public dvj a(dfc $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jh $$3 = $$2.a(this.a.g());
      dvj $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dvj $$0) {
      return true;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.d;
   }

   protected abstract dls c();

   protected abstract die b();
}
