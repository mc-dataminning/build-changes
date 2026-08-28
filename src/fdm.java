import javax.annotation.Nullable;

public class fdm extends gvs {
   private static final wu a = wu.c("mco.account.privacy.information");
   private static final int b = 15;
   private final flj c = flj.d();
   private final fnj A;
   @Nullable
   private fim B;

   public fdm(fnj $$0) {
      super(ffl.a);
      this.A = $$0;
   }

   @Override
   public void aP_() {
      this.c.a(15).c().b();
      this.B = new fim(a, this.o).b(true);
      this.c.a(this.B);
      flj $$0 = this.c.a(flj.e().a(8));
      wu $$1 = wu.c("mco.account.privacy.info.button");
      $$0.a(fhs.a($$1, fmg.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fhs.a(wt.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fhq var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void d() {
      this.l.a(this.A);
   }

   @Override
   protected void c() {
      if (this.B != null) {
         this.B.d(this.m - 15);
      }

      this.c.a();
      fld.a(this.c, this.H());
   }

   @Override
   public wu i() {
      return a;
   }
}
