import com.google.common.base.MoreObjects;
import java.util.List;

public class fsk {
   public static final int a = -1;
   private final List<fsi> b;
   private final int c;

   public fsk(List<fsi> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fsi a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fsi)MoreObjects.firstNonNull(this.b.get($$0), fsg.a) : fsg.a;
   }

   public int a() {
      return this.c;
   }
}
