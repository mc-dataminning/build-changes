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

public class bwj {
   private static final Logger a = LogUtils.getLogger();
   private final Map<jq<bwh>, bwi> b = new Object2ObjectOpenHashMap();
   private final Set<bwi> c = new ObjectOpenHashSet();
   private final Set<bwi> d = new ObjectOpenHashSet();
   private final bwl e;

   public bwj(bwl $$0) {
      this.e = $$0;
   }

   private void a(bwi $$0) {
      this.d.add($$0);
      if ($$0.a().a().b()) {
         this.c.add($$0);
      }
   }

   public Set<bwi> a() {
      return this.c;
   }

   public Set<bwi> b() {
      return this.d;
   }

   public Collection<bwi> c() {
      return this.b.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public bwi a(jq<bwh> $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.e.a(this::a, $$0x));
   }

   public boolean b(jq<bwh> $$0) {
      return this.b.get($$0) != null || this.e.c($$0);
   }

   public boolean a(jq<bwh> $$0, all $$1) {
      bwi $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.e.b($$0, $$1);
   }

   public double c(jq<bwh> $$0) {
      bwi $$1 = this.b.get($$0);
      return $$1 != null ? $$1.g() : this.e.a($$0);
   }

   public double d(jq<bwh> $$0) {
      bwi $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.e.b($$0);
   }

   public double b(jq<bwh> $$0, all $$1) {
      bwi $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).c() : this.e.a($$0, $$1);
   }

   public void a(Multimap<jq<bwh>, bwk> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         bwi $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.c($$1.b());
            $$2.b($$1);
         }
      });
   }

   public void b(Multimap<jq<bwh>, bwk> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         bwi $$2 = this.b.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.c($$1x.b()));
         }
      });
   }

   public void a(bwj $$0) {
      $$0.b.values().forEach($$0x -> {
         bwi $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public void b(bwj $$0) {
      $$0.b.values().forEach($$0x -> {
         bwi $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.b());
         }
      });
   }

   public void c(bwj $$0) {
      $$0.b.values().forEach($$0x -> {
         bwi $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.d());
         }
      });
   }

   public ut d() {
      ut $$0 = new ut();

      for (bwi $$1 : this.b.values()) {
         $$0.add($$1.h());
      }

      return $$0;
   }

   public void a(ut $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         un $$2 = $$0.a($$1);
         String $$3 = $$2.l("id");
         all $$4 = all.c($$3);
         if ($$4 != null) {
            ae.a(lz.s.c($$4), $$1x -> {
               bwi $$2x = this.a($$1x);
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
