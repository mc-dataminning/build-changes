import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class akz {
   private static final Logger a = LogUtils.getLogger();
   private static final akk b = new akk("tick");
   private static final akk c = new akk("load");
   private final MinecraftServer d;
   private List<ic<eq>> e = ImmutableList.of();
   private boolean f;
   private aky g;

   public akz(MinecraftServer $$0, aky $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<eq> a() {
      return this.d.aI().a();
   }

   public void b() {
      if (this.d.aR().i()) {
         if (this.f) {
            this.f = false;
            Collection<ic<eq>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<ic<eq>> $$0, akk $$1) {
      this.d.aU().a($$1::toString);

      for (ic<eq> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aU().c();
   }

   public void a(ic<eq> $$0, eq $$1) {
      bmv $$2 = this.d.aU();
      $$2.a(() -> "function " + $$0.a());

      try {
         ie<eq> $$3 = $$0.a(null, this.a());
         er.a($$1, $$2x -> hp.a($$2x, $$3, $$1, en.a));
      } catch (et var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(aky $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(aky $$0) {
      this.e = ImmutableList.copyOf($$0.b(b));
      this.f = true;
   }

   public eq c() {
      return this.d.aJ().a(2).a();
   }

   public Optional<ic<eq>> a(akk $$0) {
      return this.g.a($$0);
   }

   public Collection<ic<eq>> b(akk $$0) {
      return this.g.b($$0);
   }

   public Iterable<akk> d() {
      return this.g.a().keySet();
   }

   public Iterable<akk> e() {
      return this.g.b();
   }
}
