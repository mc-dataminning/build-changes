import com.google.common.base.MoreObjects;
import java.util.List;

public class fgd {
   public static final int a = -1;
   private final List<fgb> b;
   private final int c;

   public fgd(List<fgb> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fgb a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fgb)MoreObjects.firstNonNull(this.b.get($$0), ffz.a) : ffz.a;
   }

   public int a() {
      return this.c;
   }
}
