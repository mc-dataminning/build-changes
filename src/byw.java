import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class byw {
   private static final String c = "base";
   private static final String d = "modifiers";
   public static final String a = "id";
   public static final Codec<jf<byv>> b = mg.s.r();
   private final jf<byv> e;
   private final Map<byy.a, Map<ali, byy>> f = Maps.newEnumMap(byy.a.class);
   private final Map<ali, byy> g = new Object2ObjectArrayMap();
   private final Map<ali, byy> h = new Object2ObjectArrayMap();
   private double i;
   private boolean j = true;
   private double k;
   private final Consumer<byw> l;

   public byw(jf<byv> $$0, Consumer<byw> $$1) {
      this.e = $$0;
      this.l = $$1;
      this.i = $$0.a().a();
   }

   public jf<byv> a() {
      return this.e;
   }

   public double b() {
      return this.i;
   }

   public void a(double $$0) {
      if ($$0 != this.i) {
         this.i = $$0;
         this.e();
      }
   }

   @VisibleForTesting
   Map<ali, byy> a(byy.a $$0) {
      return this.f.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<byy> c() {
      return ImmutableSet.copyOf(this.g.values());
   }

   public Set<byy> d() {
      return ImmutableSet.copyOf(this.h.values());
   }

   @Nullable
   public byy a(ali $$0) {
      return this.g.get($$0);
   }

   public boolean b(ali $$0) {
      return this.g.get($$0) != null;
   }

   private void f(byy $$0) {
      byy $$1 = this.g.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.c()).put($$0.a(), $$0);
         this.e();
      }
   }

   public void a(byy $$0) {
      byy $$1 = this.g.put($$0.a(), $$0);
      if ($$0 != $$1) {
         this.a($$0.c()).put($$0.a(), $$0);
         this.e();
      }
   }

   public void b(byy $$0) {
      this.f($$0);
   }

   public void c(byy $$0) {
      this.c($$0.a());
      this.f($$0);
      this.h.put($$0.a(), $$0);
   }

   public void d(byy $$0) {
      this.f($$0);
      this.h.put($$0.a(), $$0);
   }

   public void a(Collection<byy> $$0) {
      for (byy $$1 : $$0) {
         this.d($$1);
      }
   }

   protected void e() {
      this.j = true;
      this.l.accept(this);
   }

   public void e(byy $$0) {
      this.c($$0.a());
   }

   public boolean c(ali $$0) {
      byy $$1 = this.g.remove($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1.c()).remove($$0);
         this.h.remove($$0);
         this.e();
         return true;
      }
   }

   public void f() {
      for (byy $$0 : this.c()) {
         this.e($$0);
      }
   }

   public double g() {
      if (this.j) {
         this.k = this.i();
         this.j = false;
      }

      return this.k;
   }

   private double i() {
      double $$0 = this.b();

      for (byy $$1 : this.b(byy.a.a)) {
         $$0 += $$1.b();
      }

      double $$2 = $$0;

      for (byy $$3 : this.b(byy.a.b)) {
         $$2 += $$0 * $$3.b();
      }

      for (byy $$4 : this.b(byy.a.c)) {
         $$2 *= 1.0 + $$4.b();
      }

      return this.e.a().a($$2);
   }

   private Collection<byy> b(byy.a $$0) {
      return this.f.getOrDefault($$0, Map.of()).values();
   }

   public void a(byw $$0) {
      this.i = $$0.i;
      this.g.clear();
      this.g.putAll($$0.g);
      this.h.clear();
      this.h.putAll($$0.h);
      this.f.clear();
      $$0.f.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends ali, ? extends byy>)$$1));
      this.e();
   }

   public tz h() {
      tz $$0 = new tz();
      $$0.a("id", b, this.e);
      $$0.a("base", this.i);
      if (!this.h.isEmpty()) {
         $$0.a("modifiers", byy.b.listOf(), List.copyOf(this.h.values()));
      }

      return $$0;
   }

   public void a(tz $$0) {
      this.i = $$0.b("base", 0.0);

      for (byy $$2 : $$0.<List>a("modifiers", byy.b.listOf()).orElse(List.of())) {
         this.g.put($$2.a(), $$2);
         this.a($$2.c()).put($$2.a(), $$2);
         this.h.put($$2.a(), $$2);
      }

      this.e();
   }
}
