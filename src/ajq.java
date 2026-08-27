import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ajq {
   private static final Logger a = LogUtils.getLogger();
   private static final ajc b = new ajc("tick");
   private static final ajc c = new ajc("load");
   private final MinecraftServer d;
   private List<hf<du>> e = ImmutableList.of();
   private boolean f;
   private ajp g;

   public ajq(MinecraftServer $$0, ajp $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<du> a() {
      return this.d.aH().a();
   }

   public void b() {
      if (this.d.aR().i()) {
         if (this.f) {
            this.f = false;
            Collection<hf<du>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<hf<du>> $$0, ajc $$1) {
      this.d.aU().a($$1::toString);

      for (hf<du> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aU().c();
   }

   public void a(hf<du> $$0, du $$1) {
      bjc $$2 = this.d.aU();
      $$2.a(() -> "function " + $$0.a());

      try {
         hh<du> $$3 = $$0.a(null, this.a());
         dv.a($$1, $$2x -> gs.a($$2x, $$3, $$1, dr.a));
      } catch (dx var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(ajp $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(ajp $$0) {
      this.e = ImmutableList.copyOf($$0.b(b));
      this.f = true;
   }

   public du c() {
      return this.d.aI().a(2).a();
   }

   public Optional<hf<du>> a(ajc $$0) {
      return this.g.a($$0);
   }

   public Collection<hf<du>> b(ajc $$0) {
      return this.g.b($$0);
   }

   public Iterable<ajc> d() {
      return this.g.a().keySet();
   }

   public Iterable<ajc> e() {
      return this.g.b();
   }
}
