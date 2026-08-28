import java.net.URI;

public class fuc extends fuk {
   private static final wo a = wo.c("symlink_warning.title.world").a(n.r);
   private static final wo b = wo.a("symlink_warning.message.world", wo.a(axv.p));
   private static final wo c = wo.c("symlink_warning.title.pack").a(n.r);
   private static final wo d = wo.a("symlink_warning.message.pack", wo.a(axv.p));
   private final wo s;
   private final URI u;
   private final Runnable v;
   private final fsf w = new fsf().b(10);

   public fuc(wo $$0, wo $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static fuk a(Runnable $$0) {
      return new fuc(a, b, axv.p, $$0);
   }

   public static fuk b(Runnable $$0) {
      return new fuc(c, d, axv.p, $$0);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.w.c().b();
      fsf.b $$0 = this.w.d(1);
      $$0.a(new fpz(this.l, this.p));
      $$0.a(new fpm(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fsf $$2 = new fsf().a(5);
      fsf.b $$3 = $$2.d(3);
      $$3.a(fos.a(wn.n, $$0x -> af.m().a(this.u)).b(120, 20).a());
      $$3.a(fos.a(wn.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(fos.a(wn.k, $$0x -> this.aO_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      fse.a(this.w, this.J());
   }

   @Override
   public wo i() {
      return wn.a(super.i(), this.s);
   }

   @Override
   public void aO_() {
      this.v.run();
   }
}
