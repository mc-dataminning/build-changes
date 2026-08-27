import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dit extends dfc {
   protected final iw a;
   protected final boolean b;
   protected final exn d;

   protected dit(dtb.d $$0, iw $$1, exn $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dit> a();

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().n();
   }

   public dtc a(dcb $$0) {
      return this.n();
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.a(this.a.g());
      dtc $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dtc $$0) {
      return true;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.d;
   }

   protected abstract div c();

   protected abstract dfc b();
}
