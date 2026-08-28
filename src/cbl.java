import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbl<T extends bte> extends caa {
   private final T a;
   private final cud b;
   private final Predicate<? super T> c;
   @Nullable
   private final avg d;

   public cbl(T $$0, cud $$1, @Nullable avg $$2, Predicate<? super T> $$3) {
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
      this.a.a(bso.a, this.b.s());
      this.a.c(bqg.a);
   }

   @Override
   public void d() {
      this.a.a(bso.a, cud.l);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dU().i() * 0.2F + 0.9F);
      }
   }
}
