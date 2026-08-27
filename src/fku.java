import com.google.common.base.MoreObjects;
import java.util.List;

public class fku {
   public static final int a = -1;
   private final List<fks> b;
   private final int c;

   public fku(List<fks> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fks a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fks)MoreObjects.firstNonNull(this.b.get($$0), fkq.a) : fkq.a;
   }

   public int a() {
      return this.c;
   }
}
