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

public class apt {
   private final Set<apv> a;
   private Map<String, apq> b = ImmutableMap.of();
   private List<apq> c = ImmutableList.of();

   public apt(apv... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(apq::f).collect(ImmutableList.toImmutableList());
      this.b = this.h();
      this.c = this.b($$0);
   }

   private Map<String, apq> h() {
      Map<String, apq> $$0 = Maps.newTreeMap();

      for (apv $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.f(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public void a(Collection<String> $$0) {
      this.c = this.b($$0);
   }

   public boolean a(String $$0) {
      apq $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<apq> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      apq $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<apq> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<apq> b(Collection<String> $$0) {
      List<apq> $$1 = this.c($$0).collect(Collectors.toList());

      for (apq $$2 : this.b.values()) {
         if ($$2.g() && !$$1.contains($$2)) {
            $$2.i().a($$1, $$2, Functions.identity(), false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<apq> c(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> b() {
      return this.b.keySet();
   }

   public Collection<apq> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return this.c.stream().map(apq::f).collect(ImmutableSet.toImmutableSet());
   }

   public chs e() {
      return this.f().stream().map(apq::d).reduce(chs::b).orElse(chs.a());
   }

   public Collection<apq> f() {
      return this.c;
   }

   @Nullable
   public apq c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<aow> g() {
      return this.c.stream().map(apq::e).collect(ImmutableList.toImmutableList());
   }
}
