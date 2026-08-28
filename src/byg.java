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

public class byg {
   private static final String b = "base";
   private static final String c = "modifiers";
   public static final String a = "id";
   private final je<byf> d;
   private final Map<byi.a, Map<alg, byi>> e = Maps.newEnumMap(byi.a.class);
   private final Map<alg, byi> f = new Object2ObjectArrayMap();
   private final Map<alg, byi> g = new Object2ObjectArrayMap();
   private double h;
   private boolean i = true;
   private double j;
   private final Consumer<byg> k;

   public byg(je<byf> $$0, Consumer<byg> $$1) {
      this.d = $$0;
      this.k = $$1;
      this.h = $$0.a().a();
   }

   public je<byf> a() {
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
   Map<alg, byi> a(byi.a $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<byi> c() {
      return ImmutableSet.copyOf(this.f.values());
   }

   public Set<byi> d() {
      return ImmutableSet.copyOf(this.g.values());
   }

   @Nullable
   public byi a(alg $$0) {
      return this.f.get($$0);
   }

   public boolean b(alg $$0) {
      return this.f.get($$0) != null;
   }

   private void f(byi $$0) {
      byi $$1 = this.f.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.c()).put($$0.a(), $$0);
         this.e();
      }
   }

   public void a(byi $$0) {
      byi $$1 = this.f.put($$0.a(), $$0);
      if ($$0 != $$1) {
         this.a($$0.c()).put($$0.a(), $$0);
         this.e();
      }
   }

   public void b(byi $$0) {
      this.f($$0);
   }

   public void c(byi $$0) {
      this.c($$0.a());
      this.f($$0);
      this.g.put($$0.a(), $$0);
   }

   public void d(byi $$0) {
      this.f($$0);
      this.g.put($$0.a(), $$0);
   }

   public void a(Collection<byi> $$0) {
      for (byi $$1 : $$0) {
         this.d($$1);
      }
   }

   protected void e() {
      this.i = true;
      this.k.accept(this);
   }

   public void e(byi $$0) {
      this.c($$0.a());
   }

   public boolean c(alg $$0) {
      byi $$1 = this.f.remove($$0);
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
      for (byi $$0 : this.c()) {
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

      for (byi $$1 : this.b(byi.a.a)) {
         $$0 += $$1.b();
      }

      double $$2 = $$0;

      for (byi $$3 : this.b(byi.a.b)) {
         $$2 += $$0 * $$3.b();
      }

      for (byi $$4 : this.b(byi.a.c)) {
         $$2 *= 1.0 + $$4.b();
      }

      return this.d.a().a($$2);
   }

   private Collection<byi> b(byi.a $$0) {
      return this.e.getOrDefault($$0, Map.of()).values();
   }

   public void a(byg $$0) {
      this.h = $$0.h;
      this.f.clear();
      this.f.putAll($$0.f);
      this.g.clear();
      this.g.putAll($$0.g);
      this.e.clear();
      $$0.e.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends alg, ? extends byi>)$$1));
      this.e();
   }

   public tz h() {
      tz $$0 = new tz();
      alf<byf> $$1 = this.d.e().orElseThrow(() -> new IllegalStateException("Tried to serialize unregistered attribute"));
      $$0.a("id", $$1.a().toString());
      $$0.a("base", this.h);
      if (!this.g.isEmpty()) {
         $$0.a("modifiers", byi.b.listOf(), List.copyOf(this.g.values()));
      }

      return $$0;
   }

   public void a(tz $$0) {
      this.h = $$0.k("base");

      for (byi $$2 : $$0.<List>a("modifiers", byi.b.listOf()).orElse(List.of())) {
         this.f.put($$2.a(), $$2);
         this.a($$2.c()).put($$2.a(), $$2);
         this.g.put($$2.a(), $$2);
      }

      this.e();
   }
}
