import com.mojang.serialization.MapCodec;

public class dpn extends dri implements dsb {
   public static final MapCodec<dpn> b = b(dpn::new);
   public static final dzd c = dzc.I;
   public static final dzd d = dzc.A;
   private static final int f = 8;
   public static final int e = 128;
   private static final int g = 200;

   @Override
   public MapCodec<dpn> a() {
      return b;
   }

   public dpn(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, jo.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == euu.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(c) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void e(dym $$0, dhp $$1, jj $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void f(dym $$0, dhp $$1, jj $$2) {
      jo $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, evx.a($$1, $$3, null));
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.f($$0, $$1, $$2);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$1.ag() && (long)$$1.A.a(200) <= $$1.ae() % 200L && $$2.v() == $$1.a(eel.a.b, $$2.u(), $$2.w()) - 1) {
         azo.a($$0.c(a).o(), $$1, $$2, 0.125, lv.aW, btb.a(1, 2));
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if ($$0.c(d)) {
         this.f($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }
}
