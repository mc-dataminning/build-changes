import com.google.common.base.MoreObjects;
import java.util.List;

public class flq {
   public static final int a = -1;
   private final List<flo> b;
   private final int c;

   public flq(List<flo> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public flo a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (flo)MoreObjects.firstNonNull(this.b.get($$0), flm.a) : flm.a;
   }

   public int a() {
      return this.c;
   }
}
