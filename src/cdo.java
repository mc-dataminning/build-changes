import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdo<T extends bvh> extends ccd {
   private final T a;
   private final cwn b;
   private final Predicate<? super T> c;
   @Nullable
   private final avy d;

   public cdo(T $$0, cwn $$1, @Nullable avy $$2, Predicate<? super T> $$3) {
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
      return this.a.fz();
   }

   @Override
   public void d() {
      this.a.a(bur.a, this.b.v());
      this.a.c(bsh.a);
   }

   @Override
   public void e() {
      this.a.a(bur.a, cwn.j);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dZ().i() * 0.2F + 0.9F);
      }
   }
}
