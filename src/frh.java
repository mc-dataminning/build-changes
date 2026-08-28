import java.net.URI;

public class frh extends frp {
   private static final xl a = xl.c("symlink_warning.title.world").a(n.r);
   private static final xl b = xl.a("symlink_warning.message.world", xl.a(ayj.p));
   private static final xl c = xl.c("symlink_warning.title.pack").a(n.r);
   private static final xl d = xl.a("symlink_warning.message.pack", xl.a(ayj.p));
   private final xl s;
   private final URI u;
   private final Runnable v;
   private final fpk w = new fpk().b(10);

   public frh(xl $$0, xl $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static frp a(Runnable $$0) {
      return new frh(a, b, ayj.p, $$0);
   }

   public static frp b(Runnable $$0) {
      return new frh(c, d, ayj.p, $$0);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.w.c().b();
      fpk.b $$0 = this.w.d(1);
      $$0.a(new fnd(this.l, this.p));
      $$0.a(new fmq(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fpk $$2 = new fpk().a(5);
      fpk.b $$3 = $$2.d(3);
      $$3.a(flw.a(xk.n, $$0x -> ae.m().a(this.u)).b(120, 20).a());
      $$3.a(flw.a(xk.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(flw.a(xk.k, $$0x -> this.aP_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      fpj.a(this.w, this.H());
   }

   @Override
   public xl i() {
      return xk.a(super.i(), this.s);
   }

   @Override
   public void aP_() {
      this.v.run();
   }
}
