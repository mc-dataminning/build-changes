import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdr<T extends bvk> extends ccg {
   private final T a;
   private final cwq b;
   private final Predicate<? super T> c;
   @Nullable
   private final avz d;

   public cdr(T $$0, cwq $$1, @Nullable avz $$2, Predicate<? super T> $$3) {
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
      return this.a.fz();
   }

   @Override
   public void d() {
      this.a.a(buu.a, this.b.v());
      this.a.c(bsk.a);
   }

   @Override
   public void e() {
      this.a.a(buu.a, cwq.j);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dY().i() * 0.2F + 0.9F);
      }
   }
}
