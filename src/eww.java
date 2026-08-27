import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eww extends gpe {
   private static final Logger a = LogUtils.getLogger();
   private static final vu b = vu.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final vu c = vu.c("mco.configure.world.players.inviting").b(-6250336);
   private static final vu v = vu.c("mco.configure.world.players.error").b(-65536);
   private fbr w;
   private fbi x;
   private final evi y;
   private final ewr z;
   private final fhh A;
   @Nullable
   private vu B;

   public eww(ewr $$0, fhh $$1, evi $$2) {
      super(eza.a);
      this.z = $$0;
      this.A = $$1;
      this.y = $$2;
   }

   @Override
   public void aO_() {
      this.w = new fbr(this.f.h, this.g / 2 - 100, g(2), 200, 20, null, vu.c("mco.configure.world.invite.profile.name"));
      this.d(this.w);
      this.x = this.c(fbi.a(vu.c("mco.configure.world.buttons.invite"), $$0 -> this.E()).a(this.g / 2 - 100, g(10), 200, 20).a());
      this.c(fbi.a(vt.e, $$0 -> this.f.a(this.A)).a(this.g / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   protected void aF_() {
      this.b(this.w);
   }

   private void E() {
      if (ac.b(this.w.a())) {
         this.a(v);
      } else {
         long $$0 = this.y.a;
         String $$1 = this.w.a().trim();
         this.x.j = false;
         this.w.e(false);
         this.a(c);
         CompletableFuture.<evi>supplyAsync(() -> {
            try {
               return eur.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.y.h = $$0x.h;
               this.f.a(new exd(this.z, this.y));
            } else {
               this.a(v);
            }

            this.w.e(true);
            this.x.j = true;
         }, this.j);
      }
   }

   private void a(vu $$0) {
      this.B = $$0;
      this.f.aY().c($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.A);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, b, this.g / 2 - 100, g(1), -1, false);
      if (this.B != null) {
         $$0.a(this.i, this.B, this.g / 2, g(5), -1);
      }

      this.w.a($$0, $$1, $$2, $$3);
   }
}
