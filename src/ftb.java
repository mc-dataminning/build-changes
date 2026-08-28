import com.google.common.base.MoreObjects;
import java.util.List;

public class ftb {
   public static final int a = -1;
   private final List<fsz> b;
   private final int c;

   public ftb(List<fsz> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fsz a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fsz)MoreObjects.firstNonNull(this.b.get($$0), fsx.a) : fsx.a;
   }

   public int a() {
      return this.c;
   }
}
