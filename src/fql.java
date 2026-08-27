import java.nio.file.Path;
import javax.annotation.Nullable;

public class fql extends fly {
   private static final wx a = wx.c("telemetry_info.screen.title");
   private static final wx b = wx.c("telemetry_info.screen.description").b(-4539718);
   private static final wx c = wx.c("telemetry_info.button.privacy_statement");
   private static final wx d = wx.c("telemetry_info.button.give_feedback");
   private static final wx r = wx.c("telemetry_info.button.show_data");
   private static final wx s = wx.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = fdz.Q().D();
   private final fly w;
   private final fed x;
   private final fjm y = new fjm(this, 16 + 9 * 5 + 20, v ? 33 + fgb.a(fdz.Q().h) : 33);
   @Nullable
   private fqk z;
   @Nullable
   private fgt A;
   private double B;

   public fql(fly $$0, fed $$1) {
      super(a);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public wx i() {
      return ww.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      fjq $$0 = this.y.a(fjq.d().a(4));
      $$0.c().b();
      $$0.a(new fhg(a, this.p));
      this.A = $$0.a(new fgt(b, this.p).b(true));
      fjq $$1 = $$0.a(fjq.e().a(8));
      $$1.a(ffz.a(c, this::a).a());
      $$1.a(ffz.a(d, this::b).a());
      fjq $$2 = this.y.b(fjq.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      fjq $$3 = $$2.a(fjq.e().a(8));
      $$3.a(ffz.a(r, this::c).a());
      $$3.a(ffz.a(ww.d, $$0x -> this.d()).a());
      fjq $$4 = this.y.c(fjq.d().a(8));
      this.z = $$4.a(new fqk(0, 0, this.n - 40, this.y.d(), this.p));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         ffx var10000 = this.c($$1x);
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
   protected void aC_() {
      if (this.z != null) {
         this.b(this.z);
      }
   }

   private ffx m() {
      fec<Boolean> $$0 = this.x.ai();
      return fgb.a(s, this.p).a($$0).a(this::a).a();
   }

   private void a(ffx $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(ffz $$0) {
      fkp.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(ffz $$0) {
      fkp.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(ffz $$0) {
      Path $$1 = this.m.u().b();
      ac.k().a($$1.toUri());
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }
}
