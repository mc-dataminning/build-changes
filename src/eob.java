import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eob extends ger {
   private static final Logger a = LogUtils.getLogger();
   private static final tf b = tf.c("mco.configure.world.invite.profile.name").a($$0 -> $$0.a(-6250336));
   private static final tf c = tf.c("mco.configure.world.players.inviting").a($$0 -> $$0.a(-6250336));
   private static final tf y = tf.c("mco.configure.world.players.error").a($$0 -> $$0.a(-65536));
   private esp z;
   private esg A;
   private final emm B;
   private final enw C;
   private final eya D;
   @Nullable
   private tf E;

   public eob(enw $$0, eya $$1, emm $$2) {
      super(eqd.a);
      this.C = $$0;
      this.D = $$1;
      this.B = $$2;
   }

   @Override
   public void aC_() {
      this.z = new esp(this.f.h, this.g / 2 - 100, h(2), 200, 20, null, tf.c("mco.configure.world.invite.profile.name"));
      this.e(this.z);
      this.c(this.z);
      this.A = this.d(esg.a(tf.c("mco.configure.world.buttons.invite"), $$0 -> this.C()).a(this.g / 2 - 100, h(10), 200, 20).a());
      this.d(esg.a(te.e, $$0 -> this.f.a(this.D)).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   private void C() {
      if (ac.b(this.z.a())) {
         this.a(y);
      } else {
         long $$0 = this.B.a;
         String $$1 = this.z.a().trim();
         this.A.i = false;
         this.z.e(false);
         this.a(c);
         CompletableFuture.<emm>supplyAsync(() -> {
            try {
               return elv.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.B.h = $$0x.h;
               this.f.a(new eoh(this.C, this.B));
            } else {
               this.a(y);
            }

            this.z.e(true);
            this.A.i = true;
         }, this.j);
      }
   }

   private void a(tf $$0) {
      this.E = $$0;
      this.f.aV().c($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.D);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, b, this.g / 2 - 100, h(1), -1, false);
      if (this.E != null) {
         $$0.a(this.i, this.E, this.g / 2, h(5), -1);
      }

      this.z.a($$0, $$1, $$2, $$3);
   }
}
