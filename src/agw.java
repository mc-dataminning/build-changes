import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public class agw {
   private static final agi a = new agi("tick");
   private static final agi b = new agi("load");
   private final MinecraftServer c;
   private List<gx<du>> d = ImmutableList.of();
   private boolean e;
   private agv f;

   public agw(MinecraftServer $$0, agv $$1) {
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
            Collection<gx<du>> $$0 = this.f.b(b);
            this.a($$0, b);
         }

         this.a(this.d, a);
      }
   }

   private void a(Collection<gx<du>> $$0, agi $$1) {
      this.c.aR().a($$1::toString);

      for (gx<du> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.c.aR().c();
   }

   public void a(gx<du> $$0, du $$1) {
      bfo $$2 = this.c.aR();
      $$2.a(() -> "function " + $$0.a());

      try {
         gz<du> $$3 = $$0.a(null, this.a(), $$1);
         dv.a($$1, $$2x -> $$2x.a($$3, $$1));
      } catch (dx var8) {
      } finally {
         $$2.c();
      }
   }

   public void a(agv $$0) {
      this.f = $$0;
      this.b($$0);
   }

   private void b(agv $$0) {
      this.d = ImmutableList.copyOf($$0.b(a));
      this.e = true;
   }

   public du c() {
      return this.c.aF().a(2).b();
   }

   public Optional<gx<du>> a(agi $$0) {
      return this.f.a($$0);
   }

   public Collection<gx<du>> b(agi $$0) {
      return this.f.b($$0);
   }

   public Iterable<agi> d() {
      return this.f.a().keySet();
   }

   public Iterable<agi> e() {
      return this.f.b();
   }
}
