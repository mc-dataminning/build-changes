import com.mojang.serialization.MapCodec;

public class dmc extends dhe {
   public static final MapCodec<dmc> a = b(dmc::new);
   public static final int b = 3;
   public static final dva c = duq.as;
   private static final eyx[] d = new eyx[]{
      dgv.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   protected dmc(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.a(dgx.dW);
   }

   @Override
   protected boolean f(dua $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl(cvo.sk);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }
}
