import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdj<T extends bvc> extends cby {
   private final T a;
   private final cwb b;
   private final Predicate<? super T> c;
   @Nullable
   private final awk d;

   public cdj(T $$0, cwb $$1, @Nullable awk $$2, Predicate<? super T> $$3) {
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
      return this.a.fB();
   }

   @Override
   public void d() {
      this.a.a(bum.a, this.b.v());
      this.a.c(bsc.a);
   }

   @Override
   public void e() {
      this.a.a(bum.a, cwb.k);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ea().i() * 0.2F + 0.9F);
      }
   }
}
