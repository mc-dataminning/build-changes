import com.mojang.serialization.MapCodec;

public class cyj extends daj {
   public static final MapCodec<cyj> a = b(cyj::new);
   public static final int b = 3;
   public static final dmf c = dlv.as;
   private static final eol[] g = new eol[]{
      cyo.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cyo.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<cyj> a() {
      return a;
   }

   public cyj(dle.d $$0) {
      super($$0);
   }

   @Override
   protected dmf b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected cvm d() {
      return cpc.vh;
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cvn $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return g[this.g($$0)];
   }
}
