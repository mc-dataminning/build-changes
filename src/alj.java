import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alj {
   private static final Logger a = LogUtils.getLogger();
   private static final aku b = aku.b("tick");
   private static final aku c = aku.b("load");
   private final MinecraftServer d;
   private List<il<ex>> e = ImmutableList.of();
   private boolean f;
   private ali g;

   public alj(MinecraftServer $$0, ali $$1) {
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
            Collection<il<ex>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<il<ex>> $$0, aku $$1) {
      bpi.a().a($$1::toString);

      for (il<ex> $$2 : $$0) {
         this.a($$2, this.c());
      }

      bpi.a().c();
   }

   public void a(il<ex> $$0, ex $$1) {
      bpj $$2 = bpi.a();
      $$2.a(() -> "function " + $$0.a());

      try {
         in<ex> $$3 = $$0.a(null, this.a());
         ey.a($$1, $$2x -> hx.a($$2x, $$3, $$1, eu.a));
      } catch (fa var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(ali $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(ali $$0) {
      this.e = List.copyOf($$0.b(b));
      this.f = true;
   }

   public ex c() {
      return this.d.aH().a(2).a();
   }

   public Optional<il<ex>> a(aku $$0) {
      return this.g.a($$0);
   }

   public List<il<ex>> b(aku $$0) {
      return this.g.b($$0);
   }

   public Iterable<aku> d() {
      return this.g.a().keySet();
   }

   public Iterable<aku> e() {
      return this.g.b();
   }
}
