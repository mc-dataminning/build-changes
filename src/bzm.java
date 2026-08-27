import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzm<T extends brg> extends byb {
   private final T a;
   private final csd b;
   private final Predicate<? super T> c;
   @Nullable
   private final auy d;

   public bzm(T $$0, csd $$1, @Nullable auy $$2, Predicate<? super T> $$3) {
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
      this.a.a(bqs.a, this.b.r());
      this.a.c(bop.a);
   }

   @Override
   public void d() {
      this.a.a(bqs.a, csd.i);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ej().i() * 0.2F + 0.9F);
      }
   }
}
