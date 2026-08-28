import com.mojang.serialization.MapCodec;

public class djn extends dme implements djm {
   public static final MapCodec<djn> c = b(djn::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<djn> a() {
      return c;
   }

   public djn(dvu.d $$0) {
      super($$0, jm.a, s_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azu $$0) {
      return 1;
   }

   @Override
   protected boolean h(dvv $$0) {
      return $$0.l();
   }

   @Override
   protected diq b() {
      return dis.sw;
   }

   @Override
   protected dvv a(dvv $$0, dvv $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected dvv a(dvv $$0, azu $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm(cwq.wO);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      return djm.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
