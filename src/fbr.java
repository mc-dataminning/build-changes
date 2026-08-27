public class fbr extends fcc {
   private static final vb a = vb.c("symlink_warning.title.world").a(n.r);
   private static final vb b = vb.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final vb c = vb.c("symlink_warning.title.pack").a(n.r);
   private static final vb k = vb.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final vb l;
   private final String m;
   private final Runnable n;
   private final ezq o = new ezq().b(10);

   public fbr(vb $$0, vb $$1, String $$2, Runnable $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static fcc a(Runnable $$0) {
      return new fbr(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fcc b(Runnable $$0) {
      return new fbr(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.o.c().b();
      ezq.b $$0 = this.o.d(1);
      $$0.a(new exo(this.e, this.i));
      $$0.a(new exb(this.l, this.i).j(this.g - 50).b(true));
      int $$1 = 120;
      ezq $$2 = new ezq().a(5);
      ezq.b $$3 = $$2.d(3);
      $$3.a(ewh.a(va.n, $$0x -> ac.i().a(this.m)).b(120, 20).a());
      $$3.a(ewh.a(va.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(ewh.a(va.k, $$0x -> this.aF_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
      ezp.a(this.o, this.s());
   }

   @Override
   public vb h() {
      return va.a(super.h(), this.l);
   }

   @Override
   public void aF_() {
      this.n.run();
   }
}
