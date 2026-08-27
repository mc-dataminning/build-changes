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

public class ane {
   private final Set<ang> a;
   private Map<String, anb> b = ImmutableMap.of();
   private List<anb> c = ImmutableList.of();

   public ane(ang... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(anb::f).collect(ImmutableList.toImmutableList());
      this.b = this.h();
      this.c = this.b($$0);
   }

   private Map<String, anb> h() {
      Map<String, anb> $$0 = Maps.newTreeMap();

      for (ang $$1 : this.a) {
         $$1.a($$1x -> $$0.put($$1x.f(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public void a(Collection<String> $$0) {
      this.c = this.b($$0);
   }

   public boolean a(String $$0) {
      anb $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<anb> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      anb $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<anb> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<anb> b(Collection<String> $$0) {
      List<anb> $$1 = this.c($$0).collect(Collectors.toList());

      for (anb $$2 : this.b.values()) {
         if ($$2.g() && !$$1.contains($$2)) {
            $$2.i().a($$1, $$2, Functions.identity(), false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<anb> c(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> b() {
      return this.b.keySet();
   }

   public Collection<anb> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return this.c.stream().map(anb::f).collect(ImmutableSet.toImmutableSet());
   }

   public cec e() {
      return this.f().stream().map(anb::d).reduce(cec::b).orElse(cec.a());
   }

   public Collection<anb> f() {
      return this.c;
   }

   @Nullable
   public anb c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<amh> g() {
      return this.c.stream().map(anb::e).collect(ImmutableList.toImmutableList());
   }
}
