import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eya {
   private final List<vx> a = Lists.newArrayList();

   public void a(vx $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vx a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : vx.a(this.a);
      }
   }

   public vx b() {
      vx $$0 = this.a();
      return $$0 != null ? $$0 : vx.b;
   }

   public void c() {
      this.a.clear();
   }
}
