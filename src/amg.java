import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amg {
   private static final Logger a = LogUtils.getLogger();
   private static final alr b = alr.b("tick");
   private static final alr c = alr.b("load");
   private final MinecraftServer d;
   private List<hy<ek>> e = ImmutableList.of();
   private boolean f;
   private amf g;

   public amg(MinecraftServer $$0, amf $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<ek> a() {
      return this.d.aG().a();
   }

   public void b() {
      if (this.d.aP().i()) {
         if (this.f) {
            this.f = false;
            Collection<hy<ek>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<hy<ek>> $$0, alr $$1) {
      brl.a().a($$1::toString);

      for (hy<ek> $$2 : $$0) {
         this.a($$2, this.c());
      }

      brl.a().c();
   }

   public void a(hy<ek> $$0, ek $$1) {
      brm $$2 = brl.a();
      $$2.a(() -> "function " + $$0.a());

      try {
         ia<ek> $$3 = $$0.a(null, this.a());
         el.a($$1, $$2x -> hl.a($$2x, $$3, $$1, eh.a));
      } catch (en var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(amf $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(amf $$0) {
      this.e = List.copyOf($$0.b(b));
      this.f = true;
   }

   public ek c() {
      return this.d.aH().a(2).a();
   }

   public Optional<hy<ek>> a(alr $$0) {
      return this.g.a($$0);
   }

   public List<hy<ek>> b(alr $$0) {
      return this.g.b($$0);
   }

   public Iterable<alr> d() {
      return this.g.a().keySet();
   }

   public Iterable<alr> e() {
      return this.g.b();
   }
}
