import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsp<T extends bkl> extends bre {
   private final T a;
   private final ckj b;
   private final Predicate<? super T> c;
   @Nullable
   private final aqc d;

   public bsp(T $$0, ckj $$1, @Nullable aqc $$2, Predicate<? super T> $$3) {
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
      this.a.a(bjy.a, this.b.p());
      this.a.c(bia.a);
   }

   @Override
   public void d() {
      this.a.a(bjy.a, ckj.b);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ef().i() * 0.2F + 0.9F);
      }
   }
}
