import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fai extends gsq {
   private static final Logger a = LogUtils.getLogger();
   private static final ws b = ws.c("mco.configure.world.buttons.invite");
   private static final ws c = ws.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final ws B = ws.c("mco.configure.world.players.inviting").b(-6250336);
   private static final ws C = ws.c("mco.configure.world.players.error").b(-65536);
   private final fih D = new fih(this);
   private ffd E;
   private feu F;
   private final eyu G;
   private final fad H;
   private final fkt I;
   @Nullable
   private ws J;

   public fai(fad $$0, fkt $$1, eyu $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aM_() {
      this.D.a(b, this.p);
      fil $$0 = this.D.c(fil.d().a(8));
      this.E = new ffd(this.m.h, 200, 20, ws.c("mco.configure.world.invite.profile.name"));
      $$0.a(fid.a(this.p, this.E, c));
      this.F = $$0.a(feu.a(b, $$0x -> this.C()).a(200).a());
      this.D.b(feu.a(wr.k, $$0x -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fes var10000 = this.c($$1);
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
      if (ayr.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<eyu>supplyAsync(() -> {
            try {
               return eyd.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new fap(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.q);
      }
   }

   private void a(ws $$0) {
      this.J = $$0;
      this.m.aY().c($$0);
   }

   @Override
   public void d() {
      this.m.a(this.I);
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.D() + this.F.v() + 8, -1);
      }
   }
}
