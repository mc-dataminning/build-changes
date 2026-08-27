public class ezw extends fah {
   private static final ur a = ur.c("symlink_warning.title.world").a(n.r);
   private static final ur b = ur.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final ur c = ur.c("symlink_warning.title.pack").a(n.r);
   private static final ur k = ur.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final ur l;
   private final String m;
   private final Runnable n;
   private final exv o = new exv().b(10);

   public ezw(ur $$0, ur $$1, String $$2, Runnable $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static fah a(Runnable $$0) {
      return new ezw(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fah b(Runnable $$0) {
      return new ezw(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.o.c().b();
      exv.b $$0 = this.o.d(1);
      $$0.a(new evt(this.e, this.i));
      $$0.a(new evg(this.l, this.i).j(this.g - 50).b(true));
      int $$1 = 120;
      exv $$2 = new exv().a(5);
      exv.b $$3 = $$2.d(3);
      $$3.a(eum.a(uq.n, $$0x -> ac.i().a(this.m)).b(120, 20).a());
      $$3.a(eum.a(uq.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(eum.a(uq.k, $$0x -> this.aE_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
      exu.a(this.o, this.s());
   }

   @Override
   public ur h() {
      return uq.a(super.h(), this.l);
   }

   @Override
   public void aE_() {
      this.n.run();
   }
}
