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

public class aun {
   private final Set<aup> a;
   private Map<String, auk> b = ImmutableMap.of();
   private List<auk> c = ImmutableList.of();

   public aun(aup... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public static String a(Collection<auk> $$0) {
      return $$0.stream().map($$0x -> $$0x.g() + ($$0x.d().a() ? "" : " (incompatible)")).collect(Collectors.joining(", "));
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(auk::g).collect(ImmutableList.toImmutableList());
      this.b = this.i();
      this.c = this.c($$0);
   }

   private Map<String, auk> i() {
      Map<String, auk> $$0 = Maps.newTreeMap();

      for (aup $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.g(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public boolean b() {
      List<auk> $$0 = this.c(List.of());
      return !this.c.equals($$0);
   }

   public void b(Collection<String> $$0) {
      this.c = this.c($$0);
   }

   public boolean a(String $$0) {
      auk $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<auk> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      auk $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<auk> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<auk> c(Collection<String> $$0) {
      List<auk> $$1 = this.d($$0).collect(af.b());

      for (auk $$2 : this.b.values()) {
         if ($$2.i() && !$$1.contains($$2)) {
            $$2.k().a($$1, $$2, auk::h, false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<auk> d(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> c() {
      return this.b.keySet();
   }

   public Collection<auk> d() {
      return this.b.values();
   }

   public Collection<String> e() {
      return this.c.stream().map(auk::g).collect(ImmutableSet.toImmutableSet());
   }

   public cum f() {
      return this.g().stream().map(auk::e).reduce(cum::c).orElse(cum.a());
   }

   public Collection<auk> g() {
      return this.c;
   }

   @Nullable
   public auk c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<atp> h() {
      return this.c.stream().map(auk::f).collect(ImmutableList.toImmutableList());
   }
}
