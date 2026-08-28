import com.mojang.serialization.MapCodec;

public class dou extends dju {
   public static final MapCodec<dou> a = b(dou::new);
   public static final int b = 3;
   public static final dxu c = dxl.av;
   private static final fbs[] d = new fbs[]{
      djk.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   protected dou(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.a(djm.ej);
   }

   @Override
   protected boolean f(dwv $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return new cwn(cwr.tg);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }
}
