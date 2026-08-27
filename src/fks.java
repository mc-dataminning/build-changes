public class fks extends fld {
   private static final wu a = wu.c("symlink_warning.title.world").a(n.r);
   private static final wu b = wu.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final wu c = wu.c("symlink_warning.title.pack").a(n.r);
   private static final wu d = wu.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final wu r;
   private final String s;
   private final Runnable u;
   private final fiq v = new fiq().b(10);

   public fks(wu $$0, wu $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static fld a(Runnable $$0) {
      return new fks(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fld b(Runnable $$0) {
      return new fks(c, d, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.v.c().b();
      fiq.b $$0 = this.v.d(1);
      $$0.a(new fgl(this.l, this.p));
      $$0.a(new ffy(this.r, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fiq $$2 = new fiq().a(5);
      fiq.b $$3 = $$2.d(3);
      $$3.a(ffe.a(wt.n, $$0x -> ac.j().a(this.s)).b(120, 20).a());
      $$3.a(ffe.a(wt.o, $$0x -> this.m.o.a(this.s)).b(120, 20).a());
      $$3.a(ffe.a(wt.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      fip.a(this.v, this.G());
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
