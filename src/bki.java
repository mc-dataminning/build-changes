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

public class bki {
   private final bkh a;
   private final Map<bkk.a, Set<bkk>> b = Maps.newEnumMap(bkk.a.class);
   private final Map<UUID, bkk> c = new Object2ObjectArrayMap();
   private final Set<bkk> d = new ObjectArraySet();
   private double e;
   private boolean f = true;
   private double g;
   private final Consumer<bki> h;

   public bki(bkh $$0, Consumer<bki> $$1) {
      this.a = $$0;
      this.h = $$1;
      this.e = $$0.a();
   }

   public bkh a() {
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

   public Set<bkk> a(bkk.a $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
   }

   public Set<bkk> c() {
      return ImmutableSet.copyOf(this.c.values());
   }

   @Nullable
   public bkk a(UUID $$0) {
      return this.c.get($$0);
   }

   public boolean a(bkk $$0) {
      return this.c.get($$0.a()) != null;
   }

   private void d(bkk $$0) {
      bkk $$1 = this.c.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.c()).add($$0);
         this.d();
      }
   }

   public void b(bkk $$0) {
      this.d($$0);
   }

   public void c(bkk $$0) {
      this.d($$0);
      this.d.add($$0);
   }

   protected void d() {
      this.f = true;
      this.h.accept(this);
   }

   private void e(bkk $$0) {
      this.a($$0.c()).remove($$0);
      this.c.remove($$0.a());
      this.d.remove($$0);
      this.d();
   }

   public void b(UUID $$0) {
      bkk $$1 = this.a($$0);
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public boolean c(UUID $$0) {
      bkk $$1 = this.a($$0);
      if ($$1 != null && this.d.contains($$1)) {
         this.e($$1);
         return true;
      } else {
         return false;
      }
   }

   public void e() {
      for (bkk $$0 : this.c()) {
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

      for (bkk $$1 : this.b(bkk.a.a)) {
         $$0 += $$1.d();
      }

      double $$2 = $$0;

      for (bkk $$3 : this.b(bkk.a.b)) {
         $$2 += $$0 * $$3.d();
      }

      for (bkk $$4 : this.b(bkk.a.c)) {
         $$2 *= 1.0 + $$4.d();
      }

      return this.a.a($$2);
   }

   private Collection<bkk> b(bkk.a $$0) {
      return this.b.getOrDefault($$0, Collections.emptySet());
   }

   public void a(bki $$0) {
      this.e = $$0.e;
      this.c.clear();
      this.c.putAll($$0.c);
      this.d.clear();
      this.d.addAll($$0.d);
      this.b.clear();
      $$0.b.forEach(($$0x, $$1) -> this.a($$0x).addAll($$1));
      this.d();
   }

   public qx g() {
      qx $$0 = new qx();
      $$0.a("Name", jd.v.b(this.a).toString());
      $$0.a("Base", this.e);
      if (!this.d.isEmpty()) {
         rd $$1 = new rd();

         for (bkk $$2 : this.d) {
            $$1.add($$2.e());
         }

         $$0.a("Modifiers", $$1);
      }

      return $$0;
   }

   public void a(qx $$0) {
      this.e = $$0.k("Base");
      if ($$0.b("Modifiers", 9)) {
         rd $$1 = $$0.c("Modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            bkk $$3 = bkk.a($$1.a($$2));
            if ($$3 != null) {
               this.c.put($$3.a(), $$3);
               this.a($$3.c()).add($$3);
               this.d.add($$3);
            }
         }
      }

      this.d();
   }
}
