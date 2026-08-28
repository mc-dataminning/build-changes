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

public class buq {
   private static final String b = "base";
   private static final String c = "modifiers";
   public static final String a = "id";
   private final jm<bup> d;
   private final Map<bus.a, Map<akq, bus>> e = Maps.newEnumMap(bus.a.class);
   private final Map<akq, bus> f = new Object2ObjectArrayMap();
   private final Map<akq, bus> g = new Object2ObjectArrayMap();
   private double h;
   private boolean i = true;
   private double j;
   private final Consumer<buq> k;

   public buq(jm<bup> $$0, Consumer<buq> $$1) {
      this.d = $$0;
      this.k = $$1;
      this.h = $$0.a().a();
   }

   public jm<bup> a() {
      return this.d;
   }

   public double b() {
      return this.h;
   }

   public void a(double $$0) {
      if ($$0 != this.h) {
         this.h = $$0;
         this.d();
      }
   }

   @VisibleForTesting
   Map<akq, bus> a(bus.a $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<bus> c() {
      return ImmutableSet.copyOf(this.f.values());
   }

   @Nullable
   public bus a(akq $$0) {
      return this.f.get($$0);
   }

   public boolean b(akq $$0) {
      return this.f.get($$0) != null;
   }

   private void e(bus $$0) {
      bus $$1 = this.f.putIfAbsent($$0.b(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.d()).put($$0.b(), $$0);
         this.d();
      }
   }

   public void a(bus $$0) {
      bus $$1 = this.f.put($$0.b(), $$0);
      if ($$0 != $$1) {
         this.a($$0.d()).put($$0.b(), $$0);
         this.d();
      }
   }

   public void b(bus $$0) {
      this.e($$0);
   }

   public void c(bus $$0) {
      this.e($$0);
      this.g.put($$0.b(), $$0);
   }

   protected void d() {
      this.i = true;
      this.k.accept(this);
   }

   public void d(bus $$0) {
      this.c($$0.b());
   }

   public void c(akq $$0) {
      bus $$1 = this.f.remove($$0);
      if ($$1 != null) {
         this.a($$1.d()).remove($$0);
         this.g.remove($$0);
         this.d();
      }
   }

   public boolean d(akq $$0) {
      bus $$1 = this.g.remove($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1.d()).remove($$1.b());
         this.f.remove($$0);
         this.d();
         return true;
      }
   }

   public void e() {
      for (bus $$0 : this.c()) {
         this.d($$0);
      }
   }

   public double f() {
      if (this.i) {
         this.j = this.h();
         this.i = false;
      }

      return this.j;
   }

   private double h() {
      double $$0 = this.b();

      for (bus $$1 : this.b(bus.a.a)) {
         $$0 += $$1.c();
      }

      double $$2 = $$0;

      for (bus $$3 : this.b(bus.a.b)) {
         $$2 += $$0 * $$3.c();
      }

      for (bus $$4 : this.b(bus.a.c)) {
         $$2 *= 1.0 + $$4.c();
      }

      return this.d.a().a($$2);
   }

   private Collection<bus> b(bus.a $$0) {
      return this.e.getOrDefault($$0, Map.of()).values();
   }

   public void a(buq $$0) {
      this.h = $$0.h;
      this.f.clear();
      this.f.putAll($$0.f);
      this.g.clear();
      this.g.putAll($$0.g);
      this.e.clear();
      $$0.e.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends akq, ? extends bus>)$$1));
      this.d();
   }

   public ua g() {
      ua $$0 = new ua();
      akp<bup> $$1 = this.d.e().orElseThrow(() -> new IllegalStateException("Tried to serialize unregistered attribute"));
      $$0.a("id", $$1.a().toString());
      $$0.a("base", this.h);
      if (!this.g.isEmpty()) {
         ug $$2 = new ug();

         for (bus $$3 : this.g.values()) {
            $$2.add($$3.a());
         }

         $$0.a("modifiers", $$2);
      }

      return $$0;
   }

   public void a(ua $$0) {
      this.h = $$0.k("base");
      if ($$0.b("modifiers", 9)) {
         ug $$1 = $$0.c("modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            bus $$3 = bus.a($$1.a($$2));
            if ($$3 != null) {
               this.f.put($$3.b(), $$3);
               this.a($$3.d()).put($$3.b(), $$3);
               this.g.put($$3.b(), $$3);
            }
         }
      }

      this.d();
   }
}
