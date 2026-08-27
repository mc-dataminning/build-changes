import com.google.common.base.MoreObjects;
import java.util.List;

public class fdh {
   public static final int a = -1;
   private final List<fdf> b;
   private final int c;

   public fdh(List<fdf> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fdf a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fdf)MoreObjects.firstNonNull(this.b.get($$0), fdd.a) : fdd.a;
   }

   public int a() {
      return this.c;
   }
}
