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

public class bkk {
   private final bkj a;
   private final Map<bkm.a, Set<bkm>> b = Maps.newEnumMap(bkm.a.class);
   private final Map<UUID, bkm> c = new Object2ObjectArrayMap();
   private final Set<bkm> d = new ObjectArraySet();
   private double e;
   private boolean f = true;
   private double g;
   private final Consumer<bkk> h;

   public bkk(bkj $$0, Consumer<bkk> $$1) {
      this.a = $$0;
      this.h = $$1;
      this.e = $$0.a();
   }

   public bkj a() {
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

   public Set<bkm> a(bkm.a $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
   }

   public Set<bkm> c() {
      return ImmutableSet.copyOf(this.c.values());
   }

   @Nullable
   public bkm a(UUID $$0) {
      return this.c.get($$0);
   }

   public boolean a(bkm $$0) {
      return this.c.get($$0.a()) != null;
   }

   private void d(bkm $$0) {
      bkm $$1 = this.c.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.c()).add($$0);
         this.d();
      }
   }

   public void b(bkm $$0) {
      this.d($$0);
   }

   public void c(bkm $$0) {
      this.d($$0);
      this.d.add($$0);
   }

   protected void d() {
      this.f = true;
      this.h.accept(this);
   }

   private void e(bkm $$0) {
      this.a($$0.c()).remove($$0);
      this.c.remove($$0.a());
      this.d.remove($$0);
      this.d();
   }

   public void b(UUID $$0) {
      bkm $$1 = this.a($$0);
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public boolean c(UUID $$0) {
      bkm $$1 = this.a($$0);
      if ($$1 != null && this.d.contains($$1)) {
         this.e($$1);
         return true;
      } else {
         return false;
      }
   }

   public void e() {
      for (bkm $$0 : this.c()) {
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

      for (bkm $$1 : this.b(bkm.a.a)) {
         $$0 += $$1.d();
      }

      double $$2 = $$0;

      for (bkm $$3 : this.b(bkm.a.b)) {
         $$2 += $$0 * $$3.d();
      }

      for (bkm $$4 : this.b(bkm.a.c)) {
         $$2 *= 1.0 + $$4.d();
      }

      return this.a.a($$2);
   }

   private Collection<bkm> b(bkm.a $$0) {
      return this.b.getOrDefault($$0, Collections.emptySet());
   }

   public void a(bkk $$0) {
      this.e = $$0.e;
      this.c.clear();
      this.c.putAll($$0.c);
      this.d.clear();
      this.d.addAll($$0.d);
      this.b.clear();
      $$0.b.forEach(($$0x, $$1) -> this.a($$0x).addAll($$1));
      this.d();
   }

   public qy g() {
      qy $$0 = new qy();
      $$0.a("Name", jd.v.b(this.a).toString());
      $$0.a("Base", this.e);
      if (!this.d.isEmpty()) {
         re $$1 = new re();

         for (bkm $$2 : this.d) {
            $$1.add($$2.e());
         }

         $$0.a("Modifiers", $$1);
      }

      return $$0;
   }

   public void a(qy $$0) {
      this.e = $$0.k("Base");
      if ($$0.b("Modifiers", 9)) {
         re $$1 = $$0.c("Modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            bkm $$3 = bkm.a($$1.a($$2));
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
