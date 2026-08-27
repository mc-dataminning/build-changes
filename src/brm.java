import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brm<T extends bji> extends bqb {
   private final T a;
   private final cjf b;
   private final Predicate<? super T> c;
   @Nullable
   private final apd d;

   public brm(T $$0, cjf $$1, @Nullable apd $$2, Predicate<? super T> $$3) {
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
      this.a.a(biv.a, this.b.p());
      this.a.c(bgx.a);
   }

   @Override
   public void d() {
      this.a.a(biv.a, cjf.b);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ef().i() * 0.2F + 0.9F);
      }
   }
}
