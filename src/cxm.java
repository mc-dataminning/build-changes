import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cxm extends cua {
   protected final hx a;
   protected final boolean b;
   protected final eiy d;

   protected cxm(dga.d $$0, hx $$1, eiy $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends cxm> a();

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dgb a(cra $$0) {
      return this.o();
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      ht $$3 = $$2.a(this.a.g());
      dgb $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(dgb $$0) {
      return true;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.d;
   }

   protected abstract cxo c();

   protected abstract cua b();
}
