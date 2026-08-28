import com.google.common.base.MoreObjects;
import java.util.List;

public class fsg {
   public static final int a = -1;
   private final List<fse> b;
   private final int c;

   public fsg(List<fse> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fse a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fse)MoreObjects.firstNonNull(this.b.get($$0), fsc.a) : fsc.a;
   }

   public int a() {
      return this.c;
   }
}
