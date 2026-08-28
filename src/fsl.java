import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fsl extends fsk<gah.a> {
   private static final wz C = wz.c("gui.chatReport.title");
   private static final wz D = wz.c("gui.chatReport.select_chat");
   private fje E;
   private fim F;
   private fim G;

   private fsl(fod $$0, gao $$1, gah.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fsl(fod $$0, gao $$1, UUID $$2) {
      this($$0, $$1, new gah.a($$2, $$1.a().b()));
   }

   public fsl(fod $$0, gao $$1, gah $$2) {
      this($$0, $$1, new gah.a($$2, $$1.a().b()));
   }

   @Override
   protected void C() {
      this.F = this.z.a(fim.a(D, $$0 -> this.l.a(new fsn(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.E();
         }))).a(280).a());
      this.G = fim.a(c, $$0 -> this.l.a(new fsq(this, this.A.i(), $$0x -> {
            this.A.a($$0x);
            this.E();
         }))).a(280).a();
      this.z.a(flv.a(this.o, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.E();
      });
      this.z.a(flv.a(this.o, this.E, r, $$0 -> $$0.e(12)));
   }

   @Override
   protected void E() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(wz.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gam $$1 = this.A.i();
      if ($$1 != null) {
         this.G.b($$1.b());
      } else {
         this.G.b(c);
      }

      super.E();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.E.b($$0, $$1, $$2);
   }
}
