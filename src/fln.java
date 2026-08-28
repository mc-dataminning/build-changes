import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fln {
   private final List<ya> a = Lists.newArrayList();

   public void a(ya $$0) {
      this.a.add($$0);
   }

   @Nullable
   public ya a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : ya.a(this.a);
      }
   }

   public ya b() {
      ya $$0 = this.a();
      return $$0 != null ? $$0 : ya.b;
   }

   public void c() {
      this.a.clear();
   }
}
