import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fdp {
   private final List<xc> a = Lists.newArrayList();

   public void a(xc $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xc a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : xc.a(this.a);
      }
   }

   public xc b() {
      xc $$0 = this.a();
      return $$0 != null ? $$0 : xc.b;
   }

   public void c() {
      this.a.clear();
   }
}
