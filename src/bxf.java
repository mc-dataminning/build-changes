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

public class bxf {
   private static final String b = "base";
   private static final String c = "modifiers";
   public static final String a = "id";
   private final jq<bxe> d;
   private final Map<bxh.a, Map<alz, bxh>> e = Maps.newEnumMap(bxh.a.class);
   private final Map<alz, bxh> f = new Object2ObjectArrayMap();
   private final Map<alz, bxh> g = new Object2ObjectArrayMap();
   private double h;
   private boolean i = true;
   private double j;
   private final Consumer<bxf> k;

   public bxf(jq<bxe> $$0, Consumer<bxf> $$1) {
      this.d = $$0;
      this.k = $$1;
      this.h = $$0.a().a();
   }

   public jq<bxe> a() {
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
   Map<alz, bxh> a(bxh.a $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<bxh> c() {
      return ImmutableSet.copyOf(this.f.values());
   }

   public Set<bxh> d() {
      return ImmutableSet.copyOf(this.g.values());
   }

   @Nullable
   public bxh a(alz $$0) {
      return this.f.get($$0);
   }

   public boolean b(alz $$0) {
      return this.f.get($$0) != null;
   }

   private void f(bxh $$0) {
      bxh $$1 = this.f.putIfAbsent($$0.b(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.d()).put($$0.b(), $$0);
         this.e();
      }
   }

   public void a(bxh $$0) {
      bxh $$1 = this.f.put($$0.b(), $$0);
      if ($$0 != $$1) {
         this.a($$0.d()).put($$0.b(), $$0);
         this.e();
      }
   }

   public void b(bxh $$0) {
      this.f($$0);
   }

   public void c(bxh $$0) {
      this.c($$0.b());
      this.f($$0);
      this.g.put($$0.b(), $$0);
   }

   public void d(bxh $$0) {
      this.f($$0);
      this.g.put($$0.b(), $$0);
   }

   public void a(Collection<bxh> $$0) {
      for (bxh $$1 : $$0) {
         this.d($$1);
      }
   }

   protected void e() {
      this.i = true;
      this.k.accept(this);
   }

   public void e(bxh $$0) {
      this.c($$0.b());
   }

   public boolean c(alz $$0) {
      bxh $$1 = this.f.remove($$0);
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
      for (bxh $$0 : this.c()) {
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

      for (bxh $$1 : this.b(bxh.a.a)) {
         $$0 += $$1.c();
      }

      double $$2 = $$0;

      for (bxh $$3 : this.b(bxh.a.b)) {
         $$2 += $$0 * $$3.c();
      }

      for (bxh $$4 : this.b(bxh.a.c)) {
         $$2 *= 1.0 + $$4.c();
      }

      return this.d.a().a($$2);
   }

   private Collection<bxh> b(bxh.a $$0) {
      return this.e.getOrDefault($$0, Map.of()).values();
   }

   public void a(bxf $$0) {
      this.h = $$0.h;
      this.f.clear();
      this.f.putAll($$0.f);
      this.g.clear();
      this.g.putAll($$0.g);
      this.e.clear();
      $$0.e.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends alz, ? extends bxh>)$$1));
      this.e();
   }

   public ux h() {
      ux $$0 = new ux();
      aly<bxe> $$1 = this.d.e().orElseThrow(() -> new IllegalStateException("Tried to serialize unregistered attribute"));
      $$0.a("id", $$1.a().toString());
      $$0.a("base", this.h);
      if (!this.g.isEmpty()) {
         vd $$2 = new vd();

         for (bxh $$3 : this.g.values()) {
            $$2.add($$3.a());
         }

         $$0.a("modifiers", $$2);
      }

      return $$0;
   }

   public void a(ux $$0) {
      this.h = $$0.k("base");
      if ($$0.b("modifiers", 9)) {
         vd $$1 = $$0.c("modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            bxh $$3 = bxh.a($$1.a($$2));
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
