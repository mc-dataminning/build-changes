import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eqd {
   private final List<ti> a = Lists.newArrayList();

   public void a(ti $$0) {
      this.a.add($$0);
   }

   @Nullable
   public ti a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : ti.a(this.a);
      }
   }

   public ti b() {
      ti $$0 = this.a();
      return $$0 != null ? $$0 : ti.b;
   }

   public void c() {
      this.a.clear();
   }
}
