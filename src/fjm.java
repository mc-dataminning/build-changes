public class fjm extends fjx {
   private static final wi a = wi.c("symlink_warning.title.world").a(n.r);
   private static final wi b = wi.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final wi c = wi.c("symlink_warning.title.pack").a(n.r);
   private static final wi d = wi.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final wi o;
   private final String p;
   private final Runnable q;
   private final fhk r = new fhk().b(10);

   public fjm(wi $$0, wi $$1, String $$2, Runnable $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   public static fjx a(Runnable $$0) {
      return new fjm(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fjx b(Runnable $$0) {
      return new fjm(c, d, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.r.c().b();
      fhk.b $$0 = this.r.d(1);
      $$0.a(new fff(this.i, this.m));
      $$0.a(new fes(this.o, this.m).d(this.k - 50).b(true));
      int $$1 = 120;
      fhk $$2 = new fhk().a(5);
      fhk.b $$3 = $$2.d(3);
      $$3.a(fdy.a(wh.n, $$0x -> ac.j().a(this.p)).b(120, 20).a());
      $$3.a(fdy.a(wh.o, $$0x -> this.j.o.a(this.p)).b(120, 20).a());
      $$3.a(fdy.a(wh.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.r.a(this::c);
   }

   @Override
   protected void c() {
      this.r.a();
      fhj.a(this.r, this.G());
   }

   @Override
   public wi i() {
      return wh.a(super.i(), this.o);
   }

   @Override
   public void d() {
      this.q.run();
   }
}
