import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alq {
   private static final Logger a = LogUtils.getLogger();
   private static final alb b = alb.b("tick");
   private static final alb c = alb.b("load");
   private final MinecraftServer d;
   private List<ih<et>> e = ImmutableList.of();
   private boolean f;
   private alp g;

   public alq(MinecraftServer $$0, alp $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<et> a() {
      return this.d.aG().a();
   }

   public void b() {
      if (this.d.aP().i()) {
         if (this.f) {
            this.f = false;
            Collection<ih<et>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<ih<et>> $$0, alb $$1) {
      this.d.aS().a($$1::toString);

      for (ih<et> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aS().c();
   }

   public void a(ih<et> $$0, et $$1) {
      bny $$2 = this.d.aS();
      $$2.a(() -> "function " + $$0.a());

      try {
         ij<et> $$3 = $$0.a(null, this.a());
         eu.a($$1, $$2x -> ht.a($$2x, $$3, $$1, eq.a));
      } catch (ew var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(alp $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(alp $$0) {
      this.e = List.copyOf($$0.b(b));
      this.f = true;
   }

   public et c() {
      return this.d.aH().a(2).a();
   }

   public Optional<ih<et>> a(alb $$0) {
      return this.g.a($$0);
   }

   public List<ih<et>> b(alb $$0) {
      return this.g.b($$0);
   }

   public Iterable<alb> d() {
      return this.g.a().keySet();
   }

   public Iterable<alb> e() {
      return this.g.b();
   }
}
