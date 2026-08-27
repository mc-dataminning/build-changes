import com.google.common.base.MoreObjects;
import java.util.List;

public class fdc {
   public static final int a = -1;
   private final List<fda> b;
   private final int c;

   public fdc(List<fda> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fda a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fda)MoreObjects.firstNonNull(this.b.get($$0), fcy.a) : fcy.a;
   }

   public int a() {
      return this.c;
   }
}
