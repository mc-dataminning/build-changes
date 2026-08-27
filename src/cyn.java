import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyn extends cva {
   protected final hx a;
   protected final boolean b;
   protected final ekn d;

   protected cyn(dhh.d $$0, hx $$1, ekn $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends cyn> a();

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dhi a(csb $$0) {
      return this.o();
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      ht $$3 = $$2.a(this.a.g());
      dhi $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(dhi $$0) {
      return true;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return this.d;
   }

   protected abstract cyp c();

   protected abstract cva b();
}
