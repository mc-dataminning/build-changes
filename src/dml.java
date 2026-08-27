import com.mojang.serialization.MapCodec;

public class dml extends dfv {
   public static final MapCodec<dml> a = b(dml::new);
   public static final int b = 2;
   public static final dsd c = drt.aq;
   private static final float g = 3.0F;
   private static final evf[] h = new evf[]{dea.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dea.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   public dml(drc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }

   @Override
   public evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dsd b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected day d() {
      return ctt.vi;
   }

   @Override
   public drd b(int $$0) {
      return $$0 == 2 ? dec.bS.n() : super.b($$0);
   }

   @Override
   public void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(daz $$0) {
      return 1;
   }
}
