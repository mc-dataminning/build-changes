import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class byl {
   private static final String b = "base";
   private static final String c = "modifiers";
   public static final String a = "id";
   private final jf<byk> d;
   private final Map<byn.a, Map<alg, byn>> e = Maps.newEnumMap(byn.a.class);
   private final Map<alg, byn> f = new Object2ObjectArrayMap();
   private final Map<alg, byn> g = new Object2ObjectArrayMap();
   private double h;
   private boolean i = true;
   private double j;
   private final Consumer<byl> k;

   public byl(jf<byk> $$0, Consumer<byl> $$1) {
      this.d = $$0;
      this.k = $$1;
      this.h = $$0.a().a();
   }

   public jf<byk> a() {
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
   Map<alg, byn> a(byn.a $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<byn> c() {
      return ImmutableSet.copyOf(this.f.values());
   }

   public Set<byn> d() {
      return ImmutableSet.copyOf(this.g.values());
   }

   @Nullable
   public byn a(alg $$0) {
      return this.f.get($$0);
   }

   public boolean b(alg $$0) {
      return this.f.get($$0) != null;
   }

   private void f(byn $$0) {
      byn $$1 = this.f.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.c()).put($$0.a(), $$0);
         this.e();
      }
   }

   public void a(byn $$0) {
      byn $$1 = this.f.put($$0.a(), $$0);
      if ($$0 != $$1) {
         this.a($$0.c()).put($$0.a(), $$0);
         this.e();
      }
   }

   public void b(byn $$0) {
      this.f($$0);
   }

   public void c(byn $$0) {
      this.c($$0.a());
      this.f($$0);
      this.g.put($$0.a(), $$0);
   }

   public void d(byn $$0) {
      this.f($$0);
      this.g.put($$0.a(), $$0);
   }

   public void a(Collection<byn> $$0) {
      for (byn $$1 : $$0) {
         this.d($$1);
      }
   }

   protected void e() {
      this.i = true;
      this.k.accept(this);
   }

   public void e(byn $$0) {
      this.c($$0.a());
   }

   public boolean c(alg $$0) {
      byn $$1 = this.f.remove($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1.c()).remove($$0);
         this.g.remove($$0);
         this.e();
         return true;
      }
   }

   public void f() {
      for (byn $$0 : this.c()) {
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

      for (byn $$1 : this.b(byn.a.a)) {
         $$0 += $$1.b();
      }

      double $$2 = $$0;

      for (byn $$3 : this.b(byn.a.b)) {
         $$2 += $$0 * $$3.b();
      }

      for (byn $$4 : this.b(byn.a.c)) {
         $$2 *= 1.0 + $$4.b();
      }

      return this.d.a().a($$2);
   }

   private Collection<byn> b(byn.a $$0) {
      return this.e.getOrDefault($$0, Map.of()).values();
   }

   public void a(byl $$0) {
      this.h = $$0.h;
      this.f.clear();
      this.f.putAll($$0.f);
      this.g.clear();
      this.g.putAll($$0.g);
      this.e.clear();
      $$0.e.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends alg, ? extends byn>)$$1));
      this.e();
   }

   public tz h() {
      tz $$0 = new tz();
      alf<byk> $$1 = this.d.e().orElseThrow(() -> new IllegalStateException("Tried to serialize unregistered attribute"));
      $$0.a("id", $$1.a().toString());
      $$0.a("base", this.h);
      if (!this.g.isEmpty()) {
         $$0.a("modifiers", byn.b.listOf(), List.copyOf(this.g.values()));
      }

      return $$0;
   }

   public void a(tz $$0) {
      this.h = $$0.i("base");

      for (byn $$2 : $$0.<List>a("modifiers", byn.b.listOf()).orElse(List.of())) {
         this.f.put($$2.a(), $$2);
         this.a($$2.c()).put($$2.a(), $$2);
         this.g.put($$2.a(), $$2);
      }

      this.e();
   }
}
