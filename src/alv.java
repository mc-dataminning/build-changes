import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alv {
   private static final Logger a = LogUtils.getLogger();
   private static final alg b = alg.b("tick");
   private static final alg c = alg.b("load");
   private final MinecraftServer d;
   private List<hw<ei>> e = ImmutableList.of();
   private boolean f;
   private alu g;

   public alv(MinecraftServer $$0, alu $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<ei> a() {
      return this.d.aG().a();
   }

   public void b() {
      if (this.d.aP().i()) {
         if (this.f) {
            this.f = false;
            Collection<hw<ei>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<hw<ei>> $$0, alg $$1) {
      bql.a().a($$1::toString);

      for (hw<ei> $$2 : $$0) {
         this.a($$2, this.c());
      }

      bql.a().c();
   }

   public void a(hw<ei> $$0, ei $$1) {
      bqm $$2 = bql.a();
      $$2.a(() -> "function " + $$0.a());

      try {
         hy<ei> $$3 = $$0.a(null, this.a());
         ej.a($$1, $$2x -> hj.a($$2x, $$3, $$1, ef.a));
      } catch (el var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(alu $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(alu $$0) {
      this.e = List.copyOf($$0.b(b));
      this.f = true;
   }

   public ei c() {
      return this.d.aH().a(2).a();
   }

   public Optional<hw<ei>> a(alg $$0) {
      return this.g.a($$0);
   }

   public List<hw<ei>> b(alg $$0) {
      return this.g.b($$0);
   }

   public Iterable<alg> d() {
      return this.g.a().keySet();
   }

   public Iterable<alg> e() {
      return this.g.b();
   }
}
