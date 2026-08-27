import com.mojang.serialization.MapCodec;

public class ctz extends cwq implements ctf, cty {
   public static final MapCodec<ctz> c = b(ctz::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<ctz> a() {
      return c;
   }

   public ctz(dfc.d $$0) {
      super($$0, ha.a, r_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(ash $$0) {
      return 1;
   }

   @Override
   protected boolean g(dfd $$0) {
      return $$0.i();
   }

   @Override
   protected ctc b() {
      return cte.rv;
   }

   @Override
   protected dfd a(dfd $$0, dfd $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   protected dfd a(dfd $$0, ash $$1) {
      return super.a($$0, $$1).a(s_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl(cjo.vw);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      return cty.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      super.a($$0);
      $$0.a(s_);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
