import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezm extends gru {
   private static final Logger a = LogUtils.getLogger();
   private static final wi b = wi.c("mco.configure.world.buttons.invite");
   private static final wi c = wi.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final wi y = wi.c("mco.configure.world.players.inviting").b(-6250336);
   private static final wi z = wi.c("mco.configure.world.players.error").b(-65536);
   private final fhl A = new fhl(this);
   private feh B;
   private fdy C;
   private final exy D;
   private final ezh E;
   private final fjx F;
   @Nullable
   private wi G;

   public ezm(ezh $$0, fjx $$1, exy $$2) {
      super(b);
      this.E = $$0;
      this.F = $$1;
      this.D = $$2;
   }

   @Override
   public void aM_() {
      this.A.a(b, this.m);
      fhp $$0 = this.A.c(fhp.d().a(8));
      this.B = new feh(this.j.h, 200, 20, wi.c("mco.configure.world.invite.profile.name"));
      $$0.a(fhh.a(this.m, this.B, c));
      this.C = $$0.a(fdy.a(b, $$0x -> this.C()).a(200).a());
      this.A.b(fdy.a(wh.k, $$0x -> this.d()).a(200).a());
      this.A.a($$1 -> {
         fdw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
   }

   @Override
   protected void aC_() {
      this.b(this.B);
   }

   private void C() {
      if (ayh.h(this.B.a())) {
         this.a(z);
      } else {
         long $$0 = this.D.a;
         String $$1 = this.B.a().trim();
         this.C.j = false;
         this.B.e(false);
         this.a(y);
         CompletableFuture.<exy>supplyAsync(() -> {
            try {
               return exh.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.D.h = $$0x.h;
               this.j.a(new ezt(this.E, this.D));
            } else {
               this.a(z);
            }

            this.B.e(true);
            this.C.j = true;
         }, this.n);
      }
   }

   private void a(wi $$0) {
      this.G = $$0;
      this.j.aY().c($$0);
   }

   @Override
   public void d() {
      this.j.a(this.F);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.G != null) {
         $$0.a(this.m, this.G, this.k / 2, this.C.D() + this.C.v() + 8, -1);
      }
   }
}
