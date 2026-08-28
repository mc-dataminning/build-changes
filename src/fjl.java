import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fjl {
   private final List<xq> a = Lists.newArrayList();

   public void a(xq $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xq a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xq.a(this.a);
      }
   }

   public xq b() {
      xq $$0 = this.a();
      return $$0 != null ? $$0 : xq.b;
   }

   public void c() {
      this.a.clear();
   }
}
