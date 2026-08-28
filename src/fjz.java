import javax.annotation.Nullable;

public class fjz extends hhu {
   private static final xv a = xv.c("mco.account.privacy.information");
   private static final int b = 15;
   private final frw c = frw.d();
   private final ftw C;
   @Nullable
   private foy D;

   public fjz(ftw $$0) {
      super(flv.a);
      this.C = $$0;
   }

   @Override
   public void aT_() {
      this.c.a(15).c().b();
      this.D = new foy(a, this.p).b(true);
      this.c.a(this.D);
      frw $$0 = this.c.a(frw.e().a(8));
      xv $$1 = xv.c("mco.account.privacy.info.button");
      $$0.a(fod.a($$1, fst.b(this, aza.a)).a());
      $$0.a(fod.a(xu.k, $$0x -> this.aP_()).a());
      this.c.a($$1x -> {
         fob var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aP_() {
      this.m.a(this.C);
   }

   @Override
   protected void c() {
      if (this.D != null) {
         this.D.d(this.n - 15);
      }

      this.c.a();
      frq.a(this.c, this.H());
   }

   @Override
   public xv i() {
      return a;
   }
}
