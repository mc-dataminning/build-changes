import com.mojang.serialization.MapCodec;

public class dik extends dla implements dii {
   public static final MapCodec<dik> c = b(dik::new);

   @Override
   public MapCodec<dik> a() {
      return c;
   }

   public dik(dur.d $$0) {
      super($$0, jk.a, u_, false);
      this.l(this.F.b().b(v_, Boolean.valueOf(false)));
   }

   @Override
   protected dlb c() {
      return (dlb)dho.sv;
   }

   @Override
   protected dus a(dus $$0, dus $$1) {
      return $$1.b(v_, $$0.c(v_));
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
