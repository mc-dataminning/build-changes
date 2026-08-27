import javax.annotation.Nullable;

public class erb extends ghw {
   private static final uv a = uv.c("mco.account.privacy.information");
   private static final int b = 15;
   private final eys c = eys.d();
   private final faz v;
   @Nullable
   private evy w;

   public erb(faz $$0) {
      super(eta.a);
      this.v = $$0;
   }

   @Override
   public void aQ_() {
      this.c.a(15).c().b();
      this.w = new evy(a, this.i).b(true);
      this.c.a(this.w);
      eys $$0 = this.c.a(eys.e().a(8));
      uv $$1 = uv.c("mco.account.privacy.info.button");
      $$0.a(eve.a($$1, ezr.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(eve.a(uu.k, $$0x -> this.aG_()).a());
      this.c.a($$1x -> {
         evc var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   public void aG_() {
      this.f.a(this.v);
   }

   @Override
   protected void c() {
      if (this.w != null) {
         this.w.j(this.g - 15);
      }

      this.c.a();
      eym.a(this.c, this.s());
   }

   @Override
   public uv h() {
      return a;
   }
}
