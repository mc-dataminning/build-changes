import java.util.function.Predicate;
import javax.annotation.Nullable;

public class caw<T extends bsq> extends bzl {
   private final T a;
   private final cuh b;
   private final Predicate<? super T> c;
   @Nullable
   private final avn d;

   public caw(T $$0, cuh $$1, @Nullable avn $$2, Predicate<? super T> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = $$3;
   }

   @Override
   public boolean a() {
      return this.c.test(this.a);
   }

   @Override
   public boolean b() {
      return this.a.fE();
   }

   @Override
   public void c() {
      this.a.a(bsc.a, this.b.r());
      this.a.c(bpz.a);
   }

   @Override
   public void d() {
      this.a.a(bsc.a, cuh.i);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.et().i() * 0.2F + 0.9F);
      }
   }
}
