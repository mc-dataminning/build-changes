import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffy extends hdk {
   private static final Logger a = LogUtils.getLogger();
   private static final xd b = xd.c("mco.configure.world.buttons.invite");
   private static final xd c = xd.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xd B = xd.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xd C = xd.c("mco.configure.world.players.error").b(-65536);
   private final fny D = new fny(this);
   private fkt E;
   private fkk F;
   private final fel G;
   private final fft H;
   private final fqd I;
   @Nullable
   private xd J;

   public ffy(fft $$0, fqd $$1, fel $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aR_() {
      this.D.a(b, this.p);
      foc $$0 = this.D.c(foc.d().a(8));
      this.E = new fkt(this.m.h, 200, 20, xd.c("mco.configure.world.invite.profile.name"));
      $$0.a(fnu.a(this.p, this.E, c));
      this.F = $$0.a(fkk.a(b, $$0x -> this.D()).a(200).a());
      this.D.b(fkk.a(xc.k, $$0x -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fki var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   protected void aG_() {
      this.b(this.E);
   }

   private void D() {
      if (baa.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<fel>supplyAsync(() -> {
            try {
               return fdu.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ad.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new fge(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.r);
      }
   }

   private void a(xd $$0) {
      this.J = $$0;
      this.m.aZ().c($$0);
   }

   @Override
   public void d() {
      this.m.a(this.I);
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.E() + this.F.w() + 8, -1);
      }
   }
}
