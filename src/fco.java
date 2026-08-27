public class fco extends fcz {
   private static final vf a = vf.c("symlink_warning.title.world").a(n.r);
   private static final vf b = vf.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final vf c = vf.c("symlink_warning.title.pack").a(n.r);
   private static final vf k = vf.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final vf l;
   private final String m;
   private final Runnable n;
   private final fan o = new fan().b(10);

   public fco(vf $$0, vf $$1, String $$2, Runnable $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static fcz a(Runnable $$0) {
      return new fco(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fcz b(Runnable $$0) {
      return new fco(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.o.c().b();
      fan.b $$0 = this.o.d(1);
      $$0.a(new eyl(this.e, this.i));
      $$0.a(new exy(this.l, this.i).c(this.g - 50).b(true));
      int $$1 = 120;
      fan $$2 = new fan().a(5);
      fan.b $$3 = $$2.d(3);
      $$3.a(exe.a(ve.n, $$0x -> ac.j().a(this.m)).b(120, 20).a());
      $$3.a(exe.a(ve.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(exe.a(ve.k, $$0x -> this.aE_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
      fam.a(this.o, this.F());
   }

   @Override
   public vf h() {
      return ve.a(super.h(), this.l);
   }

   @Override
   public void aE_() {
      this.n.run();
   }
}
