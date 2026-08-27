import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public class aha {
   private static final agm a = new agm("tick");
   private static final agm b = new agm("load");
   private final MinecraftServer c;
   private List<hb<du>> d = ImmutableList.of();
   private boolean e;
   private agz f;

   public aha(MinecraftServer $$0, agz $$1) {
      this.c = $$0;
      this.f = $$1;
      this.b($$1);
   }

   public CommandDispatcher<du> a() {
      return this.c.aE().a();
   }

   public void b() {
      if (this.c.aO().i()) {
         if (this.e) {
            this.e = false;
            Collection<hb<du>> $$0 = this.f.b(b);
            this.a($$0, b);
         }

         this.a(this.d, a);
      }
   }

   private void a(Collection<hb<du>> $$0, agm $$1) {
      this.c.aR().a($$1::toString);

      for (hb<du> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.c.aR().c();
   }

   public void a(hb<du> $$0, du $$1) {
      bfs $$2 = this.c.aR();
      $$2.a(() -> "function " + $$0.a());

      try {
         hd<du> $$3 = $$0.a(null, this.a(), $$1);
         dv.a($$1, $$2x -> go.a($$2x, $$3, $$1, dq.a));
      } catch (dx var8) {
      } finally {
         $$2.c();
      }
   }

   public void a(agz $$0) {
      this.f = $$0;
      this.b($$0);
   }

   private void b(agz $$0) {
      this.d = ImmutableList.copyOf($$0.b(a));
      this.e = true;
   }

   public du c() {
      return this.c.aF().a(2).a();
   }

   public Optional<hb<du>> a(agm $$0) {
      return this.f.a($$0);
   }

   public Collection<hb<du>> b(agm $$0) {
      return this.f.b($$0);
   }

   public Iterable<agm> d() {
      return this.f.a().keySet();
   }

   public Iterable<agm> e() {
      return this.f.b();
   }
}
