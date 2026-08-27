import com.google.common.base.MoreObjects;
import java.util.List;

public class fcy {
   public static final int a = -1;
   private final List<fcw> b;
   private final int c;

   public fcy(List<fcw> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fcw a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fcw)MoreObjects.firstNonNull(this.b.get($$0), fcu.a) : fcu.a;
   }

   public int a() {
      return this.c;
   }
}
