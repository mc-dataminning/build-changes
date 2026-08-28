import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fgb {
   private final List<xe> a = Lists.newArrayList();

   public void a(xe $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xe a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xe.a(this.a);
      }
   }

   public xe b() {
      xe $$0 = this.a();
      return $$0 != null ? $$0 : xe.b;
   }

   public void c() {
      this.a.clear();
   }
}
