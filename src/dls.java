import com.mojang.serialization.MapCodec;

public class dls extends dol implements dlr {
   public static final MapCodec<dls> c = b(dls::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dls> a() {
      return c;
   }

   public dls(dyl.d $$0) {
      super($$0, jo.a, s_, false, 0.1);
      this.l(this.B.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azs $$0) {
      return 1;
   }

   @Override
   protected boolean h(dym $$0) {
      return $$0.l();
   }

   @Override
   protected dku b() {
      return dkw.ta;
   }

   @Override
   protected dym a(dym $$0, dym $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected dym a(dym $$0, azs $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy(cyc.xA);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      return dlr.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
