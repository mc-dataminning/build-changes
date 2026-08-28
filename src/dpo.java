import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpo extends diz implements dit, dng {
   public static final MapCodec<dpo> a = b(dpo::new);
   protected static final float b = 6.0F;
   protected static final fas c = diq.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   protected dpo(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return c;
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dis.kJ);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      return $$1.a(axi.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      dvv $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return $$0.a_($$1.d()).a(dis.G);
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   protected erv b_(dvv $$0) {
      return erw.c.a(false);
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      dvv $$4 = dis.bx.m();
      dvv $$5 = $$4.b(dqw.d, dwq.a);
      jh $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable cou $$0, der $$1, jh $$2, dvv $$3, eru $$4) {
      return false;
   }

   @Override
   public boolean a(dfn $$0, jh $$1, dvv $$2, erv $$3) {
      return false;
   }
}
