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

public class buw {
   private static final Logger a = LogUtils.getLogger();
   private final Map<ji<buu>, buv> b = new Object2ObjectOpenHashMap();
   private final Set<buv> c = new ObjectOpenHashSet();
   private final buy d;

   public buw(buy $$0) {
      this.d = $$0;
   }

   private void a(buv $$0) {
      if ($$0.a().a().b()) {
         this.c.add($$0);
      }
   }

   public Set<buv> a() {
      return this.c;
   }

   public Collection<buv> b() {
      return this.b.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public buv a(ji<buu> $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.d.a(this::a, $$0x));
   }

   public boolean b(ji<buu> $$0) {
      return this.b.get($$0) != null || this.d.c($$0);
   }

   public boolean a(ji<buu> $$0, UUID $$1) {
      buv $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
   }

   public double c(ji<buu> $$0) {
      buv $$1 = this.b.get($$0);
      return $$1 != null ? $$1.f() : this.d.a($$0);
   }

   public double d(ji<buu> $$0) {
      buv $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.d.b($$0);
   }

   public double b(ji<buu> $$0, UUID $$1) {
      buv $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).d() : this.d.a($$0, $$1);
   }

   public void a(buw $$0) {
      $$0.b.values().forEach($$0x -> {
         buv $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public uy c() {
      uy $$0 = new uy();

      for (buv $$1 : this.b.values()) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void a(uy $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         us $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         alf $$4 = alf.a($$3);
         if ($$4 != null) {
            ac.a(lp.u.c($$4), $$1x -> {
               buv $$2x = this.a($$1x);
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
