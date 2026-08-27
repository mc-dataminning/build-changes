import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fbf {
   private final List<wl> a = Lists.newArrayList();

   public void a(wl $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wl a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : wl.a(this.a);
      }
   }

   public wl b() {
      wl $$0 = this.a();
      return $$0 != null ? $$0 : wl.b;
   }

   public void c() {
      this.a.clear();
   }
}
