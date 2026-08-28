import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alu {
   private static final Logger a = LogUtils.getLogger();
   private static final alf b = new alf("tick");
   private static final alf c = new alf("load");
   private final MinecraftServer d;
   private List<ib<ep>> e = ImmutableList.of();
   private boolean f;
   private alt g;

   public alu(MinecraftServer $$0, alt $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<ep> a() {
      return this.d.aH().a();
   }

   public void b() {
      if (this.d.aQ().i()) {
         if (this.f) {
            this.f = false;
            Collection<ib<ep>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<ib<ep>> $$0, alf $$1) {
      this.d.aT().a($$1::toString);

      for (ib<ep> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aT().c();
   }

   public void a(ib<ep> $$0, ep $$1) {
      bnk $$2 = this.d.aT();
      $$2.a(() -> "function " + $$0.a());

      try {
         id<ep> $$3 = $$0.a(null, this.a());
         eq.a($$1, $$2x -> ho.a($$2x, $$3, $$1, em.a));
      } catch (es var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(alt $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(alt $$0) {
      this.e = ImmutableList.copyOf($$0.b(b));
      this.f = true;
   }

   public ep c() {
      return this.d.aI().a(2).a();
   }

   public Optional<ib<ep>> a(alf $$0) {
      return this.g.a($$0);
   }

   public Collection<ib<ep>> b(alf $$0) {
      return this.g.b($$0);
   }

   public Iterable<alf> d() {
      return this.g.a().keySet();
   }

   public Iterable<alf> e() {
      return this.g.b();
   }
}
