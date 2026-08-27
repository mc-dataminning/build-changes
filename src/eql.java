import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eql {
   private final List<tq> a = Lists.newArrayList();

   public void a(tq $$0) {
      this.a.add($$0);
   }

   @Nullable
   public tq a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : tq.a(this.a);
      }
   }

   public tq b() {
      tq $$0 = this.a();
      return $$0 != null ? $$0 : tq.b;
   }

   public void c() {
      this.a.clear();
   }
}
