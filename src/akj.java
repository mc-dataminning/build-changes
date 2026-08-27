import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class akj {
   private static final Logger a = LogUtils.getLogger();
   private static final ajv b = new ajv("tick");
   private static final ajv c = new ajv("load");
   private final MinecraftServer d;
   private List<hh<dv>> e = ImmutableList.of();
   private boolean f;
   private aki g;

   public akj(MinecraftServer $$0, aki $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<dv> a() {
      return this.d.aH().a();
   }

   public void b() {
      if (this.d.aR().i()) {
         if (this.f) {
            this.f = false;
            Collection<hh<dv>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<hh<dv>> $$0, ajv $$1) {
      this.d.aU().a($$1::toString);

      for (hh<dv> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aU().c();
   }

   public void a(hh<dv> $$0, dv $$1) {
      bkt $$2 = this.d.aU();
      $$2.a(() -> "function " + $$0.a());

      try {
         hj<dv> $$3 = $$0.a(null, this.a());
         dw.a($$1, $$2x -> gu.a($$2x, $$3, $$1, ds.a));
      } catch (dy var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(aki $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(aki $$0) {
      this.e = ImmutableList.copyOf($$0.b(b));
      this.f = true;
   }

   public dv c() {
      return this.d.aI().a(2).a();
   }

   public Optional<hh<dv>> a(ajv $$0) {
      return this.g.a($$0);
   }

   public Collection<hh<dv>> b(ajv $$0) {
      return this.g.b($$0);
   }

   public Iterable<ajv> d() {
      return this.g.a().keySet();
   }

   public Iterable<ajv> e() {
      return this.g.b();
   }
}
