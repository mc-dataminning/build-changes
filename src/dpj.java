import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpj extends dlu {
   protected final ja a;
   protected final boolean b;
   protected final feq d;

   protected dpj(dzn.d $$0, ja $$1, feq $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dpj> a();

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dzo b(azt $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.a(this.a.g());
      dzo $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dzo $$0) {
      return true;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.d;
   }

   protected abstract dpl c();

   protected abstract dlu b();
}
