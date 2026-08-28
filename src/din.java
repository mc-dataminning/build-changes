import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class din extends dfa {
   protected final je a;
   protected final boolean b;
   protected final ewl d;

   protected din(dsc.d $$0, je $$1, ewl $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends din> a();

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dsd a(dca $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      iz $$3 = $$2.a(this.a.g());
      dsd $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dsd $$0) {
      return true;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.d;
   }

   protected abstract dip c();

   protected abstract dfa b();
}
