import com.google.common.base.MoreObjects;
import java.util.List;

public class fic {
   public static final int a = -1;
   private final List<fia> b;
   private final int c;

   public fic(List<fia> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fia a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (fia)MoreObjects.firstNonNull(this.b.get($$0), fhy.a) : fhy.a;
   }

   public int a() {
      return this.c;
   }
}
