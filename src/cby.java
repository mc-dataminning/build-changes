import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cby<T extends btr> extends can {
   private final T a;
   private final cup b;
   private final Predicate<? super T> c;
   @Nullable
   private final avz d;

   public cby(T $$0, cup $$1, @Nullable avz $$2, Predicate<? super T> $$3) {
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
      this.a.a(btb.a, this.b.s());
      this.a.c(bqt.a);
   }

   @Override
   public void d() {
      this.a.a(btb.a, cup.l);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.el().i() * 0.2F + 0.9F);
      }
   }
}
