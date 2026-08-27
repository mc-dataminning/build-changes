import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fbo {
   private final List<wn> a = Lists.newArrayList();

   public void a(wn $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wn a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : wn.a(this.a);
      }
   }

   public wn b() {
      wn $$0 = this.a();
      return $$0 != null ? $$0 : wn.b;
   }

   public void c() {
      this.a.clear();
   }
}
