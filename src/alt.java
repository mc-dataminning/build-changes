import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alt {
   private static final Logger a = LogUtils.getLogger();
   private static final ale b = ale.b("tick");
   private static final ale c = ale.b("load");
   private final MinecraftServer d;
   private List<ii<eu>> e = ImmutableList.of();
   private boolean f;
   private als g;

   public alt(MinecraftServer $$0, als $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<eu> a() {
      return this.d.aG().a();
   }

   public void b() {
      if (this.d.aP().i()) {
         if (this.f) {
            this.f = false;
            Collection<ii<eu>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<ii<eu>> $$0, ale $$1) {
      this.d.aS().a($$1::toString);

      for (ii<eu> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aS().c();
   }

   public void a(ii<eu> $$0, eu $$1) {
      bog $$2 = this.d.aS();
      $$2.a(() -> "function " + $$0.a());

      try {
         ik<eu> $$3 = $$0.a(null, this.a());
         ev.a($$1, $$2x -> hu.a($$2x, $$3, $$1, er.a));
      } catch (ex var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(als $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(als $$0) {
      this.e = List.copyOf($$0.b(b));
      this.f = true;
   }

   public eu c() {
      return this.d.aH().a(2).a();
   }

   public Optional<ii<eu>> a(ale $$0) {
      return this.g.a($$0);
   }

   public List<ii<eu>> b(ale $$0) {
      return this.g.b($$0);
   }

   public Iterable<ale> d() {
      return this.g.a().keySet();
   }

   public Iterable<ale> e() {
      return this.g.b();
   }
}
