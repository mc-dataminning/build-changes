import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cde<T extends bux> extends cbt {
   private final T a;
   private final cvx b;
   private final Predicate<? super T> c;
   @Nullable
   private final awj d;

   public cde(T $$0, cvx $$1, @Nullable awj $$2, Predicate<? super T> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = $$3;
   }

   @Override
   public boolean b() {
      return this.c.test(this.a);
   }

   @Override
   public boolean c() {
      return this.a.fB();
   }

   @Override
   public void d() {
      this.a.a(buh.a, this.b.v());
      this.a.c(brx.a);
   }

   @Override
   public void e() {
      this.a.a(buh.a, cvx.k);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ea().i() * 0.2F + 0.9F);
      }
   }
}
