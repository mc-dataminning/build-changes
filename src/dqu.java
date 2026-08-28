import com.mojang.serialization.MapCodec;

public class dqu extends dsp implements dtj {
   public static final MapCodec<dqu> b = b(dqu::new);
   public static final eaq c = eap.I;
   public static final eaq d = eap.A;
   private static final int f = 8;
   public static final int e = 128;
   private static final int g = 200;

   @Override
   public MapCodec<dqu> a() {
      return b;
   }

   public dqu(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, ja.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ewh.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(c) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dzz $$0, div $$1, iu $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dzz $$0, div $$1, iu $$2) {
      ja $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, exk.a($$1, $$3, null));
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$1.ag() && (long)$$1.A.a(200) <= $$1.ae() % 200L && $$2.v() == $$1.a(efy.a.b, $$2.u(), $$2.w()) - 1) {
         azq.a($$0.c(a).o(), $$1, $$2, 0.125, lx.aW, btm.a(1, 2));
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      if ($$0.c(d)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dzz $$0) {
      return true;
   }
}
