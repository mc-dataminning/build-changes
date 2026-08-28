import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfg<T extends bxb> extends cdv {
   private final T a;
   private final cys b;
   private final Predicate<? super T> c;
   @Nullable
   private final awk d;

   public cfg(T $$0, cys $$1, @Nullable awk $$2, Predicate<? super T> $$3) {
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
      this.a.a(bwk.a, this.b.v());
      this.a.c(btx.a);
   }

   @Override
   public void e() {
      this.a.a(bwk.a, cys.k);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dY().i() * 0.2F + 0.9F);
      }
   }
}
