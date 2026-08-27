import com.mojang.serialization.MapCodec;

public class dew extends dhm implements deb, deu {
   public static final MapCodec<dew> c = b(dew::new);

   @Override
   public MapCodec<dew> a() {
      return c;
   }

   public dew(dra.d $$0) {
      super($$0, it.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected dhn c() {
      return (dhn)dea.sv;
   }

   @Override
   protected drb a(drb $$0, drb $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto(ctr.ws);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      return deu.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
