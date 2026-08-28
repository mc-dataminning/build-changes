import com.mojang.serialization.MapCodec;

public class dsl extends dmo implements dkh {
   public static final MapCodec<dsl> c = b(dsl::new);

   @Override
   public MapCodec<dsl> a() {
      return c;
   }

   public dsl(dxm.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return true;
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      a($$0, $$2, new cxk(this));
   }
}
