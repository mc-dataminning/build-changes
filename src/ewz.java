import javax.annotation.Nullable;

public class ewz extends gpb {
   private static final vu a = vu.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fex c = fex.d();
   private final fhf v;
   @Nullable
   private fca w;

   public ewz(fhf $$0) {
      super(eyy.a);
      this.v = $$0;
   }

   @Override
   public void aO_() {
      this.c.a(15).c().b();
      this.w = new fca(a, this.i).b(true);
      this.c.a(this.w);
      fex $$0 = this.c.a(fex.e().a(8));
      vu $$1 = vu.c("mco.account.privacy.info.button");
      $$0.a(fbg.a($$1, ffw.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fbg.a(vt.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fbe var10000 = this.c($$1x);
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
      fer.a(this.c, this.F());
   }

   @Override
   public vu i() {
      return a;
   }
}
