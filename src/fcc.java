import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fcc extends fcb<fjn.a> {
   private static final int s = 120;
   private static final ti t = ti.c("gui.chatReport.title");
   private static final ti u = ti.c("gui.chatReport.select_chat");
   private final evy v = evy.d().a(8);
   private etd w;
   private esl x;
   private esl y;
   private esl z;

   private fcc(eyf $$0, fju $$1, fjn.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fcc(eyf $$0, fju $$1, UUID $$2) {
      this($$0, $$1, new fjn.a($$2, $$1.a().b()));
   }

   public fcc(eyf $$0, fju $$1, fjn $$2) {
      this($$0, $$1, new fjn.a($$2, $$1.a().b()));
   }

   @Override
   protected void aD_() {
      this.v.c().b();
      this.v.a(new etr(this.e, this.i));
      this.y = this.v.a(esl.a(u, $$0x -> this.f.a(new fce(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.C();
         }))).a(280).a());
      this.z = esl.a(c, $$0x -> this.f.a(new fch(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(280).a();
      this.v.a(evq.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.v.a(evq.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      evy $$0 = this.v.a(evy.e().a(8));
      $$0.a(esl.a(th.k, $$0x -> this.au_()).a(120).a());
      this.x = $$0.a(esl.a(a, $$0x -> this.l()).a(120).a());
      this.v.a($$1 -> {
         esj var10000 = this.d($$1);
      });
      this.b();
      this.C();
   }

   @Override
   protected void b() {
      this.v.a();
      evs.a(this.v, this.s());
   }

   private void C() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(ti.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fjs $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fjq.b $$2 = this.q.c();
      this.x.i = $$2 == null;
      this.x.a(x.a($$2, fjq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
