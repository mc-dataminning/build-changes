import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ali {
   private static final Logger a = LogUtils.getLogger();
   private static final akt b = new akt("tick");
   private static final akt c = new akt("load");
   private final MinecraftServer d;
   private List<ht<eh>> e = ImmutableList.of();
   private boolean f;
   private alh g;

   public ali(MinecraftServer $$0, alh $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<eh> a() {
      return this.d.aH().a();
   }

   public void b() {
      if (this.d.aQ().i()) {
         if (this.f) {
            this.f = false;
            Collection<ht<eh>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<ht<eh>> $$0, akt $$1) {
      this.d.aT().a($$1::toString);

      for (ht<eh> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aT().c();
   }

   public void a(ht<eh> $$0, eh $$1) {
      bmo $$2 = this.d.aT();
      $$2.a(() -> "function " + $$0.a());

      try {
         hv<eh> $$3 = $$0.a(null, this.a());
         ei.a($$1, $$2x -> hg.a($$2x, $$3, $$1, ee.a));
      } catch (ek var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(alh $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(alh $$0) {
      this.e = ImmutableList.copyOf($$0.b(b));
      this.f = true;
   }

   public eh c() {
      return this.d.aI().a(2).a();
   }

   public Optional<ht<eh>> a(akt $$0) {
      return this.g.a($$0);
   }

   public Collection<ht<eh>> b(akt $$0) {
      return this.g.b($$0);
   }

   public Iterable<akt> d() {
      return this.g.a().keySet();
   }

   public Iterable<akt> e() {
      return this.g.b();
   }
}
