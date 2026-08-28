import com.mojang.serialization.MapCodec;

public class dnm extends dqe implements dnk {
   public static final MapCodec<dnm> c = b(dnm::new);

   @Override
   public MapCodec<dnm> a() {
      return c;
   }

   public dnm(ean.d $$0) {
      super($$0, jb.a, s_, false);
      this.l(this.C.b().b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected dqf c() {
      return (dqf)dmo.td;
   }

   @Override
   protected eao a(eao $$0, eao $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk(czo.xH);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      return dnk.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(t_);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
