import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ajm {
   private static final Logger a = LogUtils.getLogger();
   private static final aiy b = new aiy("tick");
   private static final aiy c = new aiy("load");
   private final MinecraftServer d;
   private List<hd<du>> e = ImmutableList.of();
   private boolean f;
   private ajl g;

   public ajm(MinecraftServer $$0, ajl $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<du> a() {
      return this.d.aG().a();
   }

   public void b() {
      if (this.d.aQ().i()) {
         if (this.f) {
            this.f = false;
            Collection<hd<du>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<hd<du>> $$0, aiy $$1) {
      this.d.aT().a($$1::toString);

      for (hd<du> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aT().c();
   }

   public void a(hd<du> $$0, du $$1) {
      bin $$2 = this.d.aT();
      $$2.a(() -> "function " + $$0.a());

      try {
         hf<du> $$3 = $$0.a(null, this.a());
         dv.a($$1, $$2x -> gq.a($$2x, $$3, $$1, dr.a));
      } catch (dx var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(ajl $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(ajl $$0) {
      this.e = ImmutableList.copyOf($$0.b(b));
      this.f = true;
   }

   public du c() {
      return this.d.aH().a(2).a();
   }

   public Optional<hd<du>> a(aiy $$0) {
      return this.g.a($$0);
   }

   public Collection<hd<du>> b(aiy $$0) {
      return this.g.b($$0);
   }

   public Iterable<aiy> d() {
      return this.g.a().keySet();
   }

   public Iterable<aiy> e() {
      return this.g.b();
   }
}
