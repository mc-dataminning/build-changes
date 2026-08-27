import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwm<T extends boi> extends bvb {
   private final T a;
   private final coz b;
   private final Predicate<? super T> c;
   @Nullable
   private final atj d;

   public bwm(T $$0, coz $$1, @Nullable atj $$2, Predicate<? super T> $$3) {
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
      return this.a.fn();
   }

   @Override
   public void c() {
      this.a.a(bnv.a, this.b.q());
      this.a.c(blt.a);
   }

   @Override
   public void d() {
      this.a.a(bnv.a, coz.h);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.eh().i() * 0.2F + 0.9F);
      }
   }
}
