import java.nio.file.Path;
import javax.annotation.Nullable;

public class fql extends flz {
   private static final wx a = wx.c("telemetry_info.screen.title");
   private static final wx b = wx.c("telemetry_info.screen.description").b(-4539718);
   private static final wx c = wx.c("telemetry_info.button.privacy_statement");
   private static final wx d = wx.c("telemetry_info.button.give_feedback");
   private static final wx r = wx.c("telemetry_info.button.show_data");
   private static final wx s = wx.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = feb.Q().D();
   private final flz w;
   private final fef x;
   private final fjn y = new fjn(this, 16 + 9 * 5 + 20, v ? 33 + fgc.a(feb.Q().h) : 33);
   @Nullable
   private fqk z;
   @Nullable
   private fgu A;
   private double B;

   public fql(flz $$0, fef $$1) {
      super(a);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public wx i() {
      return ww.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      fjr $$0 = this.y.a(fjr.d().a(4));
      $$0.c().b();
      $$0.a(new fhh(a, this.p));
      this.A = $$0.a(new fgu(b, this.p).b(true));
      fjr $$1 = $$0.a(fjr.e().a(8));
      $$1.a(fga.a(c, this::a).a());
      $$1.a(fga.a(d, this::b).a());
      fjr $$2 = this.y.b(fjr.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      fjr $$3 = $$2.a(fjr.e().a(8));
      $$3.a(fga.a(r, this::c).a());
      $$3.a(fga.a(ww.d, $$0x -> this.d()).a());
      fjr $$4 = this.y.c(fjr.d().a(8));
      this.z = $$4.a(new fqk(0, 0, this.n - 40, this.y.d(), this.p));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         ffy var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.z != null) {
         this.z.a(this.B);
         this.z.k(this.n - 40);
         this.z.l(this.y.d());
         this.z.j();
      }

      if (this.A != null) {
         this.A.d(this.n - 16);
      }

      this.y.a();
   }

   @Override
   protected void aD_() {
      if (this.z != null) {
         this.b(this.z);
      }
   }

   private ffy m() {
      fee<Boolean> $$0 = this.x.ai();
      return fgc.a(s, this.p).a($$0).a(this::a).a();
   }

   private void a(ffy $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fga $$0) {
      fkq.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fga $$0) {
      fkq.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fga $$0) {
      Path $$1 = this.m.u().b();
      ac.k().a($$1.toUri());
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }
}
