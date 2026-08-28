import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdk extends gvu {
   private static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.configure.world.buttons.invite");
   private static final wu c = wu.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final wu A = wu.c("mco.configure.world.players.inviting").b(-6250336);
   private static final wu B = wu.c("mco.configure.world.players.error").b(-65536);
   private final flh C = new flh(this);
   private fid D;
   private fhu E;
   private final fbv F;
   private final fdf G;
   private final fnl H;
   @Nullable
   private wu I;

   public fdk(fdf $$0, fnl $$1, fbv $$2) {
      super(b);
      this.G = $$0;
      this.H = $$1;
      this.F = $$2;
   }

   @Override
   public void aP_() {
      this.C.a(b, this.o);
      fll $$0 = this.C.c(fll.d().a(8));
      this.D = new fid(this.l.h, 200, 20, wu.c("mco.configure.world.invite.profile.name"));
      $$0.a(fld.a(this.o, this.D, c));
      this.E = $$0.a(fhu.a(b, $$0x -> this.D()).a(200).a());
      this.C.b(fhu.a(wt.k, $$0x -> this.d()).a(200).a());
      this.C.a($$1 -> {
         fhs var10000 = this.c($$1);
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
      if (azd.h(this.D.a())) {
         this.a(B);
      } else {
         long $$0 = this.F.a;
         String $$1 = this.D.a().trim();
         this.E.j = false;
         this.D.e(false);
         this.a(A);
         CompletableFuture.<fbv>supplyAsync(() -> {
            try {
               return fbe.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.F.h = $$0x.h;
               this.l.a(new fdq(this.G, this.F));
            } else {
               this.a(B);
            }

            this.D.e(true);
            this.E.j = true;
         }, this.p);
      }
   }

   private void a(wu $$0) {
      this.I = $$0;
      this.l.aV().c($$0);
   }

   @Override
   public void d() {
      this.l.a(this.H);
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.I != null) {
         $$0.a(this.o, this.I, this.m / 2, this.E.E() + this.E.w() + 8, -1);
      }
   }
}
