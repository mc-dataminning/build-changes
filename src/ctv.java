import com.mojang.serialization.MapCodec;

public class ctv extends cvt {
   public static final MapCodec<ctv> a = b(ctv::new);
   public static final int b = 3;
   public static final dhb c = dgr.as;
   private static final eiy[] g = new eiy[]{
      cua.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<ctv> a() {
      return a;
   }

   public ctv(dga.d $$0) {
      super($$0);
   }

   @Override
   protected dhb b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected cqy d() {
      return ckm.ur;
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cqz $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return g[this.g($$0)];
   }
}
