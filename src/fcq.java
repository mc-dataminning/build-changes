public class fcq extends fdb {
   private static final vf a = vf.c("symlink_warning.title.world").a(n.r);
   private static final vf b = vf.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final vf c = vf.c("symlink_warning.title.pack").a(n.r);
   private static final vf k = vf.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final vf l;
   private final String m;
   private final Runnable n;
   private final fap o = new fap().b(10);

   public fcq(vf $$0, vf $$1, String $$2, Runnable $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static fdb a(Runnable $$0) {
      return new fcq(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fdb b(Runnable $$0) {
      return new fcq(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.o.c().b();
      fap.b $$0 = this.o.d(1);
      $$0.a(new eyn(this.e, this.i));
      $$0.a(new eya(this.l, this.i).c(this.g - 50).b(true));
      int $$1 = 120;
      fap $$2 = new fap().a(5);
      fap.b $$3 = $$2.d(3);
      $$3.a(exg.a(ve.n, $$0x -> ac.j().a(this.m)).b(120, 20).a());
      $$3.a(exg.a(ve.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(exg.a(ve.k, $$0x -> this.aE_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
      fao.a(this.o, this.F());
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
