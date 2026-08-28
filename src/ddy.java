import com.mojang.serialization.MapCodec;

public abstract class ddy extends det {
   private final csv a;

   protected ddy(csv $$0, dsj.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddy> a();

   @Override
   public boolean a(dsk $$0) {
      return true;
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dpe($$0, $$1, this.a);
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return $$0.c_($$1) instanceof dpe $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public csv b() {
      return this.a;
   }
}
