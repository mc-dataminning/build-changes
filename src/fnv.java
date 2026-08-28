import java.net.URI;

public class fnv extends fod {
   private static final wz a = wz.c("symlink_warning.title.world").a(n.r);
   private static final wz b = wz.a("symlink_warning.message.world", wz.a(axj.p));
   private static final wz c = wz.c("symlink_warning.title.pack").a(n.r);
   private static final wz r = wz.a("symlink_warning.message.pack", wz.a(axj.p));
   private final wz s;
   private final URI u;
   private final Runnable v;
   private final fly w = new fly().b(10);

   public fnv(wz $$0, wz $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static fod a(Runnable $$0) {
      return new fnv(a, b, axj.p, $$0);
   }

   public static fod b(Runnable $$0) {
      return new fnv(c, r, axj.p, $$0);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.w.c().b();
      fly.b $$0 = this.w.d(1);
      $$0.a(new fjt(this.k, this.o));
      $$0.a(new fjg(this.s, this.o).d(this.m - 50).b(true));
      int $$1 = 120;
      fly $$2 = new fly().a(5);
      fly.b $$3 = $$2.d(3);
      $$3.a(fim.a(wy.n, $$0x -> ad.k().a(this.u)).b(120, 20).a());
      $$3.a(fim.a(wy.o, $$0x -> this.l.o.a(this.u.toString())).b(120, 20).a());
      $$3.a(fim.a(wy.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      flx.a(this.w, this.H());
   }

   @Override
   public wz i() {
      return wy.a(super.i(), this.s);
   }

   @Override
   public void d() {
      this.v.run();
   }
}
