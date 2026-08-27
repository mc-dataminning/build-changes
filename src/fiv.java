import com.google.common.base.MoreObjects;
import java.util.List;

public class fiv {
   public static final int a = -1;
   private final List<fit> b;
   private final int c;

   public fiv(List<fit> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fit a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fit)MoreObjects.firstNonNull(this.b.get($$0), fir.a) : fir.a;
   }

   public int a() {
      return this.c;
   }
}
