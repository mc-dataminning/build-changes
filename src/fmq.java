import com.google.common.base.MoreObjects;
import java.util.List;

public class fmq {
   public static final int a = -1;
   private final List<fmo> b;
   private final int c;

   public fmq(List<fmo> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fmo a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fmo)MoreObjects.firstNonNull(this.b.get($$0), fmm.a) : fmm.a;
   }

   public int a() {
      return this.c;
   }
}
