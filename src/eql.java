import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eql {
   private final List<tp> a = Lists.newArrayList();

   public void a(tp $$0) {
      this.a.add($$0);
   }

   @Nullable
   public tp a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : tp.a(this.a);
      }
   }

   public tp b() {
      tp $$0 = this.a();
      return $$0 != null ? $$0 : tp.b;
   }

   public void c() {
      this.a.clear();
   }
}
