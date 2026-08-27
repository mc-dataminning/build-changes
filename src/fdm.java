import com.google.common.base.MoreObjects;
import java.util.List;

public class fdm {
   public static final int a = -1;
   private final List<fdk> b;
   private final int c;

   public fdm(List<fdk> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fdk a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fdk)MoreObjects.firstNonNull(this.b.get($$0), fdi.a) : fdi.a;
   }

   public int a() {
      return this.c;
   }
}
