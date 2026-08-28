import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fqr {
   private final List<xf> a = Lists.newArrayList();

   public void a(xf $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xf a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xf.a(this.a);
      }
   }

   public xf b() {
      xf $$0 = this.a();
      return $$0 != null ? $$0 : xf.b;
   }

   public void c() {
      this.a.clear();
   }
}
