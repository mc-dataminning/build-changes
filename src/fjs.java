import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fjs {
   private final List<xo> a = Lists.newArrayList();

   public void a(xo $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xo a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xo.a(this.a);
      }
   }

   public xo b() {
      xo $$0 = this.a();
      return $$0 != null ? $$0 : xo.b;
   }

   public void c() {
      this.a.clear();
   }
}
