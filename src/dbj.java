import com.mojang.serialization.MapCodec;

public class dbj extends cyc {
   public static final MapCodec<dbj> b = b(dbj::new);
   public static final djg c = djf.w;

   @Override
   public MapCodec<dbj> a() {
      return b;
   }

   public dbj(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ia.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(a, c);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(csz $$0, hv $$1) {
      if (!$$0.y_() && !$$0.M().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(csy $$0, hv $$1, dip $$2) {
      ia $$3 = $$2.c(a);
      hv $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.y_() && $$0.c(c) && !$$1.M().a($$2, this)) {
            dip $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.M().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(a, $$0.d().g().g());
   }
}
