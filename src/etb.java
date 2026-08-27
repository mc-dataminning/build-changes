import javax.annotation.Nullable;

public class etb extends gkp {
   private static final vf a = vf.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fau c = fau.d();
   private final fdb v;
   @Nullable
   private eya w;

   public etb(fdb $$0) {
      super(eva.a);
      this.v = $$0;
   }

   @Override
   public void aN_() {
      this.c.a(15).c().b();
      this.w = new eya(a, this.i).b(true);
      this.c.a(this.w);
      fau $$0 = this.c.a(fau.e().a(8));
      vf $$1 = vf.c("mco.account.privacy.info.button");
      $$0.a(exg.a($$1, fbt.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(exg.a(ve.k, $$0x -> this.aE_()).a());
      this.c.a($$1x -> {
         exe var10000 = this.d($$1x);
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
      fao.a(this.c, this.F());
   }

   @Override
   public vf h() {
      return a;
   }
}
