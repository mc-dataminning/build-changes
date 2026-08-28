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

public class auz {
   private final Set<avb> a;
   private Map<String, auv> b = ImmutableMap.of();
   private List<auv> c = ImmutableList.of();

   public auz(avb... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public static String a(Collection<auv> $$0) {
      return $$0.stream().map($$0x -> $$0x.g() + ($$0x.d().a() ? "" : " (incompatible)")).collect(Collectors.joining(", "));
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(auv::g).collect(ImmutableList.toImmutableList());
      this.b = this.i();
      this.c = this.c($$0);
   }

   private Map<String, auv> i() {
      Map<String, auv> $$0 = Maps.newTreeMap();

      for (avb $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.g(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public boolean b() {
      List<auv> $$0 = this.c(List.of());
      return !this.c.equals($$0);
   }

   public void b(Collection<String> $$0) {
      this.c = this.c($$0);
   }

   public boolean a(String $$0) {
      auv $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<auv> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      auv $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<auv> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<auv> c(Collection<String> $$0) {
      List<auv> $$1 = this.d($$0).collect(ag.b());

      for (auv $$2 : this.b.values()) {
         if ($$2.i() && !$$1.contains($$2)) {
            $$2.k().a($$1, $$2, auv::h, false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<auv> d(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> c() {
      return this.b.keySet();
   }

   public Collection<auv> d() {
      return this.b.values();
   }

   public Collection<String> e() {
      return this.c.stream().map(auv::g).collect(ImmutableSet.toImmutableSet());
   }

   public cvs f() {
      return this.g().stream().map(auv::e).reduce(cvs::c).orElse(cvs.a());
   }

   public Collection<auv> g() {
      return this.c;
   }

   @Nullable
   public auv c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<aua> h() {
      return this.c.stream().map(auv::f).collect(ImmutableList.toImmutableList());
   }
}
