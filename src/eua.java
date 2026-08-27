import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eua {
   private final List<vg> a = Lists.newArrayList();

   public void a(vg $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vg a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : vg.a(this.a);
      }
   }

   public vg b() {
      vg $$0 = this.a();
      return $$0 != null ? $$0 : vg.b;
   }

   public void c() {
      this.a.clear();
   }
}
