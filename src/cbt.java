import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbt<T extends btm> extends cai {
   private final T a;
   private final cuk b;
   private final Predicate<? super T> c;
   @Nullable
   private final avv d;

   public cbt(T $$0, cuk $$1, @Nullable avv $$2, Predicate<? super T> $$3) {
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
      return this.a.fv();
   }

   @Override
   public void c() {
      this.a.a(bsw.a, this.b.s());
      this.a.c(bqo.a);
   }

   @Override
   public void d() {
      this.a.a(bsw.a, cuk.l);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.el().i() * 0.2F + 0.9F);
      }
   }
}
