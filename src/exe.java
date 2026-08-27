import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class exe {
   private final List<vv> a = Lists.newArrayList();

   public void a(vv $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vv a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : vv.a(this.a);
      }
   }

   public vv b() {
      vv $$0 = this.a();
      return $$0 != null ? $$0 : vv.b;
   }

   public void c() {
      this.a.clear();
   }
}
