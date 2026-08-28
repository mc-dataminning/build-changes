import com.mojang.serialization.MapCodec;

public class dwc extends doz {
   public static final MapCodec<dwc> a = b(dwc::new);
   public static final int b = 1;
   public static final ece c = ebu.at;
   private static final fgk[] g = dnc.a(1, $$0 -> dnc.b(6.0, 0.0, (double)(6 + $$0 * 4)));
   private static final int h = 1;

   @Override
   public MapCodec<dwc> a() {
      return a;
   }

   public dwc(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }

   @Override
   public fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return g[this.h($$0)];
   }

   @Override
   protected ece b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected djw d() {
      return dac.wt;
   }

   @Override
   public ebe b(int $$0) {
      return $$0 == 2 ? dne.cc.m() : super.b($$0);
   }

   @Override
   public void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(djx $$0) {
      return 1;
   }
}
