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

public class but {
   private static final Logger a = LogUtils.getLogger();
   private final Map<ji<bur>, bus> b = new Object2ObjectOpenHashMap();
   private final Set<bus> c = new ObjectOpenHashSet();
   private final buv d;

   public but(buv $$0) {
      this.d = $$0;
   }

   private void a(bus $$0) {
      if ($$0.a().a().b()) {
         this.c.add($$0);
      }
   }

   public Set<bus> a() {
      return this.c;
   }

   public Collection<bus> b() {
      return this.b.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public bus a(ji<bur> $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.d.a(this::a, $$0x));
   }

   public boolean b(ji<bur> $$0) {
      return this.b.get($$0) != null || this.d.c($$0);
   }

   public boolean a(ji<bur> $$0, UUID $$1) {
      bus $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
   }

   public double c(ji<bur> $$0) {
      bus $$1 = this.b.get($$0);
      return $$1 != null ? $$1.f() : this.d.a($$0);
   }

   public double d(ji<bur> $$0) {
      bus $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.d.b($$0);
   }

   public double b(ji<bur> $$0, UUID $$1) {
      bus $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).d() : this.d.a($$0, $$1);
   }

   public void a(but $$0) {
      $$0.b.values().forEach($$0x -> {
         bus $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public ux c() {
      ux $$0 = new ux();

      for (bus $$1 : this.b.values()) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void a(ux $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ur $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         ale $$4 = ale.a($$3);
         if ($$4 != null) {
            ac.a(lp.u.c($$4), $$1x -> {
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
