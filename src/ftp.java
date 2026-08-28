public class ftp extends fui {
   private static final wo a = wo.c("gui.toMenu");
   private static final wo b = wo.c("gui.toTitle");
   private static final wo c = wo.c("gui.report_to_server");
   private static final wo d = wo.c("gui.open_report_dir");
   private final fui s;
   private final vk u;
   private final wo v;
   private final fsi w = fsi.d();

   public ftp(fui $$0, wo $$1, wo $$2) {
      this($$0, $$1, new vk($$2));
   }

   public ftp(fui $$0, wo $$1, wo $$2, wo $$3) {
      this($$0, $$1, new vk($$2), $$3);
   }

   public ftp(fui $$0, wo $$1, vk $$2) {
      this($$0, $$1, $$2, a);
   }

   public ftp(fui $$0, wo $$1, vk $$2, wo $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aR_() {
      this.w.c().b().a(10);
      this.w.a(new fpx(this.l, this.p));
      this.w.a(new fpk(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fop.a(c, ftf.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fop.a(d, $$1x -> af.m().a($$0.getParent())).a(200).a()));
      fop $$0;
      if (this.m.F()) {
         $$0 = fop.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fop.a(b, $$0x -> this.m.a(new fuk())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fsc.a(this.w, this.J());
   }

   @Override
   public wo i() {
      return wn.a(this.l, this.u.a());
   }

   @Override
   public boolean aG_() {
      return false;
   }
}
