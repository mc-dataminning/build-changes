import java.net.URI;

public class fpz extends fqh {
   private static final xe a = xe.c("symlink_warning.title.world").a(n.r);
   private static final xe b = xe.a("symlink_warning.message.world", xe.a(ayb.p));
   private static final xe c = xe.c("symlink_warning.title.pack").a(n.r);
   private static final xe d = xe.a("symlink_warning.message.pack", xe.a(ayb.p));
   private final xe s;
   private final URI u;
   private final Runnable v;
   private final fob w = new fob().b(10);

   public fpz(xe $$0, xe $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static fqh a(Runnable $$0) {
      return new fpz(a, b, ayb.p, $$0);
   }

   public static fqh b(Runnable $$0) {
      return new fpz(c, d, ayb.p, $$0);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.w.c().b();
      fob.b $$0 = this.w.d(1);
      $$0.a(new flv(this.l, this.p));
      $$0.a(new fli(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fob $$2 = new fob().a(5);
      fob.b $$3 = $$2.d(3);
      $$3.a(fko.a(xd.n, $$0x -> ad.m().a(this.u)).b(120, 20).a());
      $$3.a(fko.a(xd.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(fko.a(xd.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      foa.a(this.w, this.H());
   }

   @Override
   public xe i() {
      return xd.a(super.i(), this.s);
   }

   @Override
   public void d() {
      this.v.run();
   }
}
