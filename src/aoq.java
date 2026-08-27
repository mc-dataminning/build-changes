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

public class aoq implements aov {
   private final aov c;
   private final List<aov> d;

   public aoq(aov $$0, List<aov> $$1) {
      this.c = $$0;
      List<aov> $$2 = new ArrayList<>($$1.size() + 1);
      $$2.addAll(Lists.reverse($$1));
      $$2.add($$0);
      this.d = List.copyOf($$2);
   }

   @Nullable
   @Override
   public apz<InputStream> a(String... $$0) {
      return this.c.a($$0);
   }

   @Nullable
   @Override
   public apz<InputStream> a(aow $$0, ahg $$1) {
      for (aov $$2 : this.d) {
         apz<InputStream> $$3 = $$2.a($$0, $$1);
         if ($$3 != null) {
            return $$3;
         }
      }

      return null;
   }

   @Override
   public void a(aow $$0, String $$1, String $$2, aov.a $$3) {
      Map<ahg, apz<InputStream>> $$4 = new HashMap<>();

      for (aov $$5 : this.d) {
         $$5.a($$0, $$1, $$2, $$4::putIfAbsent);
      }

      $$4.forEach($$3);
   }

   @Override
   public Set<String> a(aow $$0) {
      Set<String> $$1 = new HashSet<>();

      for (aov $$2 : this.d) {
         $$1.addAll($$2.a($$0));
      }

      return $$1;
   }

   @Nullable
   @Override
   public <T> T a(aph<T> $$0) throws IOException {
      return this.c.a($$0);
   }

   @Override
   public String a() {
      return this.c.a();
   }

   @Override
   public boolean b() {
      return this.c.b();
   }

   @Override
   public void close() {
      this.d.forEach(aov::close);
   }
}
