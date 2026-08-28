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

public class bud {
   private static final Logger a = LogUtils.getLogger();
   private final Map<jj<bub>, buc> b = new Object2ObjectOpenHashMap();
   private final Set<buc> c = new ObjectOpenHashSet();
   private final buf d;

   public bud(buf $$0) {
      this.d = $$0;
   }

   private void a(buc $$0) {
      if ($$0.a().a().b()) {
         this.c.add($$0);
      }
   }

   public Set<buc> a() {
      return this.c;
   }

   public Collection<buc> b() {
      return this.b.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public buc a(jj<bub> $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.d.a(this::a, $$0x));
   }

   public boolean b(jj<bub> $$0) {
      return this.b.get($$0) != null || this.d.c($$0);
   }

   public boolean a(jj<bub> $$0, UUID $$1) {
      buc $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
   }

   public double c(jj<bub> $$0) {
      buc $$1 = this.b.get($$0);
      return $$1 != null ? $$1.f() : this.d.a($$0);
   }

   public double d(jj<bub> $$0) {
      buc $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.d.b($$0);
   }

   public double b(jj<bub> $$0, UUID $$1) {
      buc $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).d() : this.d.a($$0, $$1);
   }

   public void a(Multimap<jj<bub>, bue> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         buc $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.b($$1.b());
            $$2.c($$1);
         }
      });
   }

   public void b(Multimap<jj<bub>, bue> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         buc $$2 = this.b.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.b($$1x.b()));
         }
      });
   }

   public void a(bud $$0) {
      $$0.b.values().forEach($$0x -> {
         buc $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public ud c() {
      ud $$0 = new ud();

      for (buc $$1 : this.b.values()) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void a(ud $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         tx $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         akk $$4 = akk.a($$3);
         if ($$4 != null) {
            ac.a(lq.s.c($$4), $$1x -> {
               buc $$2x = this.a($$1x);
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
