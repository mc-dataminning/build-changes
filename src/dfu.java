import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfu extends dch {
   protected final ij a;
   protected final boolean b;
   protected final etc d;

   protected dfu(dph.d $$0, ij $$1, etc $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dfu> a();

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().n();
   }

   public dpi a(czh $$0) {
      return this.n();
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.a(this.a.g());
      dpi $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dpi $$0) {
      return true;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.d;
   }

   protected abstract dfw c();

   protected abstract dch b();
}
