import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbv<T extends btn> extends cak {
   private final T a;
   private final cuo b;
   private final Predicate<? super T> c;
   @Nullable
   private final avn d;

   public cbv(T $$0, cuo $$1, @Nullable avn $$2, Predicate<? super T> $$3) {
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
      return this.a.fs();
   }

   @Override
   public void d() {
      this.a.a(bsx.a, this.b.s());
      this.a.c(bqp.a);
   }

   @Override
   public void e() {
      this.a.a(bsx.a, cuo.l);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dT().i() * 0.2F + 0.9F);
      }
   }
}
