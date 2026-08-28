import com.mojang.serialization.MapCodec;

public class dml extends dno {
   public static final MapCodec<dml> a = b(dml::new);

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   public dml(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected dub a_(ebq $$0) {
      return dub.a;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return fgt.a();
   }
}
