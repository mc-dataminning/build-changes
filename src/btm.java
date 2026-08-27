import java.util.function.Predicate;
import javax.annotation.Nullable;

public class btm<T extends bli> extends bsb {
   private final T a;
   private final clj b;
   private final Predicate<? super T> c;
   @Nullable
   private final aqq d;

   public btm(T $$0, clj $$1, @Nullable aqq $$2, Predicate<? super T> $$3) {
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
      return this.a.fo();
   }

   @Override
   public void c() {
      this.a.a(bkv.a, this.b.p());
      this.a.c(biw.a);
   }

   @Override
   public void d() {
      this.a.a(bkv.a, clj.b);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.eh().i() * 0.2F + 0.9F);
      }
   }
}
