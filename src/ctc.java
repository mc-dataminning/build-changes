import com.mojang.serialization.MapCodec;

public class ctc extends cuj implements cud {
   public static final MapCodec<ctc> a = b(ctc::new);
   private static final eiy b = eiv.a(cua.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), cua.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<ctc> a() {
      return a;
   }

   protected ctc(dga.d $$0) {
      super($$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.a(cuc.dR) || super.d($$0, $$1, $$2);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      dfq.e.a($$0, $$0.k().g(), $$2, $$3, $$1);
   }
}
