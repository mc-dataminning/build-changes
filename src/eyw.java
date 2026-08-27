import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eyw {
   private final List<vz> a = Lists.newArrayList();

   public void a(vz $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vz a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : vz.a(this.a);
      }
   }

   public vz b() {
      vz $$0 = this.a();
      return $$0 != null ? $$0 : vz.b;
   }

   public void c() {
      this.a.clear();
   }
}
