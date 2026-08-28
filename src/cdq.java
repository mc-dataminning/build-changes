import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdq<T extends bvj> extends ccf {
   private final T a;
   private final cwm b;
   private final Predicate<? super T> c;
   @Nullable
   private final awm d;

   public cdq(T $$0, cwm $$1, @Nullable awm $$2, Predicate<? super T> $$3) {
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
      return this.a.fx();
   }

   @Override
   public void d() {
      this.a.a(but.a, this.b.v());
      this.a.c(bsj.a);
   }

   @Override
   public void e() {
      this.a.a(but.a, cwm.k);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dY().i() * 0.2F + 0.9F);
      }
   }
}
