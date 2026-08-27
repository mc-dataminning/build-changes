import com.mojang.serialization.MapCodec;

public class cxn extends cvz {
   public static final MapCodec<cxn> a = b(cxn::new);
   public static final djg b = djf.w;
   public static final djg c = djf.r;

   @Override
   protected MapCodec<? extends cxn> a() {
      return a;
   }

   public cxn(dio.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if ($$3.b() != $$0.b()) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(b)) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      boolean $$4 = $$1.B($$2);
      if ($$4 != $$0.c(b)) {
         dip $$5 = $$0;
         if (!$$0.c(b)) {
            $$5 = $$0.a(c);
            $$1.a(null, $$2, $$5.c(c) ? arc.fd : arc.fe, ard.e);
         }

         $$1.a($$2, $$5.a(b, Boolean.valueOf($$4)), 3);
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c, b);
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
