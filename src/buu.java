import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class buu {
   private final ji<but> a;
   private final Map<buw.a, Map<UUID, buw>> b = Maps.newEnumMap(buw.a.class);
   private final Map<UUID, buw> c = new Object2ObjectArrayMap();
   private final Map<UUID, buw> d = new Object2ObjectArrayMap();
   private double e;
   private boolean f = true;
   private double g;
   private final Consumer<buu> h;

   public buu(ji<but> $$0, Consumer<buu> $$1) {
      this.a = $$0;
      this.h = $$1;
      this.e = $$0.a().a();
   }

   public ji<but> a() {
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

   @VisibleForTesting
   Map<UUID, buw> a(buw.a $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<buw> c() {
      return ImmutableSet.copyOf(this.c.values());
   }

   @Nullable
   public buw a(UUID $$0) {
      return this.c.get($$0);
   }

   public boolean a(buw $$0) {
      return this.c.get($$0.b()) != null;
   }

   private void f(buw $$0) {
      buw $$1 = this.c.putIfAbsent($$0.b(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.e()).put($$0.b(), $$0);
         this.d();
      }
   }

   public void b(buw $$0) {
      buw $$1 = this.c.put($$0.b(), $$0);
      if ($$0 != $$1) {
         this.a($$0.e()).put($$0.b(), $$0);
         this.d();
      }
   }

   public void c(buw $$0) {
      this.f($$0);
   }

   public void d(buw $$0) {
      this.f($$0);
      this.d.put($$0.b(), $$0);
   }

   protected void d() {
      this.f = true;
      this.h.accept(this);
   }

   public void e(buw $$0) {
      this.b($$0.b());
   }

   public void b(UUID $$0) {
      buw $$1 = this.c.remove($$0);
      if ($$1 != null) {
         this.a($$1.e()).remove($$0);
         this.d.remove($$0);
         this.d();
      }
   }

   public boolean c(UUID $$0) {
      buw $$1 = this.d.remove($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1.e()).remove($$1.b());
         this.c.remove($$0);
         this.d();
         return true;
      }
   }

   public void e() {
      for (buw $$0 : this.c()) {
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

      for (buw $$1 : this.b(buw.a.a)) {
         $$0 += $$1.d();
      }

      double $$2 = $$0;

      for (buw $$3 : this.b(buw.a.b)) {
         $$2 += $$0 * $$3.d();
      }

      for (buw $$4 : this.b(buw.a.c)) {
         $$2 *= 1.0 + $$4.d();
      }

      return this.a.a().a($$2);
   }

   private Collection<buw> b(buw.a $$0) {
      return this.b.getOrDefault($$0, Map.of()).values();
   }

   public void a(buu $$0) {
      this.e = $$0.e;
      this.c.clear();
      this.c.putAll($$0.c);
      this.d.clear();
      this.d.putAll($$0.d);
      this.b.clear();
      $$0.b.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends UUID, ? extends buw>)$$1));
      this.d();
   }

   public us g() {
      us $$0 = new us();
      ale<but> $$1 = this.a.e().orElseThrow(() -> new IllegalStateException("Tried to serialize unregistered attribute"));
      $$0.a("Name", $$1.a().toString());
      $$0.a("Base", this.e);
      if (!this.d.isEmpty()) {
         uy $$2 = new uy();

         for (buw $$3 : this.d.values()) {
            $$2.add($$3.a());
         }

         $$0.a("Modifiers", $$2);
      }

      return $$0;
   }

   public void a(us $$0) {
      this.e = $$0.k("Base");
      if ($$0.b("Modifiers", 9)) {
         uy $$1 = $$0.c("Modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            buw $$3 = buw.a($$1.a($$2));
            if ($$3 != null) {
               this.c.put($$3.b(), $$3);
               this.a($$3.e()).put($$3.b(), $$3);
               this.d.put($$3.b(), $$3);
            }
         }
      }

      this.d();
   }
}
