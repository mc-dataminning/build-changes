public class ftt extends fum {
   private static final wp a = wp.c("gui.toMenu");
   private static final wp b = wp.c("gui.toTitle");
   private static final wp c = wp.c("gui.report_to_server");
   private static final wp d = wp.c("gui.open_report_dir");
   private final fum s;
   private final vk u;
   private final wp v;
   private final fsm w = fsm.d();

   public ftt(fum $$0, wp $$1, wp $$2) {
      this($$0, $$1, new vk($$2));
   }

   public ftt(fum $$0, wp $$1, wp $$2, wp $$3) {
      this($$0, $$1, new vk($$2), $$3);
   }

   public ftt(fum $$0, wp $$1, vk $$2) {
      this($$0, $$1, $$2, a);
   }

   public ftt(fum $$0, wp $$1, vk $$2, wp $$3) {
      super($$1);
      this.s = $$0;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected void aR_() {
      this.w.c().b().a(10);
      this.w.a(new fqb(this.l, this.p));
      this.w.a(new fpo(this.u.a(), this.p).d(this.n - 50).b(true));
      this.w.c().a(2);
      this.u.c().ifPresent($$0 -> this.w.a(fou.a(c, ftj.b(this, $$0, false)).a(200).a()));
      this.u.b().ifPresent($$0 -> this.w.a(fou.a(d, $$1x -> af.n().a($$0.getParent())).a(200).a()));
      fou $$0;
      if (this.m.F()) {
         $$0 = fou.a(this.v, $$0x -> this.m.a(this.s)).a(200).a();
      } else {
         $$0 = fou.a(b, $$0x -> this.m.a(new fuo())).a(200).a();
      }

      this.w.a($$0);
      this.w.a();
      this.w.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fsg.a(this.w, this.J());
   }

   @Override
   public wp i() {
      return wo.a(this.l, this.u.a());
   }

   @Override
   public boolean aG_() {
      return false;
   }
}
