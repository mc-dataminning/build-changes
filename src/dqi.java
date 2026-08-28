import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dqi extends dmr {
   protected final jb a;
   protected final boolean b;
   protected final ffw d;

   protected dqi(eas.d $$0, jb $$1, ffw $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dqi> a();

   @Nullable
   @Override
   public eat a(ddg $$0) {
      eat $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public eat b(azv $$0) {
      return this.m();
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      iv $$3 = $$2.a(this.a.g());
      eat $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(eat $$0) {
      return true;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.d;
   }

   protected abstract dqk c();

   protected abstract dmr b();
}
