import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class div extends dfi {
   protected final jf a;
   protected final boolean b;
   protected final exa d;

   protected div(dsk.d $$0, jf $$1, exa $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends div> a();

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dsl a(dch $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      ja $$3 = $$2.a(this.a.g());
      dsl $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dsl $$0) {
      return true;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return this.d;
   }

   protected abstract dix c();

   protected abstract dfi b();
}
