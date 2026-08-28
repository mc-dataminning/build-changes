import javax.annotation.Nullable;

public class fjd extends hle {
   private static final wp a = wp.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fsl c = fsl.d();
   private final ful C;
   @Nullable
   private fpn D;

   public fjd(ful $$0) {
      super(fla.a);
      this.C = $$0;
   }

   @Override
   public void aR_() {
      this.c.a(15).c().b();
      this.D = new fpn(a, this.p).b(true);
      this.c.a(this.D);
      fsl $$0 = this.c.a(fsl.e().a(8));
      wp $$1 = wp.c("mco.account.privacy.info.button");
      $$0.a(fot.a($$1, fti.b(this, axv.a)).a());
      $$0.a(fot.a(wo.k, $$0x -> this.aO_()).a());
      this.c.a($$1x -> {
         foq var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aO_() {
      this.m.a(this.C);
   }

   @Override
   protected void c() {
      if (this.D != null) {
         this.D.d(this.n - 15);
      }

      this.c.a();
      fsf.a(this.c, this.J());
   }

   @Override
   public wp i() {
      return a;
   }
}
