import com.mojang.serialization.MapCodec;

public class dec extends dgs implements ddh, dea {
   public static final MapCodec<dec> c = b(dec::new);

   @Override
   public MapCodec<dec> a() {
      return c;
   }

   public dec(dqg.d $$0) {
      super($$0, is.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected dgt c() {
      return (dgt)ddg.sv;
   }

   @Override
   protected dqh a(dqh $$0, dqh $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz(ctc.ws);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      return dea.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
