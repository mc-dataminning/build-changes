import com.mojang.serialization.MapCodec;

public class dov extends djv {
   public static final MapCodec<dov> a = b(dov::new);
   public static final int b = 3;
   public static final dxv c = dxm.av;
   private static final fbt[] d = new fbt[]{
      djl.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   protected dov(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a(djn.ej);
   }

   @Override
   protected boolean f(dww $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo(cws.tg);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c);
   }
}
