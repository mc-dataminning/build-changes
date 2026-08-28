import com.google.common.base.MoreObjects;
import java.util.List;

public class fst {
   public static final int a = -1;
   private final List<fsr> b;
   private final int c;

   public fst(List<fsr> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fsr a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fsr)MoreObjects.firstNonNull(this.b.get($$0), fsp.a) : fsp.a;
   }

   public int a() {
      return this.c;
   }
}
