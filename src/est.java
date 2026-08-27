import javax.annotation.Nullable;

public class est extends gkc {
   private static final vd a = vd.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fam c = fam.d();
   private final fct v;
   @Nullable
   private exs w;

   public est(fct $$0) {
      super(eus.a);
      this.v = $$0;
   }

   @Override
   public void aN_() {
      this.c.a(15).c().b();
      this.w = new exs(a, this.i).b(true);
      this.c.a(this.w);
      fam $$0 = this.c.a(fam.e().a(8));
      vd $$1 = vd.c("mco.account.privacy.info.button");
      $$0.a(ewy.a($$1, fbl.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(ewy.a(vc.k, $$0x -> this.aE_()).a());
      this.c.a($$1x -> {
         eww var10000 = this.d($$1x);
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
      fag.a(this.c, this.F());
   }

   @Override
   public vd h() {
      return a;
   }
}
