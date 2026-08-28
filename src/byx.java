import com.google.common.collect.Multimap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class byx {
   private final Map<jf<byv>, byw> a = new Object2ObjectOpenHashMap();
   private final Set<byw> b = new ObjectOpenHashSet();
   private final Set<byw> c = new ObjectOpenHashSet();
   private final byz d;

   public byx(byz $$0) {
      this.d = $$0;
   }

   private void a(byw $$0) {
      this.c.add($$0);
      if ($$0.a().a().b()) {
         this.b.add($$0);
      }
   }

   public Set<byw> a() {
      return this.b;
   }

   public Set<byw> b() {
      return this.c;
   }

   public Collection<byw> c() {
      return this.a.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public byw a(jf<byv> $$0) {
      return this.a.computeIfAbsent($$0, $$0x -> this.d.a(this::a, $$0x));
   }

   public boolean b(jf<byv> $$0) {
      return this.a.get($$0) != null || this.d.c($$0);
   }

   public boolean a(jf<byv> $$0, ali $$1) {
      byw $$2 = this.a.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
   }

   public double c(jf<byv> $$0) {
      byw $$1 = this.a.get($$0);
      return $$1 != null ? $$1.g() : this.d.a($$0);
   }

   public double d(jf<byv> $$0) {
      byw $$1 = this.a.get($$0);
      return $$1 != null ? $$1.b() : this.d.b($$0);
   }

   public double b(jf<byv> $$0, ali $$1) {
      byw $$2 = this.a.get($$0);
      return $$2 != null ? $$2.a($$1).b() : this.d.a($$0, $$1);
   }

   public void a(Multimap<jf<byv>, byy> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         byw $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.c($$1.a());
            $$2.b($$1);
         }
      });
   }

   public void b(Multimap<jf<byv>, byy> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         byw $$2 = this.a.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.c($$1x.a()));
         }
      });
   }

   public void a(byx $$0) {
      $$0.a.values().forEach($$0x -> {
         byw $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public void b(byx $$0) {
      $$0.a.values().forEach($$0x -> {
         byw $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.b());
         }
      });
   }

   public void c(byx $$0) {
      $$0.a.values().forEach($$0x -> {
         byw $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.d());
         }
      });
   }

   public boolean e(jf<byv> $$0) {
      if (!this.d.c($$0)) {
         return false;
      } else {
         byw $$1 = this.a.get($$0);
         if ($$1 != null) {
            $$1.a(this.d.b($$0));
         }

         return true;
      }
   }

   public uf d() {
      uf $$0 = new uf();

      for (byw $$1 : this.a.values()) {
         $$0.add($$1.h());
      }

      return $$0;
   }

   public void a(uf $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         tz $$2 = $$0.b($$1);
         $$2.<jf<byv>>a("id", byw.b).map(this::a).ifPresent($$1x -> $$1x.a($$2));
      }
   }
}
