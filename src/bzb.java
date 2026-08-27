import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzb<T extends bqv> extends bxq {
   private final T a;
   private final crs b;
   private final Predicate<? super T> c;
   @Nullable
   private final aun d;

   public bzb(T $$0, crs $$1, @Nullable aun $$2, Predicate<? super T> $$3) {
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
      return this.a.fs();
   }

   @Override
   public void c() {
      this.a.a(bqh.a, this.b.r());
      this.a.c(boe.a);
   }

   @Override
   public void d() {
      this.a.a(bqh.a, crs.i);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ei().i() * 0.2F + 0.9F);
      }
   }
}
