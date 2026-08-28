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

public class byy {
   private static final String c = "base";
   private static final String d = "modifiers";
   public static final String a = "id";
   public static final Codec<jg<byx>> b = mh.s.r();
   private final jg<byx> e;
   private final Map<bza.a, Map<alk, bza>> f = Maps.newEnumMap(bza.a.class);
   private final Map<alk, bza> g = new Object2ObjectArrayMap();
   private final Map<alk, bza> h = new Object2ObjectArrayMap();
   private double i;
   private boolean j = true;
   private double k;
   private final Consumer<byy> l;

   public byy(jg<byx> $$0, Consumer<byy> $$1) {
      this.e = $$0;
      this.l = $$1;
      this.i = $$0.a().a();
   }

   public jg<byx> a() {
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
   Map<alk, bza> a(bza.a $$0) {
      return this.f.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<bza> c() {
      return ImmutableSet.copyOf(this.g.values());
   }

   public Set<bza> d() {
      return ImmutableSet.copyOf(this.h.values());
   }

   @Nullable
   public bza a(alk $$0) {
      return this.g.get($$0);
   }

   public boolean b(alk $$0) {
      return this.g.get($$0) != null;
   }

   private void f(bza $$0) {
      bza $$1 = this.g.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.c()).put($$0.a(), $$0);
         this.e();
      }
   }

   public void a(bza $$0) {
      bza $$1 = this.g.put($$0.a(), $$0);
      if ($$0 != $$1) {
         this.a($$0.c()).put($$0.a(), $$0);
         this.e();
      }
   }

   public void b(bza $$0) {
      this.f($$0);
   }

   public void c(bza $$0) {
      this.c($$0.a());
      this.f($$0);
      this.h.put($$0.a(), $$0);
   }

   public void d(bza $$0) {
      this.f($$0);
      this.h.put($$0.a(), $$0);
   }

   public void a(Collection<bza> $$0) {
      for (bza $$1 : $$0) {
         this.d($$1);
      }
   }

   protected void e() {
      this.j = true;
      this.l.accept(this);
   }

   public void e(bza $$0) {
      this.c($$0.a());
   }

   public boolean c(alk $$0) {
      bza $$1 = this.g.remove($$0);
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
      for (bza $$0 : this.c()) {
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

      for (bza $$1 : this.b(bza.a.a)) {
         $$0 += $$1.b();
      }

      double $$2 = $$0;

      for (bza $$3 : this.b(bza.a.b)) {
         $$2 += $$0 * $$3.b();
      }

      for (bza $$4 : this.b(bza.a.c)) {
         $$2 *= 1.0 + $$4.b();
      }

      return this.e.a().a($$2);
   }

   private Collection<bza> b(bza.a $$0) {
      return this.f.getOrDefault($$0, Map.of()).values();
   }

   public void a(byy $$0) {
      this.i = $$0.i;
      this.g.clear();
      this.g.putAll($$0.g);
      this.h.clear();
      this.h.putAll($$0.h);
      this.f.clear();
      $$0.f.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends alk, ? extends bza>)$$1));
      this.e();
   }

   public ua h() {
      ua $$0 = new ua();
      $$0.a("id", b, this.e);
      $$0.a("base", this.i);
      if (!this.h.isEmpty()) {
         $$0.a("modifiers", bza.b.listOf(), List.copyOf(this.h.values()));
      }

      return $$0;
   }

   public void a(ua $$0) {
      this.i = $$0.b("base", 0.0);

      for (bza $$2 : $$0.<List>a("modifiers", bza.b.listOf()).orElse(List.of())) {
         this.g.put($$2.a(), $$2);
         this.a($$2.c()).put($$2.a(), $$2);
         this.h.put($$2.a(), $$2);
      }

      this.e();
   }
}
