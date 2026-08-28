public class fni extends fob {
   private static final wz a = wz.c("gui.toMenu");
   private static final wz b = wz.c("gui.toTitle");
   private static final wz c = wz.c("gui.report_to_server");
   private static final wz r = wz.c("gui.open_report_dir");
   private final fob s;
   private final vv u;
   private final wz v;
   private final fmb w = fmb.d();

   public fni(fob $$0, wz $$1, wz $$2) {
      this($$0, $$1, new vv($$2));
   }

   public fni(fob $$0, wz $$1, wz $$2, wz $$3) {
      this($$0, $$1, new vv($$2), $$3);
   }

   public fni(fob $$0, wz $$1, vv $$2) {
      this($$0, $$1, $$2, a);
   }

   public fni(fob $$0, wz $$1, vv $$2, wz $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aT_() {
      this.w.c().b().a(10);
      this.w.a(new fjr(this.k, this.o));
      this.w.a(new fje(this.u.a(), this.o).d(this.m - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fik.a(c, fmy.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fik.a(r, $$1x -> ad.k().a($$0.getParent())).a(200).a()));
      fik $$0;
      if (this.l.F()) {
         $$0 = fik.a(this.v, $$0x -> this.l.a(this.s)).a(200).a();
      } else {
         $$0 = fik.a(b, $$0x -> this.l.a(new fod())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      flv.a(this.w, this.H());
   }

   @Override
   public wz i() {
      return wy.a(this.k, this.u.a());
   }

   @Override
   public boolean aJ_() {
      return false;
   }
}
