import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dqt extends dnc {
   protected final jb a;
   protected final boolean b;
   protected final fgk d;

   protected dqt(ebd.d $$0, jb $$1, fgk $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dqt> a();

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public ebe b(azx $$0) {
      return this.m();
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.a(this.a.g());
      ebe $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(ebe $$0) {
      return true;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.d;
   }

   protected abstract dqv c();

   protected abstract dnc b();
}
