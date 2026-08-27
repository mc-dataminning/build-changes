import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esu extends gkn {
   private static final Logger a = LogUtils.getLogger();
   private static final vf b = vf.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final vf c = vf.c("mco.configure.world.players.inviting").b(-6250336);
   private static final vf v = vf.c("mco.configure.world.players.error").b(-65536);
   private exn w;
   private exe x;
   private final erg y;
   private final esp z;
   private final fcz A;
   @Nullable
   private vf B;

   public esu(esp $$0, fcz $$1, erg $$2) {
      super(euy.a);
      this.z = $$0;
      this.A = $$1;
      this.y = $$2;
   }

   @Override
   public void aN_() {
      this.w = new exn(this.f.h, this.g / 2 - 100, g(2), 200, 20, null, vf.c("mco.configure.world.invite.profile.name"));
      this.e(this.w);
      this.c(this.w);
      this.x = this.d(exe.a(vf.c("mco.configure.world.buttons.invite"), $$0 -> this.C()).a(this.g / 2 - 100, g(10), 200, 20).a());
      this.d(exe.a(ve.e, $$0 -> this.f.a(this.A)).a(this.g / 2 - 100, g(12), 200, 20).a());
   }

   private void C() {
      if (ac.b(this.w.a())) {
         this.a(v);
      } else {
         long $$0 = this.y.a;
         String $$1 = this.w.a().trim();
         this.x.j = false;
         this.w.e(false);
         this.a(c);
         CompletableFuture.<erg>supplyAsync(() -> {
            try {
               return eqp.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.y.h = $$0x.h;
               this.f.a(new etb(this.z, this.y));
            } else {
               this.a(v);
            }

            this.w.e(true);
            this.x.j = true;
         }, this.j);
      }
   }

   private void a(vf $$0) {
      this.B = $$0;
      this.f.aV().c($$0);
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
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, b, this.g / 2 - 100, g(1), -1, false);
      if (this.B != null) {
         $$0.a(this.i, this.B, this.g / 2, g(5), -1);
      }

      this.w.a($$0, $$1, $$2, $$3);
   }
}
