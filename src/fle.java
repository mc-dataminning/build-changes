import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fle extends fld<fsz.a> {
   private static final int r = 120;
   private static final vu t = vu.c("gui.chatReport.title");
   private static final vu u = vu.c("gui.chatReport.select_chat");
   private final fex v = fex.d().a(8);
   private fby w;
   private fbg x;
   private fbg y;
   private fbg z;

   private fle(fhf $$0, ftg $$1, fsz.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fle(fhf $$0, ftg $$1, UUID $$2) {
      this($$0, $$1, new fsz.a($$2, $$1.a().b()));
   }

   public fle(fhf $$0, ftg $$1, fsz $$2) {
      this($$0, $$1, new fsz.a($$2, $$1.a().b()));
   }

   @Override
   protected void aO_() {
      this.v.c().b();
      this.v.a(new fcn(this.e, this.i));
      this.y = this.v.a(fbg.a(u, $$0x -> this.f.a(new flg(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.E();
         }))).a(280).a());
      this.z = fbg.a(c, $$0x -> this.f.a(new flj(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.E();
         }))).a(280).a();
      this.v.a(fep.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      this.v.a(fep.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      fex $$0 = this.v.a(fex.e().a(8));
      $$0.a(fbg.a(vt.k, $$0x -> this.d()).a(120).a());
      this.x = $$0.a(fbg.a(a, $$0x -> this.o()).a(120).a());
      this.v.a($$1 -> {
         fbe var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.v.a();
      fer.a(this.v, this.F());
   }

   private void E() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(vu.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fte $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      ftc.b $$2 = this.q.c();
      this.x.j = $$2 == null;
      this.x.a(x.a($$2, ftc.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
