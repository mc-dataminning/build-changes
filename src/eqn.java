import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eqn {
   private final List<tr> a = Lists.newArrayList();

   public void a(tr $$0) {
      this.a.add($$0);
   }

   @Nullable
   public tr a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : tr.a(this.a);
      }
   }

   public tr b() {
      tr $$0 = this.a();
      return $$0 != null ? $$0 : tr.b;
   }

   public void c() {
      this.a.clear();
   }
}
