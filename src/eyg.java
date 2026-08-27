public class eyg extends ezd {
   private static final ui a = ui.c("gui.toMenu");
   private static final ui b = ui.c("gui.toTitle");
   private final ezd c;
   private final ui k;
   private final ui l;
   private final ewx m = ewx.d();

   public eyg(ezd $$0, ui $$1, ui $$2) {
      this($$0, $$1, $$2, a);
   }

   public eyg(ezd $$0, ui $$1, ui $$2, ui $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aM_() {
      this.m.c().b().a(10);
      this.m.a(new euq(this.e, this.i));
      this.m.a(new eud(this.k, this.i).j(this.g - 50).b(true));
      etj $$0;
      if (this.f.D()) {
         $$0 = etj.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = etj.a(b, $$0x -> this.f.a(new ezi())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.c();
   }

   @Override
   protected void c() {
      ewr.a(this.m, this.s());
   }

   @Override
   public ui h() {
      return uh.a(this.e, this.k);
   }

   @Override
   public boolean aB_() {
      return false;
   }
}
