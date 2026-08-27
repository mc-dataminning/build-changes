import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxw<T extends bpq> extends bwl {
   private final T a;
   private final cqk b;
   private final Predicate<? super T> c;
   @Nullable
   private final atx d;

   public bxw(T $$0, cqk $$1, @Nullable atx $$2, Predicate<? super T> $$3) {
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
      this.a.a(bpd.a, this.b.q());
      this.a.c(bnb.a);
   }

   @Override
   public void d() {
      this.a.a(bpd.a, cqk.h);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ei().i() * 0.2F + 0.9F);
      }
   }
}
