import com.mojang.serialization.MapCodec;

public class dtv extends dne implements dnh {
   public static final MapCodec<dtv> a = b(dtv::new);

   @Override
   public MapCodec<dtv> a() {
      return a;
   }

   public dtv(ebf.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      $$0.b($$2.e(), dng.tq.m());
   }

   @Override
   public iw a(iw $$0) {
      return $$0.e();
   }
}
