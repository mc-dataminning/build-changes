import com.mojang.serialization.MapCodec;

public class dkm extends dfo {
   public static final MapCodec<dkm> a = b(dkm::new);
   public static final int b = 3;
   public static final dth c = dsx.as;
   private static final ews[] d = new ews[]{
      dff.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   protected dkm(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.a(dfh.dW);
   }

   @Override
   protected boolean d_(dsh $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua(cud.sj);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c);
   }
}
