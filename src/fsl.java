import com.google.common.base.MoreObjects;
import java.util.List;

public class fsl {
   public static final int a = -1;
   private final List<fsj> b;
   private final int c;

   public fsl(List<fsj> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fsj a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fsj)MoreObjects.firstNonNull(this.b.get($$0), fsh.a) : fsh.a;
   }

   public int a() {
      return this.c;
   }
}
