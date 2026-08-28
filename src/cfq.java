import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfq<T extends bxl> extends cef {
   private final T a;
   private final czk b;
   private final Predicate<? super T> c;
   @Nullable
   private final awm d;

   public cfq(T $$0, czk $$1, @Nullable awm $$2, Predicate<? super T> $$3) {
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
      return this.a.fy();
   }

   @Override
   public void d() {
      this.a.a(bws.a, this.b.v());
      this.a.c(buf.a);
   }

   @Override
   public void e() {
      this.a.a(bws.a, czk.k);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dX().i() * 0.2F + 0.9F);
      }
   }
}
