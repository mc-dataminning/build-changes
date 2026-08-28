import com.mojang.serialization.MapCodec;

public class dhk extends dfw {
   public static final MapCodec<dhk> a = b(dhk::new);
   public static final dtr b = dtq.w;
   public static final dtr c = dtq.r;

   @Override
   protected MapCodec<? extends dhk> a() {
      return a;
   }

   public dhk(dsz.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aqt $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if ($$1 instanceof aqt $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dta $$0, aqt $$1, jd $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dta $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? avo.fG : avo.fH, avp.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
