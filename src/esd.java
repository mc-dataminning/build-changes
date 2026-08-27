import javax.annotation.Nullable;

public class esd extends gjl {
   private static final vb a = vb.c("mco.account.privacy.information");
   private static final int b = 15;
   private final ezv c = ezv.d();
   private final fcc v;
   @Nullable
   private exb w;

   public esd(fcc $$0) {
      super(euc.a);
      this.v = $$0;
   }

   @Override
   public void aP_() {
      this.c.a(15).c().b();
      this.w = new exb(a, this.i).b(true);
      this.c.a(this.w);
      ezv $$0 = this.c.a(ezv.e().a(8));
      vb $$1 = vb.c("mco.account.privacy.info.button");
      $$0.a(ewh.a($$1, fau.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(ewh.a(va.k, $$0x -> this.aF_()).a());
      this.c.a($$1x -> {
         ewf var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   public void aF_() {
      this.f.a(this.v);
   }

   @Override
   protected void c() {
      if (this.w != null) {
         this.w.j(this.g - 15);
      }

      this.c.a();
      ezp.a(this.c, this.s());
   }

   @Override
   public vb h() {
      return a;
   }
}
