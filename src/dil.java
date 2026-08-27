import com.mojang.serialization.MapCodec;

public class dil extends ddn {
   public static final MapCodec<dil> a = b(dil::new);
   public static final int b = 3;
   public static final drh c = dqx.as;
   private static final eui[] d = new eui[]{
      dde.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   protected dil(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.a(ddg.dW);
   }

   @Override
   protected boolean d_(dqh $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz(ctc.sj);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }
}
