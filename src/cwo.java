import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cwo extends ctc {
   protected final ha a;
   protected final boolean b;
   protected final eia d;

   protected cwo(dfc.d $$0, ha $$1, eia $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends cwo> a();

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dfd a(cqc $$0) {
      return this.o();
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.a(this.a.g());
      dfd $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(dfd $$0) {
      return true;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.d;
   }

   protected abstract cwq c();

   protected abstract ctc b();
}
