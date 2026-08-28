import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fph {
   private final List<xd> a = Lists.newArrayList();

   public void a(xd $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xd a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xd.a(this.a);
      }
   }

   public xd b() {
      xd $$0 = this.a();
      return $$0 != null ? $$0 : xd.b;
   }

   public void c() {
      this.a.clear();
   }
}
