import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alx {
   private static final Logger a = LogUtils.getLogger();
   private static final ali b = ali.b("tick");
   private static final ali c = ali.b("load");
   private final MinecraftServer d;
   private List<hx<ej>> e = ImmutableList.of();
   private boolean f;
   private alw g;

   public alx(MinecraftServer $$0, alw $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<ej> a() {
      return this.d.aG().a();
   }

   public void b() {
      if (this.d.aP().i()) {
         if (this.f) {
            this.f = false;
            Collection<hx<ej>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<hx<ej>> $$0, ali $$1) {
      bra.a().a($$1::toString);

      for (hx<ej> $$2 : $$0) {
         this.a($$2, this.c());
      }

      bra.a().c();
   }

   public void a(hx<ej> $$0, ej $$1) {
      brb $$2 = bra.a();
      $$2.a(() -> "function " + $$0.a());

      try {
         hz<ej> $$3 = $$0.a(null, this.a());
         ek.a($$1, $$2x -> hk.a($$2x, $$3, $$1, eg.a));
      } catch (em var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(alw $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(alw $$0) {
      this.e = List.copyOf($$0.b(b));
      this.f = true;
   }

   public ej c() {
      return this.d.aH().a(2).a();
   }

   public Optional<hx<ej>> a(ali $$0) {
      return this.g.a($$0);
   }

   public List<hx<ej>> b(ali $$0) {
      return this.g.b($$0);
   }

   public Iterable<ali> d() {
      return this.g.a().keySet();
   }

   public Iterable<ali> e() {
      return this.g.b();
   }
}
