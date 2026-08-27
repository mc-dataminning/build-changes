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

public class bmn {
   private final bmm a;
   private final Map<bmp.a, Set<bmp>> b = Maps.newEnumMap(bmp.a.class);
   private final Map<UUID, bmp> c = new Object2ObjectArrayMap();
   private final Set<bmp> d = new ObjectArraySet();
   private double e;
   private boolean f = true;
   private double g;
   private final Consumer<bmn> h;

   public bmn(bmm $$0, Consumer<bmn> $$1) {
      this.a = $$0;
      this.h = $$1;
      this.e = $$0.a();
   }

   public bmm a() {
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

   public Set<bmp> a(bmp.a $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
   }

   public Set<bmp> c() {
      return ImmutableSet.copyOf(this.c.values());
   }

   @Nullable
   public bmp a(UUID $$0) {
      return this.c.get($$0);
   }

   public boolean a(bmp $$0) {
      return this.c.get($$0.a()) != null;
   }

   private void d(bmp $$0) {
      bmp $$1 = this.c.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.b()).add($$0);
         this.d();
      }
   }

   public void b(bmp $$0) {
      this.d($$0);
   }

   public void c(bmp $$0) {
      this.d($$0);
      this.d.add($$0);
   }

   protected void d() {
      this.f = true;
      this.h.accept(this);
   }

   private void e(bmp $$0) {
      this.a($$0.b()).remove($$0);
      this.c.remove($$0.a());
      this.d.remove($$0);
      this.d();
   }

   public void b(UUID $$0) {
      bmp $$1 = this.a($$0);
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public boolean c(UUID $$0) {
      bmp $$1 = this.a($$0);
      if ($$1 != null && this.d.contains($$1)) {
         this.e($$1);
         return true;
      } else {
         return false;
      }
   }

   public void e() {
      for (bmp $$0 : this.c()) {
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

      for (bmp $$1 : this.b(bmp.a.a)) {
         $$0 += $$1.c();
      }

      double $$2 = $$0;

      for (bmp $$3 : this.b(bmp.a.b)) {
         $$2 += $$0 * $$3.c();
      }

      for (bmp $$4 : this.b(bmp.a.c)) {
         $$2 *= 1.0 + $$4.c();
      }

      return this.a.a($$2);
   }

   private Collection<bmp> b(bmp.a $$0) {
      return this.b.getOrDefault($$0, Collections.emptySet());
   }

   public void a(bmn $$0) {
      this.e = $$0.e;
      this.c.clear();
      this.c.putAll($$0.c);
      this.d.clear();
      this.d.addAll($$0.d);
      this.b.clear();
      $$0.b.forEach(($$0x, $$1) -> this.a($$0x).addAll($$1));
      this.d();
   }

   public sd g() {
      sd $$0 = new sd();
      $$0.a("Name", kc.v.b(this.a).toString());
      $$0.a("Base", this.e);
      if (!this.d.isEmpty()) {
         sj $$1 = new sj();

         for (bmp $$2 : this.d) {
            $$1.add($$2.d());
         }

         $$0.a("Modifiers", $$1);
      }

      return $$0;
   }

   public void a(sd $$0) {
      this.e = $$0.k("Base");
      if ($$0.b("Modifiers", 9)) {
         sj $$1 = $$0.c("Modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            bmp $$3 = bmp.a($$1.a($$2));
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
