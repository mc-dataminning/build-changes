import java.util.function.Predicate;
import javax.annotation.Nullable;

public class caz<T extends bss> extends bzo {
   private final T a;
   private final ctq b;
   private final Predicate<? super T> c;
   @Nullable
   private final avh d;

   public caz(T $$0, ctq $$1, @Nullable avh $$2, Predicate<? super T> $$3) {
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
      this.a.a(bsd.a, this.b.s());
      this.a.c(bpv.a);
   }

   @Override
   public void d() {
      this.a.a(bsd.a, ctq.i);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.el().i() * 0.2F + 0.9F);
      }
   }
}
