import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgd<T extends bxy> extends ces {
   private final T a;
   private final daa b;
   private final Predicate<? super T> c;
   @Nullable
   private final awq d;

   public cgd(T $$0, daa $$1, @Nullable awq $$2, Predicate<? super T> $$3) {
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
      return this.a.fz();
   }

   @Override
   public void d() {
      this.a.a(bxf.a, this.b.v());
      this.a.c(bus.a);
   }

   @Override
   public void e() {
      this.a.a(bxf.a, daa.k);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dY().i() * 0.2F + 0.9F);
      }
   }
}
