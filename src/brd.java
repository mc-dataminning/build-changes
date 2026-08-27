import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brd<T extends biy> extends bps {
   private final T a;
   private final ciw b;
   private final Predicate<? super T> c;
   @Nullable
   private final aot d;

   public brd(T $$0, ciw $$1, @Nullable aot $$2, Predicate<? super T> $$3) {
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
      return this.a.fl();
   }

   @Override
   public void c() {
      this.a.a(bil.a, this.b.p());
      this.a.c(bgn.a);
   }

   @Override
   public void d() {
      this.a.a(bil.a, ciw.b);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ee().i() * 0.2F + 0.9F);
      }
   }
}
