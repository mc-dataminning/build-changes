import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cey<T extends bwt> extends cdn {
   private final T a;
   private final cxy b;
   private final Predicate<? super T> c;
   @Nullable
   private final awj d;

   public cey(T $$0, cxy $$1, @Nullable awj $$2, Predicate<? super T> $$3) {
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
      this.a.a(bwc.a, this.b.v());
      this.a.c(btp.a);
   }

   @Override
   public void e() {
      this.a.a(bwc.a, cxy.k);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dY().i() * 0.2F + 0.9F);
      }
   }
}
