import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alc {
   private static final Logger a = LogUtils.getLogger();
   private static final akn b = new akn("tick");
   private static final akn c = new akn("load");
   private final MinecraftServer d;
   private List<hq<ee>> e = ImmutableList.of();
   private boolean f;
   private alb g;

   public alc(MinecraftServer $$0, alb $$1) {
      this.d = $$0;
      this.g = $$1;
      this.b($$1);
   }

   public CommandDispatcher<ee> a() {
      return this.d.aH().a();
   }

   public void b() {
      if (this.d.aQ().i()) {
         if (this.f) {
            this.f = false;
            Collection<hq<ee>> $$0 = this.g.b(c);
            this.a($$0, c);
         }

         this.a(this.e, b);
      }
   }

   private void a(Collection<hq<ee>> $$0, akn $$1) {
      this.d.aT().a($$1::toString);

      for (hq<ee> $$2 : $$0) {
         this.a($$2, this.c());
      }

      this.d.aT().c();
   }

   public void a(hq<ee> $$0, ee $$1) {
      bmk $$2 = this.d.aT();
      $$2.a(() -> "function " + $$0.a());

      try {
         hs<ee> $$3 = $$0.a(null, this.a());
         ef.a($$1, $$2x -> hd.a($$2x, $$3, $$1, eb.a));
      } catch (eh var9) {
      } catch (Exception var10) {
         a.warn("Failed to execute function {}", $$0.a(), var10);
      } finally {
         $$2.c();
      }
   }

   public void a(alb $$0) {
      this.g = $$0;
      this.b($$0);
   }

   private void b(alb $$0) {
      this.e = ImmutableList.copyOf($$0.b(b));
      this.f = true;
   }

   public ee c() {
      return this.d.aI().a(2).a();
   }

   public Optional<hq<ee>> a(akn $$0) {
      return this.g.a($$0);
   }

   public Collection<hq<ee>> b(akn $$0) {
      return this.g.b($$0);
   }

   public Iterable<akn> d() {
      return this.g.a().keySet();
   }

   public Iterable<akn> e() {
      return this.g.b();
   }
}
