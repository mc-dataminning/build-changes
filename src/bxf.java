import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxf<T extends boz> extends bvu {
   private final T a;
   private final cpq b;
   private final Predicate<? super T> c;
   @Nullable
   private final ato d;

   public bxf(T $$0, cpq $$1, @Nullable ato $$2, Predicate<? super T> $$3) {
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
      return this.a.fp();
   }

   @Override
   public void c() {
      this.a.a(bom.a, this.b.q());
      this.a.c(bmk.a);
   }

   @Override
   public void d() {
      this.a.a(bom.a, cpq.h);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ef().i() * 0.2F + 0.9F);
      }
   }
}
