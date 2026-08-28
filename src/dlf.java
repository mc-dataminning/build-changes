import com.mojang.serialization.MapCodec;

public class dlf extends dgh {
   public static final MapCodec<dlf> a = b(dlf::new);
   public static final int b = 3;
   public static final duc c = dts.as;
   private static final ext[] d = new ext[]{
      dfy.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   protected dlf(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dtc $$0, dcc $$1, jd $$2) {
      return $$0.a(dga.dW);
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq(cut.sj);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }
}
