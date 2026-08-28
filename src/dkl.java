import com.mojang.serialization.MapCodec;

public abstract class dkl extends dlg {
   private final cxq a;

   protected dkl(cxq $$0, dzn.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dkl> a();

   @Override
   public boolean a(dzo $$0) {
      return true;
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwb($$0, $$1, this.a);
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return $$0.c_($$1) instanceof dwb $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cxq b() {
      return this.a;
   }
}
