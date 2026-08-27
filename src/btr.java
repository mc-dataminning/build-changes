import java.util.function.Predicate;
import javax.annotation.Nullable;

public class btr<T extends bln> extends bsg {
   private final T a;
   private final clo b;
   private final Predicate<? super T> c;
   @Nullable
   private final aqu d;

   public btr(T $$0, clo $$1, @Nullable aqu $$2, Predicate<? super T> $$3) {
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
      return this.a.fo();
   }

   @Override
   public void c() {
      this.a.a(bla.a, this.b.p());
      this.a.c(bja.a);
   }

   @Override
   public void d() {
      this.a.a(bla.a, clo.b);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.eh().i() * 0.2F + 0.9F);
      }
   }
}
