import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class czw extends cwj {
   protected final ic a;
   protected final boolean b;
   protected final emf d;

   protected czw(diz.d $$0, ic $$1, emf $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends czw> a();

   @Nullable
   @Override
   public dja a(cpa $$0) {
      dja $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dja a(ctj $$0) {
      return this.o();
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      hx $$3 = $$2.a(this.a.g());
      dja $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(dja $$0) {
      return true;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.d;
   }

   protected abstract czy c();

   protected abstract cwj b();
}
