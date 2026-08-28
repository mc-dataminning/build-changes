import com.google.common.collect.Multimap;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bym {
   private static final Logger a = LogUtils.getLogger();
   private final Map<jf<byk>, byl> b = new Object2ObjectOpenHashMap();
   private final Set<byl> c = new ObjectOpenHashSet();
   private final Set<byl> d = new ObjectOpenHashSet();
   private final byo e;

   public bym(byo $$0) {
      this.e = $$0;
   }

   private void a(byl $$0) {
      this.d.add($$0);
      if ($$0.a().a().b()) {
         this.c.add($$0);
      }
   }

   public Set<byl> a() {
      return this.c;
   }

   public Set<byl> b() {
      return this.d;
   }

   public Collection<byl> c() {
      return this.b.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public byl a(jf<byk> $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.e.a(this::a, $$0x));
   }

   public boolean b(jf<byk> $$0) {
      return this.b.get($$0) != null || this.e.c($$0);
   }

   public boolean a(jf<byk> $$0, alg $$1) {
      byl $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.e.b($$0, $$1);
   }

   public double c(jf<byk> $$0) {
      byl $$1 = this.b.get($$0);
      return $$1 != null ? $$1.g() : this.e.a($$0);
   }

   public double d(jf<byk> $$0) {
      byl $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.e.b($$0);
   }

   public double b(jf<byk> $$0, alg $$1) {
      byl $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).b() : this.e.a($$0, $$1);
   }

   public void a(Multimap<jf<byk>, byn> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         byl $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.c($$1.a());
            $$2.b($$1);
         }
      });
   }

   public void b(Multimap<jf<byk>, byn> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         byl $$2 = this.b.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.c($$1x.a()));
         }
      });
   }

   public void a(bym $$0) {
      $$0.b.values().forEach($$0x -> {
         byl $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public void b(bym $$0) {
      $$0.b.values().forEach($$0x -> {
         byl $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.b());
         }
      });
   }

   public void c(bym $$0) {
      $$0.b.values().forEach($$0x -> {
         byl $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.d());
         }
      });
   }

   public boolean e(jf<byk> $$0) {
      if (!this.e.c($$0)) {
         return false;
      } else {
         byl $$1 = this.b.get($$0);
         if ($$1 != null) {
            $$1.a(this.e.b($$0));
         }

         return true;
      }
   }

   public uf d() {
      uf $$0 = new uf();

      for (byl $$1 : this.b.values()) {
         $$0.add($$1.h());
      }

      return $$0;
   }

   public void a(uf $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         tz $$2 = $$0.a($$1);
         String $$3 = $$2.j("id");
         alg $$4 = alg.c($$3);
         if ($$4 != null) {
            ag.a(mg.s.c($$4), $$1x -> {
               byl $$2x = this.a($$1x);
               if ($$2x != null) {
                  $$2x.a($$2);
               }
            }, () -> a.warn("Ignoring unknown attribute '{}'", $$4));
         } else {
            a.warn("Ignoring malformed attribute '{}'", $$3);
         }
      }
   }
}
