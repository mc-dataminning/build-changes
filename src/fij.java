import com.google.common.base.MoreObjects;
import java.util.List;

public class fij {
   public static final int a = -1;
   private final List<fih> b;
   private final int c;

   public fij(List<fih> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fih a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fih)MoreObjects.firstNonNull(this.b.get($$0), fif.a) : fif.a;
   }

   public int a() {
      return this.c;
   }
}
