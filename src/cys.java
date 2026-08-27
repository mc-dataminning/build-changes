import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cys extends cvf {
   protected final ib a;
   protected final boolean b;
   protected final eks d;

   protected cys(dhm.d $$0, ib $$1, eks $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends cys> a();

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dhn a(csg $$0) {
      return this.o();
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.a(this.a.g());
      dhn $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(dhn $$0) {
      return true;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.d;
   }

   protected abstract cyu c();

   protected abstract cvf b();
}
