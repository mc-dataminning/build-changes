import com.google.common.base.MoreObjects;
import java.util.List;

public class fik {
   public static final int a = -1;
   private final List<fii> b;
   private final int c;

   public fik(List<fii> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fii a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fii)MoreObjects.firstNonNull(this.b.get($$0), fig.a) : fig.a;
   }

   public int a() {
      return this.c;
   }
}
