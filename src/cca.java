import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cca<T extends btt> extends cap {
   private final T a;
   private final cur b;
   private final Predicate<? super T> c;
   @Nullable
   private final avz d;

   public cca(T $$0, cur $$1, @Nullable avz $$2, Predicate<? super T> $$3) {
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
      this.a.a(btd.a, this.b.s());
      this.a.c(bqv.a);
   }

   @Override
   public void d() {
      this.a.a(btd.a, cur.l);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.el().i() * 0.2F + 0.9F);
      }
   }
}
