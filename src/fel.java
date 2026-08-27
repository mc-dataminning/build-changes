import com.google.common.base.MoreObjects;
import java.util.List;

public class fel {
   public static final int a = -1;
   private final List<fej> b;
   private final int c;

   public fel(List<fej> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fej a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fej)MoreObjects.firstNonNull(this.b.get($$0), feh.a) : feh.a;
   }

   public int a() {
      return this.c;
   }
}
