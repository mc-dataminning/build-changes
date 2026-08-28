import com.mojang.serialization.MapCodec;

public class drn extends dvj {
   public static final MapCodec<drn> a = b(drn::new);
   public static final int b = 3;
   public static final eaz c = eap.av;
   private static final ffc[] d = dma.a(3, $$0 -> dma.b(16.0, 0.0, (double)(5 + $$0 * 3)));

   @Override
   public MapCodec<drn> a() {
      return a;
   }

   protected drn(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return $$0.a(dmc.ek);
   }

   @Override
   protected boolean f(dzz $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return new cyy(czc.tm);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }
}
