import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceg<T extends bvz> extends ccv {
   private final T a;
   private final cxg b;
   private final Predicate<? super T> c;
   @Nullable
   private final awu d;

   public ceg(T $$0, cxg $$1, @Nullable awu $$2, Predicate<? super T> $$3) {
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
      this.a.a(bvj.a, this.b.v());
      this.a.c(bsz.a);
   }

   @Override
   public void e() {
      this.a.a(bvj.a, cxg.j);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dZ().i() * 0.2F + 0.9F);
      }
   }
}
