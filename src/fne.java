import java.net.URI;

public class fne extends fnx {
   private static final wy a = wy.c("gui.toMenu");
   private static final wy b = wy.c("gui.toTitle");
   private static final wy c = wy.c("gui.report_to_server");
   private static final wy q = wy.c("gui.open_report_dir");
   private final fnx r;
   private final vu s;
   private final wy u;
   private final flx v = flx.d();

   public fne(fnx $$0, wy $$1, wy $$2) {
      this($$0, $$1, new vu($$2));
   }

   public fne(fnx $$0, wy $$1, wy $$2, wy $$3) {
      this($$0, $$1, new vu($$2), $$3);
   }

   public fne(fnx $$0, wy $$1, vu $$2) {
      this($$0, $$1, $$2, a);
   }

   public fne(fnx $$0, wy $$1, vu $$2, wy $$3) {
      super($$1);
      this.r = $$0;
      this.s = $$2;
      this.u = $$3;
   }

   @Override
   protected void aP_() {
      this.v.c().b().a(10);
      this.v.a(new fjn(this.k, this.o));
      this.v.a(new fja(this.s.a(), this.o).d(this.m - 50).b(true));
      this.v.c().a(2);
      this.s.c().ifPresent($$0 -> this.v.a(fig.a(c, fmu.b(this, $$0, false)).a(200).a()));
      this.s.b().ifPresent($$0 -> {
         URI $$1x = $$0.getParent().toUri();
         this.v.a(fig.a(q, $$1xx -> ad.k().a($$1x)).a(200).a());
      });
      fig $$0;
      if (this.l.F()) {
         $$0 = fig.a(this.u, $$0x -> this.l.a(this.r)).a(200).a();
      } else {
         $$0 = fig.a(b, $$0x -> this.l.a(new fnz())).a(200).a();
      }

      this.v.a($$0);
      this.v.a();
      this.v.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      flr.a(this.v, this.H());
   }

   @Override
   public wy i() {
      return wx.a(this.k, this.s.a());
   }

   @Override
   public boolean aF_() {
      return false;
   }
}
