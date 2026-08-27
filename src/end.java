import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class end {
   private final List<ta> a = Lists.newArrayList();

   public void a(ta $$0) {
      this.a.add($$0);
   }

   @Nullable
   public ta a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : ta.a(this.a);
      }
   }

   public ta b() {
      ta $$0 = this.a();
      return $$0 != null ? $$0 : ta.b;
   }

   public void c() {
      this.a.clear();
   }
}
