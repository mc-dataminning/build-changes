import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxx<T extends bpr> extends bwm {
   private final T a;
   private final cqm b;
   private final Predicate<? super T> c;
   @Nullable
   private final atx d;

   public bxx(T $$0, cqm $$1, @Nullable atx $$2, Predicate<? super T> $$3) {
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
      return this.a.fs();
   }

   @Override
   public void c() {
      this.a.a(bpe.a, this.b.q());
      this.a.c(bnc.a);
   }

   @Override
   public void d() {
      this.a.a(bpe.a, cqm.h);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ei().i() * 0.2F + 0.9F);
      }
   }
}
