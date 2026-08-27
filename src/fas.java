import java.util.List;
import javax.annotation.Nullable;

public class fas implements fdd {
   private static final int a = 170;
   private final vq b;
   @Nullable
   private List<avt> c;
   @Nullable
   private final vq d;

   private fas(vq $$0, @Nullable vq $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fas a(vq $$0, @Nullable vq $$1) {
      return new fas($$0, $$1);
   }

   public static fas a(vq $$0) {
      return new fas($$0, $$0);
   }

   @Override
   public void b(fdc $$0) {
      if (this.d != null) {
         $$0.a(fdb.c, this.d);
      }
   }

   public List<avt> a(exh $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<avt> a(exh $$0, vq $$1) {
      return $$0.h.c($$1, 170);
   }
}
