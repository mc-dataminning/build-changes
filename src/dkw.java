import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkw extends dhj {
   protected final jj a;
   protected final boolean b;
   protected final ezm d;

   protected dkw(dun.d $$0, jj $$1, ezm $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dkw> a();

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public duo a(deh $$0) {
      return this.o();
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.a(this.a.g());
      duo $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(duo $$0) {
      return true;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.d;
   }

   protected abstract dky c();

   protected abstract dhj b();
}
