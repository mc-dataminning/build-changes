import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbp extends gty {
   private static final Logger a = LogUtils.getLogger();
   private static final wx b = wx.c("mco.configure.world.buttons.invite");
   private static final wx c = wx.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final wx B = wx.c("mco.configure.world.players.inviting").b(-6250336);
   private static final wx C = wx.c("mco.configure.world.players.error").b(-65536);
   private final fjn D = new fjn(this);
   private fgj E;
   private fga F;
   private final fab G;
   private final fbk H;
   private final flz I;
   @Nullable
   private wx J;

   public fbp(fbk $$0, flz $$1, fab $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aN_() {
      this.D.a(b, this.p);
      fjr $$0 = this.D.c(fjr.d().a(8));
      this.E = new fgj(this.m.h, 200, 20, wx.c("mco.configure.world.invite.profile.name"));
      $$0.a(fjj.a(this.p, this.E, c));
      this.F = $$0.a(fga.a(b, $$0x -> this.C()).a(200).a());
      this.D.b(fga.a(ww.k, $$0x -> this.d()).a(200).a());
      this.D.a($$1 -> {
         ffy var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   protected void aD_() {
      this.b(this.E);
   }

   private void C() {
      if (aza.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<fab>supplyAsync(() -> {
            try {
               return ezk.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new fbw(this.H, this.G));
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
      this.m.aX().c($$0);
   }

   @Override
   public void d() {
      this.m.a(this.I);
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.D() + this.F.v() + 8, -1);
      }
   }
}
