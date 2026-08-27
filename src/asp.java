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

public class asp {
   private final Set<asr> a;
   private Map<String, asm> b = ImmutableMap.of();
   private List<asm> c = ImmutableList.of();

   public asp(asr... $$0) {
      this.a = ImmutableSet.copyOf($$0);
   }

   public void a() {
      List<String> $$0 = this.c.stream().map(asm::g).collect(ImmutableList.toImmutableList());
      this.b = this.h();
      this.c = this.b($$0);
   }

   private Map<String, asm> h() {
      Map<String, asm> $$0 = Maps.newTreeMap();

      for (asr $$1 : this.a) {
         $$1.loadPacks($$1x -> $$0.put($$1x.g(), $$1x));
      }

      return ImmutableMap.copyOf($$0);
   }

   public void a(Collection<String> $$0) {
      this.c = this.b($$0);
   }

   public boolean a(String $$0) {
      asm $$1 = this.b.get($$0);
      if ($$1 != null && !this.c.contains($$1)) {
         List<asm> $$2 = Lists.newArrayList(this.c);
         $$2.add($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String $$0) {
      asm $$1 = this.b.get($$0);
      if ($$1 != null && this.c.contains($$1)) {
         List<asm> $$2 = Lists.newArrayList(this.c);
         $$2.remove($$1);
         this.c = $$2;
         return true;
      } else {
         return false;
      }
   }

   private List<asm> b(Collection<String> $$0) {
      List<asm> $$1 = this.c($$0).collect(Collectors.toList());

      for (asm $$2 : this.b.values()) {
         if ($$2.i() && !$$1.contains($$2)) {
            $$2.k().a($$1, $$2, asm::h, false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<asm> c(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> b() {
      return this.b.keySet();
   }

   public Collection<asm> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return this.c.stream().map(asm::g).collect(ImmutableSet.toImmutableSet());
   }

   public cmn e() {
      return this.f().stream().map(asm::e).reduce(cmn::b).orElse(cmn.a());
   }

   public Collection<asm> f() {
      return this.c;
   }

   @Nullable
   public asm c(String $$0) {
      return this.b.get($$0);
   }

   public boolean d(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<arq> g() {
      return this.c.stream().map(asm::f).collect(ImmutableList.toImmutableList());
   }
}
