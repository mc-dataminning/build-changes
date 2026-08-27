import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eok extends gfb {
   private static final Logger a = LogUtils.getLogger();
   private static final tm b = tm.c("mco.configure.world.invite.profile.name").a($$0 -> $$0.a(-6250336));
   private static final tm c = tm.c("mco.configure.world.players.inviting").a($$0 -> $$0.a(-6250336));
   private static final tm y = tm.c("mco.configure.world.players.error").a($$0 -> $$0.a(-65536));
   private esz z;
   private esq A;
   private final emw B;
   private final eof C;
   private final eyk D;
   @Nullable
   private tm E;

   public eok(eof $$0, eyk $$1, emw $$2) {
      super(eqn.a);
      this.C = $$0;
      this.D = $$1;
      this.B = $$2;
   }

   @Override
   public void aI_() {
      this.z = new esz(this.f.h, this.g / 2 - 100, h(2), 200, 20, null, tm.c("mco.configure.world.invite.profile.name"));
      this.e(this.z);
      this.c(this.z);
      this.A = this.d(esq.a(tm.c("mco.configure.world.buttons.invite"), $$0 -> this.D()).a(this.g / 2 - 100, h(10), 200, 20).a());
      this.d(esq.a(tl.e, $$0 -> this.f.a(this.D)).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   private void D() {
      if (ac.b(this.z.a())) {
         this.a(y);
      } else {
         long $$0 = this.B.a;
         String $$1 = this.z.a().trim();
         this.A.i = false;
         this.z.e(false);
         this.a(c);
         CompletableFuture.<emw>supplyAsync(() -> {
            try {
               return emf.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.B.h = $$0x.h;
               this.f.a(new eor(this.C, this.B));
            } else {
               this.a(y);
            }

            this.z.e(true);
            this.A.i = true;
         }, this.j);
      }
   }

   private void a(tm $$0) {
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
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, b, this.g / 2 - 100, h(1), -1, false);
      if (this.E != null) {
         $$0.a(this.i, this.E, this.g / 2, h(5), -1);
      }

      this.z.a($$0, $$1, $$2, $$3);
   }
}
