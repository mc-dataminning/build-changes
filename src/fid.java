import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fid {
   private final List<xj> a = Lists.newArrayList();

   public void a(xj $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xj a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xj.a(this.a);
      }
   }

   public xj b() {
      xj $$0 = this.a();
      return $$0 != null ? $$0 : xj.b;
   }

   public void c() {
      this.a.clear();
   }
}
