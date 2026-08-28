import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbk<T extends btd> extends bzz {
   private final T a;
   private final cuc b;
   private final Predicate<? super T> c;
   @Nullable
   private final avg d;

   public cbk(T $$0, cuc $$1, @Nullable avg $$2, Predicate<? super T> $$3) {
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
      this.a.a(bsn.a, this.b.s());
      this.a.c(bqf.a);
   }

   @Override
   public void d() {
      this.a.a(bsn.a, cuc.l);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dT().i() * 0.2F + 0.9F);
      }
   }
}
