import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbx<T extends btp> extends cam {
   private final T a;
   private final cuq b;
   private final Predicate<? super T> c;
   @Nullable
   private final avo d;

   public cbx(T $$0, cuq $$1, @Nullable avo $$2, Predicate<? super T> $$3) {
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
      this.a.a(bsy.a, this.b.s());
      this.a.c(bqq.a);
   }

   @Override
   public void e() {
      this.a.a(bsy.a, cuq.l);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dS().i() * 0.2F + 0.9F);
      }
   }
}
