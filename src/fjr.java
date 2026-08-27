import java.nio.file.Path;
import javax.annotation.Nullable;

public class fjr extends ffe {
   private static final int a = 8;
   private static final vq b = vq.c("telemetry_info.screen.title");
   private static final vq c = vq.c("telemetry_info.screen.description").a(n.h);
   private static final vq k = vq.c("telemetry_info.button.privacy_statement");
   private static final vq l = vq.c("telemetry_info.button.give_feedback");
   private static final vq m = vq.c("telemetry_info.button.show_data");
   private static final vq n = vq.c("telemetry_info.opt_in.description");
   private final ffe o;
   private final exl p;
   @Nullable
   private fjq q;
   private double r;

   public fjr(ffe $$0, exl $$1) {
      super(b);
      this.o = $$0;
      this.p = $$1;
   }

   @Override
   public vq i() {
      return vp.a(super.i(), c);
   }

   @Override
   protected void aQ_() {
      fcr $$0 = new fcr();
      $$0.c().a(8);
      $$0.a(this.h);
      fcx $$1 = $$0.a(fcx.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new fao(this.p(), this.i));
      $$1.a(new fab(c, this.i).c(this.g - 16).b(true));
      fcs $$2 = this.a(ezh.a(k, this::b).a(), ezh.a(l, this::c).a());
      $$1.a($$2);
      fcu $$3 = this.o();
      $$0.a();
      $$3.a();
      int $$4 = $$2.C() + $$2.u();
      int $$5 = $$3.u();
      int $$6 = this.h - $$4 - $$5 - 16;
      this.q = new fjq(0, 0, this.g - 40, $$6, this.f.h);
      this.q.a(this.r);
      this.q.a($$0x -> this.r = $$0x);
      $$1.a(this.q);
      $$1.a($$3);
      $$0.a();
      fcr.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         ezf var10000 = this.d($$1x);
      });
   }

   @Override
   protected void aH_() {
      this.c(this.q);
   }

   private fcu o() {
      fcx $$0 = fcx.d();
      $$0.c().b().e(4);
      if (this.f.B()) {
         $$0.a(this.E());
      }

      $$0.a(this.a(ezh.a(m, this::d).a(), ezh.a(vp.d, this::a).a()));
      return $$0;
   }

   private ezf E() {
      exk<Boolean> $$0 = this.p.af();
      ezj $$1 = ezj.a(n, this.f.h).a($$0).a(this::a).a();
      $$1.j = this.f.B();
      return $$1;
   }

   private void a(ezf $$0, boolean $$1) {
      if (this.q != null) {
         this.q.b($$1);
      }
   }

   private void a(ezh $$0) {
      this.f.a(this.o);
   }

   private void b(ezh $$0) {
      fdw.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void c(ezh $$0) {
      fdw.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void d(ezh $$0) {
      Path $$1 = this.f.t().b();
      ac.j().a($$1.toUri());
   }

   @Override
   public void d() {
      this.f.a(this.o);
   }

   @Override
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private fcs a(ezf $$0, ezf $$1) {
      fcs $$2 = new fcs();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
