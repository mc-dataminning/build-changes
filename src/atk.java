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

public class atk implements atr {
   private final atr c;
   private final List<atr> d;

   public atk(atr $$0, List<atr> $$1) {
      this.c = $$0;
      List<atr> $$2 = new ArrayList<>($$1.size() + 1);
      $$2.addAll(Lists.reverse($$1));
      $$2.add($$0);
      this.d = List.copyOf($$2);
   }

   @Nullable
   @Override
   public auw<InputStream> a(String... $$0) {
      return this.c.a($$0);
   }

   @Nullable
   @Override
   public auw<InputStream> a(att $$0, ali $$1) {
      for (atr $$2 : this.d) {
         auw<InputStream> $$3 = $$2.a($$0, $$1);
         if ($$3 != null) {
            return $$3;
         }
      }

      return null;
   }

   @Override
   public void a(att $$0, String $$1, String $$2, atr.a $$3) {
      Map<ali, auw<InputStream>> $$4 = new HashMap<>();

      for (atr $$5 : this.d) {
         $$5.a($$0, $$1, $$2, $$4::putIfAbsent);
      }

      $$4.forEach($$3);
   }

   @Override
   public Set<String> a(att $$0) {
      Set<String> $$1 = new HashSet<>();

      for (atr $$2 : this.d) {
         $$1.addAll($$2.a($$0));
      }

      return $$1;
   }

   @Nullable
   @Override
   public <T> T a(aue<T> $$0) throws IOException {
      return this.c.a($$0);
   }

   @Override
   public atq a() {
      return this.c.a();
   }

   @Override
   public void close() {
      this.d.forEach(atr::close);
   }
}
