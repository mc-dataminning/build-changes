public class fmv extends fnd {
   private static final wu a = wu.c("symlink_warning.title.world").a(n.r);
   private static final wu b = wu.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final wu c = wu.c("symlink_warning.title.pack").a(n.r);
   private static final wu q = wu.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final wu r;
   private final String s;
   private final Runnable u;
   private final fky v = new fky().b(10);

   public fmv(wu $$0, wu $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static fnd a(Runnable $$0) {
      return new fmv(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fnd b(Runnable $$0) {
      return new fmv(c, q, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.v.c().b();
      fky.b $$0 = this.v.d(1);
      $$0.a(new fit(this.k, this.o));
      $$0.a(new fig(this.r, this.o).d(this.m - 50).b(true));
      int $$1 = 120;
      fky $$2 = new fky().a(5);
      fky.b $$3 = $$2.d(3);
      $$3.a(fhm.a(wt.n, $$0x -> ac.k().a(this.s)).b(120, 20).a());
      $$3.a(fhm.a(wt.o, $$0x -> this.l.o.a(this.s)).b(120, 20).a());
      $$3.a(fhm.a(wt.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      fkx.a(this.v, this.H());
   }

   @Override
   public wu i() {
      return wt.a(super.i(), this.r);
   }

   @Override
   public void d() {
      this.u.run();
   }
}
