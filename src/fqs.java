import java.net.URI;

public class fqs extends fra {
   private static final xi a = xi.c("symlink_warning.title.world").a(n.r);
   private static final xi b = xi.a("symlink_warning.message.world", xi.a(ayg.p));
   private static final xi c = xi.c("symlink_warning.title.pack").a(n.r);
   private static final xi d = xi.a("symlink_warning.message.pack", xi.a(ayg.p));
   private final xi s;
   private final URI u;
   private final Runnable v;
   private final fov w = new fov().b(10);

   public fqs(xi $$0, xi $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static fra a(Runnable $$0) {
      return new fqs(a, b, ayg.p, $$0);
   }

   public static fra b(Runnable $$0) {
      return new fqs(c, d, ayg.p, $$0);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.w.c().b();
      fov.b $$0 = this.w.d(1);
      $$0.a(new fmo(this.l, this.p));
      $$0.a(new fmb(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fov $$2 = new fov().a(5);
      fov.b $$3 = $$2.d(3);
      $$3.a(flh.a(xh.n, $$0x -> ae.m().a(this.u)).b(120, 20).a());
      $$3.a(flh.a(xh.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(flh.a(xh.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      fou.a(this.w, this.H());
   }

   @Override
   public xi i() {
      return xh.a(super.i(), this.s);
   }

   @Override
   public void d() {
      this.v.run();
   }
}
