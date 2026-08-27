import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eux {
   private final List<vk> a = Lists.newArrayList();

   public void a(vk $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vk a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : vk.a(this.a);
      }
   }

   public vk b() {
      vk $$0 = this.a();
      return $$0 != null ? $$0 : vk.b;
   }

   public void c() {
      this.a.clear();
   }
}
