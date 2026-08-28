import java.net.URI;

public class fro extends frw {
   private static final xj a = xj.c("symlink_warning.title.world").a(n.r);
   private static final xj b = xj.a("symlink_warning.message.world", xj.a(ayi.p));
   private static final xj c = xj.c("symlink_warning.title.pack").a(n.r);
   private static final xj d = xj.a("symlink_warning.message.pack", xj.a(ayi.p));
   private final xj s;
   private final URI u;
   private final Runnable v;
   private final fpr w = new fpr().b(10);

   public fro(xj $$0, xj $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static frw a(Runnable $$0) {
      return new fro(a, b, ayi.p, $$0);
   }

   public static frw b(Runnable $$0) {
      return new fro(c, d, ayi.p, $$0);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.w.c().b();
      fpr.b $$0 = this.w.d(1);
      $$0.a(new fnk(this.l, this.p));
      $$0.a(new fmx(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fpr $$2 = new fpr().a(5);
      fpr.b $$3 = $$2.d(3);
      $$3.a(fmd.a(xi.n, $$0x -> ae.m().a(this.u)).b(120, 20).a());
      $$3.a(fmd.a(xi.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(fmd.a(xi.k, $$0x -> this.aO_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      fpq.a(this.w, this.H());
   }

   @Override
   public xj i() {
      return xi.a(super.i(), this.s);
   }

   @Override
   public void aO_() {
      this.v.run();
   }
}
