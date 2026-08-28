import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdn<T extends bvg> extends ccc {
   private final T a;
   private final cwf b;
   private final Predicate<? super T> c;
   @Nullable
   private final awn d;

   public cdn(T $$0, cwf $$1, @Nullable awn $$2, Predicate<? super T> $$3) {
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
      return this.a.fC();
   }

   @Override
   public void d() {
      this.a.a(buq.a, this.b.v());
      this.a.c(bsg.a);
   }

   @Override
   public void e() {
      this.a.a(buq.a, cwf.k);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.eb().i() * 0.2F + 0.9F);
      }
   }
}
