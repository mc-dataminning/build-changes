import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fqe {
   private final List<xl> a = Lists.newArrayList();

   public void a(xl $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xl a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xl.a(this.a);
      }
   }

   public xl b() {
      xl $$0 = this.a();
      return $$0 != null ? $$0 : xl.b;
   }

   public void c() {
      this.a.clear();
   }
}
