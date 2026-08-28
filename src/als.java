import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class als {
   private static final Logger a = LogUtils.getLogger();
   private static final ald b = ald.b("tick");
   private static final ald c = ald.b("load");
   private final MinecraftServer d;
   private List<im<ex>> e = ImmutableList.of();
   private boolean f;
   private alr g;

   public als(MinecraftServer $$0, alr $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<ex> a() {
      return this.d.aG().a();
   }

   public void b() {
      if (this.d.aP().i()) {
         if (this.f) {
            this.f = false;
            Collection<im<ex>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<im<ex>> $$0, ald $$1) {
      bqa.a().a($$1::toString);

      for (im<ex> $$2 : $$0) {
         this.a($$2, this.c());
      }

      bqa.a().c();
   }

   public void a(im<ex> $$0, ex $$1) {
      bqb $$2 = bqa.a();
      $$2.a(() -> "function " + $$0.a());

      try {
         io<ex> $$3 = $$0.a(null, this.a());
         ey.a($$1, $$2x -> hy.a($$2x, $$3, $$1, eu.a));
      } catch (fa var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(alr $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(alr $$0) {
      this.e = List.copyOf($$0.b(b));
      this.f = true;
   }

   public ex c() {
      return this.d.aH().a(2).a();
   }

   public Optional<im<ex>> a(ald $$0) {
      return this.g.a($$0);
   }

   public List<im<ex>> b(ald $$0) {
      return this.g.b($$0);
   }

   public Iterable<ald> d() {
      return this.g.a().keySet();
   }

   public Iterable<ald> e() {
      return this.g.b();
   }
}
