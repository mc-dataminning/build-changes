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

public class bus {
   private static final String b = "base";
   private static final String c = "modifiers";
   public static final String a = "id";
   private final jm<bur> d;
   private final Map<buu.a, Map<akr, buu>> e = Maps.newEnumMap(buu.a.class);
   private final Map<akr, buu> f = new Object2ObjectArrayMap();
   private final Map<akr, buu> g = new Object2ObjectArrayMap();
   private double h;
   private boolean i = true;
   private double j;
   private final Consumer<bus> k;

   public bus(jm<bur> $$0, Consumer<bus> $$1) {
      this.d = $$0;
      this.k = $$1;
      this.h = $$0.a().a();
   }

   public jm<bur> a() {
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
   Map<akr, buu> a(buu.a $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<buu> c() {
      return ImmutableSet.copyOf(this.f.values());
   }

   @Nullable
   public buu a(akr $$0) {
      return this.f.get($$0);
   }

   public boolean b(akr $$0) {
      return this.f.get($$0) != null;
   }

   private void e(buu $$0) {
      buu $$1 = this.f.putIfAbsent($$0.b(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.d()).put($$0.b(), $$0);
         this.d();
      }
   }

   public void a(buu $$0) {
      buu $$1 = this.f.put($$0.b(), $$0);
      if ($$0 != $$1) {
         this.a($$0.d()).put($$0.b(), $$0);
         this.d();
      }
   }

   public void b(buu $$0) {
      this.e($$0);
   }

   public void c(buu $$0) {
      this.e($$0);
      this.g.put($$0.b(), $$0);
   }

   protected void d() {
      this.i = true;
      this.k.accept(this);
   }

   public void d(buu $$0) {
      this.c($$0.b());
   }

   public boolean c(akr $$0) {
      buu $$1 = this.f.remove($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1.d()).remove($$0);
         this.g.remove($$0);
         this.d();
         return true;
      }
   }

   public void e() {
      for (buu $$0 : this.c()) {
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

      for (buu $$1 : this.b(buu.a.a)) {
         $$0 += $$1.c();
      }

      double $$2 = $$0;

      for (buu $$3 : this.b(buu.a.b)) {
         $$2 += $$0 * $$3.c();
      }

      for (buu $$4 : this.b(buu.a.c)) {
         $$2 *= 1.0 + $$4.c();
      }

      return this.d.a().a($$2);
   }

   private Collection<buu> b(buu.a $$0) {
      return this.e.getOrDefault($$0, Map.of()).values();
   }

   public void a(bus $$0) {
      this.h = $$0.h;
      this.f.clear();
      this.f.putAll($$0.f);
      this.g.clear();
      this.g.putAll($$0.g);
      this.e.clear();
      $$0.e.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends akr, ? extends buu>)$$1));
      this.d();
   }

   public ub g() {
      ub $$0 = new ub();
      akq<bur> $$1 = this.d.e().orElseThrow(() -> new IllegalStateException("Tried to serialize unregistered attribute"));
      $$0.a("id", $$1.a().toString());
      $$0.a("base", this.h);
      if (!this.g.isEmpty()) {
         uh $$2 = new uh();

         for (buu $$3 : this.g.values()) {
            $$2.add($$3.a());
         }

         $$0.a("modifiers", $$2);
      }

      return $$0;
   }

   public void a(ub $$0) {
      this.h = $$0.k("base");
      if ($$0.b("modifiers", 9)) {
         uh $$1 = $$0.c("modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            buu $$3 = buu.a($$1.a($$2));
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
