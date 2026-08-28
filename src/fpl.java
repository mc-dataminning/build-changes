import java.net.URI;

public class fpl extends fpt {
   private static final xd a = xd.c("symlink_warning.title.world").a(n.r);
   private static final xd b = xd.a("symlink_warning.message.world", xd.a(axy.p));
   private static final xd c = xd.c("symlink_warning.title.pack").a(n.r);
   private static final xd d = xd.a("symlink_warning.message.pack", xd.a(axy.p));
   private final xd s;
   private final URI u;
   private final Runnable v;
   private final fnn w = new fnn().b(10);

   public fpl(xd $$0, xd $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static fpt a(Runnable $$0) {
      return new fpl(a, b, axy.p, $$0);
   }

   public static fpt b(Runnable $$0) {
      return new fpl(c, d, axy.p, $$0);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.w.c().b();
      fnn.b $$0 = this.w.d(1);
      $$0.a(new flh(this.l, this.p));
      $$0.a(new fku(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fnn $$2 = new fnn().a(5);
      fnn.b $$3 = $$2.d(3);
      $$3.a(fka.a(xc.n, $$0x -> ad.m().a(this.u)).b(120, 20).a());
      $$3.a(fka.a(xc.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(fka.a(xc.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      fnm.a(this.w, this.H());
   }

   @Override
   public xd i() {
      return xc.a(super.i(), this.s);
   }

   @Override
   public void d() {
      this.v.run();
   }
}
