import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bur<T extends bmm> extends btg {
   private final T a;
   private final cmx b;
   private final Predicate<? super T> c;
   @Nullable
   private final arq d;

   public bur(T $$0, cmx $$1, @Nullable arq $$2, Predicate<? super T> $$3) {
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
      this.a.a(blz.a, this.b.p());
      this.a.c(bjz.a);
   }

   @Override
   public void d() {
      this.a.a(blz.a, cmx.f);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.eg().i() * 0.2F + 0.9F);
      }
   }
}
