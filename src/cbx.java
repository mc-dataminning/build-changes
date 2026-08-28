import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbx<T extends btq> extends cam {
   private final T a;
   private final cuo b;
   private final Predicate<? super T> c;
   @Nullable
   private final avy d;

   public cbx(T $$0, cuo $$1, @Nullable avy $$2, Predicate<? super T> $$3) {
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
      this.a.a(bta.a, this.b.s());
      this.a.c(bqs.a);
   }

   @Override
   public void d() {
      this.a.a(bta.a, cuo.l);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.el().i() * 0.2F + 0.9F);
      }
   }
}
