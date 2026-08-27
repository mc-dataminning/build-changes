import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class czm extends cvz {
   protected final ia a;
   protected final boolean b;
   protected final elu d;

   protected czm(dio.d $$0, ia $$1, elu $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends czm> a();

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dip a(csz $$0) {
      return this.o();
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.a(this.a.g());
      dip $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(dip $$0) {
      return true;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.d;
   }

   protected abstract czo c();

   protected abstract cvz b();
}
