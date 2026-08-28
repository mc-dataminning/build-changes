import com.google.common.base.MoreObjects;
import java.util.List;

public class fsj {
   public static final int a = -1;
   private final List<fsh> b;
   private final int c;

   public fsj(List<fsh> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fsh a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fsh)MoreObjects.firstNonNull(this.b.get($$0), fsf.a) : fsf.a;
   }

   public int a() {
      return this.c;
   }
}
