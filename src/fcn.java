import java.util.UUID;
import java.util.function.Supplier;

public class fcn extends fcg<fka.a> {
   private static final int s = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final tl v = tl.c("gui.abuseReport.skin.title");
   private final ewd w = ewd.d().a(8);
   private eti x;
   private esq y;
   private esq z;

   private fcn(eyk $$0, fjz $$1, fka.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fcn(eyk $$0, fjz $$1, UUID $$2, Supplier<gae> $$3) {
      this($$0, $$1, new fka.a($$2, $$3, $$1.a().b()));
   }

   public fcn(eyk $$0, fjz $$1, fka $$2) {
      this($$0, $$1, new fka.a($$2, $$1.a().b()));
   }

   @Override
   protected void aI_() {
      this.w.c().b();
      this.w.a(new etw(this.e, this.i));
      ewd $$0 = this.w.a(ewd.e().a(8));
      $$0.c().e();
      $$0.a(new etq(85, 120, this.f.aP(), this.q.e().a()));
      ewd $$1 = $$0.a(ewd.d().a(8));
      this.z = esq.a(c, $$0x -> this.f.a(new fcm(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(evv.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      $$1.a(evv.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      ewd $$2 = this.w.a(ewd.e().a(8));
      $$2.a(esq.a(tk.k, $$0x -> this.az_()).a(120).a());
      this.y = $$2.a(esq.a(a, $$0x -> this.l()).a(120).a());
      this.w.a($$1x -> {
         eso var10000 = this.d($$1x);
      });
      this.b();
      this.C();
   }

   @Override
   protected void b() {
      this.w.a();
      evx.a(this.w, this.s());
   }

   private void C() {
      fjx $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      fjv.b $$1 = this.q.c();
      this.y.i = $$1 == null;
      this.y.a(x.a($$1, fjv.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
