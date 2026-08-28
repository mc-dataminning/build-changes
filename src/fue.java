import java.net.URI;

public class fue extends fum {
   private static final wp a = wp.c("symlink_warning.title.world").a(n.r);
   private static final wp b = wp.a("symlink_warning.message.world", wp.a(axv.p));
   private static final wp c = wp.c("symlink_warning.title.pack").a(n.r);
   private static final wp d = wp.a("symlink_warning.message.pack", wp.a(axv.p));
   private final wp s;
   private final URI u;
   private final Runnable v;
   private final fsh w = new fsh().b(10);

   public fue(wp $$0, wp $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.s = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   public static fum a(Runnable $$0) {
      return new fue(a, b, axv.p, $$0);
   }

   public static fum b(Runnable $$0) {
      return new fue(c, d, axv.p, $$0);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.w.c().b();
      fsh.b $$0 = this.w.d(1);
      $$0.a(new fqb(this.l, this.p));
      $$0.a(new fpo(this.s, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fsh $$2 = new fsh().a(5);
      fsh.b $$3 = $$2.d(3);
      $$3.a(fou.a(wo.n, $$0x -> af.n().a(this.u)).b(120, 20).a());
      $$3.a(fou.a(wo.o, $$0x -> this.m.p.a(this.u.toString())).b(120, 20).a());
      $$3.a(fou.a(wo.k, $$0x -> this.aO_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
      fsg.a(this.w, this.J());
   }

   @Override
   public wp i() {
      return wo.a(super.i(), this.s);
   }

   @Override
   public void aO_() {
      this.v.run();
   }
}
