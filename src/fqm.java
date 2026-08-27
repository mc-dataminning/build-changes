import com.google.common.base.MoreObjects;
import java.util.List;

public class fqm {
   public static final int a = -1;
   private final List<fqk> b;
   private final int c;

   public fqm(List<fqk> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fqk a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fqk)MoreObjects.firstNonNull(this.b.get($$0), fqi.a) : fqi.a;
   }

   public int a() {
      return this.c;
   }
}
