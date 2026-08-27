import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class evh {
   private final List<vl> a = Lists.newArrayList();

   public void a(vl $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vl a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : vl.a(this.a);
      }
   }

   public vl b() {
      vl $$0 = this.a();
      return $$0 != null ? $$0 : vl.b;
   }

   public void c() {
      this.a.clear();
   }
}
