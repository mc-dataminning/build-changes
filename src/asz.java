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

public class asz {
   private final Set<atb> a;
   private Map<String, asw> b = ImmutableMap.of();
   private List<asw> c = ImmutableList.of();

   public asz(atb... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(asw::g).collect(ImmutableList.toImmutableList());
      this.b = this.h();
      this.c = this.b($$0);
   }

   private Map<String, asw> h() {
      Map<String, asw> $$0 = Maps.newTreeMap();

      for (atb $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.g(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public void a(Collection<String> $$0) {
      this.c = this.b($$0);
   }

   public boolean a(String $$0) {
      asw $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<asw> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      asw $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<asw> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<asw> b(Collection<String> $$0) {
      List<asw> $$1 = this.c($$0).collect(Collectors.toList());

      for (asw $$2 : this.b.values()) {
         if ($$2.i() && !$$1.contains($$2)) {
            $$2.k().a($$1, $$2, asw::h, false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<asw> c(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> b() {
      return this.b.keySet();
   }

   public Collection<asw> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return this.c.stream().map(asw::g).collect(ImmutableSet.toImmutableSet());
   }

   public cmy e() {
      return this.f().stream().map(asw::e).reduce(cmy::b).orElse(cmy.a());
   }

   public Collection<asw> f() {
      return this.c;
   }

   @Nullable
   public asw c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<asa> g() {
      return this.c.stream().map(asw::f).collect(ImmutableList.toImmutableList());
   }
}
