import com.google.common.base.Functions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class aow {
   private final Set<aoy> a;
   private Map<String, aot> b = ImmutableMap.of();
   private List<aot> c = ImmutableList.of();

   public aow(aoy... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(aot::f).collect(ImmutableList.toImmutableList());
      this.b = this.h();
      this.c = this.b($$0);
   }

   private Map<String, aot> h() {
      Map<String, aot> $$0 = Maps.newTreeMap();

      for (aoy $$1 : this.a) {
         $$1.a($$1x -> $$0.put($$1x.f(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public void a(Collection<String> $$0) {
      this.c = this.b($$0);
   }

   public boolean a(String $$0) {
      aot $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<aot> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      aot $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<aot> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<aot> b(Collection<String> $$0) {
      List<aot> $$1 = this.c($$0).collect(Collectors.toList());

      for (aot $$2 : this.b.values()) {
         if ($$2.g() && !$$1.contains($$2)) {
            $$2.i().a($$1, $$2, Functions.identity(), false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<aot> c(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> b() {
      return this.b.keySet();
   }

   public Collection<aot> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return this.c.stream().map(aot::f).collect(ImmutableSet.toImmutableSet());
   }

   public cgi e() {
      return this.f().stream().map(aot::d).reduce(cgi::b).orElse(cgi.a());
   }

   public Collection<aot> f() {
      return this.c;
   }

   @Nullable
   public aot c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<anz> g() {
      return this.c.stream().map(aot::e).collect(ImmutableList.toImmutableList());
   }
}
