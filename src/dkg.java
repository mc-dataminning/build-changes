import com.mojang.serialization.MapCodec;

public class dkg extends dfi {
   public static final MapCodec<dkg> a = b(dkg::new);
   public static final int b = 3;
   public static final dtc c = dss.as;
   private static final ewk[] d = new ewk[]{
      dez.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   protected dkg(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.a(dfb.dW);
   }

   @Override
   protected boolean d_(dsc $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup(cus.sj);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c);
   }
}
