import com.mojang.serialization.MapCodec;

public class dqb extends did {
   public static final MapCodec<dqb> c = b(dqb::new);

   @Override
   public MapCodec<dqb> a() {
      return c;
   }

   public dqb(dvu.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dis.a.m();
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dvv $$0) {
      return $$0.a(axc.aU);
   }

   @Override
   protected boolean g(dvv $$0) {
      return true;
   }
}
