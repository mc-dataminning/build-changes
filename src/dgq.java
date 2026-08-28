import com.mojang.serialization.MapCodec;

public class dgq extends diq {
   public static final MapCodec<dgq> a = b(dgq::new);
   public static final int b = 3;
   public static final dva c = duq.as;
   private static final eyx[] g = new eyx[]{
      dgv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   public dgq(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected dva b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected ddr d() {
      return cvo.vn;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dds $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return g[this.h($$0)];
   }
}
