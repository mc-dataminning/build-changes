import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bkb {
   private static final Logger a = LogUtils.getLogger();
   private final Map<bjz, bka> b = Maps.newHashMap();
   private final Set<bka> c = Sets.newHashSet();
   private final bkd d;

   public bkb(bkd $$0) {
      this.d = $$0;
   }

   private void a(bka $$0) {
      if ($$0.a().b()) {
         this.c.add($$0);
      }
   }

   public Set<bka> a() {
      return this.c;
   }

   public Collection<bka> b() {
      return this.b.values().stream().filter($$0 -> $$0.a().b()).collect(Collectors.toList());
   }

   @Nullable
   public bka a(bjz $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.d.a(this::a, $$0x));
   }

   @Nullable
   public bka a(he<bjz> $$0) {
      return this.a($$0.a());
   }

   public boolean b(bjz $$0) {
      return this.b.get($$0) != null || this.d.c($$0);
   }

   public boolean b(he<bjz> $$0) {
      return this.b($$0.a());
   }

   public boolean a(bjz $$0, UUID $$1) {
      bka $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
   }

   public boolean a(he<bjz> $$0, UUID $$1) {
      return this.a($$0.a(), $$1);
   }

   public double c(bjz $$0) {
      bka $$1 = this.b.get($$0);
      return $$1 != null ? $$1.f() : this.d.a($$0);
   }

   public double d(bjz $$0) {
      bka $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.d.b($$0);
   }

   public double b(bjz $$0, UUID $$1) {
      bka $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).d() : this.d.a($$0, $$1);
   }

   public double b(he<bjz> $$0, UUID $$1) {
      return this.b($$0.a(), $$1);
   }

   public void a(Multimap<bjz, bkc> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         bka $$2 = this.b.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.b($$1x.a()));
         }
      });
   }

   public void b(Multimap<bjz, bkc> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         bka $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.b($$1.a());
            $$2.b($$1);
         }
      });
   }

   public void a(bkb $$0) {
      $$0.b.values().forEach($$0x -> {
         bka $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public qx c() {
      qx $$0 = new qx();

      for (bka $$1 : this.b.values()) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void a(qx $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qr $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         ac.a(jb.v.b(aer.a($$3)), $$1x -> {
            bka $$2x = this.a($$1x);
            if ($$2x != null) {
               $$2x.a($$2);
            }
         }, () -> a.warn("Ignoring unknown attribute '{}'", $$3));
      }
   }
}
