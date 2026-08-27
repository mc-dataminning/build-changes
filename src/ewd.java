import javax.annotation.Nullable;

public class ewd extends gob {
   private static final vs a = vs.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fea c = fea.d();
   private final fgh v;
   @Nullable
   private fbe w;

   public ewd(fgh $$0) {
      super(eyc.a);
      this.v = $$0;
   }

   @Override
   public void aP_() {
      this.c.a(15).c().b();
      this.w = new fbe(a, this.i).b(true);
      this.c.a(this.w);
      fea $$0 = this.c.a(fea.e().a(8));
      vs $$1 = vs.c("mco.account.privacy.info.button");
      $$0.a(fak.a($$1, fez.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fak.a(vr.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fai var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void d() {
      this.f.a(this.v);
   }

   @Override
   protected void c() {
      if (this.w != null) {
         this.w.c(this.g - 15);
      }

      this.c.a();
      fdu.a(this.c, this.F());
   }

   @Override
   public vs i() {
      return a;
   }
}
