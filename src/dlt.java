import com.mojang.serialization.MapCodec;

public class dlt extends dok implements dlr {
   public static final MapCodec<dlt> c = b(dlt::new);

   @Override
   public MapCodec<dlt> a() {
      return c;
   }

   public dlt(dyl.d $$0) {
      super($$0, jo.a, s_, false);
      this.l(this.B.b().b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected dol c() {
      return (dol)dkw.sZ;
   }

   @Override
   protected dym a(dym $$0, dym $$1) {
      return $$1.b(t_, $$0.c(t_));
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
