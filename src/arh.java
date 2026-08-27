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

public class arh implements aro {
   private final aro c;
   private final List<aro> d;

   public arh(aro $$0, List<aro> $$1) {
      this.c = $$0;
      List<aro> $$2 = new ArrayList<>($$1.size() + 1);
      $$2.addAll(Lists.reverse($$1));
      $$2.add($$0);
      this.d = List.copyOf($$2);
   }

   @Nullable
   @Override
   public asu<InputStream> a(String... $$0) {
      return this.c.a($$0);
   }

   @Nullable
   @Override
   public asu<InputStream> a(arq $$0, ajt $$1) {
      for (aro $$2 : this.d) {
         asu<InputStream> $$3 = $$2.a($$0, $$1);
         if ($$3 != null) {
            return $$3;
         }
      }

      return null;
   }

   @Override
   public void a(arq $$0, String $$1, String $$2, aro.a $$3) {
      Map<ajt, asu<InputStream>> $$4 = new HashMap<>();

      for (aro $$5 : this.d) {
         $$5.a($$0, $$1, $$2, $$4::putIfAbsent);
      }

      $$4.forEach($$3);
   }

   @Override
   public Set<String> a(arq $$0) {
      Set<String> $$1 = new HashSet<>();

      for (aro $$2 : this.d) {
         $$1.addAll($$2.a($$0));
      }

      return $$1;
   }

   @Nullable
   @Override
   public <T> T a(asb<T> $$0) throws IOException {
      return this.c.a($$0);
   }

   @Override
   public arn a() {
      return this.c.a();
   }

   @Override
   public void close() {
      this.d.forEach(aro::close);
   }
}
