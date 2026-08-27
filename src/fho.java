import java.nio.file.Path;
import javax.annotation.Nullable;

public class fho extends fdb {
   private static final int a = 8;
   private static final vf b = vf.c("telemetry_info.screen.title");
   private static final vf c = vf.c("telemetry_info.screen.description").a(n.h);
   private static final vf k = vf.c("telemetry_info.button.privacy_statement");
   private static final vf l = vf.c("telemetry_info.button.give_feedback");
   private static final vf m = vf.c("telemetry_info.button.show_data");
   private static final vf n = vf.c("telemetry_info.opt_in.description");
   private final fdb o;
   private final evm p;
   @Nullable
   private fhn q;
   private double r;

   public fho(fdb $$0, evm $$1) {
      super(b);
      this.o = $$0;
      this.p = $$1;
   }

   @Override
   public vf h() {
      return ve.a(super.h(), c);
   }

   @Override
   protected void aN_() {
      fao $$0 = new fao();
      $$0.c().a(8);
      $$0.a(this.h);
      fau $$1 = $$0.a(fau.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new eyn(this.o(), this.i));
      $$1.a(new eya(c, this.i).c(this.g - 16).b(true));
      fap $$2 = this.a(exg.a(k, this::b).a(), exg.a(l, this::c).a());
      $$1.a($$2);
      far $$3 = this.n();
      $$0.a();
      $$3.a();
      int $$4 = $$2.C() + $$2.u();
      int $$5 = $$3.u();
      int $$6 = this.h - $$4 - $$5 - 16;
      this.q = new fhn(0, 0, this.g - 40, $$6, this.f.h);
      this.q.a(this.r);
      this.q.a($$0x -> this.r = $$0x);
      this.c(this.q);
      $$1.a(this.q);
      $$1.a($$3);
      $$0.a();
      fao.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         exe var10000 = this.d($$1x);
      });
   }

   private far n() {
      fau $$0 = fau.d();
      $$0.c().b().e(4);
      if (this.f.B()) {
         $$0.a(this.D());
      }

      $$0.a(this.a(exg.a(m, this::d).a(), exg.a(ve.d, this::a).a()));
      return $$0;
   }

   private exe D() {
      evl<Boolean> $$0 = this.p.af();
      exi $$1 = exi.a(n, this.f.h).a($$0).a(this::a).a();
      $$1.j = this.f.B();
      return $$1;
   }

   private void a(exe $$0, boolean $$1) {
      if (this.q != null) {
         this.q.b($$1);
      }
   }

   private void a(exg $$0) {
      this.f.a(this.o);
   }

   private void b(exg $$0) {
      fbt.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void c(exg $$0) {
      fbt.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void d(exg $$0) {
      Path $$1 = this.f.t().b();
      ac.j().a($$1.toUri());
   }

   @Override
   public void aE_() {
      this.f.a(this.o);
   }

   @Override
   public void b(ewu $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private fap a(exe $$0, exe $$1) {
      fap $$2 = new fap();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
