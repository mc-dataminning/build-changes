import java.net.URI;

public class ftj extends ftr {
   private static final xk a = xk.c("symlink_warning.title.world").a(n.r);
   private static final xk b = xk.a("symlink_warning.message.world", xk.a(ayq.p));
   private static final xk c = xk.c("symlink_warning.title.pack").a(n.r);
   private static final xk d = xk.a("symlink_warning.message.pack", xk.a(ayq.p));
   private final xk s;
   private final URI u;
   private final Runnable v;
   private final frm w = new frm().b(10);

   public ftj(xk $$0, xk $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static ftr a(Runnable $$0) {
      return new ftj(a, b, ayq.p, $$0);
   }

   public static ftr b(Runnable $$0) {
      return new ftj(c, d, ayq.p, $$0);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.w.c().b();
      frm.b $$0 = this.w.d(1);
      $$0.a(new fpg(this.l, this.p));
      $$0.a(new fot(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      frm $$2 = new frm().a(5);
      frm.b $$3 = $$2.d(3);
      $$3.a(fny.a(xj.n, $$0x -> ae.m().a(this.u)).b(120, 20).a());
      $$3.a(fny.a(xj.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(fny.a(xj.k, $$0x -> this.aP_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      frl.a(this.w, this.H());
   }

   @Override
   public xk i() {
      return xj.a(super.i(), this.s);
   }

   @Override
   public void aP_() {
      this.v.run();
   }
}
