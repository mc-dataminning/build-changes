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

public class asq implements asx {
   private final asx c;
   private final List<asx> d;

   public asq(asx $$0, List<asx> $$1) {
      this.c = $$0;
      List<asx> $$2 = new ArrayList<>($$1.size() + 1);
      $$2.addAll(Lists.reverse($$1));
      $$2.add($$0);
      this.d = List.copyOf($$2);
   }

   @Nullable
   @Override
   public aud<InputStream> a(String... $$0) {
      return this.c.a($$0);
   }

   @Nullable
   @Override
   public aud<InputStream> a(asz $$0, alb $$1) {
      for (asx $$2 : this.d) {
         aud<InputStream> $$3 = $$2.a($$0, $$1);
         if ($$3 != null) {
            return $$3;
         }
      }

      return null;
   }

   @Override
   public void a(asz $$0, String $$1, String $$2, asx.a $$3) {
      Map<alb, aud<InputStream>> $$4 = new HashMap<>();

      for (asx $$5 : this.d) {
         $$5.a($$0, $$1, $$2, $$4::putIfAbsent);
      }

      $$4.forEach($$3);
   }

   @Override
   public Set<String> a(asz $$0) {
      Set<String> $$1 = new HashSet<>();

      for (asx $$2 : this.d) {
         $$1.addAll($$2.a($$0));
      }

      return $$1;
   }

   @Nullable
   @Override
   public <T> T a(atk<T> $$0) throws IOException {
      return this.c.a($$0);
   }

   @Override
   public asw a() {
      return this.c.a();
   }

   @Override
   public void close() {
      this.d.forEach(asx::close);
   }
}
