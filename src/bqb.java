import com.google.common.collect.Multimap;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqb {
   private static final Logger a = LogUtils.getLogger();
   private final Map<il<bpz>, bqa> b = new Object2ObjectOpenHashMap();
   private final Set<bqa> c = new ObjectOpenHashSet();
   private final bqd d;

   public bqb(bqd $$0) {
      this.d = $$0;
   }

   private void a(bqa $$0) {
      if ($$0.a().a().b()) {
         this.c.add($$0);
      }
   }

   public Set<bqa> a() {
      return this.c;
   }

   public Collection<bqa> b() {
      return this.b.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public bqa a(il<bpz> $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.d.a(this::a, $$0x));
   }

   public boolean b(il<bpz> $$0) {
      return this.b.get($$0) != null || this.d.c($$0);
   }

   public boolean a(il<bpz> $$0, UUID $$1) {
      bqa $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
   }

   public double c(il<bpz> $$0) {
      bqa $$1 = this.b.get($$0);
      return $$1 != null ? $$1.f() : this.d.a($$0);
   }

   public double d(il<bpz> $$0) {
      bqa $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.d.b($$0);
   }

   public double b(il<bpz> $$0, UUID $$1) {
      bqa $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).c() : this.d.a($$0, $$1);
   }

   public void a(Multimap<il<bpz>, bqc> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         bqa $$2 = this.b.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.b($$1x.a()));
         }
      });
   }

   public void b(Multimap<il<bpz>, bqc> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         bqa $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.b($$1.a());
            $$2.c($$1);
         }
      });
   }

   public void a(bqb $$0) {
      $$0.b.values().forEach($$0x -> {
         bqa $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public te c() {
      te $$0 = new te();

      for (bqa $$1 : this.b.values()) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void a(te $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sy $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         ajc $$4 = ajc.a($$3);
         if ($$4 != null) {
            ac.a(kh.u.c($$4), $$1x -> {
               bqa $$2x = this.a($$1x);
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
