import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgm<T extends byh> extends cfb {
   private final T a;
   private final dak b;
   private final Predicate<? super T> c;
   @Nullable
   private final awx d;

   public cgm(T $$0, dak $$1, @Nullable awx $$2, Predicate<? super T> $$3) {
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
      this.a.a(bxo.a, this.b.v());
      this.a.c(bvb.a);
   }

   @Override
   public void e() {
      this.a.a(bxo.a, dak.l);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dY().i() * 0.2F + 0.9F);
      }
   }
}
