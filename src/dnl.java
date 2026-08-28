import com.mojang.serialization.MapCodec;

public class dnl extends dqf implements dnk {
   public static final MapCodec<dnl> c = b(dnl::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dnl> a() {
      return c;
   }

   public dnl(ean.d $$0) {
      super($$0, jb.a, s_, false, 0.1);
      this.l(this.C.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azv $$0) {
      return 1;
   }

   @Override
   protected boolean h(eao $$0) {
      return $$0.l();
   }

   @Override
   protected dmm b() {
      return dmo.te;
   }

   @Override
   protected eao a(eao $$0, eao $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected eao a(eao $$0, azv $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
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
      super.a($$0);
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
