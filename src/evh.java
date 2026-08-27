import javax.annotation.Nullable;

public class evh extends gnd {
   private static final vq a = vq.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fde c = fde.d();
   private final ffl v;
   @Nullable
   private fai w;

   public evh(ffl $$0) {
      super(exg.a);
      this.v = $$0;
   }

   @Override
   public void aQ_() {
      this.c.a(15).c().b();
      this.w = new fai(a, this.i).b(true);
      this.c.a(this.w);
      fde $$0 = this.c.a(fde.e().a(8));
      vq $$1 = vq.c("mco.account.privacy.info.button");
      $$0.a(ezo.a($$1, fed.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(ezo.a(vp.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         ezm var10000 = this.c($$1x);
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
      fcy.a(this.c, this.F());
   }

   @Override
   public vq i() {
      return a;
   }
}
