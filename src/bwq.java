import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwq<T extends bok> extends bvf {
   private final T a;
   private final cpd b;
   private final Predicate<? super T> c;
   @Nullable
   private final atk d;

   public bwq(T $$0, cpd $$1, @Nullable atk $$2, Predicate<? super T> $$3) {
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
      this.a.a(bnx.a, this.b.q());
      this.a.c(blv.a);
   }

   @Override
   public void d() {
      this.a.a(bnx.a, cpd.h);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.eh().i() * 0.2F + 0.9F);
      }
   }
}
