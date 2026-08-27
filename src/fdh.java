import java.util.UUID;
import java.util.function.Supplier;

public class fdh extends fda<fkv.a> {
   private static final int s = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final ui v = ui.c("gui.abuseReport.skin.title");
   private final ewx w = ewx.d().a(8);
   private eub x;
   private etj y;
   private etj z;

   private fdh(ezd $$0, fku $$1, fkv.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fdh(ezd $$0, fku $$1, UUID $$2, Supplier<gba> $$3) {
      this($$0, $$1, new fkv.a($$2, $$3, $$1.a().b()));
   }

   public fdh(ezd $$0, fku $$1, fkv $$2) {
      this($$0, $$1, new fkv.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.w.c().b();
      this.w.a(new euq(this.e, this.i));
      ewx $$0 = this.w.a(ewx.e().a(8));
      $$0.c().e();
      $$0.a(new euj(85, 120, this.f.aP(), this.q.e().a()));
      ewx $$1 = $$0.a(ewx.d().a(8));
      this.z = etj.a(c, $$0x -> this.f.a(new fdg(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(ewp.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      $$1.a(ewp.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      ewx $$2 = this.w.a(ewx.e().a(8));
      $$2.a(etj.a(uh.k, $$0x -> this.aC_()).a(120).a());
      this.y = $$2.a(etj.a(a, $$0x -> this.l()).a(120).a());
      this.w.a($$1x -> {
         eth var10000 = this.d($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.w.a();
      ewr.a(this.w, this.s());
   }

   private void C() {
      fks $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      fkq.b $$1 = this.q.c();
      this.y.i = $$1 == null;
      this.y.a(x.a($$1, fkq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
