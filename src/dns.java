import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dns extends dke {
   protected final jm a;
   protected final boolean b;
   protected final fcm d;

   protected dns(dxm.d $$0, jm $$1, fcm $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dns> a();

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dxn b(bam $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jh $$3 = $$2.a(this.a.g());
      dxn $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dxn $$0) {
      return true;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.d;
   }

   protected abstract dnu c();

   protected abstract dke b();
}
