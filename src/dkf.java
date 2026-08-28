import com.mojang.serialization.MapCodec;

public class dkf extends dfh {
   public static final MapCodec<dkf> a = b(dkf::new);
   public static final int b = 3;
   public static final dtb c = dsr.as;
   private static final ewj[] d = new ewj[]{
      dey.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   protected dkf(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.a(dfa.dW);
   }

   @Override
   protected boolean d_(dsb $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return new cuo(cur.sj);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c);
   }
}
