import com.mojang.serialization.MapCodec;

public class drt extends dvr {
   public static final MapCodec<drt> a = b(drt::new);
   public static final int b = 3;
   public static final ebh c = eax.av;
   private static final ffk[] d = dmf.a(3, $$0 -> dmf.b(16.0, 0.0, (double)(5 + $$0 * 3)));

   @Override
   public MapCodec<drt> a() {
      return a;
   }

   protected drt(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.a(dmh.en);
   }

   @Override
   protected boolean f(eah $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd(czh.tr);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c);
   }
}
