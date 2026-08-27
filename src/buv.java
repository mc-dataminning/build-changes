import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buv<T extends bmq> extends btk {
   private final T a;
   private final cng b;
   private final Predicate<? super T> c;
   @Nullable
   private final ars d;

   public buv(T $$0, cng $$1, @Nullable ars $$2, Predicate<? super T> $$3) {
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
      this.a.a(bmd.a, this.b.p());
      this.a.c(bkb.a);
   }

   @Override
   public void d() {
      this.a.a(bmd.a, cng.f);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.eg().i() * 0.2F + 0.9F);
      }
   }
}
