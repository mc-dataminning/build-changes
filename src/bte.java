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

public class bte {
   private static final Logger a = LogUtils.getLogger();
   private final Map<iw<btc>, btd> b = new Object2ObjectOpenHashMap();
   private final Set<btd> c = new ObjectOpenHashSet();
   private final btg d;

   public bte(btg $$0) {
      this.d = $$0;
   }

   private void a(btd $$0) {
      if ($$0.a().a().b()) {
         this.c.add($$0);
      }
   }

   public Set<btd> a() {
      return this.c;
   }

   public Collection<btd> b() {
      return this.b.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public btd a(iw<btc> $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> this.d.a(this::a, $$0x));
   }

   public boolean b(iw<btc> $$0) {
      return this.b.get($$0) != null || this.d.c($$0);
   }

   public boolean a(iw<btc> $$0, UUID $$1) {
      btd $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
   }

   public double c(iw<btc> $$0) {
      btd $$1 = this.b.get($$0);
      return $$1 != null ? $$1.f() : this.d.a($$0);
   }

   public double d(iw<btc> $$0) {
      btd $$1 = this.b.get($$0);
      return $$1 != null ? $$1.b() : this.d.b($$0);
   }

   public double b(iw<btc> $$0, UUID $$1) {
      btd $$2 = this.b.get($$0);
      return $$2 != null ? $$2.a($$1).d() : this.d.a($$0, $$1);
   }

   public void a(bte $$0) {
      $$0.b.values().forEach($$0x -> {
         btd $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public ug c() {
      ug $$0 = new ug();

      for (btd $$1 : this.b.values()) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void a(ug $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ua $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         akh $$4 = akh.a($$3);
         if ($$4 != null) {
            ac.a(ld.u.c($$4), $$1x -> {
               btd $$2x = this.a($$1x);
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
