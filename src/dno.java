import com.mojang.serialization.MapCodec;

public class dno extends dwq implements dnh {
   public static final MapCodec<dno> a = b(dno::new);
   private static final fgm b = dne.b(16.0, 0.0, 13.0);

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   protected dno(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return dnh.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      dnh.a((djz)$$0, $$2, $$3).ifPresent($$1x -> $$0.b($$1x, this.m()));
   }
}
