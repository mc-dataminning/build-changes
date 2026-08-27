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

public class bsh {
   private final iv<bsg> a;
   private final Map<bsj.a, Map<UUID, bsj>> b = Maps.newEnumMap(bsj.a.class);
   private final Map<UUID, bsj> c = new Object2ObjectArrayMap();
   private final Map<UUID, bsj> d = new Object2ObjectArrayMap();
   private double e;
   private boolean f = true;
   private double g;
   private final Consumer<bsh> h;

   public bsh(iv<bsg> $$0, Consumer<bsh> $$1) {
      this.a = $$0;
      this.h = $$1;
      this.e = $$0.a().a();
   }

   public iv<bsg> a() {
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
   Map<UUID, bsj> a(bsj.a $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<bsj> c() {
      return ImmutableSet.copyOf(this.c.values());
   }

   @Nullable
   public bsj a(UUID $$0) {
      return this.c.get($$0);
   }

   public boolean a(bsj $$0) {
      return this.c.get($$0.b()) != null;
   }

   private void f(bsj $$0) {
      bsj $$1 = this.c.putIfAbsent($$0.b(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.e()).put($$0.b(), $$0);
         this.d();
      }
   }

   public void b(bsj $$0) {
      bsj $$1 = this.c.put($$0.b(), $$0);
      if ($$0 != $$1) {
         this.a($$0.e()).put($$0.b(), $$0);
         this.d();
      }
   }

   public void c(bsj $$0) {
      this.f($$0);
   }

   public void d(bsj $$0) {
      this.f($$0);
      this.d.put($$0.b(), $$0);
   }

   protected void d() {
      this.f = true;
      this.h.accept(this);
   }

   public void e(bsj $$0) {
      this.b($$0.b());
   }

   public void b(UUID $$0) {
      bsj $$1 = this.c.remove($$0);
      if ($$1 != null) {
         this.a($$1.e()).remove($$0);
         this.d.remove($$0);
         this.d();
      }
   }

   public boolean c(UUID $$0) {
      bsj $$1 = this.d.remove($$0);
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
      for (bsj $$0 : this.c()) {
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

      for (bsj $$1 : this.b(bsj.a.a)) {
         $$0 += $$1.d();
      }

      double $$2 = $$0;

      for (bsj $$3 : this.b(bsj.a.b)) {
         $$2 += $$0 * $$3.d();
      }

      for (bsj $$4 : this.b(bsj.a.c)) {
         $$2 *= 1.0 + $$4.d();
      }

      return this.a.a().a($$2);
   }

   private Collection<bsj> b(bsj.a $$0) {
      return this.b.getOrDefault($$0, Map.of()).values();
   }

   public void a(bsh $$0) {
      this.e = $$0.e;
      this.c.clear();
      this.c.putAll($$0.c);
      this.d.clear();
      this.d.putAll($$0.d);
      this.b.clear();
      $$0.b.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends UUID, ? extends bsj>)$$1));
      this.d();
   }

   public ty g() {
      ty $$0 = new ty();
      ake<bsg> $$1 = this.a.e().orElseThrow(() -> new IllegalStateException("Tried to serialize unregistered attribute"));
      $$0.a("Name", $$1.a().toString());
      $$0.a("Base", this.e);
      if (!this.d.isEmpty()) {
         ue $$2 = new ue();

         for (bsj $$3 : this.d.values()) {
            $$2.add($$3.a());
         }

         $$0.a("Modifiers", $$2);
      }

      return $$0;
   }

   public void a(ty $$0) {
      this.e = $$0.k("Base");
      if ($$0.b("Modifiers", 9)) {
         ue $$1 = $$0.c("Modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            bsj $$3 = bsj.a($$1.a($$2));
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
