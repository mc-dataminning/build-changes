import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fqt {
   private final List<xh> a = Lists.newArrayList();

   public void a(xh $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xh a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xh.a(this.a);
      }
   }

   public xh b() {
      xh $$0 = this.a();
      return $$0 != null ? $$0 : xh.b;
   }

   public void c() {
      this.a.clear();
   }
}
