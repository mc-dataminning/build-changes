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

public class bka {
   private final bjz a;
   private final Map<bkc.a, Set<bkc>> b = Maps.newEnumMap(bkc.a.class);
   private final Map<UUID, bkc> c = new Object2ObjectArrayMap();
   private final Set<bkc> d = new ObjectArraySet();
   private double e;
   private boolean f = true;
   private double g;
   private final Consumer<bka> h;

   public bka(bjz $$0, Consumer<bka> $$1) {
      this.a = $$0;
      this.h = $$1;
      this.e = $$0.a();
   }

   public bjz a() {
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

   public Set<bkc> a(bkc.a $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
   }

   public Set<bkc> c() {
      return ImmutableSet.copyOf(this.c.values());
   }

   @Nullable
   public bkc a(UUID $$0) {
      return this.c.get($$0);
   }

   public boolean a(bkc $$0) {
      return this.c.get($$0.a()) != null;
   }

   private void d(bkc $$0) {
      bkc $$1 = this.c.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.c()).add($$0);
         this.d();
      }
   }

   public void b(bkc $$0) {
      this.d($$0);
   }

   public void c(bkc $$0) {
      this.d($$0);
      this.d.add($$0);
   }

   protected void d() {
      this.f = true;
      this.h.accept(this);
   }

   private void e(bkc $$0) {
      this.a($$0.c()).remove($$0);
      this.c.remove($$0.a());
      this.d.remove($$0);
      this.d();
   }

   public void b(UUID $$0) {
      bkc $$1 = this.a($$0);
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public boolean c(UUID $$0) {
      bkc $$1 = this.a($$0);
      if ($$1 != null && this.d.contains($$1)) {
         this.e($$1);
         return true;
      } else {
         return false;
      }
   }

   public void e() {
      for (bkc $$0 : this.c()) {
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

      for (bkc $$1 : this.b(bkc.a.a)) {
         $$0 += $$1.d();
      }

      double $$2 = $$0;

      for (bkc $$3 : this.b(bkc.a.b)) {
         $$2 += $$0 * $$3.d();
      }

      for (bkc $$4 : this.b(bkc.a.c)) {
         $$2 *= 1.0 + $$4.d();
      }

      return this.a.a($$2);
   }

   private Collection<bkc> b(bkc.a $$0) {
      return this.b.getOrDefault($$0, Collections.emptySet());
   }

   public void a(bka $$0) {
      this.e = $$0.e;
      this.c.clear();
      this.c.putAll($$0.c);
      this.d.clear();
      this.d.addAll($$0.d);
      this.b.clear();
      $$0.b.forEach(($$0x, $$1) -> this.a($$0x).addAll($$1));
      this.d();
   }

   public qr g() {
      qr $$0 = new qr();
      $$0.a("Name", jb.v.b(this.a).toString());
      $$0.a("Base", this.e);
      if (!this.d.isEmpty()) {
         qx $$1 = new qx();

         for (bkc $$2 : this.d) {
            $$1.add($$2.e());
         }

         $$0.a("Modifiers", $$1);
      }

      return $$0;
   }

   public void a(qr $$0) {
      this.e = $$0.k("Base");
      if ($$0.b("Modifiers", 9)) {
         qx $$1 = $$0.c("Modifiers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            bkc $$3 = bkc.a($$1.a($$2));
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
