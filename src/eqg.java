import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eqg {
   private final List<tm> a = Lists.newArrayList();

   public void a(tm $$0) {
      this.a.add($$0);
   }

   @Nullable
   public tm a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : tm.a(this.a);
      }
   }

   public tm b() {
      tm $$0 = this.a();
      return $$0 != null ? $$0 : tm.b;
   }

   public void c() {
      this.a.clear();
   }
}
