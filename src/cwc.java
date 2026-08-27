import com.mojang.serialization.MapCodec;

public class cwc extends cua {
   public static final MapCodec<cwc> a = b(cwc::new);
   protected static final eiy b = cwv.c;

   @Override
   public MapCodec<cwc> a() {
      return a;
   }

   protected cwc(dga.d $$0) {
      super($$0);
   }

   @Override
   public boolean g_(dgb $$0) {
      return true;
   }

   @Override
   public dgb a(cmr $$0) {
      return !this.o().a((crc)$$0.q(), $$0.a()) ? cua.a(this.o(), cuc.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      cwv.a(null, $$0, $$1, $$2);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      dgb $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cwx;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
