import com.mojang.serialization.MapCodec;

public abstract class cuj extends cua {
   protected cuj(dga.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cuj> a();

   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.a(aqs.af) || $$0.a(cuc.cC);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      ht $$3 = $$2.d();
      return this.d($$1.a_($$3), $$1, $$3);
   }

   @Override
   public boolean c(dgb $$0, cqf $$1, ht $$2) {
      return $$0.u().c();
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return $$3 == ebu.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
