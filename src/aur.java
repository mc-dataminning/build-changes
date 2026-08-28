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

public class aur {
   private final Set<aut> a;
   private Map<String, auo> b = ImmutableMap.of();
   private List<auo> c = ImmutableList.of();

   public aur(aut... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public static String a(Collection<auo> $$0) {
      return $$0.stream().map($$0x -> $$0x.g() + ($$0x.d().a() ? "" : " (incompatible)")).collect(Collectors.joining(", "));
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(auo::g).collect(ImmutableList.toImmutableList());
      this.b = this.i();
      this.c = this.c($$0);
   }

   private Map<String, auo> i() {
      Map<String, auo> $$0 = Maps.newTreeMap();

      for (aut $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.g(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public boolean b() {
      List<auo> $$0 = this.c(List.of());
      return !this.c.equals($$0);
   }

   public void b(Collection<String> $$0) {
      this.c = this.c($$0);
   }

   public boolean a(String $$0) {
      auo $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<auo> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      auo $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<auo> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<auo> c(Collection<String> $$0) {
      List<auo> $$1 = this.d($$0).collect(ag.b());

      for (auo $$2 : this.b.values()) {
         if ($$2.i() && !$$1.contains($$2)) {
            $$2.k().a($$1, $$2, auo::h, false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<auo> d(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> c() {
      return this.b.keySet();
   }

   public Collection<auo> d() {
      return this.b.values();
   }

   public Collection<String> e() {
      return this.c.stream().map(auo::g).collect(ImmutableSet.toImmutableSet());
   }

   public cvj f() {
      return this.g().stream().map(auo::e).reduce(cvj::c).orElse(cvj.a());
   }

   public Collection<auo> g() {
      return this.c;
   }

   @Nullable
   public auo c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<att> h() {
      return this.c.stream().map(auo::f).collect(ImmutableList.toImmutableList());
   }
}
