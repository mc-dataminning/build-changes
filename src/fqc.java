import com.google.common.base.MoreObjects;
import java.util.List;

public class fqc {
   public static final int a = -1;
   private final List<fqa> b;
   private final int c;

   public fqc(List<fqa> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fqa a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fqa)MoreObjects.firstNonNull(this.b.get($$0), fpy.a) : fpy.a;
   }

   public int a() {
      return this.c;
   }
}
