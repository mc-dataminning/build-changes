import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbn extends gty {
   private static final Logger a = LogUtils.getLogger();
   private static final wx b = wx.c("mco.configure.world.buttons.invite");
   private static final wx c = wx.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final wx B = wx.c("mco.configure.world.players.inviting").b(-6250336);
   private static final wx C = wx.c("mco.configure.world.players.error").b(-65536);
   private final fjm D = new fjm(this);
   private fgi E;
   private ffz F;
   private final ezz G;
   private final fbi H;
   private final fly I;
   @Nullable
   private wx J;

   public fbn(fbi $$0, fly $$1, ezz $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aM_() {
      this.D.a(b, this.p);
      fjq $$0 = this.D.c(fjq.d().a(8));
      this.E = new fgi(this.m.h, 200, 20, wx.c("mco.configure.world.invite.profile.name"));
      $$0.a(fji.a(this.p, this.E, c));
      this.F = $$0.a(ffz.a(b, $$0x -> this.C()).a(200).a());
      this.D.b(ffz.a(ww.k, $$0x -> this.d()).a(200).a());
      this.D.a($$1 -> {
         ffx var10000 = this.c($$1);
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
      if (ayy.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<ezz>supplyAsync(() -> {
            try {
               return ezi.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new fbu(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.q);
      }
   }

   private void a(wx $$0) {
      this.J = $$0;
      this.m.aZ().c($$0);
   }

   @Override
   public void d() {
      this.m.a(this.I);
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.D() + this.F.v() + 8, -1);
      }
   }
}
