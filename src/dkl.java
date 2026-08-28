import com.mojang.serialization.MapCodec;

public class dkl extends dnd implements dkk {
   public static final MapCodec<dkl> c = b(dkl::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dkl> a() {
      return c;
   }

   public dkl(dwx.d $$0) {
      super($$0, jn.a, s_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Override
   protected boolean h(dwy $$0) {
      return $$0.l();
   }

   @Override
   protected djn b() {
      return djp.sY;
   }

   @Override
   protected dwy a(dwy $$0, dwy $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected dwy a(dwy $$0, azh $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq(cwu.xw);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      return dkk.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
