import com.mojang.serialization.MapCodec;

public class czf extends cuj {
   public static final MapCodec<czf> a = b(czf::new);
   public static final int b = 3;
   public static final dhb c = dgr.as;
   private static final eiy[] d = new eiy[]{
      cua.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<czf> a() {
      return a;
   }

   protected czf(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.a(cuc.dW);
   }

   @Override
   public boolean e_(dgb $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj(ckm.ru);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c);
   }
}
