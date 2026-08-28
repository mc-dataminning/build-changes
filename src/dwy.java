import com.mojang.serialization.MapCodec;

public class dwy extends dwq {
   public static final MapCodec<dwy> a = b(dwy::new);
   private static final fgm b = dne.b(14.0, 0.0, 1.5);

   @Override
   public MapCodec<dwy> a() {
      return a;
   }

   protected dwy(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1 instanceof aru && $$3 instanceof cuk) {
         $$1.a(new iw($$2), true, $$3);
      }
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      exq $$3 = $$1.b_($$2);
      exq $$4 = $$1.b_($$2.d());
      return ($$3.a() == exr.c || $$0.b() instanceof drh) && $$4.a() == exr.a;
   }
}
