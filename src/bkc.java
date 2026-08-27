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

public class bkc {
   private static final Logger a = LogUtils.getLogger();
   private final Map<bka, bkb> b = Maps.newHashMap();
   private final Set<bkb> c = Sets.newHashSet();
   private final bke d;

   public bkc(bke $$0) {
      this.d = $$0;
   }

   private void a(bkb $$0) {
      if ($$0.a().b()) {
         this.c.add($$0);
      }
   }

   public Set<bkb> a() {
      return this.c;
   }

   public Collection<bkb> b() {
      return this.b.values().stream().filter($$0 -> $$0.a().b()).collect(Collectors.toList());
   }

   @Nullable
   public bkb a(bka $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.d.a(this::a, $$0x));
   }

   @Nullable
   public bkb a(he<bka> $$0) {
      return this.a($$0.a());
   }

   public boolean b(bka $$0) {
      return this.b.get($$0) != null || this.d.c($$0);
   }

   public boolean b(he<bka> $$0) {
      return this.b($$0.a());
   }

   public boolean a(bka $$0, UUID $$1) {
      bkb $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
   }

   public boolean a(he<bka> $$0, UUID $$1) {
      return this.a($$0.a(), $$1);
   }

   public double c(bka $$0) {
      bkb $$1 = this.b.get($$0);
      return $$1 != null ? $$1.f() : this.d.a($$0);
   }

   public double d(bka $$0) {
      bkb $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.d.b($$0);
   }

   public double b(bka $$0, UUID $$1) {
      bkb $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).d() : this.d.a($$0, $$1);
   }

   public double b(he<bka> $$0, UUID $$1) {
      return this.b($$0.a(), $$1);
   }

   public void a(Multimap<bka, bkd> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         bkb $$2 = this.b.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.b($$1x.a()));
         }
      });
   }

   public void b(Multimap<bka, bkd> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         bkb $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.b($$1.a());
            $$2.b($$1);
         }
      });
   }

   public void a(bkc $$0) {
      $$0.b.values().forEach($$0x -> {
         bkb $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public qx c() {
      qx $$0 = new qx();

      for (bkb $$1 : this.b.values()) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void a(qx $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qr $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         ac.a(jb.v.b(aer.a($$3)), $$1x -> {
            bkb $$2x = this.a($$1x);
            if ($$2x != null) {
               $$2x.a($$2);
            }
         }, () -> a.warn("Ignoring unknown attribute '{}'", $$3));
      }
   }
}
