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

public class asi implements asp {
   private final asp c;
   private final List<asp> d;

   public asi(asp $$0, List<asp> $$1) {
      this.c = $$0;
      List<asp> $$2 = new ArrayList<>($$1.size() + 1);
      $$2.addAll(Lists.reverse($$1));
      $$2.add($$0);
      this.d = List.copyOf($$2);
   }

   @Nullable
   @Override
   public atv<InputStream> a(String... $$0) {
      return this.c.a($$0);
   }

   @Nullable
   @Override
   public atv<InputStream> a(asr $$0, akt $$1) {
      for (asp $$2 : this.d) {
         atv<InputStream> $$3 = $$2.a($$0, $$1);
         if ($$3 != null) {
            return $$3;
         }
      }

      return null;
   }

   @Override
   public void a(asr $$0, String $$1, String $$2, asp.a $$3) {
      Map<akt, atv<InputStream>> $$4 = new HashMap<>();

      for (asp $$5 : this.d) {
         $$5.a($$0, $$1, $$2, $$4::putIfAbsent);
      }

      $$4.forEach($$3);
   }

   @Override
   public Set<String> a(asr $$0) {
      Set<String> $$1 = new HashSet<>();

      for (asp $$2 : this.d) {
         $$1.addAll($$2.a($$0));
      }

      return $$1;
   }

   @Nullable
   @Override
   public <T> T a(atc<T> $$0) throws IOException {
      return this.c.a($$0);
   }

   @Override
   public aso a() {
      return this.c.a();
   }

   @Override
   public void close() {
      this.d.forEach(asp::close);
   }
}
