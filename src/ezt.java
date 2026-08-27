import com.google.common.base.MoreObjects;
import java.util.List;

public class ezt {
   public static final int a = -1;
   private final List<ezr> b;
   private final int c;

   public ezt(List<ezr> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ezr a(int $$0) {
      return $$0 >= 0 && $$0 < this.b.size() ? (ezr)MoreObjects.firstNonNull(this.b.get($$0), ezp.a) : ezp.a;
   }

   public int a() {
      return this.c;
   }
}
