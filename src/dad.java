import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dad extends cwq {
   protected final ic a;
   protected final boolean b;
   protected final emm d;

   protected dad(djg.d $$0, ic $$1, emm $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dad> a();

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public djh a(ctq $$0) {
      return this.o();
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.a(this.a.g());
      djh $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(djh $$0) {
      return true;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.d;
   }

   protected abstract daf c();

   protected abstract cwq b();
}
