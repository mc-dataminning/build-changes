import com.mojang.serialization.MapCodec;

public class dqc extends diq {
   public static final MapCodec<dqc> a = b(dqc::new);
   protected static final fas b = diq.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   public dqc(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected fas b_(dvv $$0, der $$1, jh $$2) {
      return fap.b();
   }

   @Override
   protected fas c(dvv $$0, der $$1, jh $$2, fad $$3) {
      return fap.b();
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      diw.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4 == jm.b && $$6.a(dis.G)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   @Override
   protected float c(dvv $$0, der $$1, jh $$2) {
      return 0.2F;
   }
}
