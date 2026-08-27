import com.mojang.serialization.MapCodec;

public class dbf extends cwi {
   public static final MapCodec<dbf> a = b(dbf::new);
   public static final int b = 3;
   public static final djp c = djf.as;
   private static final elu[] d = new elu[]{
      cvz.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dbf> a() {
      return a;
   }

   protected dbf(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.a(cwb.dW);
   }

   @Override
   public boolean e_(dip $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh(cmk.sg);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c);
   }
}
