import com.google.common.base.MoreObjects;
import java.util.List;

public class fsn {
   public static final int a = -1;
   private final List<fsl> b;
   private final int c;

   public fsn(List<fsl> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fsl a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fsl)MoreObjects.firstNonNull(this.b.get($$0), fsj.a) : fsj.a;
   }

   public int a() {
      return this.c;
   }
}
