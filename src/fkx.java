import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fkx {
   private final List<wu> a = Lists.newArrayList();

   public void a(wu $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wu a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : wu.a(this.a);
      }
   }

   public wu b() {
      wu $$0 = this.a();
      return $$0 != null ? $$0 : wu.b;
   }

   public void c() {
      this.a.clear();
   }
}
