import java.util.List;
import javax.annotation.Nullable;

public class flv implements foi {
   private static final int a = 170;
   private final xd b;
   @Nullable
   private List<ayp> c;
   @Nullable
   private ua d;
   @Nullable
   private final xd e;

   private flv(xd $$0, @Nullable xd $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static flv a(xd $$0, @Nullable xd $$1) {
      return new flv($$0, $$1);
   }

   public static flv a(xd $$0) {
      return new flv($$0, $$0);
   }

   @Override
   public void b(foh $$0) {
      if (this.e != null) {
         $$0.a(fog.c, this.e);
      }
   }

   public List<ayp> a(fil $$0) {
      ua $$1 = ua.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayp> a(fil $$0, xd $$1) {
      return $$0.h.c($$1, 170);
   }
}
