import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgr extends dde {
   protected final is a;
   protected final boolean b;
   protected final eui d;

   protected dgr(dqg.d $$0, is $$1, eui $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dgr> a();

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().n();
   }

   public dqh a(dae $$0) {
      return this.n();
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.a(this.a.g());
      dqh $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dqh $$0) {
      return true;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.d;
   }

   protected abstract dgt c();

   protected abstract dde b();
}
