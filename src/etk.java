import javax.annotation.Nullable;

public class etk extends gld {
   private static final vg a = vg.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fbf c = fbf.d();
   private final fdm v;
   @Nullable
   private eyl w;

   public etk(fdm $$0) {
      super(evj.a);
      this.v = $$0;
   }

   @Override
   public void aP_() {
      this.c.a(15).c().b();
      this.w = new eyl(a, this.i).b(true);
      this.c.a(this.w);
      fbf $$0 = this.c.a(fbf.e().a(8));
      vg $$1 = vg.c("mco.account.privacy.info.button");
      $$0.a(exr.a($$1, fce.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(exr.a(vf.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         exp var10000 = this.d($$1x);
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
      faz.a(this.c, this.F());
   }

   @Override
   public vg i() {
      return a;
   }
}
