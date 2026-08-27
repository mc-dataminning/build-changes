import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bpl {
   private final ij<bpk> a;
   private final Map<bpn.a, Set<bpn>> b = Maps.newEnumMap(bpn.a.class);
   private final Map<UUID, bpn> c = new Object2ObjectArrayMap();
   private final Set<bpn> d = new ObjectArraySet();
   private double e;
   private boolean f = true;
   private double g;
   private final Consumer<bpl> h;

   public bpl(ij<bpk> $$0, Consumer<bpl> $$1) {
      this.a = $$0;
      this.h = $$1;
      this.e = $$0.a().a();
   }

   public ij<bpk> a() {
      return this.a;
   }

   public double b() {
      return this.e;
   }

   public void a(double $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.d();
      }
   }

   public Set<bpn> a(bpn.a $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
   }

   public Set<bpn> c() {
      return ImmutableSet.copyOf(this.c.values());
   }

   @Nullable
   public bpn a(UUID $$0) {
      return this.c.get($$0);
   }

   public boolean a(bpn $$0) {
      return this.c.get($$0.a()) != null;
   }

   private void f(bpn $$0) {
      bpn $$1 = this.c.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.b()).add($$0);
         this.d();
      }
   }

   public void b(bpn $$0) {
      bpn $$1 = this.c.putIfAbsent($$0.a(), $$0);
      if ($$0 != $$1) {
         Set<bpn> $$2 = this.a($$0.b());
         if ($$1 != null) {
            $$2.remove($$1);
         }

         $$2.add($$0);
         this.d();
      }
   }

   public void c(bpn $$0) {
      this.f($$0);
   }

   public void d(bpn $$0) {
      this.f($$0);
      this.d.add($$0);
   }

   protected void d() {
      this.f = true;
      this.h.accept(this);
   }

   public void e(bpn $$0) {
      this.a($$0.b()).remove($$0);
      this.c.remove($$0.a());
      this.d.remove($$0);
      this.d();
   }

   public void b(UUID $$0) {
      bpn $$1 = this.a($$0);
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public boolean c(UUID $$0) {
      bpn $$1 = this.a($$0);
      if ($$1 != null && this.d.contains($$1)) {
         this.e($$1);
         return true;
      } else {
         return false;
      }
   }

   public void e() {
      for (bpn $$0 : this.c()) {
         this.e($$0);
      }
   }

   public double f() {
      if (this.f) {
         this.g = this.h();
         this.f = false;
      }

      return this.g;
   }

   private double h() {
      double $$0 = this.b();

      for (bpn $$1 : this.b(bpn.a.a)) {
         $$0 += $$1.c();
      }

      double $$2 = $$0;

      for (bpn $$3 : this.b(bpn.a.b)) {
         $$2 += $$0 * $$3.c();
      }

      for (bpn $$4 : this.b(bpn.a.c)) {
         $$2 *= 1.0 + $$4.c();
      }

      return this.a.a().a($$2);
   }

   private Collection<bpn> b(bpn.a $$0) {
      return this.b.getOrDefault($$0, Collections.emptySet());
   }

   public void a(bpl $$0) {
      this.e = $$0.e;
      this.c.clear();
      this.c.putAll($$0.c);
      this.d.clear();
      this.d.addAll($$0.d);
      this.b.clear();
      $$0.b.forEach(($$0x, $$1) -> this.a($$0x).addAll($$1));
      this.d();
   }

   public sw g() {
      sw $$0 = new sw();
      aix<bpk> $$1 = this.a.e().orElseThrow(() -> new IllegalStateException("Tried to serialize unregistered attribute"));
      $$0.a("Name", $$1.a().toString());
      $$0.a("Base", this.e);
      if (!this.d.isEmpty()) {
         tc $$2 = new tc();

         for (bpn $$3 : this.d) {
            $$2.add($$3.d());
         }

         $$0.a("Modifiers", $$2);
      }

      return $$0;
   }

   public void a(sw $$0) {
      this.e = $$0.k("Base");
      if ($$0.b("Modifiers", 9)) {
         tc $$1 = $$0.c("Modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            bpn $$3 = bpn.a($$1.a($$2));
            if ($$3 != null) {
               this.c.put($$3.a(), $$3);
               this.a($$3.b()).add($$3);
               this.d.add($$3);
            }
         }
      }

      this.d();
   }
}
