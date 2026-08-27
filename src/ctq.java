import com.mojang.serialization.MapCodec;

public abstract class ctq extends cua {
   protected static final int a = 2;
   protected static final eiy b = cua.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected ctq(dga.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends ctq> a();

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !this.a($$0, $$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return a($$1, $$2.d(), hx.b);
   }
}
