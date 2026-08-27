import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class akt {
   private static final Logger a = LogUtils.getLogger();
   private static final akf b = new akf("tick");
   private static final akf c = new akf("load");
   private final MinecraftServer d;
   private List<ho<ec>> e = ImmutableList.of();
   private boolean f;
   private aks g;

   public akt(MinecraftServer $$0, aks $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<ec> a() {
      return this.d.aH().a();
   }

   public void b() {
      if (this.d.aR().i()) {
         if (this.f) {
            this.f = false;
            Collection<ho<ec>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<ho<ec>> $$0, akf $$1) {
      this.d.aU().a($$1::toString);

      for (ho<ec> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aU().c();
   }

   public void a(ho<ec> $$0, ec $$1) {
      ble $$2 = this.d.aU();
      $$2.a(() -> "function " + $$0.a());

      try {
         hq<ec> $$3 = $$0.a(null, this.a());
         ed.a($$1, $$2x -> hb.a($$2x, $$3, $$1, dz.a));
      } catch (ef var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(aks $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(aks $$0) {
      this.e = ImmutableList.copyOf($$0.b(b));
      this.f = true;
   }

   public ec c() {
      return this.d.aI().a(2).a();
   }

   public Optional<ho<ec>> a(akf $$0) {
      return this.g.a($$0);
   }

   public Collection<ho<ec>> b(akf $$0) {
      return this.g.b($$0);
   }

   public Iterable<akf> d() {
      return this.g.a().keySet();
   }

   public Iterable<akf> e() {
      return this.g.b();
   }
}
