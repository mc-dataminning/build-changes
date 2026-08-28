import java.util.List;
import javax.annotation.Nullable;

public class fry implements ful {
   private static final int a = 170;
   private final wv b;
   @Nullable
   private List<ayw> c;
   @Nullable
   private tr d;
   @Nullable
   private final wv e;

   private fry(wv $$0, @Nullable wv $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fry a(wv $$0, @Nullable wv $$1) {
      return new fry($$0, $$1);
   }

   public static fry a(wv $$0) {
      return new fry($$0, $$0);
   }

   @Override
   public void b(fuk $$0) {
      if (this.e != null) {
         $$0.a(fuj.c, this.e);
      }
   }

   public List<ayw> a(fnd $$0) {
      tr $$1 = tr.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayw> a(fnd $$0, wv $$1) {
      return $$0.h.c($$1, 170);
   }
}
