public class fnb extends fnj {
   private static final wu a = wu.c("symlink_warning.title.world").a(n.r);
   private static final wu b = wu.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final wu c = wu.c("symlink_warning.title.pack").a(n.r);
   private static final wu q = wu.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final wu r;
   private final String s;
   private final Runnable u;
   private final fle v = new fle().b(10);

   public fnb(wu $$0, wu $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static fnj a(Runnable $$0) {
      return new fnb(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fnj b(Runnable $$0) {
      return new fnb(c, q, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.v.c().b();
      fle.b $$0 = this.v.d(1);
      $$0.a(new fiz(this.k, this.o));
      $$0.a(new fim(this.r, this.o).d(this.m - 50).b(true));
      int $$1 = 120;
      fle $$2 = new fle().a(5);
      fle.b $$3 = $$2.d(3);
      $$3.a(fhs.a(wt.n, $$0x -> ac.k().a(this.s)).b(120, 20).a());
      $$3.a(fhs.a(wt.o, $$0x -> this.l.o.a(this.s)).b(120, 20).a());
      $$3.a(fhs.a(wt.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      fld.a(this.v, this.H());
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
