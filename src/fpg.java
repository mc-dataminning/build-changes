import com.google.common.base.MoreObjects;
import java.util.List;

public class fpg {
   public static final int a = -1;
   private final List<fpe> b;
   private final int c;

   public fpg(List<fpe> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fpe a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fpe)MoreObjects.firstNonNull(this.b.get($$0), fpc.a) : fpc.a;
   }

   public int a() {
      return this.c;
   }
}
