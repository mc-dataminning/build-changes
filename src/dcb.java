import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dcb extends cyo {
   protected final ie a;
   protected final boolean b;
   protected final eol d;

   protected dcb(dle.d $$0, ie $$1, eol $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dcb> a();

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dlf a(cvo $$0) {
      return this.o();
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.a(this.a.g());
      dlf $$4 = $$1.a_($$3);
      return !this.m($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean m(dlf $$0) {
      return true;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.d;
   }

   protected abstract dcd c();

   protected abstract cyo b();
}
