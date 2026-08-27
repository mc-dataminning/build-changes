public class fao extends faz {
   private static final uv a = uv.c("symlink_warning.title.world").a(n.r);
   private static final uv b = uv.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final uv c = uv.c("symlink_warning.title.pack").a(n.r);
   private static final uv k = uv.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final uv l;
   private final String m;
   private final Runnable n;
   private final eyn o = new eyn().b(10);

   public fao(uv $$0, uv $$1, String $$2, Runnable $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static faz a(Runnable $$0) {
      return new fao(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static faz b(Runnable $$0) {
      return new fao(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.o.c().b();
      eyn.b $$0 = this.o.d(1);
      $$0.a(new ewl(this.e, this.i));
      $$0.a(new evy(this.l, this.i).j(this.g - 50).b(true));
      int $$1 = 120;
      eyn $$2 = new eyn().a(5);
      eyn.b $$3 = $$2.d(3);
      $$3.a(eve.a(uu.n, $$0x -> ac.i().a(this.m)).b(120, 20).a());
      $$3.a(eve.a(uu.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(eve.a(uu.k, $$0x -> this.aG_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
      eym.a(this.o, this.s());
   }

   @Override
   public uv h() {
      return uu.a(super.h(), this.l);
   }

   @Override
   public void aG_() {
      this.n.run();
   }
}
