import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceo<T extends bwh> extends cdd {
   private final T a;
   private final cxo b;
   private final Predicate<? super T> c;
   @Nullable
   private final axe d;

   public ceo(T $$0, cxo $$1, @Nullable axe $$2, Predicate<? super T> $$3) {
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
      this.a.a(bvr.a, this.b.v());
      this.a.c(bth.a);
   }

   @Override
   public void e() {
      this.a.a(bvr.a, cxo.j);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dZ().i() * 0.2F + 0.9F);
      }
   }
}
