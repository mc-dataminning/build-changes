import com.mojang.serialization.MapCodec;

public class dsq extends dwo {
   public static final MapCodec<dsq> a = b(dsq::new);
   public static final int b = 3;
   public static final ece c = ebu.av;
   private static final fgk[] d = dnc.a(3, $$0 -> dnc.b(16.0, 0.0, (double)(5 + $$0 * 3)));

   @Override
   public MapCodec<dsq> a() {
      return a;
   }

   protected dsq(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a(dne.en);
   }

   @Override
   protected boolean f(ebe $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy(dac.tr);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }
}
