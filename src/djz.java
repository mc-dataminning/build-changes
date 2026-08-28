import com.mojang.serialization.MapCodec;

public class djz extends djp implements dfi {
   public static final MapCodec<djz> a = b(djz::new);

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(dsg.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      $$0.a($$2.d(), dka.c(), 2);
   }

   @Override
   public ja a(ja $$0) {
      return $$0.d();
   }
}
