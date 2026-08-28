import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccv<T extends bup> extends cbk {
   private final T a;
   private final cvs b;
   private final Predicate<? super T> c;
   @Nullable
   private final awf d;

   public ccv(T $$0, cvs $$1, @Nullable awf $$2, Predicate<? super T> $$3) {
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
      return this.a.fv();
   }

   @Override
   public void d() {
      this.a.a(btz.a, this.b.u());
      this.a.c(brr.a);
   }

   @Override
   public void e() {
      this.a.a(btz.a, cvs.k);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dV().i() * 0.2F + 0.9F);
      }
   }
}
