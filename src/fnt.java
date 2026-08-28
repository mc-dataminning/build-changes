import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fnt {
   private final List<xb> a = Lists.newArrayList();

   public void a(xb $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xb a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xb.a(this.a);
      }
   }

   public xb b() {
      xb $$0 = this.a();
      return $$0 != null ? $$0 : xb.b;
   }

   public void c() {
      this.a.clear();
   }
}
