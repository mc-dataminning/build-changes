import com.google.common.base.MoreObjects;
import java.util.List;

public class fdt {
   public static final int a = -1;
   private final List<fdr> b;
   private final int c;

   public fdt(List<fdr> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fdr a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fdr)MoreObjects.firstNonNull(this.b.get($$0), fdp.a) : fdp.a;
   }

   public int a() {
      return this.c;
   }
}
