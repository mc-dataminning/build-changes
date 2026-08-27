import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bus<T extends bmn> extends bth {
   private final T a;
   private final cmy b;
   private final Predicate<? super T> c;
   @Nullable
   private final arr d;

   public bus(T $$0, cmy $$1, @Nullable arr $$2, Predicate<? super T> $$3) {
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
      this.a.a(bma.a, this.b.p());
      this.a.c(bka.a);
   }

   @Override
   public void d() {
      this.a.a(bma.a, cmy.f);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.eg().i() * 0.2F + 0.9F);
      }
   }
}
