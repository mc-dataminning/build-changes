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

public class buf {
   private final jj<bue> a;
   private final Map<buh.a, Map<UUID, buh>> b = Maps.newEnumMap(buh.a.class);
   private final Map<UUID, buh> c = new Object2ObjectArrayMap();
   private final Map<UUID, buh> d = new Object2ObjectArrayMap();
   private double e;
   private boolean f = true;
   private double g;
   private final Consumer<buf> h;

   public buf(jj<bue> $$0, Consumer<buf> $$1) {
      this.a = $$0;
      this.h = $$1;
      this.e = $$0.a().a();
   }

   public jj<bue> a() {
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
   Map<UUID, buh> a(buh.a $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<buh> c() {
      return ImmutableSet.copyOf(this.c.values());
   }

   @Nullable
   public buh a(UUID $$0) {
      return this.c.get($$0);
   }

   public boolean a(buh $$0) {
      return this.c.get($$0.b()) != null;
   }

   private void f(buh $$0) {
      buh $$1 = this.c.putIfAbsent($$0.b(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.e()).put($$0.b(), $$0);
         this.d();
      }
   }

   public void b(buh $$0) {
      buh $$1 = this.c.put($$0.b(), $$0);
      if ($$0 != $$1) {
         this.a($$0.e()).put($$0.b(), $$0);
         this.d();
      }
   }

   public void c(buh $$0) {
      this.f($$0);
   }

   public void d(buh $$0) {
      this.f($$0);
      this.d.put($$0.b(), $$0);
   }

   protected void d() {
      this.f = true;
      this.h.accept(this);
   }

   public void e(buh $$0) {
      this.b($$0.b());
   }

   public void b(UUID $$0) {
      buh $$1 = this.c.remove($$0);
      if ($$1 != null) {
         this.a($$1.e()).remove($$0);
         this.d.remove($$0);
         this.d();
      }
   }

   public boolean c(UUID $$0) {
      buh $$1 = this.d.remove($$0);
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
      for (buh $$0 : this.c()) {
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

      for (buh $$1 : this.b(buh.a.a)) {
         $$0 += $$1.d();
      }

      double $$2 = $$0;

      for (buh $$3 : this.b(buh.a.b)) {
         $$2 += $$0 * $$3.d();
      }

      for (buh $$4 : this.b(buh.a.c)) {
         $$2 *= 1.0 + $$4.d();
      }

      return this.a.a().a($$2);
   }

   private Collection<buh> b(buh.a $$0) {
      return this.b.getOrDefault($$0, Map.of()).values();
   }

   public void a(buf $$0) {
      this.e = $$0.e;
      this.c.clear();
      this.c.putAll($$0.c);
      this.d.clear();
      this.d.putAll($$0.d);
      this.b.clear();
      $$0.b.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends UUID, ? extends buh>)$$1));
      this.d();
   }

   public tx g() {
      tx $$0 = new tx();
      akj<bue> $$1 = this.a.e().orElseThrow(() -> new IllegalStateException("Tried to serialize unregistered attribute"));
      $$0.a("Name", $$1.a().toString());
      $$0.a("Base", this.e);
      if (!this.d.isEmpty()) {
         ud $$2 = new ud();

         for (buh $$3 : this.d.values()) {
            $$2.add($$3.a());
         }

         $$0.a("Modifiers", $$2);
      }

      return $$0;
   }

   public void a(tx $$0) {
      this.e = $$0.k("Base");
      if ($$0.b("Modifiers", 9)) {
         ud $$1 = $$0.c("Modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            buh $$3 = buh.a($$1.a($$2));
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
