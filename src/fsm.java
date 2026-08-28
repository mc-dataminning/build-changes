import com.google.common.base.MoreObjects;
import java.util.List;

public class fsm {
   public static final int a = -1;
   private final List<fsk> b;
   private final int c;

   public fsm(List<fsk> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fsk a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fsk)MoreObjects.firstNonNull(this.b.get($$0), fsi.a) : fsi.a;
   }

   public int a() {
      return this.c;
   }
}
