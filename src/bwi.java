import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bwi {
   private static final String b = "base";
   private static final String c = "modifiers";
   public static final String a = "id";
   private final jq<bwh> d;
   private final Map<bwk.a, Map<all, bwk>> e = Maps.newEnumMap(bwk.a.class);
   private final Map<all, bwk> f = new Object2ObjectArrayMap();
   private final Map<all, bwk> g = new Object2ObjectArrayMap();
   private double h;
   private boolean i = true;
   private double j;
   private final Consumer<bwi> k;

   public bwi(jq<bwh> $$0, Consumer<bwi> $$1) {
      this.d = $$0;
      this.k = $$1;
      this.h = $$0.a().a();
   }

   public jq<bwh> a() {
      return this.d;
   }

   public double b() {
      return this.h;
   }

   public void a(double $$0) {
      if ($$0 != this.h) {
         this.h = $$0;
         this.e();
      }
   }

   @VisibleForTesting
   Map<all, bwk> a(bwk.a $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<bwk> c() {
      return ImmutableSet.copyOf(this.f.values());
   }

   public Set<bwk> d() {
      return ImmutableSet.copyOf(this.g.values());
   }

   @Nullable
   public bwk a(all $$0) {
      return this.f.get($$0);
   }

   public boolean b(all $$0) {
      return this.f.get($$0) != null;
   }

   private void f(bwk $$0) {
      bwk $$1 = this.f.putIfAbsent($$0.b(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.d()).put($$0.b(), $$0);
         this.e();
      }
   }

   public void a(bwk $$0) {
      bwk $$1 = this.f.put($$0.b(), $$0);
      if ($$0 != $$1) {
         this.a($$0.d()).put($$0.b(), $$0);
         this.e();
      }
   }

   public void b(bwk $$0) {
      this.f($$0);
   }

   public void c(bwk $$0) {
      this.c($$0.b());
      this.f($$0);
      this.g.put($$0.b(), $$0);
   }

   public void d(bwk $$0) {
      this.f($$0);
      this.g.put($$0.b(), $$0);
   }

   public void a(Collection<bwk> $$0) {
      for (bwk $$1 : $$0) {
         this.d($$1);
      }
   }

   protected void e() {
      this.i = true;
      this.k.accept(this);
   }

   public void e(bwk $$0) {
      this.c($$0.b());
   }

   public boolean c(all $$0) {
      bwk $$1 = this.f.remove($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1.d()).remove($$0);
         this.g.remove($$0);
         this.e();
         return true;
      }
   }

   public void f() {
      for (bwk $$0 : this.c()) {
         this.e($$0);
      }
   }

   public double g() {
      if (this.i) {
         this.j = this.i();
         this.i = false;
      }

      return this.j;
   }

   private double i() {
      double $$0 = this.b();

      for (bwk $$1 : this.b(bwk.a.a)) {
         $$0 += $$1.c();
      }

      double $$2 = $$0;

      for (bwk $$3 : this.b(bwk.a.b)) {
         $$2 += $$0 * $$3.c();
      }

      for (bwk $$4 : this.b(bwk.a.c)) {
         $$2 *= 1.0 + $$4.c();
      }

      return this.d.a().a($$2);
   }

   private Collection<bwk> b(bwk.a $$0) {
      return this.e.getOrDefault($$0, Map.of()).values();
   }

   public void a(bwi $$0) {
      this.h = $$0.h;
      this.f.clear();
      this.f.putAll($$0.f);
      this.g.clear();
      this.g.putAll($$0.g);
      this.e.clear();
      $$0.e.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends all, ? extends bwk>)$$1));
      this.e();
   }

   public un h() {
      un $$0 = new un();
      alk<bwh> $$1 = this.d.e().orElseThrow(() -> new IllegalStateException("Tried to serialize unregistered attribute"));
      $$0.a("id", $$1.a().toString());
      $$0.a("base", this.h);
      if (!this.g.isEmpty()) {
         ut $$2 = new ut();

         for (bwk $$3 : this.g.values()) {
            $$2.add($$3.a());
         }

         $$0.a("modifiers", $$2);
      }

      return $$0;
   }

   public void a(un $$0) {
      this.h = $$0.k("base");
      if ($$0.b("modifiers", 9)) {
         ut $$1 = $$0.c("modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            bwk $$3 = bwk.a($$1.a($$2));
            if ($$3 != null) {
               this.f.put($$3.b(), $$3);
               this.a($$3.d()).put($$3.b(), $$3);
               this.g.put($$3.b(), $$3);
            }
         }
      }

      this.e();
   }
}
