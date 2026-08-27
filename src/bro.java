import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bro<T extends bjk> extends bqd {
   private final T a;
   private final cjh b;
   private final Predicate<? super T> c;
   @Nullable
   private final ape d;

   public bro(T $$0, cjh $$1, @Nullable ape $$2, Predicate<? super T> $$3) {
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
      return this.a.fm();
   }

   @Override
   public void c() {
      this.a.a(bix.a, this.b.p());
      this.a.c(bgz.a);
   }

   @Override
   public void d() {
      this.a.a(bix.a, cjh.b);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ef().i() * 0.2F + 0.9F);
      }
   }
}
