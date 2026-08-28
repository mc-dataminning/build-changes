import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dis extends dff {
   protected final jf a;
   protected final boolean b;
   protected final ews d;

   protected dis(dsg.d $$0, jf $$1, ews $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dis> a();

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dsh a(dce $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.a(this.a.g());
      dsh $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dsh $$0) {
      return true;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.d;
   }

   protected abstract diu c();

   protected abstract dff b();
}
