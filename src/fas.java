import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fas extends gtb {
   private static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.configure.world.buttons.invite");
   private static final wu c = wu.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final wu B = wu.c("mco.configure.world.players.inviting").b(-6250336);
   private static final wu C = wu.c("mco.configure.world.players.error").b(-65536);
   private final fir D = new fir(this);
   private ffn E;
   private ffe F;
   private final eze G;
   private final fan H;
   private final fld I;
   @Nullable
   private wu J;

   public fas(fan $$0, fld $$1, eze $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aM_() {
      this.D.a(b, this.p);
      fiv $$0 = this.D.c(fiv.d().a(8));
      this.E = new ffn(this.m.h, 200, 20, wu.c("mco.configure.world.invite.profile.name"));
      $$0.a(fin.a(this.p, this.E, c));
      this.F = $$0.a(ffe.a(b, $$0x -> this.C()).a(200).a());
      this.D.b(ffe.a(wt.k, $$0x -> this.d()).a(200).a());
      this.D.a($$1 -> {
         ffc var10000 = this.c($$1);
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
      if (ayu.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<eze>supplyAsync(() -> {
            try {
               return eyn.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new faz(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.q);
      }
   }

   private void a(wu $$0) {
      this.J = $$0;
      this.m.aZ().c($$0);
   }

   @Override
   public void d() {
      this.m.a(this.I);
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.D() + this.F.v() + 8, -1);
      }
   }
}
