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

public class atf implements atm {
   private final atm c;
   private final List<atm> d;

   public atf(atm $$0, List<atm> $$1) {
      this.c = $$0;
      List<atm> $$2 = new ArrayList<>($$1.size() + 1);
      $$2.addAll(Lists.reverse($$1));
      $$2.add($$0);
      this.d = List.copyOf($$2);
   }

   @Nullable
   @Override
   public aus<InputStream> a(String... $$0) {
      return this.c.a($$0);
   }

   @Nullable
   @Override
   public aus<InputStream> a(ato $$0, ali $$1) {
      for (atm $$2 : this.d) {
         aus<InputStream> $$3 = $$2.a($$0, $$1);
         if ($$3 != null) {
            return $$3;
         }
      }

      return null;
   }

   @Override
   public void a(ato $$0, String $$1, String $$2, atm.a $$3) {
      Map<ali, aus<InputStream>> $$4 = new HashMap<>();

      for (atm $$5 : this.d) {
         $$5.a($$0, $$1, $$2, $$4::putIfAbsent);
      }

      $$4.forEach($$3);
   }

   @Override
   public Set<String> a(ato $$0) {
      Set<String> $$1 = new HashSet<>();

      for (atm $$2 : this.d) {
         $$1.addAll($$2.a($$0));
      }

      return $$1;
   }

   @Nullable
   @Override
   public <T> T a(atz<T> $$0) throws IOException {
      return this.c.a($$0);
   }

   @Override
   public atl a() {
      return this.c.a();
   }

   @Override
   public void close() {
      this.d.forEach(atm::close);
   }
}
