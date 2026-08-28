import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fkx {
   private final List<wt> a = Lists.newArrayList();

   public void a(wt $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wt a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : wt.a(this.a);
      }
   }

   public wt b() {
      wt $$0 = this.a();
      return $$0 != null ? $$0 : wt.b;
   }

   public void c() {
      this.a.clear();
   }
}
