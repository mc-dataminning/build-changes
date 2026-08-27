import com.google.common.base.MoreObjects;
import java.util.List;

public class fua {
   public static final int a = -1;
   private final List<fty> b;
   private final int c;

   public fua(List<fty> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fty a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fty)MoreObjects.firstNonNull(this.b.get($$0), ftw.a) : ftw.a;
   }

   public int a() {
      return this.c;
   }
}
