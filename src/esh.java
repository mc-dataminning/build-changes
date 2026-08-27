import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class esh {
   private final List<uw> a = Lists.newArrayList();

   public void a(uw $$0) {
      this.a.add($$0);
   }

   @Nullable
   public uw a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : uw.a(this.a);
      }
   }

   public uw b() {
      uw $$0 = this.a();
      return $$0 != null ? $$0 : uw.b;
   }

   public void c() {
      this.a.clear();
   }
}
