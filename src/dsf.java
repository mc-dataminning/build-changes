import com.mojang.serialization.MapCodec;

public class dsf extends dwd {
   public static final MapCodec<dsf> a = b(dsf::new);
   public static final int b = 3;
   public static final ebt c = ebj.av;
   private static final ffw[] d = dmr.a(3, $$0 -> dmr.b(16.0, 0.0, (double)(5 + $$0 * 3)));

   @Override
   public MapCodec<dsf> a() {
      return a;
   }

   protected dsf(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.a(dmt.en);
   }

   @Override
   protected boolean f(eat $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn(czr.tr);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }
}
