import com.google.common.base.MoreObjects;
import java.util.List;

public class ffq {
   public static final int a = -1;
   private final List<ffo> b;
   private final int c;

   public ffq(List<ffo> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ffo a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (ffo)MoreObjects.firstNonNull(this.b.get($$0), ffm.a) : ffm.a;
   }

   public int a() {
      return this.c;
   }
}
