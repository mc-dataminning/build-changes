import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buc<T extends blx> extends bsr {
   private final T a;
   private final cmh b;
   private final Predicate<? super T> c;
   @Nullable
   private final arb d;

   public buc(T $$0, cmh $$1, @Nullable arb $$2, Predicate<? super T> $$3) {
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
      this.a.a(blk.a, this.b.p());
      this.a.c(bjk.a);
   }

   @Override
   public void d() {
      this.a.a(blk.a, cmh.f);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.eg().i() * 0.2F + 0.9F);
      }
   }
}
