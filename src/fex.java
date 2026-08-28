import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fex {
   private final List<xu> a = Lists.newArrayList();

   public void a(xu $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xu a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xu.a(this.a);
      }
   }

   public xu b() {
      xu $$0 = this.a();
      return $$0 != null ? $$0 : xu.b;
   }

   public void c() {
      this.a.clear();
   }
}
