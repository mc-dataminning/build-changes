import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fhp {
   private final List<xi> a = Lists.newArrayList();

   public void a(xi $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xi a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xi.a(this.a);
      }
   }

   public xi b() {
      xi $$0 = this.a();
      return $$0 != null ? $$0 : xi.b;
   }

   public void c() {
      this.a.clear();
   }
}
