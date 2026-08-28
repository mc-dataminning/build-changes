import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fln {
   private final List<xp> a = Lists.newArrayList();

   public void a(xp $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xp a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xp.a(this.a);
      }
   }

   public xp b() {
      xp $$0 = this.a();
      return $$0 != null ? $$0 : xp.b;
   }

   public void c() {
      this.a.clear();
   }
}
