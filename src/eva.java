import javax.annotation.Nullable;

public class eva extends gmv {
   private static final vq a = vq.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fcx c = fcx.d();
   private final ffe v;
   @Nullable
   private fab w;

   public eva(ffe $$0) {
      super(ewz.a);
      this.v = $$0;
   }

   @Override
   public void aQ_() {
      this.c.a(15).c().b();
      this.w = new fab(a, this.i).b(true);
      this.c.a(this.w);
      fcx $$0 = this.c.a(fcx.e().a(8));
      vq $$1 = vq.c("mco.account.privacy.info.button");
      $$0.a(ezh.a($$1, fdw.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(ezh.a(vp.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         ezf var10000 = this.d($$1x);
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
      fcr.a(this.c, this.F());
   }

   @Override
   public vq i() {
      return a;
   }
}
