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

public class bur {
   private static final Logger a = LogUtils.getLogger();
   private final Map<jm<bup>, buq> b = new Object2ObjectOpenHashMap();
   private final Set<buq> c = new ObjectOpenHashSet();
   private final Set<buq> d = new ObjectOpenHashSet();
   private final but e;

   public bur(but $$0) {
      this.e = $$0;
   }

   private void a(buq $$0) {
      this.d.add($$0);
      if ($$0.a().a().b()) {
         this.c.add($$0);
      }
   }

   public Set<buq> a() {
      return this.c;
   }

   public Set<buq> b() {
      return this.d;
   }

   public Collection<buq> c() {
      return this.b.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public buq a(jm<bup> $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.e.a(this::a, $$0x));
   }

   public boolean b(jm<bup> $$0) {
      return this.b.get($$0) != null || this.e.c($$0);
   }

   public boolean a(jm<bup> $$0, akq $$1) {
      buq $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.e.b($$0, $$1);
   }

   public double c(jm<bup> $$0) {
      buq $$1 = this.b.get($$0);
      return $$1 != null ? $$1.f() : this.e.a($$0);
   }

   public double d(jm<bup> $$0) {
      buq $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.e.b($$0);
   }

   public double b(jm<bup> $$0, akq $$1) {
      buq $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).c() : this.e.a($$0, $$1);
   }

   public void a(Multimap<jm<bup>, bus> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         buq $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.c($$1.b());
            $$2.b($$1);
         }
      });
   }

   public void b(Multimap<jm<bup>, bus> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         buq $$2 = this.b.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.c($$1x.b()));
         }
      });
   }

   public void a(bur $$0) {
      $$0.b.values().forEach($$0x -> {
         buq $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public void b(bur $$0) {
      $$0.b.values().forEach($$0x -> {
         buq $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.b());
         }
      });
   }

   public ug d() {
      ug $$0 = new ug();

      for (buq $$1 : this.b.values()) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void a(ug $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ua $$2 = $$0.a($$1);
         String $$3 = $$2.l("id");
         akq $$4 = akq.c($$3);
         if ($$4 != null) {
            ad.a(lt.s.c($$4), $$1x -> {
               buq $$2x = this.a($$1x);
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
