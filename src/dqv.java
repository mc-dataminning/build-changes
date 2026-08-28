import com.mojang.serialization.MapCodec;

public class dqv extends diz implements dit {
   public static final MapCodec<dqv> a = b(dqv::new);
   protected static final float b = 6.0F;
   protected static final fas c = diq.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqv> a() {
      return a;
   }

   protected dqv(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return c;
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      dky.a($$0, o($$3).m(), $$2, 2);
   }

   private static dky o(dvv $$0) {
      return (dky)($$0.a(dis.bu) ? dis.iI : dis.iH);
   }
}
