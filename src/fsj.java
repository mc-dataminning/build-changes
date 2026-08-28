import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fsj extends fsi<gaf.a> {
   private static final int z = 120;
   private static final wz A = wz.c("gui.chatReport.title");
   private static final wz B = wz.c("gui.chatReport.select_chat");
   private final fmb C = fmb.d().a(8);
   private fjc D;
   private fik E;
   private fik F;
   private fik G;

   private fsj(fob $$0, gam $$1, gaf.a $$2) {
      super(A, $$0, $$1, $$2);
   }

   public fsj(fob $$0, gam $$1, UUID $$2) {
      this($$0, $$1, new gaf.a($$2, $$1.a().b()));
   }

   public fsj(fob $$0, gam $$1, gaf $$2) {
      this($$0, $$1, new gaf.a($$2, $$1.a().b()));
   }

   @Override
   protected void aT_() {
      this.C.c().b();
      this.C.a(new fjr(this.k, this.o));
      this.F = this.C.a(fik.a(B, $$0x -> this.l.a(new fsl(this, this.x, this.y, $$0xx -> {
            this.y = $$0xx;
            this.C();
         }))).a(280).a());
      this.G = fik.a(c, $$0x -> this.l.a(new fso(this, this.y.h(), $$0xx -> {
            this.y.a($$0xx);
            this.C();
         }))).a(280).a();
      this.C.a(flt.a(this.o, this.G, b));
      this.D = this.a(280, 9 * 8, $$0x -> {
         this.y.a($$0x);
         this.C();
      });
      this.C.a(flt.a(this.o, this.D, r, $$0x -> $$0x.e(12)));
      fmb $$0 = this.C.a(fmb.e().a(8));
      $$0.a(fik.a(wy.k, $$0x -> this.d()).a(120).a());
      this.E = $$0.a(fik.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1 -> {
         fii var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.C.a();
      flv.a(this.C, this.H());
   }

   private void C() {
      IntSet $$0 = this.y.a();
      if ($$0.isEmpty()) {
         this.F.b(B);
      } else {
         this.F.b(wz.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gak $$1 = this.y.h();
      if ($$1 != null) {
         this.G.b($$1.b());
      } else {
         this.G.b(c);
      }

      gai.b $$2 = this.y.c();
      this.E.j = $$2 == null;
      this.E.a(x.a($$2, gai.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
