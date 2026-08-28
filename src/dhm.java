import com.mojang.serialization.MapCodec;

public class dhm extends dfy {
   public static final MapCodec<dhm> a = b(dhm::new);
   public static final dtt b = dts.w;
   public static final dtt c = dts.r;

   @Override
   protected MapCodec<? extends dhm> a() {
      return a;
   }

   public dhm(dtb.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aqu $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if ($$1 instanceof aqu $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dtc $$0, aqu $$1, jd $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dtc $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? avp.fG : avp.fH, avq.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
