import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccs<T extends bum> extends cbh {
   private final T a;
   private final cvp b;
   private final Predicate<? super T> c;
   @Nullable
   private final awd d;

   public ccs(T $$0, cvp $$1, @Nullable awd $$2, Predicate<? super T> $$3) {
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
      return this.a.fv();
   }

   @Override
   public void d() {
      this.a.a(btw.a, this.b.u());
      this.a.c(bro.a);
   }

   @Override
   public void e() {
      this.a.a(btw.a, cvp.k);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dV().i() * 0.2F + 0.9F);
      }
   }
}
