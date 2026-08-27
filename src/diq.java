import com.mojang.serialization.MapCodec;

public class diq extends dch implements dck {
   public static final MapCodec<diq> a = b(diq::new);

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   public diq(dph.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      $$0.b($$2.d(), dcj.sG.n());
   }

   @Override
   public id a(id $$0) {
      return $$0.d();
   }
}
