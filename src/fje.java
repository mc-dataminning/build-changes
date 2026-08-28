import javax.annotation.Nullable;

public class fje extends hlf {
   private static final wp a = wp.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fsm c = fsm.d();
   private final fum C;
   @Nullable
   private fpo D;

   public fje(fum $$0) {
      super(flb.a);
      this.C = $$0;
   }

   @Override
   public void aR_() {
      this.c.a(15).c().b();
      this.D = new fpo(a, this.p).b(true);
      this.c.a(this.D);
      fsm $$0 = this.c.a(fsm.e().a(8));
      wp $$1 = wp.c("mco.account.privacy.info.button");
      $$0.a(fou.a($$1, ftj.b(this, axv.a)).a());
      $$0.a(fou.a(wo.k, $$0x -> this.aO_()).a());
      this.c.a($$1x -> {
         fos var10000 = this.c($$1x);
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
      fsg.a(this.c, this.J());
   }

   @Override
   public wp i() {
      return a;
   }
}
