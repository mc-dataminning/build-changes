import javax.annotation.Nullable;

public class eta extends gko {
   private static final vf a = vf.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fat c = fat.d();
   private final fda v;
   @Nullable
   private exz w;

   public eta(fda $$0) {
      super(euz.a);
      this.v = $$0;
   }

   @Override
   public void aN_() {
      this.c.a(15).c().b();
      this.w = new exz(a, this.i).b(true);
      this.c.a(this.w);
      fat $$0 = this.c.a(fat.e().a(8));
      vf $$1 = vf.c("mco.account.privacy.info.button");
      $$0.a(exf.a($$1, fbs.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(exf.a(ve.k, $$0x -> this.aE_()).a());
      this.c.a($$1x -> {
         exd var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   public void aE_() {
      this.f.a(this.v);
   }

   @Override
   protected void c() {
      if (this.w != null) {
         this.w.c(this.g - 15);
      }

      this.c.a();
      fan.a(this.c, this.F());
   }

   @Override
   public vf h() {
      return a;
   }
}
