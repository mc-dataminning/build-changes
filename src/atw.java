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
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class atw {
   private final Set<aty> a;
   private Map<String, att> b = ImmutableMap.of();
   private List<att> c = ImmutableList.of();

   public atw(aty... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(att::g).collect(ImmutableList.toImmutableList());
      this.b = this.h();
      this.c = this.b($$0);
   }

   private Map<String, att> h() {
      Map<String, att> $$0 = Maps.newTreeMap();

      for (aty $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.g(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public void a(Collection<String> $$0) {
      this.c = this.b($$0);
   }

   public boolean a(String $$0) {
      att $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<att> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      att $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<att> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<att> b(Collection<String> $$0) {
      List<att> $$1 = this.c($$0).collect(ac.b());

      for (att $$2 : this.b.values()) {
         if ($$2.i() && !$$1.contains($$2)) {
            $$2.k().a($$1, $$2, att::h, false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<att> c(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> b() {
      return this.b.keySet();
   }

   public Collection<att> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return this.c.stream().map(att::g).collect(ImmutableSet.toImmutableSet());
   }

   public cpg e() {
      return this.f().stream().map(att::e).reduce(cpg::b).orElse(cpg.a());
   }

   public Collection<att> f() {
      return this.c;
   }

   @Nullable
   public att c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<asx> g() {
      return this.c.stream().map(att::f).collect(ImmutableList.toImmutableList());
   }
}
