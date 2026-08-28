import javax.annotation.Nullable;

public class fkx extends hne {
   private static final wv a = wv.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fuf c = fuf.d();
   private final fwf C;
   @Nullable
   private frh D;

   public fkx(fwf $$0) {
      super(fmu.a);
      this.C = $$0;
   }

   @Override
   public void aN_() {
      this.c.a(15).c().b();
      this.D = new frh(a, this.p).b(true);
      this.c.a(this.D);
      fuf $$0 = this.c.a(fuf.e().a(8));
      wv $$1 = wv.c("mco.account.privacy.info.button");
      $$0.a(fqn.a($$1, fvc.b(this, ayf.a)).a());
      $$0.a(fqn.a(wu.k, $$0x -> this.aK_()).a());
      this.c.a($$1x -> {
         fql var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aK_() {
      this.m.a(this.C);
   }

   @Override
   protected void c() {
      if (this.D != null) {
         this.D.d(this.n - 15);
      }

      this.c.a();
      ftz.a(this.c, this.J());
   }

   @Override
   public wv i() {
      return a;
   }
}
