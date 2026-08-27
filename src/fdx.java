import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdx extends gxb {
   private static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("mco.configure.world.buttons.invite");
   private static final xe c = xe.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xe B = xe.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xe C = xe.c("mco.configure.world.players.error").b(-65536);
   private final fma D = new fma(this);
   private fiw E;
   private fin F;
   private final fcj G;
   private final fds H;
   private final fon I;
   @Nullable
   private xe J;

   public fdx(fds $$0, fon $$1, fcj $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aN_() {
      this.D.a(b, this.p);
      fme $$0 = this.D.c(fme.d().a(8));
      this.E = new fiw(this.m.h, 200, 20, xe.c("mco.configure.world.invite.profile.name"));
      $$0.a(flw.a(this.p, this.E, c));
      this.F = $$0.a(fin.a(b, $$0x -> this.C()).a(200).a());
      this.D.b(fin.a(xd.k, $$0x -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fil var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   protected void aC_() {
      this.b(this.E);
   }

   private void C() {
      if (azh.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<fcj>supplyAsync(() -> {
            try {
               return fbs.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ad.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new fee(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.q);
      }
   }

   private void a(xe $$0) {
      this.J = $$0;
      this.m.aZ().c($$0);
   }

   @Override
   public void d() {
      this.m.a(this.I);
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.D() + this.F.v() + 8, -1);
      }
   }
}
