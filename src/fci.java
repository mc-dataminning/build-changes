public class fci extends fct {
   private static final vd a = vd.c("symlink_warning.title.world").a(n.r);
   private static final vd b = vd.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final vd c = vd.c("symlink_warning.title.pack").a(n.r);
   private static final vd k = vd.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final vd l;
   private final String m;
   private final Runnable n;
   private final fah o = new fah().b(10);

   public fci(vd $$0, vd $$1, String $$2, Runnable $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static fct a(Runnable $$0) {
      return new fci(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fct b(Runnable $$0) {
      return new fci(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.o.c().b();
      fah.b $$0 = this.o.d(1);
      $$0.a(new eyf(this.e, this.i));
      $$0.a(new exs(this.l, this.i).c(this.g - 50).b(true));
      int $$1 = 120;
      fah $$2 = new fah().a(5);
      fah.b $$3 = $$2.d(3);
      $$3.a(ewy.a(vc.n, $$0x -> ac.i().a(this.m)).b(120, 20).a());
      $$3.a(ewy.a(vc.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(ewy.a(vc.k, $$0x -> this.aE_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
      fag.a(this.o, this.F());
   }

   @Override
   public vd h() {
      return vc.a(super.h(), this.l);
   }

   @Override
   public void aE_() {
      this.n.run();
   }
}
