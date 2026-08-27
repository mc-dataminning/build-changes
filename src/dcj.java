import com.mojang.serialization.MapCodec;

public class dcj extends cvt {
   public static final MapCodec<dcj> a = b(dcj::new);
   public static final int b = 2;
   public static final dhb c = dgr.aq;
   private static final float g = 3.0F;
   private static final eiy[] h = new eiy[]{cua.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), cua.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   public dcj(dga.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dhb b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected cqy d() {
      return ckm.uo;
   }

   @Override
   public dgb b(int $$0) {
      return $$0 == 2 ? cuc.bS.o() : super.b($$0);
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cqz $$0) {
      return 1;
   }
}
