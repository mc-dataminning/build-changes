import java.net.URI;

public class ftq extends fty {
   private static final xv a = xv.c("symlink_warning.title.world").a(n.r);
   private static final xv b = xv.a("symlink_warning.message.world", xv.a(aza.p));
   private static final xv c = xv.c("symlink_warning.title.pack").a(n.r);
   private static final xv d = xv.a("symlink_warning.message.pack", xv.a(aza.p));
   private final xv s;
   private final URI u;
   private final Runnable v;
   private final frt w = new frt().b(10);

   public ftq(xv $$0, xv $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static fty a(Runnable $$0) {
      return new ftq(a, b, aza.p, $$0);
   }

   public static fty b(Runnable $$0) {
      return new ftq(c, d, aza.p, $$0);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.w.c().b();
      frt.b $$0 = this.w.d(1);
      $$0.a(new fpn(this.l, this.p));
      $$0.a(new fpa(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      frt $$2 = new frt().a(5);
      frt.b $$3 = $$2.d(3);
      $$3.a(fof.a(xu.n, $$0x -> ae.m().a(this.u)).b(120, 20).a());
      $$3.a(fof.a(xu.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(fof.a(xu.k, $$0x -> this.aP_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      frs.a(this.w, this.H());
   }

   @Override
   public xv i() {
      return xu.a(super.i(), this.s);
   }

   @Override
   public void aP_() {
      this.v.run();
   }
}
