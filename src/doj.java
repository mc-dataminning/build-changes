import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class doj extends dku {
   protected final jo a;
   protected final boolean b;
   protected final fdo d;

   protected doj(dyl.d $$0, jo $$1, fdo $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends doj> a();

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dym b(azs $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.a(this.a.g());
      dym $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dym $$0) {
      return true;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.d;
   }

   protected abstract dol c();

   protected abstract dku b();
}
