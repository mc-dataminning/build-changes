import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fet {
   private final List<xt> a = Lists.newArrayList();

   public void a(xt $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xt a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xt.a(this.a);
      }
   }

   public xt b() {
      xt $$0 = this.a();
      return $$0 != null ? $$0 : xt.b;
   }

   public void c() {
      this.a.clear();
   }
}
