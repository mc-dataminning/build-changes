import java.util.UUID;

public class fso extends fsk<gaj.a> {
   private static final wz C = wz.c("gui.abuseReport.name.title");
   private fje D;

   private fso(fod $$0, gao $$1, gaj.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fso(fod $$0, gao $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gaj.a($$2, $$3, $$1.a().b()));
   }

   public fso(fod $$0, gao $$1, gaj $$2) {
      this($$0, $$1, new gaj.a($$2, $$1.a().b()));
   }

   @Override
   protected void C() {
      wz $$0 = wz.b(this.A.e().a()).a(n.o);
      this.z.a(new fjt(wz.a("gui.abuseReport.name.reporting", $$0), this.o), $$0x -> $$0x.a().a(0, 8));
      this.D = this.a(280, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.E();
      });
      this.z.a(flv.a(this.o, this.D, r, $$0x -> $$0x.e(12)));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
