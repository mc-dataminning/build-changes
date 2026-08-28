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

public class aue {
   private final Set<aug> a;
   private Map<String, aub> b = ImmutableMap.of();
   private List<aub> c = ImmutableList.of();

   public aue(aug... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public static String a(Collection<aub> $$0) {
      return $$0.stream().map($$0x -> $$0x.g() + ($$0x.d().a() ? "" : " (incompatible)")).collect(Collectors.joining(", "));
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(aub::g).collect(ImmutableList.toImmutableList());
      this.b = this.h();
      this.c = this.c($$0);
   }

   private Map<String, aub> h() {
      Map<String, aub> $$0 = Maps.newTreeMap();

      for (aug $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.g(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public void b(Collection<String> $$0) {
      this.c = this.c($$0);
   }

   public boolean a(String $$0) {
      aub $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<aub> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      aub $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<aub> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<aub> c(Collection<String> $$0) {
      List<aub> $$1 = this.d($$0).collect(ad.b());

      for (aub $$2 : this.b.values()) {
         if ($$2.i() && !$$1.contains($$2)) {
            $$2.k().a($$1, $$2, aub::h, false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<aub> d(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> b() {
      return this.b.keySet();
   }

   public Collection<aub> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return this.c.stream().map(aub::g).collect(ImmutableSet.toImmutableSet());
   }

   public cqn e() {
      return this.f().stream().map(aub::e).reduce(cqn::c).orElse(cqn.a());
   }

   public Collection<aub> f() {
      return this.c;
   }

   @Nullable
   public aub c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<atf> g() {
      return this.c.stream().map(aub::f).collect(ImmutableList.toImmutableList());
   }
}
