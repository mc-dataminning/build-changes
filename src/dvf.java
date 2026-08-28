import com.mojang.serialization.MapCodec;

public class dvf extends doc {
   public static final MapCodec<dvf> a = b(dvf::new);
   public static final int b = 1;
   public static final ebh c = eax.at;
   private static final ffk[] g = dmf.a(1, $$0 -> dmf.b(6.0, 0.0, (double)(6 + $$0 * 4)));
   private static final int h = 1;

   @Override
   public MapCodec<dvf> a() {
      return a;
   }

   public dvf(eag.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c);
   }

   @Override
   public ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return g[this.h($$0)];
   }

   @Override
   protected ebh b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected diz d() {
      return czh.wt;
   }

   @Override
   public eah b(int $$0) {
      return $$0 == 2 ? dmh.cc.m() : super.b($$0);
   }

   @Override
   public void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dja $$0) {
      return 1;
   }
}
