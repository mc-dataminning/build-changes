import com.mojang.serialization.MapCodec;

public class cwk extends cvz {
   public static final MapCodec<cwk> a = b(cwk::new);
   public static final djp b = djf.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final elu e = cvz.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final elu f = cvz.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<cwk> a() {
      return a;
   }

   protected cwk(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      hv $$4 = $$2.c();
      if ($$1.t($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               dip $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      return e;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return f;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      for (ia $$3 : ia.c.a) {
         dip $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(arw.b)) {
            return false;
         }
      }

      dip $$5 = $$1.a_($$2.d());
      return ($$5.a(cwb.dQ) || $$5.a(arr.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      $$3.a($$1.ah().j(), 1.0F);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
