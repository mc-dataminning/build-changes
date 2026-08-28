import com.mojang.serialization.MapCodec;

public class dss extends dwq {
   public static final MapCodec<dss> a = b(dss::new);
   public static final int b = 3;
   public static final ecg c = ebw.av;
   private static final fgm[] d = dne.a(3, $$0 -> dne.b(16.0, 0.0, (double)(5 + $$0 * 3)));

   @Override
   public MapCodec<dss> a() {
      return a;
   }

   protected dss(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a(dng.en);
   }

   @Override
   protected boolean f(ebg $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa(dae.tr);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c);
   }
}
