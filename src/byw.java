import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byw<T extends bqq> extends bxl {
   private final T a;
   private final crj b;
   private final Predicate<? super T> c;
   @Nullable
   private final aul d;

   public byw(T $$0, crj $$1, @Nullable aul $$2, Predicate<? super T> $$3) {
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
      return this.a.fs();
   }

   @Override
   public void c() {
      this.a.a(bqc.a, this.b.r());
      this.a.c(bnz.a);
   }

   @Override
   public void d() {
      this.a.a(bqc.a, crj.i);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ei().i() * 0.2F + 0.9F);
      }
   }
}
