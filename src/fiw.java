import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fiw {
   private final List<xn> a = Lists.newArrayList();

   public void a(xn $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xn a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xn.a(this.a);
      }
   }

   public xn b() {
      xn $$0 = this.a();
      return $$0 != null ? $$0 : xn.b;
   }

   public void c() {
      this.a.clear();
   }
}
