import com.mojang.serialization.MapCodec;

public class dkp extends dfr {
   public static final MapCodec<dkp> a = b(dkp::new);
   public static final int b = 3;
   public static final dtl c = dtb.as;
   private static final exa[] d = new exa[]{
      dfi.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   protected dkp(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.a(dfk.dW);
   }

   @Override
   protected boolean d_(dsl $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud(cug.sj);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c);
   }
}
