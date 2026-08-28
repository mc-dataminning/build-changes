import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amo {
   private static final Logger a = LogUtils.getLogger();
   private static final alz b = alz.b("tick");
   private static final alz c = alz.b("load");
   private final MinecraftServer d;
   private List<ik<ew>> e = ImmutableList.of();
   private boolean f;
   private amn g;

   public amo(MinecraftServer $$0, amn $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<ew> a() {
      return this.d.aG().a();
   }

   public void b() {
      if (this.d.aP().i()) {
         if (this.f) {
            this.f = false;
            Collection<ik<ew>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<ik<ew>> $$0, alz $$1) {
      bpr.a().a($$1::toString);

      for (ik<ew> $$2 : $$0) {
         this.a($$2, this.c());
      }

      bpr.a().c();
   }

   public void a(ik<ew> $$0, ew $$1) {
      bps $$2 = bpr.a();
      $$2.a(() -> "function " + $$0.a());

      try {
         im<ew> $$3 = $$0.a(null, this.a());
         ex.a($$1, $$2x -> hw.a($$2x, $$3, $$1, et.a));
      } catch (ez var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(amn $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(amn $$0) {
      this.e = List.copyOf($$0.b(b));
      this.f = true;
   }

   public ew c() {
      return this.d.aH().a(2).a();
   }

   public Optional<ik<ew>> a(alz $$0) {
      return this.g.a($$0);
   }

   public List<ik<ew>> b(alz $$0) {
      return this.g.b($$0);
   }

   public Iterable<alz> d() {
      return this.g.a().keySet();
   }

   public Iterable<alz> e() {
      return this.g.b();
   }
}
