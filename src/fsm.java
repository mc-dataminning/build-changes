import java.util.UUID;

public class fsm extends fsi<gah.a> {
   private static final int z = 120;
   private static final wz A = wz.c("gui.abuseReport.name.title");
   private final fmb B = fmb.d().a(8);
   private fjc C;
   private fik D;

   private fsm(fob $$0, gam $$1, gah.a $$2) {
      super(A, $$0, $$1, $$2);
   }

   public fsm(fob $$0, gam $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gah.a($$2, $$3, $$1.a().b()));
   }

   public fsm(fob $$0, gam $$1, gah $$2) {
      this($$0, $$1, new gah.a($$2, $$1.a().b()));
   }

   @Override
   protected void aT_() {
      this.B.c().b();
      this.B.a(new fjr(this.k, this.o));
      wz $$0 = wz.b(this.y.e().a()).a(n.o);
      this.B.a(new fjr(wz.a("gui.abuseReport.name.reporting", $$0), this.o), $$0x -> $$0x.a().a(0, 8));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.y.a($$0x);
         this.C();
      });
      this.B.a(flt.a(this.o, this.C, r, $$0x -> $$0x.e(12)));
      fmb $$1 = this.B.a(fmb.e().a(8));
      $$1.a(fik.a(wy.k, $$0x -> this.d()).a(120).a());
      this.D = $$1.a(fik.a(a, $$0x -> this.m()).a(120).a());
      this.C();
      this.B.a($$1x -> {
         fii var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      flv.a(this.B, this.H());
   }

   private void C() {
      gai.b $$0 = this.y.c();
      this.D.j = $$0 == null;
      this.D.a(x.a($$0, gai.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
