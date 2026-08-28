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

public class buh {
   private static final Logger a = LogUtils.getLogger();
   private final Map<jj<buf>, bug> b = new Object2ObjectOpenHashMap();
   private final Set<bug> c = new ObjectOpenHashSet();
   private final Set<bug> d = new ObjectOpenHashSet();
   private final buj e;

   public buh(buj $$0) {
      this.e = $$0;
   }

   private void a(bug $$0) {
      this.d.add($$0);
      if ($$0.a().a().b()) {
         this.c.add($$0);
      }
   }

   public Set<bug> a() {
      return this.c;
   }

   public Set<bug> b() {
      return this.d;
   }

   public Collection<bug> c() {
      return this.b.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public bug a(jj<buf> $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.e.a(this::a, $$0x));
   }

   public boolean b(jj<buf> $$0) {
      return this.b.get($$0) != null || this.e.c($$0);
   }

   public boolean a(jj<buf> $$0, UUID $$1) {
      bug $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.e.b($$0, $$1);
   }

   public double c(jj<buf> $$0) {
      bug $$1 = this.b.get($$0);
      return $$1 != null ? $$1.f() : this.e.a($$0);
   }

   public double d(jj<buf> $$0) {
      bug $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.e.b($$0);
   }

   public double b(jj<buf> $$0, UUID $$1) {
      bug $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).d() : this.e.a($$0, $$1);
   }

   public void a(Multimap<jj<buf>, bui> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         bug $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.b($$1.b());
            $$2.c($$1);
         }
      });
   }

   public void b(Multimap<jj<buf>, bui> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         bug $$2 = this.b.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.b($$1x.b()));
         }
      });
   }

   public void a(buh $$0) {
      $$0.b.values().forEach($$0x -> {
         bug $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public void b(buh $$0) {
      $$0.b.values().forEach($$0x -> {
         bug $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.b());
         }
      });
   }

   public ud d() {
      ud $$0 = new ud();

      for (bug $$1 : this.b.values()) {
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
               bug $$2x = this.a($$1x);
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
