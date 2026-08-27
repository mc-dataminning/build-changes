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

public class bll {
   private final blk a;
   private final Map<bln.a, Set<bln>> b = Maps.newEnumMap(bln.a.class);
   private final Map<UUID, bln> c = new Object2ObjectArrayMap();
   private final Set<bln> d = new ObjectArraySet();
   private double e;
   private boolean f = true;
   private double g;
   private final Consumer<bll> h;

   public bll(blk $$0, Consumer<bll> $$1) {
      this.a = $$0;
      this.h = $$1;
      this.e = $$0.a();
   }

   public blk a() {
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

   public Set<bln> a(bln.a $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
   }

   public Set<bln> c() {
      return ImmutableSet.copyOf(this.c.values());
   }

   @Nullable
   public bln a(UUID $$0) {
      return this.c.get($$0);
   }

   public boolean a(bln $$0) {
      return this.c.get($$0.a()) != null;
   }

   private void d(bln $$0) {
      bln $$1 = this.c.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.b()).add($$0);
         this.d();
      }
   }

   public void b(bln $$0) {
      this.d($$0);
   }

   public void c(bln $$0) {
      this.d($$0);
      this.d.add($$0);
   }

   protected void d() {
      this.f = true;
      this.h.accept(this);
   }

   private void e(bln $$0) {
      this.a($$0.b()).remove($$0);
      this.c.remove($$0.a());
      this.d.remove($$0);
      this.d();
   }

   public void b(UUID $$0) {
      bln $$1 = this.a($$0);
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public boolean c(UUID $$0) {
      bln $$1 = this.a($$0);
      if ($$1 != null && this.d.contains($$1)) {
         this.e($$1);
         return true;
      } else {
         return false;
      }
   }

   public void e() {
      for (bln $$0 : this.c()) {
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

      for (bln $$1 : this.b(bln.a.a)) {
         $$0 += $$1.c();
      }

      double $$2 = $$0;

      for (bln $$3 : this.b(bln.a.b)) {
         $$2 += $$0 * $$3.c();
      }

      for (bln $$4 : this.b(bln.a.c)) {
         $$2 *= 1.0 + $$4.c();
      }

      return this.a.a($$2);
   }

   private Collection<bln> b(bln.a $$0) {
      return this.b.getOrDefault($$0, Collections.emptySet());
   }

   public void a(bll $$0) {
      this.e = $$0.e;
      this.c.clear();
      this.c.putAll($$0.c);
      this.d.clear();
      this.d.addAll($$0.d);
      this.b.clear();
      $$0.b.forEach(($$0x, $$1) -> this.a($$0x).addAll($$1));
      this.d();
   }

   public rt g() {
      rt $$0 = new rt();
      $$0.a("Name", jy.v.b(this.a).toString());
      $$0.a("Base", this.e);
      if (!this.d.isEmpty()) {
         rz $$1 = new rz();

         for (bln $$2 : this.d) {
            $$1.add($$2.d());
         }

         $$0.a("Modifiers", $$1);
      }

      return $$0;
   }

   public void a(rt $$0) {
      this.e = $$0.k("Base");
      if ($$0.b("Modifiers", 9)) {
         rz $$1 = $$0.c("Modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            bln $$3 = bln.a($$1.a($$2));
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
