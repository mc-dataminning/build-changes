import com.mojang.serialization.MapCodec;

public abstract class did extends diy {
   private final cvm a;

   protected did(cvm $$0, dww.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends did> a();

   @Override
   public boolean a(dwx $$0) {
      return true;
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dto($$0, $$1, this.a);
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return $$0.c_($$1) instanceof dto $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cvm b() {
      return this.a;
   }
}
