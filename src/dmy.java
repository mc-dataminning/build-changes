import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmy extends djk {
   protected final jn a;
   protected final boolean b;
   protected final fbs d;

   protected dmy(dwu.d $$0, jn $$1, fbs $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dmy> a();

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dwv $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dwv b(azg $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.a(this.a.g());
      dwv $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dwv $$0) {
      return true;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.d;
   }

   protected abstract dna c();

   protected abstract djk b();
}
