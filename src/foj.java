import java.nio.file.Path;
import javax.annotation.Nullable;

public class foj extends fjx {
   private static final wi a = wi.c("telemetry_info.screen.title");
   private static final wi b = wi.c("telemetry_info.screen.description").a(n.h);
   private static final wi c = wi.c("telemetry_info.button.privacy_statement");
   private static final wi d = wi.c("telemetry_info.button.give_feedback");
   private static final wi o = wi.c("telemetry_info.button.show_data");
   private static final wi p = wi.c("telemetry_info.opt_in.description");
   private static final int q = 8;
   private static final boolean r = fby.Q().D();
   private final fjx s;
   private final fcc u;
   private final fhl v = new fhl(this, 16 + 9 * 5 + 20, r ? 33 + fea.a(fby.Q().h) : 33);
   @Nullable
   private foi w;
   @Nullable
   private fes x;
   private double y;

   public foj(fjx $$0, fcc $$1) {
      super(a);
      this.s = $$0;
      this.u = $$1;
   }

   @Override
   public wi i() {
      return wh.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      fhp $$0 = this.v.a(fhp.d().a(4));
      $$0.c().b();
      $$0.a(new fff(a, this.m));
      this.x = $$0.a(new fes(b, this.m).b(true));
      fhp $$1 = $$0.a(fhp.e().a(8));
      $$1.a(fdy.a(c, this::a).a());
      $$1.a(fdy.a(d, this::b).a());
      fhp $$2 = this.v.b(fhp.d().a(4));
      if (r) {
         $$2.a(this.m());
      }

      fhp $$3 = $$2.a(fhp.e().a(8));
      $$3.a(fdy.a(o, this::c).a());
      $$3.a(fdy.a(wh.d, $$0x -> this.d()).a());
      fhp $$4 = this.v.c(fhp.d().a(8));
      this.w = $$4.a(new foi(0, 0, this.k - 40, this.v.d(), this.m));
      this.w.a($$0x -> this.y = $$0x);
      this.v.a($$1x -> {
         fdw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.w != null) {
         this.w.a(this.y);
         this.w.k(this.k - 40);
         this.w.l(this.v.d());
         this.w.j();
      }

      if (this.x != null) {
         this.x.d(this.k - 16);
      }

      this.v.a();
   }

   @Override
   protected void aC_() {
      if (this.w != null) {
         this.b(this.w);
      }
   }

   private fdw m() {
      fcb<Boolean> $$0 = this.u.ai();
      return fea.a(p, this.m).a($$0).a(this::a).a();
   }

   private void a(fdw $$0, boolean $$1) {
      if (this.w != null) {
         this.w.b($$1);
      }
   }

   private void a(fdy $$0) {
      fio.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fdy $$0) {
      fio.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fdy $$0) {
      Path $$1 = this.j.u().b();
      ac.j().a($$1.toUri());
   }

   @Override
   public void d() {
      this.j.a(this.s);
   }
}
