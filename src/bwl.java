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

public class bwl {
   private static final String b = "base";
   private static final String c = "modifiers";
   public static final String a = "id";
   private final jq<bwk> d;
   private final Map<bwn.a, Map<alj, bwn>> e = Maps.newEnumMap(bwn.a.class);
   private final Map<alj, bwn> f = new Object2ObjectArrayMap();
   private final Map<alj, bwn> g = new Object2ObjectArrayMap();
   private double h;
   private boolean i = true;
   private double j;
   private final Consumer<bwl> k;

   public bwl(jq<bwk> $$0, Consumer<bwl> $$1) {
      this.d = $$0;
      this.k = $$1;
      this.h = $$0.a().a();
   }

   public jq<bwk> a() {
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
   Map<alj, bwn> a(bwn.a $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<bwn> c() {
      return ImmutableSet.copyOf(this.f.values());
   }

   public Set<bwn> d() {
      return ImmutableSet.copyOf(this.g.values());
   }

   @Nullable
   public bwn a(alj $$0) {
      return this.f.get($$0);
   }

   public boolean b(alj $$0) {
      return this.f.get($$0) != null;
   }

   private void f(bwn $$0) {
      bwn $$1 = this.f.putIfAbsent($$0.b(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.d()).put($$0.b(), $$0);
         this.e();
      }
   }

   public void a(bwn $$0) {
      bwn $$1 = this.f.put($$0.b(), $$0);
      if ($$0 != $$1) {
         this.a($$0.d()).put($$0.b(), $$0);
         this.e();
      }
   }

   public void b(bwn $$0) {
      this.f($$0);
   }

   public void c(bwn $$0) {
      this.c($$0.b());
      this.f($$0);
      this.g.put($$0.b(), $$0);
   }

   public void d(bwn $$0) {
      this.f($$0);
      this.g.put($$0.b(), $$0);
   }

   public void a(Collection<bwn> $$0) {
      for (bwn $$1 : $$0) {
         this.d($$1);
      }
   }

   protected void e() {
      this.i = true;
      this.k.accept(this);
   }

   public void e(bwn $$0) {
      this.c($$0.b());
   }

   public boolean c(alj $$0) {
      bwn $$1 = this.f.remove($$0);
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
      for (bwn $$0 : this.c()) {
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

      for (bwn $$1 : this.b(bwn.a.a)) {
         $$0 += $$1.c();
      }

      double $$2 = $$0;

      for (bwn $$3 : this.b(bwn.a.b)) {
         $$2 += $$0 * $$3.c();
      }

      for (bwn $$4 : this.b(bwn.a.c)) {
         $$2 *= 1.0 + $$4.c();
      }

      return this.d.a().a($$2);
   }

   private Collection<bwn> b(bwn.a $$0) {
      return this.e.getOrDefault($$0, Map.of()).values();
   }

   public void a(bwl $$0) {
      this.h = $$0.h;
      this.f.clear();
      this.f.putAll($$0.f);
      this.g.clear();
      this.g.putAll($$0.g);
      this.e.clear();
      $$0.e.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends alj, ? extends bwn>)$$1));
      this.e();
   }

   public ul h() {
      ul $$0 = new ul();
      ali<bwk> $$1 = this.d.e().orElseThrow(() -> new IllegalStateException("Tried to serialize unregistered attribute"));
      $$0.a("id", $$1.a().toString());
      $$0.a("base", this.h);
      if (!this.g.isEmpty()) {
         ur $$2 = new ur();

         for (bwn $$3 : this.g.values()) {
            $$2.add($$3.a());
         }

         $$0.a("modifiers", $$2);
      }

      return $$0;
   }

   public void a(ul $$0) {
      this.h = $$0.k("base");
      if ($$0.b("modifiers", 9)) {
         ur $$1 = $$0.c("modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            bwn $$3 = bwn.a($$1.a($$2));
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
