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

public class aug {
   private final Set<aui> a;
   private Map<String, aud> b = ImmutableMap.of();
   private List<aud> c = ImmutableList.of();

   public aug(aui... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public static String a(Collection<aud> $$0) {
      return $$0.stream().map($$0x -> $$0x.g() + ($$0x.d().a() ? "" : " (incompatible)")).collect(Collectors.joining(", "));
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(aud::g).collect(ImmutableList.toImmutableList());
      this.b = this.h();
      this.c = this.c($$0);
   }

   private Map<String, aud> h() {
      Map<String, aud> $$0 = Maps.newTreeMap();

      for (aui $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.g(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public void b(Collection<String> $$0) {
      this.c = this.c($$0);
   }

   public boolean a(String $$0) {
      aud $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<aud> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      aud $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<aud> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<aud> c(Collection<String> $$0) {
      List<aud> $$1 = this.d($$0).collect(ad.b());

      for (aud $$2 : this.b.values()) {
         if ($$2.i() && !$$1.contains($$2)) {
            $$2.k().a($$1, $$2, aud::h, false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<aud> d(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> b() {
      return this.b.keySet();
   }

   public Collection<aud> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return this.c.stream().map(aud::g).collect(ImmutableSet.toImmutableSet());
   }

   public cqq e() {
      return this.f().stream().map(aud::e).reduce(cqq::c).orElse(cqq.a());
   }

   public Collection<aud> f() {
      return this.c;
   }

   @Nullable
   public aud c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<ath> g() {
      return this.c.stream().map(aud::f).collect(ImmutableList.toImmutableList());
   }
}
