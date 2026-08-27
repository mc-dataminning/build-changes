import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class akw {
   private static final Logger a = LogUtils.getLogger();
   private static final akh b = new akh("tick");
   private static final akh c = new akh("load");
   private final MinecraftServer d;
   private List<hp<ed>> e = ImmutableList.of();
   private boolean f;
   private akv g;

   public akw(MinecraftServer $$0, akv $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<ed> a() {
      return this.d.aH().a();
   }

   public void b() {
      if (this.d.aQ().i()) {
         if (this.f) {
            this.f = false;
            Collection<hp<ed>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<hp<ed>> $$0, akh $$1) {
      this.d.aT().a($$1::toString);

      for (hp<ed> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aT().c();
   }

   public void a(hp<ed> $$0, ed $$1) {
      bma $$2 = this.d.aT();
      $$2.a(() -> "function " + $$0.a());

      try {
         hr<ed> $$3 = $$0.a(null, this.a());
         ee.a($$1, $$2x -> hc.a($$2x, $$3, $$1, ea.a));
      } catch (eg var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(akv $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(akv $$0) {
      this.e = ImmutableList.copyOf($$0.b(b));
      this.f = true;
   }

   public ed c() {
      return this.d.aI().a(2).a();
   }

   public Optional<hp<ed>> a(akh $$0) {
      return this.g.a($$0);
   }

   public Collection<hp<ed>> b(akh $$0) {
      return this.g.b($$0);
   }

   public Iterable<akh> d() {
      return this.g.a().keySet();
   }

   public Iterable<akh> e() {
      return this.g.b();
   }
}
