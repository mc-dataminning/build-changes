import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eqc {
   private final List<tj> a = Lists.newArrayList();

   public void a(tj $$0) {
      this.a.add($$0);
   }

   @Nullable
   public tj a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : tj.a(this.a);
      }
   }

   public tj b() {
      tj $$0 = this.a();
      return $$0 != null ? $$0 : tj.b;
   }

   public void c() {
      this.a.clear();
   }
}
