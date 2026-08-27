import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ahh {
   private static final Logger a = LogUtils.getLogger();
   private static final agt b = new agt("tick");
   private static final agt c = new agt("load");
   private final MinecraftServer d;
   private List<gz<ds>> e = ImmutableList.of();
   private boolean f;
   private ahg g;

   public ahh(MinecraftServer $$0, ahg $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<ds> a() {
      return this.d.aE().a();
   }

   public void b() {
      if (this.d.aO().i()) {
         if (this.f) {
            this.f = false;
            Collection<gz<ds>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<gz<ds>> $$0, agt $$1) {
      this.d.aR().a($$1::toString);

      for (gz<ds> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aR().c();
   }

   public void a(gz<ds> $$0, ds $$1) {
      bgc $$2 = this.d.aR();
      $$2.a(() -> "function " + $$0.a());

      try {
         hb<ds> $$3 = $$0.a(null, this.a(), $$1);
         dt.a($$1, $$2x -> gm.a($$2x, $$3, $$1, dp.a));
      } catch (dv var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(ahg $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(ahg $$0) {
      this.e = ImmutableList.copyOf($$0.b(b));
      this.f = true;
   }

   public ds c() {
      return this.d.aF().a(2).a();
   }

   public Optional<gz<ds>> a(agt $$0) {
      return this.g.a($$0);
   }

   public Collection<gz<ds>> b(agt $$0) {
      return this.g.b($$0);
   }

   public Iterable<agt> d() {
      return this.g.a().keySet();
   }

   public Iterable<agt> e() {
      return this.g.b();
   }
}
