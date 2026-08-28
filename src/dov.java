import com.mojang.serialization.MapCodec;

public class dov extends dgw {
   public static final MapCodec<dov> c = b(dov::new);

   @Override
   public MapCodec<dov> a() {
      return c;
   }

   public dov(dun.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dhl.a.o();
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(duo $$0) {
      return $$0.a(awt.aU);
   }

   @Override
   protected boolean g(duo $$0) {
      return true;
   }
}
