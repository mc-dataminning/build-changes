import com.mojang.serialization.MapCodec;

public class dpa extends diq implements dit {
   public static final MapCodec<dpa> a = b(dpa::new);

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   public dpa(dvu.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      $$0.b($$2.e(), dis.sG.m());
   }

   @Override
   public jh a(jh $$0) {
      return $$0.e();
   }
}
