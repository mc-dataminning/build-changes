import com.mojang.serialization.MapCodec;

public class dfa extends dha {
   public static final MapCodec<dfa> a = b(dfa::new);
   public static final int b = 3;
   public static final dth c = dsx.as;
   private static final ews[] g = new ews[]{
      dff.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dfa> a() {
      return a;
   }

   public dfa(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected dth b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dcc d() {
      return cud.vl;
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dcd $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return g[this.g($$0)];
   }
}
