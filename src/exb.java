import javax.annotation.Nullable;

public class exb extends gpe {
   private static final vu a = vu.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fez c = fez.d();
   private final fhh v;
   @Nullable
   private fcc w;

   public exb(fhh $$0) {
      super(eza.a);
      this.v = $$0;
   }

   @Override
   public void aO_() {
      this.c.a(15).c().b();
      this.w = new fcc(a, this.i).b(true);
      this.c.a(this.w);
      fez $$0 = this.c.a(fez.e().a(8));
      vu $$1 = vu.c("mco.account.privacy.info.button");
      $$0.a(fbi.a($$1, ffy.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fbi.a(vt.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fbg var10000 = this.c($$1x);
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
      fet.a(this.c, this.F());
   }

   @Override
   public vu i() {
      return a;
   }
}
