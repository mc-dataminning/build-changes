import com.mojang.serialization.MapCodec;

public class dgq extends dfc {
   public static final MapCodec<dgq> a = b(dgq::new);
   public static final dtt b = dts.w;
   public static final dtt c = dts.r;

   @Override
   protected MapCodec<? extends dgq> a() {
      return a;
   }

   public dgq(dtb.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aqt $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if ($$1 instanceof aqt $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dtc $$0, aqt $$1, ir $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dtc $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? avo.fG : avo.fH, avq.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
