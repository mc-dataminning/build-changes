import com.mojang.serialization.MapCodec;

public class cwk extends cyk {
   public static final MapCodec<cwk> a = b(cwk::new);
   public static final int b = 3;
   public static final dkg c = djw.as;
   private static final eml[] g = new eml[]{
      cwp.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<cwk> a() {
      return a;
   }

   public cwk(djf.d $$0) {
      super($$0);
   }

   @Override
   protected dkg b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected ctn d() {
      return cna.ve;
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cto $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return g[this.g($$0)];
   }
}
