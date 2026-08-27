import com.mojang.serialization.MapCodec;

public class dgy extends daj {
   public static final MapCodec<dgy> a = b(dgy::new);
   public static final int b = 2;
   public static final dmf c = dlv.aq;
   private static final float g = 3.0F;
   private static final eol[] h = new eol[]{cyo.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), cyo.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dgy> a() {
      return a;
   }

   public dgy(dle.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }

   @Override
   public eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dmf b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected cvm d() {
      return cpc.ve;
   }

   @Override
   public dlf b(int $$0) {
      return $$0 == 2 ? cyq.bS.o() : super.b($$0);
   }

   @Override
   public void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cvn $$0) {
      return 1;
   }
}
