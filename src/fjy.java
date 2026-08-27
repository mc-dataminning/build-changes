import java.nio.file.Path;
import javax.annotation.Nullable;

public class fjy extends ffl {
   private static final int a = 8;
   private static final vq b = vq.c("telemetry_info.screen.title");
   private static final vq c = vq.c("telemetry_info.screen.description").a(n.h);
   private static final vq k = vq.c("telemetry_info.button.privacy_statement");
   private static final vq l = vq.c("telemetry_info.button.give_feedback");
   private static final vq m = vq.c("telemetry_info.button.show_data");
   private static final vq n = vq.c("telemetry_info.opt_in.description");
   private final ffl o;
   private final exs p;
   @Nullable
   private fjx q;
   private double r;

   public fjy(ffl $$0, exs $$1) {
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
      fcy $$0 = new fcy();
      $$0.c().a(8);
      $$0.a(this.h);
      fde $$1 = $$0.a(fde.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new fav(this.p(), this.i));
      $$1.a(new fai(c, this.i).c(this.g - 16).b(true));
      fcz $$2 = this.a(ezo.a(k, this::b).a(), ezo.a(l, this::c).a());
      $$1.a($$2);
      fdb $$3 = this.o();
      $$0.a();
      $$3.a();
      int $$4 = $$2.C() + $$2.u();
      int $$5 = $$3.u();
      int $$6 = this.h - $$4 - $$5 - 16;
      this.q = new fjx(0, 0, this.g - 40, $$6, this.f.h);
      this.q.a(this.r);
      this.q.a($$0x -> this.r = $$0x);
      $$1.a(this.q);
      $$1.a($$3);
      $$0.a();
      fcy.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         ezm var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aH_() {
      this.b(this.q);
   }

   private fdb o() {
      fde $$0 = fde.d();
      $$0.c().b().e(4);
      if (this.f.C()) {
         $$0.a(this.E());
      }

      $$0.a(this.a(ezo.a(m, this::d).a(), ezo.a(vp.d, this::a).a()));
      return $$0;
   }

   private ezm E() {
      exr<Boolean> $$0 = this.p.af();
      ezq $$1 = ezq.a(n, this.f.h).a($$0).a(this::a).a();
      $$1.j = this.f.C();
      return $$1;
   }

   private void a(ezm $$0, boolean $$1) {
      if (this.q != null) {
         this.q.b($$1);
      }
   }

   private void a(ezo $$0) {
      this.f.a(this.o);
   }

   private void b(ezo $$0) {
      fed.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void c(ezo $$0) {
      fed.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void d(ezo $$0) {
      Path $$1 = this.f.t().b();
      ac.j().a($$1.toUri());
   }

   @Override
   public void d() {
      this.f.a(this.o);
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private fcz a(ezm $$0, ezm $$1) {
      fcz $$2 = new fcz();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
