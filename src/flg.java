import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class flg extends flf<ftb.a> {
   private static final int r = 120;
   private static final vu t = vu.c("gui.chatReport.title");
   private static final vu u = vu.c("gui.chatReport.select_chat");
   private final fez v = fez.d().a(8);
   private fca w;
   private fbi x;
   private fbi y;
   private fbi z;

   private flg(fhh $$0, fti $$1, ftb.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public flg(fhh $$0, fti $$1, UUID $$2) {
      this($$0, $$1, new ftb.a($$2, $$1.a().b()));
   }

   public flg(fhh $$0, fti $$1, ftb $$2) {
      this($$0, $$1, new ftb.a($$2, $$1.a().b()));
   }

   @Override
   protected void aO_() {
      this.v.c().b();
      this.v.a(new fcp(this.e, this.i));
      this.y = this.v.a(fbi.a(u, $$0x -> this.f.a(new fli(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.E();
         }))).a(280).a());
      this.z = fbi.a(c, $$0x -> this.f.a(new fll(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.E();
         }))).a(280).a();
      this.v.a(fer.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      this.v.a(fer.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      fez $$0 = this.v.a(fez.e().a(8));
      $$0.a(fbi.a(vt.k, $$0x -> this.d()).a(120).a());
      this.x = $$0.a(fbi.a(a, $$0x -> this.o()).a(120).a());
      this.v.a($$1 -> {
         fbg var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.v.a();
      fet.a(this.v, this.F());
   }

   private void E() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(vu.a("gui.chatReport.selected_chat", $$0.size()));
      }

      ftg $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fte.b $$2 = this.q.c();
      this.x.j = $$2 == null;
      this.x.a(x.a($$2, fte.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
