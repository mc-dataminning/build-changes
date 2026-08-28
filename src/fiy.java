import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fiy extends hld {
   private static final Logger a = LogUtils.getLogger();
   private static final wp b = wp.c("mco.configure.world.buttons.invite");
   private static final wp c = wp.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final wp C = wp.c("mco.configure.world.players.inviting").b(-6250336);
   private static final wp D = wp.c("mco.configure.world.players.error").b(-65536);
   private final fsg E = new fsg(this);
   private fpb F;
   private fos G;
   private final fhk H;
   private final fit I;
   private final fuk J;
   @Nullable
   private wp K;

   public fiy(fit $$0, fuk $$1, fhk $$2) {
      super(b);
      this.I = $$0;
      this.J = $$1;
      this.H = $$2;
   }

   @Override
   public void aR_() {
      this.E.a(b, this.p);
      fsk $$0 = this.E.c(fsk.d().a(8));
      this.F = new fpb(this.m.h, 200, 20, wp.c("mco.configure.world.invite.profile.name"));
      $$0.a(fsc.a(this.p, this.F, c));
      this.G = $$0.a(fos.a(b, $$0x -> this.E()).a(200).a());
      this.E.b(fos.a(wo.k, $$0x -> this.aO_()).a(200).a());
      this.E.a($$1 -> {
         fop var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a();
   }

   @Override
   protected void aF_() {
      this.b(this.F);
   }

   private void E() {
      if (azw.h(this.F.a())) {
         this.a(D);
      } else {
         long $$0 = this.H.a;
         String $$1 = this.F.a().trim();
         this.G.j = false;
         this.F.e(false);
         this.a(C);
         CompletableFuture.<fhk>supplyAsync(() -> {
            try {
               return fgj.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, af.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.H.h = $$0x.h;
               this.m.a(new fje(this.I, this.H));
            } else {
               this.a(D);
            }

            this.F.e(true);
            this.G.j = true;
         }, this.r);
      }
   }

   private void a(wp $$0) {
      this.K = $$0;
      this.m.aY().c($$0);
   }

   @Override
   public void aO_() {
      this.m.a(this.J);
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.K != null) {
         $$0.a(this.p, this.K, this.n / 2, this.G.G() + this.G.y() + 8, -1);
      }
   }
}
