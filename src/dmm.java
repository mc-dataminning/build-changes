import com.mojang.serialization.MapCodec;

public class dmm extends doo {
   public static final MapCodec<dmm> a = b(dmm::new);
   public static final int b = 3;
   public static final ebt c = ebj.av;
   private static final ffw[] g = dmr.a(3, $$0 -> dmr.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<dmm> a() {
      return a;
   }

   public dmm(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ebt b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected djl d() {
      return czr.ww;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(djm $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return g[this.h($$0)];
   }
}
