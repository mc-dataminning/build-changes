import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dna extends djm {
   protected final jn a;
   protected final boolean b;
   protected final fbu d;

   protected dna(dww.d $$0, jn $$1, fbu $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dna> a();

   @Nullable
   @Override
   public dwx a(dag $$0) {
      dwx $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public dwx b(azh $$0) {
      return this.m();
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.a(this.a.g());
      dwx $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(dwx $$0) {
      return true;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.d;
   }

   protected abstract dnc c();

   protected abstract djm b();
}
