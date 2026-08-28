import com.mojang.serialization.MapCodec;

public class dne extends dih {
   public static final MapCodec<dne> a = b(dne::new);
   public static final int b = 3;
   public static final dwd c = dvt.as;
   private static final fab[] d = new fab[]{
      dhy.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   protected dne(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a(dia.dW);
   }

   @Override
   protected boolean f(dvd $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx(cwb.sk);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }
}
