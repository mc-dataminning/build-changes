import javax.annotation.Nullable;

public class fax extends gtb {
   private static final wu a = wu.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fiv c = fiv.d();
   private final fld B;
   @Nullable
   private ffy C;

   public fax(fld $$0) {
      super(fcw.a);
      this.B = $$0;
   }

   @Override
   public void aM_() {
      this.c.a(15).c().b();
      this.C = new ffy(a, this.p).b(true);
      this.c.a(this.C);
      fiv $$0 = this.c.a(fiv.e().a(8));
      wu $$1 = wu.c("mco.account.privacy.info.button");
      $$0.a(ffe.a($$1, fju.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(ffe.a(wt.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         ffc var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   @Override
   protected void c() {
      if (this.C != null) {
         this.C.d(this.n - 15);
      }

      this.c.a();
      fip.a(this.c, this.G());
   }

   @Override
   public wu i() {
      return a;
   }
}
