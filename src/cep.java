import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cep<T extends bwi> extends cde {
   private final T a;
   private final cxp b;
   private final Predicate<? super T> c;
   @Nullable
   private final axe d;

   public cep(T $$0, cxp $$1, @Nullable axe $$2, Predicate<? super T> $$3) {
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
      this.a.a(bvs.a, this.b.v());
      this.a.c(bti.a);
   }

   @Override
   public void e() {
      this.a.a(bvs.a, cxp.j);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dZ().i() * 0.2F + 0.9F);
      }
   }
}
