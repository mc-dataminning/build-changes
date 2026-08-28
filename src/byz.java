import com.google.common.collect.Multimap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class byz {
   private final Map<jg<byx>, byy> a = new Object2ObjectOpenHashMap();
   private final Set<byy> b = new ObjectOpenHashSet();
   private final Set<byy> c = new ObjectOpenHashSet();
   private final bzb d;

   public byz(bzb $$0) {
      this.d = $$0;
   }

   private void a(byy $$0) {
      this.c.add($$0);
      if ($$0.a().a().b()) {
         this.b.add($$0);
      }
   }

   public Set<byy> a() {
      return this.b;
   }

   public Set<byy> b() {
      return this.c;
   }

   public Collection<byy> c() {
      return this.a.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public byy a(jg<byx> $$0) {
      return this.a.computeIfAbsent($$0, $$0x -> this.d.a(this::a, $$0x));
   }

   public boolean b(jg<byx> $$0) {
      return this.a.get($$0) != null || this.d.c($$0);
   }

   public boolean a(jg<byx> $$0, alk $$1) {
      byy $$2 = this.a.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
   }

   public double c(jg<byx> $$0) {
      byy $$1 = this.a.get($$0);
      return $$1 != null ? $$1.g() : this.d.a($$0);
   }

   public double d(jg<byx> $$0) {
      byy $$1 = this.a.get($$0);
      return $$1 != null ? $$1.b() : this.d.b($$0);
   }

   public double b(jg<byx> $$0, alk $$1) {
      byy $$2 = this.a.get($$0);
      return $$2 != null ? $$2.a($$1).b() : this.d.a($$0, $$1);
   }

   public void a(Multimap<jg<byx>, bza> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         byy $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.c($$1.a());
            $$2.b($$1);
         }
      });
   }

   public void b(Multimap<jg<byx>, bza> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         byy $$2 = this.a.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.c($$1x.a()));
         }
      });
   }

   public void a(byz $$0) {
      $$0.a.values().forEach($$0x -> {
         byy $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public void b(byz $$0) {
      $$0.a.values().forEach($$0x -> {
         byy $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.b());
         }
      });
   }

   public void c(byz $$0) {
      $$0.a.values().forEach($$0x -> {
         byy $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.d());
         }
      });
   }

   public boolean e(jg<byx> $$0) {
      if (!this.d.c($$0)) {
         return false;
      } else {
         byy $$1 = this.a.get($$0);
         if ($$1 != null) {
            $$1.a(this.d.b($$0));
         }

         return true;
      }
   }

   public ug d() {
      ug $$0 = new ug();

      for (byy $$1 : this.a.values()) {
         $$0.add($$1.h());
      }

      return $$0;
   }

   public void a(ug $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ua $$2 = $$0.b($$1);
         $$2.<jg<byx>>a("id", byy.b).map(this::a).ifPresent($$1x -> $$1x.a($$2));
      }
   }
}
