import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alw {
   private static final Logger a = LogUtils.getLogger();
   private static final alh b = alh.b("tick");
   private static final alh c = alh.b("load");
   private final MinecraftServer d;
   private List<ij<ev>> e = ImmutableList.of();
   private boolean f;
   private alv g;

   public alw(MinecraftServer $$0, alv $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<ev> a() {
      return this.d.aG().a();
   }

   public void b() {
      if (this.d.aP().i()) {
         if (this.f) {
            this.f = false;
            Collection<ij<ev>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<ij<ev>> $$0, alh $$1) {
      this.d.aS().a($$1::toString);

      for (ij<ev> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aS().c();
   }

   public void a(ij<ev> $$0, ev $$1) {
      bok $$2 = this.d.aS();
      $$2.a(() -> "function " + $$0.a());

      try {
         il<ev> $$3 = $$0.a(null, this.a());
         ew.a($$1, $$2x -> hv.a($$2x, $$3, $$1, es.a));
      } catch (ey var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(alv $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(alv $$0) {
      this.e = List.copyOf($$0.b(b));
      this.f = true;
   }

   public ev c() {
      return this.d.aH().a(2).a();
   }

   public Optional<ij<ev>> a(alh $$0) {
      return this.g.a($$0);
   }

   public List<ij<ev>> b(alh $$0) {
      return this.g.b($$0);
   }

   public Iterable<alh> d() {
      return this.g.a().keySet();
   }

   public Iterable<alh> e() {
      return this.g.b();
   }
}
