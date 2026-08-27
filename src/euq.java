import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class euq {
   private final List<vi> a = Lists.newArrayList();

   public void a(vi $$0) {
      this.a.add($$0);
   }

   @Nullable
   public vi a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : vi.a(this.a);
      }
   }

   public vi b() {
      vi $$0 = this.a();
      return $$0 != null ? $$0 : vi.b;
   }

   public void c() {
      this.a.clear();
   }
}
