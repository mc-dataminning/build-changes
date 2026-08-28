import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceh<T extends bwa> extends ccw {
   private final T a;
   private final cxh b;
   private final Predicate<? super T> c;
   @Nullable
   private final avz d;

   public ceh(T $$0, cxh $$1, @Nullable avz $$2, Predicate<? super T> $$3) {
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
      this.a.a(bvj.a, this.b.v());
      this.a.c(bsx.a);
   }

   @Override
   public void e() {
      this.a.a(bvj.a, cxh.k);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dX().i() * 0.2F + 0.9F);
      }
   }
}
