import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class ftz extends fty<gby.a> {
   private static final xd C = xd.c("gui.chatReport.title");
   private static final xd D = xd.c("gui.chatReport.select_chat");
   private fks E;
   private fka F;
   private fka G;

   private ftz(fpt $$0, gcf $$1, gby.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public ftz(fpt $$0, gcf $$1, UUID $$2) {
      this($$0, $$1, new gby.a($$2, $$1.a().b()));
   }

   public ftz(fpt $$0, gcf $$1, gby $$2) {
      this($$0, $$1, new gby.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      this.F = this.z.a(fka.a(D, $$0 -> this.m.a(new fub(this, this.y, this.A, $$0x -> {
            this.A = $$0x;
            this.F();
         }))).a(280).a());
      this.G = fka.a(c, $$0 -> this.m.a(new fue(this, this.A.i(), gce.a, $$0x -> {
            this.A.a($$0x);
            this.F();
         }))).a(280).a();
      this.z.a(fnk.a(this.p, this.G, b));
      this.E = this.a(280, 9 * 8, $$0 -> {
         this.A.a($$0);
         this.F();
      });
      this.z.a(fnk.a(this.p, this.E, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void F() {
      IntSet $$0 = this.A.a();
      if ($$0.isEmpty()) {
         this.F.b(D);
      } else {
         this.F.b(xd.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gcd $$1 = this.A.i();
      if ($$1 != null) {
         this.G.b($$1.b());
      } else {
         this.G.b(c);
      }

      super.F();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.E.b($$0, $$1, $$2);
   }
}
