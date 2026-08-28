import javax.annotation.Nullable;

public class fdg extends gvm {
   private static final wu a = wu.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fld c = fld.d();
   private final fnd A;
   @Nullable
   private fig B;

   public fdg(fnd $$0) {
      super(fff.a);
      this.A = $$0;
   }

   @Override
   public void aO_() {
      this.c.a(15).c().b();
      this.B = new fig(a, this.o).b(true);
      this.c.a(this.B);
      fld $$0 = this.c.a(fld.e().a(8));
      wu $$1 = wu.c("mco.account.privacy.info.button");
      $$0.a(fhm.a($$1, fma.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fhm.a(wt.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fhk var10000 = this.c($$1x);
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
      fkx.a(this.c, this.H());
   }

   @Override
   public wu i() {
      return a;
   }
}
