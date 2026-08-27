import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ere {
   private final List<un> a = Lists.newArrayList();

   public void a(un $$0) {
      this.a.add($$0);
   }

   @Nullable
   public un a() {
      if (this.a.isEmpty()) {
         return null;
      } else {
         return this.a.size() == 1 ? this.a.get(0) : un.a(this.a);
      }
   }

   public un b() {
      un $$0 = this.a();
      return $$0 != null ? $$0 : un.b;
   }

   public void c() {
      this.a.clear();
   }
}
