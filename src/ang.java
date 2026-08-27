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

public class ang {
   private final Set<ani> a;
   private Map<String, and> b = ImmutableMap.of();
   private List<and> c = ImmutableList.of();

   public ang(ani... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(and::f).collect(ImmutableList.toImmutableList());
      this.b = this.h();
      this.c = this.b($$0);
   }

   private Map<String, and> h() {
      Map<String, and> $$0 = Maps.newTreeMap();

      for (ani $$1 : this.a) {
         $$1.a($$1x -> $$0.put($$1x.f(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public void a(Collection<String> $$0) {
      this.c = this.b($$0);
   }

   public boolean a(String $$0) {
      and $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<and> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      and $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<and> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<and> b(Collection<String> $$0) {
      List<and> $$1 = this.c($$0).collect(Collectors.toList());

      for (and $$2 : this.b.values()) {
         if ($$2.g() && !$$1.contains($$2)) {
            $$2.i().a($$1, $$2, Functions.identity(), false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<and> c(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> b() {
      return this.b.keySet();
   }

   public Collection<and> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return this.c.stream().map(and::f).collect(ImmutableSet.toImmutableSet());
   }

   public cee e() {
      return this.f().stream().map(and::d).reduce(cee::b).orElse(cee.a());
   }

   public Collection<and> f() {
      return this.c;
   }

   @Nullable
   public and c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<amj> g() {
      return this.c.stream().map(and::e).collect(ImmutableList.toImmutableList());
   }
}
