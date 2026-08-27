import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyg extends cut {
   protected final hx a;
   protected final boolean b;
   protected final ekb d;

   protected cyg(dgv.d $$0, hx $$1, ekb $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends cyg> a();

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().o();
   }

   public dgw a(crt $$0) {
      return this.o();
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.a(this.a.g());
      dgw $$4 = $$1.a_($$3);
      return !this.h($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean h(dgw $$0) {
      return true;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.d;
   }

   protected abstract cyi c();

   protected abstract cut b();
}
