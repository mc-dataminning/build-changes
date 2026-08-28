import com.mojang.serialization.MapCodec;

public class drb extends dkl {
   public static final MapCodec<drb> a = b(drb::new);
   public static final int b = 2;
   public static final dwu c = dwl.aq;
   private static final float g = 3.0F;
   private static final fas[] h = new fas[]{diq.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), diq.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   public drb(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }

   @Override
   public fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dwu b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dfl d() {
      return cwq.vA;
   }

   @Override
   public dvv b(int $$0) {
      return $$0 == 2 ? dis.bS.m() : super.b($$0);
   }

   @Override
   public void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dfm $$0) {
      return 1;
   }
}
