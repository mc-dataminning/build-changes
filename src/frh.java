import com.google.common.base.MoreObjects;
import java.util.List;

public class frh {
   public static final int a = -1;
   private final List<frf> b;
   private final int c;

   public frh(List<frf> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public frf a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (frf)MoreObjects.firstNonNull(this.b.get($$0), frd.a) : frd.a;
   }

   public int a() {
      return this.c;
   }
}
