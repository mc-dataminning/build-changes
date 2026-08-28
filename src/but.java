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

public class but {
   private static final Logger a = LogUtils.getLogger();
   private final Map<jm<bur>, bus> b = new Object2ObjectOpenHashMap();
   private final Set<bus> c = new ObjectOpenHashSet();
   private final Set<bus> d = new ObjectOpenHashSet();
   private final buv e;

   public but(buv $$0) {
      this.e = $$0;
   }

   private void a(bus $$0) {
      this.d.add($$0);
      if ($$0.a().a().b()) {
         this.c.add($$0);
      }
   }

   public Set<bus> a() {
      return this.c;
   }

   public Set<bus> b() {
      return this.d;
   }

   public Collection<bus> c() {
      return this.b.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public bus a(jm<bur> $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.e.a(this::a, $$0x));
   }

   public boolean b(jm<bur> $$0) {
      return this.b.get($$0) != null || this.e.c($$0);
   }

   public boolean a(jm<bur> $$0, akr $$1) {
      bus $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.e.b($$0, $$1);
   }

   public double c(jm<bur> $$0) {
      bus $$1 = this.b.get($$0);
      return $$1 != null ? $$1.f() : this.e.a($$0);
   }

   public double d(jm<bur> $$0) {
      bus $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.e.b($$0);
   }

   public double b(jm<bur> $$0, akr $$1) {
      bus $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).c() : this.e.a($$0, $$1);
   }

   public void a(Multimap<jm<bur>, buu> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         bus $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.c($$1.b());
            $$2.b($$1);
         }
      });
   }

   public void b(Multimap<jm<bur>, buu> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         bus $$2 = this.b.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.c($$1x.b()));
         }
      });
   }

   public void a(but $$0) {
      $$0.b.values().forEach($$0x -> {
         bus $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public void b(but $$0) {
      $$0.b.values().forEach($$0x -> {
         bus $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.b());
         }
      });
   }

   public uh d() {
      uh $$0 = new uh();

      for (bus $$1 : this.b.values()) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void a(uh $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ub $$2 = $$0.a($$1);
         String $$3 = $$2.l("id");
         akr $$4 = akr.c($$3);
         if ($$4 != null) {
            ad.a(lt.s.c($$4), $$1x -> {
               bus $$2x = this.a($$1x);
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
