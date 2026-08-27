import com.google.common.base.MoreObjects;
import java.util.List;

public class fmo {
   public static final int a = -1;
   private final List<fmm> b;
   private final int c;

   public fmo(List<fmm> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fmm a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fmm)MoreObjects.firstNonNull(this.b.get($$0), fmk.a) : fmk.a;
   }

   public int a() {
      return this.c;
   }
}
