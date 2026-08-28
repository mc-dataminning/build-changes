import com.google.common.base.MoreObjects;
import java.util.List;

public class ftv {
   public static final int a = -1;
   private final List<ftt> b;
   private final int c;

   public ftv(List<ftt> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ftt a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (ftt)MoreObjects.firstNonNull(this.b.get($$0), ftr.a) : ftr.a;
   }

   public int a() {
      return this.c;
   }
}
