import com.mojang.serialization.MapCodec;

public class dph extends diq {
   public static final MapCodec<dph> a = b(dph::new);
   public static final int b = 2;
   public static final dva c = duq.aq;
   private static final float g = 3.0F;
   private static final eyx[] h = new eyx[]{dgv.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dgv.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dph> a() {
      return a;
   }

   public dph(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }

   @Override
   public eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dva b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected ddr d() {
      return cvo.vk;
   }

   @Override
   public dua b(int $$0) {
      return $$0 == 2 ? dgx.bS.o() : super.b($$0);
   }

   @Override
   public void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dds $$0) {
      return 1;
   }
}
