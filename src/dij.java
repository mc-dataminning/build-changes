import com.mojang.serialization.MapCodec;

public class dij extends dlb implements dii {
   public static final MapCodec<dij> c = b(dij::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dij> a() {
      return c;
   }

   public dij(dur.d $$0) {
      super($$0, jk.a, u_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(v_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azn $$0) {
      return 1;
   }

   @Override
   protected boolean h(dus $$0) {
      return $$0.l();
   }

   @Override
   protected dhm b() {
      return dho.sw;
   }

   @Override
   protected dus a(dus $$0, dus $$1) {
      return $$1.b(v_, $$0.c(v_));
   }

   @Override
   protected dus a(dus $$0, azn $$1) {
      return super.a($$0, $$1).b(v_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs(cvw.wy);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      return dii.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      super.a($$0);
      $$0.a(v_);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return !$$2.c(v_);
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      $$0.a($$2, $$3.b(v_, Boolean.valueOf(true)), 2);
   }
}
