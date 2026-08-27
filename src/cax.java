import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cax<T extends bsq> extends bzm {
   private final T a;
   private final cto b;
   private final Predicate<? super T> c;
   @Nullable
   private final avg d;

   public cax(T $$0, cto $$1, @Nullable avg $$2, Predicate<? super T> $$3) {
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
      return this.a.fv();
   }

   @Override
   public void c() {
      this.a.a(bsb.a, this.b.s());
      this.a.c(bpt.a);
   }

   @Override
   public void d() {
      this.a.a(bsb.a, cto.i);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.el().i() * 0.2F + 0.9F);
      }
   }
}
