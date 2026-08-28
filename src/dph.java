import com.mojang.serialization.MapCodec;

public class dph extends dox implements dko {
   public static final MapCodec<dph> a = b(dph::new);

   @Override
   public MapCodec<dph> a() {
      return a;
   }

   public dph(dxt.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      $$0.a($$2.e(), dpi.c(), 2);
   }

   @Override
   public jh a(jh $$0) {
      return $$0.e();
   }
}
