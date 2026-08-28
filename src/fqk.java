import java.net.URI;

public class fqk extends fqs {
   private static final xh a = xh.c("symlink_warning.title.world").a(n.r);
   private static final xh b = xh.a("symlink_warning.message.world", xh.a(ayf.p));
   private static final xh c = xh.c("symlink_warning.title.pack").a(n.r);
   private static final xh d = xh.a("symlink_warning.message.pack", xh.a(ayf.p));
   private final xh s;
   private final URI u;
   private final Runnable v;
   private final fom w = new fom().b(10);

   public fqk(xh $$0, xh $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static fqs a(Runnable $$0) {
      return new fqk(a, b, ayf.p, $$0);
   }

   public static fqs b(Runnable $$0) {
      return new fqk(c, d, ayf.p, $$0);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.w.c().b();
      fom.b $$0 = this.w.d(1);
      $$0.a(new fmg(this.l, this.p));
      $$0.a(new flt(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fom $$2 = new fom().a(5);
      fom.b $$3 = $$2.d(3);
      $$3.a(fkz.a(xg.n, $$0x -> ad.m().a(this.u)).b(120, 20).a());
      $$3.a(fkz.a(xg.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(fkz.a(xg.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      fol.a(this.w, this.H());
   }

   @Override
   public xh i() {
      return xg.a(super.i(), this.s);
   }

   @Override
   public void d() {
      this.v.run();
   }
}
