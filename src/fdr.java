import com.google.common.base.MoreObjects;
import java.util.List;

public class fdr {
   public static final int a = -1;
   private final List<fdp> b;
   private final int c;

   public fdr(List<fdp> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fdp a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fdp)MoreObjects.firstNonNull(this.b.get($$0), fdn.a) : fdn.a;
   }

   public int a() {
      return this.c;
   }
}
