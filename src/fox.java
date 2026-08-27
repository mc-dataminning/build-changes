import com.google.common.base.MoreObjects;
import java.util.List;

public class fox {
   public static final int a = -1;
   private final List<fov> b;
   private final int c;

   public fox(List<fov> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fov a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fov)MoreObjects.firstNonNull(this.b.get($$0), fot.a) : fot.a;
   }

   public int a() {
      return this.c;
   }
}
