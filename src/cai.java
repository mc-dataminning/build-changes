import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cai<T extends bsc> extends byx {
   private final T a;
   private final csz b;
   private final Predicate<? super T> c;
   @Nullable
   private final avb d;

   public cai(T $$0, csz $$1, @Nullable avb $$2, Predicate<? super T> $$3) {
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
      return this.a.ft();
   }

   @Override
   public void c() {
      this.a.a(bro.a, this.b.r());
      this.a.c(bpl.a);
   }

   @Override
   public void d() {
      this.a.a(bro.a, csz.i);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ej().i() * 0.2F + 0.9F);
      }
   }
}
