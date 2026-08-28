import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diu extends dfh {
   protected final jf a;
   protected final boolean b;
   protected final ewy d;

   protected diu(dsj.d $$0, jf $$1, ewy $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends diu> a();

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dsk a(dcg $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.a(this.a.g());
      dsk $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dsk $$0) {
      return true;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.d;
   }

   protected abstract diw c();

   protected abstract dfh b();
}
