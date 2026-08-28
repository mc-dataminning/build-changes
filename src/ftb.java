import java.util.List;
import javax.annotation.Nullable;

public class ftb implements fvo {
   private static final int a = 170;
   private final ww b;
   @Nullable
   private List<ayw> c;
   @Nullable
   private ts d;
   @Nullable
   private final ww e;

   private ftb(ww $$0, @Nullable ww $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static ftb a(ww $$0, @Nullable ww $$1) {
      return new ftb($$0, $$1);
   }

   public static ftb a(ww $$0) {
      return new ftb($$0, $$0);
   }

   @Override
   public void b(fvn $$0) {
      if (this.e != null) {
         $$0.a(fvm.c, this.e);
      }
   }

   public List<ayw> a(fof $$0) {
      ts $$1 = ts.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayw> a(fof $$0, ww $$1) {
      return $$0.h.c($$1, 170);
   }
}
