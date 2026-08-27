import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elf extends gan {
   private static final Logger a = LogUtils.getLogger();
   private static final sw b = sw.c("mco.configure.world.invite.profile.name").a($$0 -> $$0.a(-6250336));
   private static final sw c = sw.c("mco.configure.world.players.inviting").a($$0 -> $$0.a(-6250336));
   private static final sw G = sw.c("mco.configure.world.players.error").a($$0 -> $$0.a(-65536));
   private epr H;
   private epi I;
   private final ejq J;
   private final ela K;
   private final euq L;
   @Nullable
   private sw M;

   public elf(ela $$0, euq $$1, ejq $$2) {
      super(enf.a);
      this.K = $$0;
      this.L = $$1;
      this.J = $$2;
   }

   @Override
   public void f() {
      this.H.a();
   }

   @Override
   public void b() {
      this.H = new epr(this.f.h, this.g / 2 - 100, h(2), 200, 20, null, sw.c("mco.configure.world.invite.profile.name"));
      this.e(this.H);
      this.c(this.H);
      this.I = this.d(epi.a(sw.c("mco.configure.world.buttons.invite"), $$0 -> this.B()).a(this.g / 2 - 100, h(10), 200, 20).a());
      this.d(epi.a(sv.e, $$0 -> this.f.a(this.L)).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   private void B() {
      if (ac.b(this.H.b())) {
         this.a(G);
      } else {
         long $$0 = this.J.a;
         String $$1 = this.H.b().trim();
         this.I.r = false;
         this.H.c(false);
         this.a(c);
         CompletableFuture.<ejq>supplyAsync(() -> {
            try {
               return eiz.a().b($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.J.h = $$0x.h;
               this.f.a(new ell(this.K, this.J));
            } else {
               this.a(G);
            }

            this.H.c(true);
            this.I.r = true;
         }, this.j);
      }
   }

   private void a(sw $$0) {
      this.M = $$0;
      this.f.aU().c($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.L);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, b, this.g / 2 - 100, h(1), -1, false);
      if (this.M != null) {
         $$0.a(this.i, this.M, this.g / 2, h(5), -1);
      }

      this.H.a($$0, $$1, $$2, $$3);
      super.a($$0, $$1, $$2, $$3);
   }
}
