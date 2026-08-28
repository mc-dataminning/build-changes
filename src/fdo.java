import javax.annotation.Nullable;

public class fdo extends gvu {
   private static final wu a = wu.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fll c = fll.d();
   private final fnl A;
   @Nullable
   private fio B;

   public fdo(fnl $$0) {
      super(ffo.a);
      this.A = $$0;
   }

   @Override
   public void aP_() {
      this.c.a(15).c().b();
      this.B = new fio(a, this.o).b(true);
      this.c.a(this.B);
      fll $$0 = this.c.a(fll.e().a(8));
      wu $$1 = wu.c("mco.account.privacy.info.button");
      $$0.a(fhu.a($$1, fmi.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fhu.a(wt.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fhs var10000 = this.c($$1x);
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
      flf.a(this.c, this.H());
   }

   @Override
   public wu i() {
      return a;
   }
}
