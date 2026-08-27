import com.google.common.base.MoreObjects;
import java.util.List;

public class fkn {
   public static final int a = -1;
   private final List<fkl> b;
   private final int c;

   public fkn(List<fkl> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fkl a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fkl)MoreObjects.firstNonNull(this.b.get($$0), fkj.a) : fkj.a;
   }

   public int a() {
      return this.c;
   }
}
