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

public class atf {
   private final Set<ath> a;
   private Map<String, atc> b = ImmutableMap.of();
   private List<atc> c = ImmutableList.of();

   public atf(ath... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public static String a(Collection<atc> $$0) {
      return $$0.stream().map($$0x -> $$0x.g() + ($$0x.d().a() ? "" : " (incompatible)")).collect(Collectors.joining(", "));
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(atc::g).collect(ImmutableList.toImmutableList());
      this.b = this.h();
      this.c = this.c($$0);
   }

   private Map<String, atc> h() {
      Map<String, atc> $$0 = Maps.newTreeMap();

      for (ath $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.g(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public void b(Collection<String> $$0) {
      this.c = this.c($$0);
   }

   public boolean a(String $$0) {
      atc $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<atc> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      atc $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<atc> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<atc> c(Collection<String> $$0) {
      List<atc> $$1 = this.d($$0).collect(ac.b());

      for (atc $$2 : this.b.values()) {
         if ($$2.i() && !$$1.contains($$2)) {
            $$2.k().a($$1, $$2, atc::h, false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<atc> d(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> b() {
      return this.b.keySet();
   }

   public Collection<atc> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return this.c.stream().map(atc::g).collect(ImmutableSet.toImmutableSet());
   }

   public cov e() {
      return this.f().stream().map(atc::e).reduce(cov::c).orElse(cov.a());
   }

   public Collection<atc> f() {
      return this.c;
   }

   @Nullable
   public atc c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<asg> g() {
      return this.c.stream().map(atc::f).collect(ImmutableList.toImmutableList());
   }
}
