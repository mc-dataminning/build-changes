import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eso extends gkc {
   private static final Logger a = LogUtils.getLogger();
   private static final vd b = vd.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final vd c = vd.c("mco.configure.world.players.inviting").b(-6250336);
   private static final vd v = vd.c("mco.configure.world.players.error").b(-65536);
   private exh w;
   private ewy x;
   private final era y;
   private final esj z;
   private final fct A;
   @Nullable
   private vd B;

   public eso(esj $$0, fct $$1, era $$2) {
      super(eus.a);
      this.z = $$0;
      this.A = $$1;
      this.y = $$2;
   }

   @Override
   public void aN_() {
      this.w = new exh(this.f.h, this.g / 2 - 100, g(2), 200, 20, null, vd.c("mco.configure.world.invite.profile.name"));
      this.e(this.w);
      this.c(this.w);
      this.x = this.d(ewy.a(vd.c("mco.configure.world.buttons.invite"), $$0 -> this.C()).a(this.g / 2 - 100, g(10), 200, 20).a());
      this.d(ewy.a(vc.e, $$0 -> this.f.a(this.A)).a(this.g / 2 - 100, g(12), 200, 20).a());
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
         CompletableFuture.<era>supplyAsync(() -> {
            try {
               return eqj.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.y.h = $$0x.h;
               this.f.a(new esv(this.z, this.y));
            } else {
               this.a(v);
            }

            this.w.e(true);
            this.x.j = true;
         }, this.j);
      }
   }

   private void a(vd $$0) {
      this.B = $$0;
      this.f.aU().c($$0);
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
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, b, this.g / 2 - 100, g(1), -1, false);
      if (this.B != null) {
         $$0.a(this.i, this.B, this.g / 2, g(5), -1);
      }

      this.w.a($$0, $$1, $$2, $$3);
   }
}
