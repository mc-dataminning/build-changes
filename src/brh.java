import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brh<T extends bjd> extends bpw {
   private final T a;
   private final cja b;
   private final Predicate<? super T> c;
   @Nullable
   private final aoy d;

   public brh(T $$0, cja $$1, @Nullable aoy $$2, Predicate<? super T> $$3) {
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
      this.a.a(biq.a, this.b.p());
      this.a.c(bgs.a);
   }

   @Override
   public void d() {
      this.a.a(biq.a, cja.b);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ee().i() * 0.2F + 0.9F);
      }
   }
}
