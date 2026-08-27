import com.mojang.serialization.MapCodec;

public class dex extends cyo implements cyr {
   public static final MapCodec<dex> a = b(dex::new);

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   public dex(dle.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      $$0.b($$2.d(), cyq.sG.o());
   }

   @Override
   public hz a(hz $$0) {
      return $$0.d();
   }
}
