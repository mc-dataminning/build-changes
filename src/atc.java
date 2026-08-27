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

public class atc {
   private final Set<ate> a;
   private Map<String, asz> b = ImmutableMap.of();
   private List<asz> c = ImmutableList.of();

   public atc(ate... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(asz::g).collect(ImmutableList.toImmutableList());
      this.b = this.h();
      this.c = this.b($$0);
   }

   private Map<String, asz> h() {
      Map<String, asz> $$0 = Maps.newTreeMap();

      for (ate $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.g(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public void a(Collection<String> $$0) {
      this.c = this.b($$0);
   }

   public boolean a(String $$0) {
      asz $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<asz> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      asz $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<asz> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<asz> b(Collection<String> $$0) {
      List<asz> $$1 = this.c($$0).collect(Collectors.toList());

      for (asz $$2 : this.b.values()) {
         if ($$2.i() && !$$1.contains($$2)) {
            $$2.k().a($$1, $$2, asz::h, false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<asz> c(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> b() {
      return this.b.keySet();
   }

   public Collection<asz> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return this.c.stream().map(asz::g).collect(ImmutableSet.toImmutableSet());
   }

   public cnu e() {
      return this.f().stream().map(asz::e).reduce(cnu::b).orElse(cnu.a());
   }

   public Collection<asz> f() {
      return this.c;
   }

   @Nullable
   public asz c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<asd> g() {
      return this.c.stream().map(asz::f).collect(ImmutableList.toImmutableList());
   }
}
