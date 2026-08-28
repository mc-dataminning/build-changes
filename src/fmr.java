import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fmr {
   private final List<xa> a = Lists.newArrayList();

   public void a(xa $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xa a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xa.a(this.a);
      }
   }

   public xa b() {
      xa $$0 = this.a();
      return $$0 != null ? $$0 : xa.b;
   }

   public void c() {
      this.a.clear();
   }
}
