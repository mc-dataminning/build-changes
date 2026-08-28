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

public class asy implements atf {
   private final atf c;
   private final List<atf> d;

   public asy(atf $$0, List<atf> $$1) {
      this.c = $$0;
      List<atf> $$2 = new ArrayList<>($$1.size() + 1);
      $$2.addAll(Lists.reverse($$1));
      $$2.add($$0);
      this.d = List.copyOf($$2);
   }

   @Nullable
   @Override
   public aul<InputStream> a(String... $$0) {
      return this.c.a($$0);
   }

   @Nullable
   @Override
   public aul<InputStream> a(ath $$0, alc $$1) {
      for (atf $$2 : this.d) {
         aul<InputStream> $$3 = $$2.a($$0, $$1);
         if ($$3 != null) {
            return $$3;
         }
      }

      return null;
   }

   @Override
   public void a(ath $$0, String $$1, String $$2, atf.a $$3) {
      Map<alc, aul<InputStream>> $$4 = new HashMap<>();

      for (atf $$5 : this.d) {
         $$5.a($$0, $$1, $$2, $$4::putIfAbsent);
      }

      $$4.forEach($$3);
   }

   @Override
   public Set<String> a(ath $$0) {
      Set<String> $$1 = new HashSet<>();

      for (atf $$2 : this.d) {
         $$1.addAll($$2.a($$0));
      }

      return $$1;
   }

   @Nullable
   @Override
   public <T> T a(ats<T> $$0) throws IOException {
      return this.c.a($$0);
   }

   @Override
   public ate a() {
      return this.c.a();
   }

   @Override
   public void close() {
      this.d.forEach(atf::close);
   }
}
