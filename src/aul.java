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

public class aul {
   private final Set<aun> a;
   private Map<String, aui> b = ImmutableMap.of();
   private List<aui> c = ImmutableList.of();

   public aul(aun... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public static String a(Collection<aui> $$0) {
      return $$0.stream().map($$0x -> $$0x.g() + ($$0x.d().a() ? "" : " (incompatible)")).collect(Collectors.joining(", "));
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(aui::g).collect(ImmutableList.toImmutableList());
      this.b = this.i();
      this.c = this.c($$0);
   }

   private Map<String, aui> i() {
      Map<String, aui> $$0 = Maps.newTreeMap();

      for (aun $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.g(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public boolean b() {
      List<aui> $$0 = this.c(List.of());
      return !this.c.equals($$0);
   }

   public void b(Collection<String> $$0) {
      this.c = this.c($$0);
   }

   public boolean a(String $$0) {
      aui $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<aui> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      aui $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<aui> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<aui> c(Collection<String> $$0) {
      List<aui> $$1 = this.d($$0).collect(af.b());

      for (aui $$2 : this.b.values()) {
         if ($$2.i() && !$$1.contains($$2)) {
            $$2.k().a($$1, $$2, aui::h, false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<aui> d(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> c() {
      return this.b.keySet();
   }

   public Collection<aui> d() {
      return this.b.values();
   }

   public Collection<String> e() {
      return this.c.stream().map(aui::g).collect(ImmutableSet.toImmutableSet());
   }

   public cub f() {
      return this.g().stream().map(aui::e).reduce(cub::c).orElse(cub.a());
   }

   public Collection<aui> g() {
      return this.c;
   }

   @Nullable
   public aui c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<atn> h() {
      return this.c.stream().map(aui::f).collect(ImmutableList.toImmutableList());
   }
}
