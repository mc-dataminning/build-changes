import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ffd {
   private final List<wz> a = Lists.newArrayList();

   public void a(wz $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wz a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : wz.a(this.a);
      }
   }

   public wz b() {
      wz $$0 = this.a();
      return $$0 != null ? $$0 : wz.b;
   }

   public void c() {
      this.a.clear();
   }
}
