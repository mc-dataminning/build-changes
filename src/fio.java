import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fio {
   private final List<xm> a = Lists.newArrayList();

   public void a(xm $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xm a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xm.a(this.a);
      }
   }

   public xm b() {
      xm $$0 = this.a();
      return $$0 != null ? $$0 : xm.b;
   }

   public void c() {
      this.a.clear();
   }
}
