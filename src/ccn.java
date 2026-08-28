import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccn<T extends buh> extends cbc {
   private final T a;
   private final cvl b;
   private final Predicate<? super T> c;
   @Nullable
   private final awc d;

   public ccn(T $$0, cvl $$1, @Nullable awc $$2, Predicate<? super T> $$3) {
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
      this.a.a(btr.a, this.b.u());
      this.a.c(brj.a);
   }

   @Override
   public void e() {
      this.a.a(btr.a, cvl.k);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dV().i() * 0.2F + 0.9F);
      }
   }
}
