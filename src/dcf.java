import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dcf extends cys {
   protected final ie a;
   protected final boolean b;
   protected final eos d;

   protected dcf(dli.d $$0, ie $$1, eos $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dcf> a();

   @Nullable
   @Override
   public dlj a(crk $$0) {
      dlj $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dlj a(cvs $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      hz $$3 = $$2.a(this.a.g());
      dlj $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dlj $$0) {
      return true;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.d;
   }

   protected abstract dch c();

   protected abstract cys b();
}
