import com.google.common.base.MoreObjects;
import java.util.List;

public class fhl {
   public static final int a = -1;
   private final List<fhj> b;
   private final int c;

   public fhl(List<fhj> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fhj a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fhj)MoreObjects.firstNonNull(this.b.get($$0), fhh.a) : fhh.a;
   }

   public int a() {
      return this.c;
   }
}
