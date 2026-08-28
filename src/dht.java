import com.mojang.serialization.MapCodec;

public class dht extends diq implements dit {
   public static final MapCodec<dht> a = b(dht::new);
   protected static final float b = 4.0F;
   protected static final fas c = diq.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   public dht(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      ezy $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return $$1.a_($$2.e()).a(axc.aw);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if (!$$0.a($$1, $$3)) {
         return dis.a.m();
      } else {
         return $$4 == jm.b && $$6.a(dis.mZ) ? dis.mZ.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm(cwq.dR);
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
      this.a($$0, $$2);
   }

   @Override
   protected float a(dvv $$0, cou $$1, der $$2, jh $$3) {
      return $$1.eX().h() instanceof cya ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dfm $$0, jh $$1) {
      $$0.a($$1.d(), dis.mZ.m().b(dhu.i, dwh.b), 3);
   }
}
