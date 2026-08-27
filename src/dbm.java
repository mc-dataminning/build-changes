import com.mojang.serialization.MapCodec;

public abstract class dbm extends dch {
   private final cqw a;

   protected dbm(cqw $$0, dpx.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dbm> a();

   @Override
   public boolean a(dpy $$0) {
      return true;
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dms($$0, $$1, this.a);
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return $$0.c_($$1) instanceof dms $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cqw b() {
      return this.a;
   }
}
