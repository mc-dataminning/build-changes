import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class esy {
   private final List<va> a = Lists.newArrayList();

   public void a(va $$0) {
      this.a.add($$0);
   }

   @Nullable
   public va a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : va.a(this.a);
      }
   }

   public va b() {
      va $$0 = this.a();
      return $$0 != null ? $$0 : va.b;
   }

   public void c() {
      this.a.clear();
   }
}
