import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brs<T extends bjo> extends bqh {
   private final T a;
   private final cjl b;
   private final Predicate<? super T> c;
   @Nullable
   private final apf d;

   public brs(T $$0, cjl $$1, @Nullable apf $$2, Predicate<? super T> $$3) {
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
      this.a.a(bjb.a, this.b.p());
      this.a.c(bhd.a);
   }

   @Override
   public void d() {
      this.a.a(bjb.a, cjl.b);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ef().i() * 0.2F + 0.9F);
      }
   }
}
