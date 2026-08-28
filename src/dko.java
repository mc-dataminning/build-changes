import com.mojang.serialization.MapCodec;

public class dko extends dfq {
   public static final MapCodec<dko> a = b(dko::new);
   public static final int b = 3;
   public static final dtk c = dta.as;
   private static final ewy[] d = new ewy[]{
      dfh.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   protected dko(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.a(dfj.dW);
   }

   @Override
   protected boolean d_(dsk $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc(cuf.sj);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c);
   }
}
