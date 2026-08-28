import com.mojang.serialization.MapCodec;

public class dvr extends doo {
   public static final MapCodec<dvr> a = b(dvr::new);
   public static final int b = 1;
   public static final ebt c = ebj.at;
   private static final ffw[] g = dmr.a(1, $$0 -> dmr.b(6.0, 0.0, (double)(6 + $$0 * 4)));
   private static final int h = 1;

   @Override
   public MapCodec<dvr> a() {
      return a;
   }

   public dvr(eas.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }

   @Override
   public ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return g[this.h($$0)];
   }

   @Override
   protected ebt b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected djl d() {
      return czr.wt;
   }

   @Override
   public eat b(int $$0) {
      return $$0 == 2 ? dmt.cc.m() : super.b($$0);
   }

   @Override
   public void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(djm $$0) {
      return 1;
   }
}
