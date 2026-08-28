import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgn extends hee {
   private static final Logger a = LogUtils.getLogger();
   private static final xh b = xh.c("mco.configure.world.buttons.invite");
   private static final xh c = xh.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xh B = xh.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xh C = xh.c("mco.configure.world.players.error").b(-65536);
   private final fon D = new fon(this);
   private fli E;
   private fkz F;
   private final ffa G;
   private final fgi H;
   private final fqs I;
   @Nullable
   private xh J;

   public fgn(fgi $$0, fqs $$1, ffa $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aS_() {
      this.D.a(b, this.p);
      fos $$0 = this.D.c(fos.d().a(8));
      this.E = new fli(this.m.h, 200, 20, xh.c("mco.configure.world.invite.profile.name"));
      $$0.a(foj.a(this.p, this.E, c));
      this.F = $$0.a(fkz.a(b, $$0x -> this.D()).a(200).a());
      this.D.b(fkz.a(xg.k, $$0x -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fkx var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   protected void aH_() {
      this.b(this.E);
   }

   private void D() {
      if (bag.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<ffa>supplyAsync(() -> {
            try {
               return fej.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ad.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new fgt(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.r);
      }
   }

   private void a(xh $$0) {
      this.J = $$0;
      this.m.ba().c($$0);
   }

   @Override
   public void d() {
      this.m.a(this.I);
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.E() + this.F.w() + 8, -1);
      }
   }
}
