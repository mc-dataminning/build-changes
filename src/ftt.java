import com.google.common.base.MoreObjects;
import java.util.List;

public class ftt {
   public static final int a = -1;
   private final List<ftr> b;
   private final int c;

   public ftt(List<ftr> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ftr a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (ftr)MoreObjects.firstNonNull(this.b.get($$0), ftp.a) : ftp.a;
   }

   public int a() {
      return this.c;
   }
}
