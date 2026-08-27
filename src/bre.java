import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bre<T extends bja> extends bpt {
   private final T a;
   private final cix b;
   private final Predicate<? super T> c;
   @Nullable
   private final aov d;

   public bre(T $$0, cix $$1, @Nullable aov $$2, Predicate<? super T> $$3) {
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
      return this.a.fl();
   }

   @Override
   public void c() {
      this.a.a(bin.a, this.b.p());
      this.a.c(bgp.a);
   }

   @Override
   public void d() {
      this.a.a(bin.a, cix.b);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ee().i() * 0.2F + 0.9F);
      }
   }
}
