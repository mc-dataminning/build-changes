import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fck {
   private final List<wx> a = Lists.newArrayList();

   public void a(wx $$0) {
      this.a.add($$0);
   }

   @Nullable
   public wx a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : wx.a(this.a);
      }
   }

   public wx b() {
      wx $$0 = this.a();
      return $$0 != null ? $$0 : wx.b;
   }

   public void c() {
      this.a.clear();
   }
}
