import com.google.common.base.MoreObjects;
import java.util.List;

public class fii {
   public static final int a = -1;
   private final List<fig> b;
   private final int c;

   public fii(List<fig> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fig a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fig)MoreObjects.firstNonNull(this.b.get($$0), fie.a) : fie.a;
   }

   public int a() {
      return this.c;
   }
}
