import com.google.common.base.MoreObjects;
import java.util.List;

public class ftp {
   public static final int a = -1;
   private final List<ftn> b;
   private final int c;

   public ftp(List<ftn> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ftn a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (ftn)MoreObjects.firstNonNull(this.b.get($$0), ftl.a) : ftl.a;
   }

   public int a() {
      return this.c;
   }
}
