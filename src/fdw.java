import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdw extends gwj {
   private static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.configure.world.buttons.invite");
   private static final wy c = wy.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final wy A = wy.c("mco.configure.world.players.inviting").b(-6250336);
   private static final wy B = wy.c("mco.configure.world.players.error").b(-65536);
   private final flt C = new flt(this);
   private fip D;
   private fig E;
   private final fcj F;
   private final fdr G;
   private final fnx H;
   @Nullable
   private wy I;

   public fdw(fdr $$0, fnx $$1, fcj $$2) {
      super(b);
      this.G = $$0;
      this.H = $$1;
      this.F = $$2;
   }

   @Override
   public void aP_() {
      this.C.a(b, this.o);
      flx $$0 = this.C.c(flx.d().a(8));
      this.D = new fip(this.l.h, 200, 20, wy.c("mco.configure.world.invite.profile.name"));
      $$0.a(flp.a(this.o, this.D, c));
      this.E = $$0.a(fig.a(b, $$0x -> this.D()).a(200).a());
      this.C.b(fig.a(wx.k, $$0x -> this.d()).a(200).a());
      this.C.a($$1 -> {
         fie var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   protected void aE_() {
      this.b(this.D);
   }

   private void D() {
      if (azk.h(this.D.a())) {
         this.a(B);
      } else {
         long $$0 = this.F.a;
         String $$1 = this.D.a().trim();
         this.E.j = false;
         this.D.e(false);
         this.a(A);
         CompletableFuture.<fcj>supplyAsync(() -> {
            try {
               return fbs.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ad.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.F.h = $$0x.h;
               this.l.a(new fec(this.G, this.F));
            } else {
               this.a(B);
            }

            this.D.e(true);
            this.E.j = true;
         }, this.p);
      }
   }

   private void a(wy $$0) {
      this.I = $$0;
      this.l.aV().c($$0);
   }

   @Override
   public void d() {
      this.l.a(this.H);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.I != null) {
         $$0.a(this.o, this.I, this.m / 2, this.E.E() + this.E.w() + 8, -1);
      }
   }
}
