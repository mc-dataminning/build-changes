import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bum<T extends bmh> extends btb {
   private final T a;
   private final cmr b;
   private final Predicate<? super T> c;
   @Nullable
   private final arl d;

   public bum(T $$0, cmr $$1, @Nullable arl $$2, Predicate<? super T> $$3) {
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
      return this.a.fn();
   }

   @Override
   public void c() {
      this.a.a(blu.a, this.b.p());
      this.a.c(bju.a);
   }

   @Override
   public void d() {
      this.a.a(blu.a, cmr.f);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.eg().i() * 0.2F + 0.9F);
      }
   }
}
