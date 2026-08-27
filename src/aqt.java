import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class aqt implements ara {
   private final ara c;
   private final List<ara> d;

   public aqt(ara $$0, List<ara> $$1) {
      this.c = $$0;
      List<ara> $$2 = new ArrayList<>($$1.size() + 1);
      $$2.addAll(Lists.reverse($$1));
      $$2.add($$0);
      this.d = List.copyOf($$2);
   }

   @Nullable
   @Override
   public asg<InputStream> a(String... $$0) {
      return this.c.a($$0);
   }

   @Nullable
   @Override
   public asg<InputStream> a(arc $$0, ajh $$1) {
      for (ara $$2 : this.d) {
         asg<InputStream> $$3 = $$2.a($$0, $$1);
         if ($$3 != null) {
            return $$3;
         }
      }

      return null;
   }

   @Override
   public void a(arc $$0, String $$1, String $$2, ara.a $$3) {
      Map<ajh, asg<InputStream>> $$4 = new HashMap<>();

      for (ara $$5 : this.d) {
         $$5.a($$0, $$1, $$2, $$4::putIfAbsent);
      }

      $$4.forEach($$3);
   }

   @Override
   public Set<String> a(arc $$0) {
      Set<String> $$1 = new HashSet<>();

      for (ara $$2 : this.d) {
         $$1.addAll($$2.a($$0));
      }

      return $$1;
   }

   @Nullable
   @Override
   public <T> T a(arn<T> $$0) throws IOException {
      return this.c.a($$0);
   }

   @Override
   public aqz a() {
      return this.c.a();
   }

   @Override
   public void close() {
      this.d.forEach(ara::close);
   }
}
