import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public class agk {
   private static final afw a = new afw("tick");
   private static final afw b = new afw("load");
   private final MinecraftServer c;
   private List<gx<du>> d = ImmutableList.of();
   private boolean e;
   private agj f;

   public agk(MinecraftServer $$0, agj $$1) {
      this.c = $$0;
      this.f = $$1;
      this.b($$1);
   }

   public CommandDispatcher<du> a() {
      return this.c.aC().a();
   }

   public void b() {
      if (this.e) {
         this.e = false;
         Collection<gx<du>> $$0 = this.f.b(b);
         this.a($$0, b);
      }

      this.a(this.d, a);
   }

   private void a(Collection<gx<du>> $$0, afw $$1) {
      this.c.aM().a($$1::toString);

      for (gx<du> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.c.aM().c();
   }

   public void a(gx<du> $$0, du $$1) {
      bes $$2 = this.c.aM();
      $$2.a(() -> "function " + $$0.a());

      try {
         gz<du> $$3 = $$0.a(null, this.a(), $$1);
         dv.a($$1, $$2x -> $$2x.a($$3, $$1));
      } catch (CommandSyntaxException | dx var8) {
      } finally {
         $$2.c();
      }
   }

   public void a(agj $$0) {
      this.f = $$0;
      this.b($$0);
   }

   private void b(agj $$0) {
      this.d = ImmutableList.copyOf($$0.b(a));
      this.e = true;
   }

   public du c() {
      return this.c.aD().a(2).b();
   }

   public Optional<gx<du>> a(afw $$0) {
      return this.f.a($$0);
   }

   public Collection<gx<du>> b(afw $$0) {
      return this.f.b($$0);
   }

   public Iterable<afw> d() {
      return this.f.a().keySet();
   }

   public Iterable<afw> e() {
      return this.f.b();
   }
}
