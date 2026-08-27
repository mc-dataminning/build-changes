import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bko {
   private final bkn a;
   private final Map<bkq.a, Set<bkq>> b = Maps.newEnumMap(bkq.a.class);
   private final Map<UUID, bkq> c = new Object2ObjectArrayMap();
   private final Set<bkq> d = new ObjectArraySet();
   private double e;
   private boolean f = true;
   private double g;
   private final Consumer<bko> h;

   public bko(bkn $$0, Consumer<bko> $$1) {
      this.a = $$0;
      this.h = $$1;
      this.e = $$0.a();
   }

   public bkn a() {
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

   public Set<bkq> a(bkq.a $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
   }

   public Set<bkq> c() {
      return ImmutableSet.copyOf(this.c.values());
   }

   @Nullable
   public bkq a(UUID $$0) {
      return this.c.get($$0);
   }

   public boolean a(bkq $$0) {
      return this.c.get($$0.a()) != null;
   }

   private void d(bkq $$0) {
      bkq $$1 = this.c.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.b()).add($$0);
         this.d();
      }
   }

   public void b(bkq $$0) {
      this.d($$0);
   }

   public void c(bkq $$0) {
      this.d($$0);
      this.d.add($$0);
   }

   protected void d() {
      this.f = true;
      this.h.accept(this);
   }

   private void e(bkq $$0) {
      this.a($$0.b()).remove($$0);
      this.c.remove($$0.a());
      this.d.remove($$0);
      this.d();
   }

   public void b(UUID $$0) {
      bkq $$1 = this.a($$0);
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public boolean c(UUID $$0) {
      bkq $$1 = this.a($$0);
      if ($$1 != null && this.d.contains($$1)) {
         this.e($$1);
         return true;
      } else {
         return false;
      }
   }

   public void e() {
      for (bkq $$0 : this.c()) {
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

      for (bkq $$1 : this.b(bkq.a.a)) {
         $$0 += $$1.c();
      }

      double $$2 = $$0;

      for (bkq $$3 : this.b(bkq.a.b)) {
         $$2 += $$0 * $$3.c();
      }

      for (bkq $$4 : this.b(bkq.a.c)) {
         $$2 *= 1.0 + $$4.c();
      }

      return this.a.a($$2);
   }

   private Collection<bkq> b(bkq.a $$0) {
      return this.b.getOrDefault($$0, Collections.emptySet());
   }

   public void a(bko $$0) {
      this.e = $$0.e;
      this.c.clear();
      this.c.putAll($$0.c);
      this.d.clear();
      this.d.addAll($$0.d);
      this.b.clear();
      $$0.b.forEach(($$0x, $$1) -> this.a($$0x).addAll($$1));
      this.d();
   }

   public qw g() {
      qw $$0 = new qw();
      $$0.a("Name", jb.v.b(this.a).toString());
      $$0.a("Base", this.e);
      if (!this.d.isEmpty()) {
         rc $$1 = new rc();

         for (bkq $$2 : this.d) {
            $$1.add($$2.d());
         }

         $$0.a("Modifiers", $$1);
      }

      return $$0;
   }

   public void a(qw $$0) {
      this.e = $$0.k("Base");
      if ($$0.b("Modifiers", 9)) {
         rc $$1 = $$0.c("Modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            bkq $$3 = bkq.a($$1.a($$2));
            if ($$3 != null) {
               this.c.put($$3.a(), $$3);
               this.a($$3.b()).add($$3);
               this.d.add($$3);
            }
         }
      }

      this.d();
   }
}
