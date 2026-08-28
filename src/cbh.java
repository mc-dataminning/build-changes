import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbh<T extends bta> extends bzw {
   private final T a;
   private final cua b;
   private final Predicate<? super T> c;
   @Nullable
   private final ave d;

   public cbh(T $$0, cua $$1, @Nullable ave $$2, Predicate<? super T> $$3) {
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
      return this.a.fr();
   }

   @Override
   public void c() {
      this.a.a(bsk.a, this.b.s());
      this.a.c(bqc.a);
   }

   @Override
   public void d() {
      this.a.a(bsk.a, cua.l);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dS().i() * 0.2F + 0.9F);
      }
   }
}
