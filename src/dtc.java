import com.mojang.serialization.MapCodec;

public class dtc extends dxa {
   public static final MapCodec<dtc> a = b(dtc::new);
   public static final int b = 3;
   public static final ecq c = ecg.av;
   private static final fgw[] d = dno.a(3, $$0 -> dno.b(16.0, 0.0, (double)(5 + $$0 * 3)));

   @Override
   public MapCodec<dtc> a() {
      return a;
   }

   protected dtc(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a(dnq.en);
   }

   @Override
   protected boolean f(ebq $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak(dao.tr);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }
}
