import com.mojang.serialization.MapCodec;

public class dez extends cyk {
   public static final MapCodec<dez> a = b(dez::new);
   public static final int b = 2;
   public static final dkg c = djw.aq;
   private static final float g = 3.0F;
   private static final eml[] h = new eml[]{cwp.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), cwp.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dez> a() {
      return a;
   }

   public dez(djf.d $$0) {
      super($$0);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dkg b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected ctn d() {
      return cna.vb;
   }

   @Override
   public djg b(int $$0) {
      return $$0 == 2 ? cwr.bS.o() : super.b($$0);
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cto $$0) {
      return 1;
   }
}
