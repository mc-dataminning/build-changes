import javax.annotation.Nullable;

public class fan extends gsq {
   private static final ws a = ws.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fil c = fil.d();
   private final fkt B;
   @Nullable
   private ffo C;

   public fan(fkt $$0) {
      super(fcm.a);
      this.B = $$0;
   }

   @Override
   public void aM_() {
      this.c.a(15).c().b();
      this.C = new ffo(a, this.p).b(true);
      this.c.a(this.C);
      fil $$0 = this.c.a(fil.e().a(8));
      ws $$1 = ws.c("mco.account.privacy.info.button");
      $$0.a(feu.a($$1, fjk.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(feu.a(wr.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fes var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   @Override
   protected void c() {
      if (this.C != null) {
         this.C.d(this.n - 15);
      }

      this.c.a();
      fif.a(this.c, this.G());
   }

   @Override
   public ws i() {
      return a;
   }
}
