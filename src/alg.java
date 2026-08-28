import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alg {
   private static final Logger a = LogUtils.getLogger();
   private static final akr b = akr.b("tick");
   private static final akr c = akr.b("load");
   private final MinecraftServer d;
   private List<ig<et>> e = ImmutableList.of();
   private boolean f;
   private alf g;

   public alg(MinecraftServer $$0, alf $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<et> a() {
      return this.d.aH().a();
   }

   public void b() {
      if (this.d.aQ().i()) {
         if (this.f) {
            this.f = false;
            Collection<ig<et>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<ig<et>> $$0, akr $$1) {
      this.d.aT().a($$1::toString);

      for (ig<et> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aT().c();
   }

   public void a(ig<et> $$0, et $$1) {
      bnf $$2 = this.d.aT();
      $$2.a(() -> "function " + $$0.a());

      try {
         ii<et> $$3 = $$0.a(null, this.a());
         eu.a($$1, $$2x -> hs.a($$2x, $$3, $$1, eq.a));
      } catch (ew var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(alf $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(alf $$0) {
      this.e = ImmutableList.copyOf($$0.b(b));
      this.f = true;
   }

   public et c() {
      return this.d.aI().a(2).a();
   }

   public Optional<ig<et>> a(akr $$0) {
      return this.g.a($$0);
   }

   public Collection<ig<et>> b(akr $$0) {
      return this.g.b($$0);
   }

   public Iterable<akr> d() {
      return this.g.a().keySet();
   }

   public Iterable<akr> e() {
      return this.g.b();
   }
}
