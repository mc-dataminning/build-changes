import com.mojang.serialization.MapCodec;

public class dnn extends diq implements dit {
   public static final MapCodec<dnn> a = b(dnn::new);

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   public dnn(dvu.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      $$0.J_().a(ma.aJ).flatMap($$0x -> $$0x.a(ry.n)).ifPresent($$3x -> ((eei)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dit.a aq_() {
      return dit.a.a;
   }
}
