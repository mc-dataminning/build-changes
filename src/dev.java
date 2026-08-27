import com.mojang.serialization.MapCodec;

public class dev extends dhn implements deb, deu {
   public static final MapCodec<dev> c = b(dev::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dev> a() {
      return c;
   }

   public dev(dra.d $$0) {
      super($$0, it.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(ayk $$0) {
      return 1;
   }

   @Override
   protected boolean g(drb $$0) {
      return $$0.i();
   }

   @Override
   protected ddy b() {
      return dea.sw;
   }

   @Override
   protected drb a(drb $$0, drb $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected drb a(drb $$0, ayk $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
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
      super.a($$0);
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
