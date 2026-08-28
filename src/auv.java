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

public class auv {
   private final Set<auy> a;
   private Map<String, aus> b = ImmutableMap.of();
   private List<aus> c = ImmutableList.of();

   public auv(auy... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public static String a(Collection<aus> $$0) {
      return $$0.stream().map($$0x -> $$0x.g() + ($$0x.d().a() ? "" : " (incompatible)")).collect(Collectors.joining(", "));
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(aus::g).collect(ImmutableList.toImmutableList());
      this.b = this.i();
      this.c = this.c($$0);
   }

   private Map<String, aus> i() {
      Map<String, aus> $$0 = Maps.newTreeMap();

      for (auy $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.g(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public boolean b() {
      List<aus> $$0 = this.c(List.of());
      return !this.c.equals($$0);
   }

   public void b(Collection<String> $$0) {
      this.c = this.c($$0);
   }

   public boolean a(String $$0) {
      aus $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<aus> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      aus $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<aus> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<aus> c(Collection<String> $$0) {
      List<aus> $$1 = this.d($$0).collect(ae.b());

      for (aus $$2 : this.b.values()) {
         if ($$2.i() && !$$1.contains($$2)) {
            $$2.k().a($$1, $$2, aus::h, false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<aus> d(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> c() {
      return this.b.keySet();
   }

   public Collection<aus> d() {
      return this.b.values();
   }

   public Collection<String> e() {
      return this.c.stream().map(aus::g).collect(ImmutableSet.toImmutableSet());
   }

   public csk f() {
      return this.g().stream().map(aus::e).reduce(csk::c).orElse(csk.a());
   }

   public Collection<aus> g() {
      return this.c;
   }

   @Nullable
   public aus c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<atw> h() {
      return this.c.stream().map(aus::f).collect(ImmutableList.toImmutableList());
   }
}
