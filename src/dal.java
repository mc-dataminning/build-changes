import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dal extends cwy {
   protected final ic a;
   protected final boolean b;
   protected final emv d;

   protected dal(djo.d $$0, ic $$1, emv $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dal> a();

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public djp a(cty $$0) {
      return this.o();
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.a(this.a.g());
      djp $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(djp $$0) {
      return true;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.d;
   }

   protected abstract dan c();

   protected abstract cwy b();
}
