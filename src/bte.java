import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bte<T extends bla> extends brt {
   private final T a;
   private final clb b;
   private final Predicate<? super T> c;
   @Nullable
   private final aqm d;

   public bte(T $$0, clb $$1, @Nullable aqm $$2, Predicate<? super T> $$3) {
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
      this.a.a(bkn.a, this.b.p());
      this.a.c(bip.a);
   }

   @Override
   public void d() {
      this.a.a(bkn.a, clb.b);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ef().i() * 0.2F + 0.9F);
      }
   }
}
