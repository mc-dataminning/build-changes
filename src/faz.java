import java.util.List;
import javax.annotation.Nullable;

public class faz implements fdk {
   private static final int a = 170;
   private final vq b;
   @Nullable
   private List<avu> c;
   @Nullable
   private final vq d;

   private faz(vq $$0, @Nullable vq $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static faz a(vq $$0, @Nullable vq $$1) {
      return new faz($$0, $$1);
   }

   public static faz a(vq $$0) {
      return new faz($$0, $$0);
   }

   @Override
   public void b(fdj $$0) {
      if (this.d != null) {
         $$0.a(fdi.c, this.d);
      }
   }

   public List<avu> a(exo $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<avu> a(exo $$0, vq $$1) {
      return $$0.h.c($$1, 170);
   }
}
