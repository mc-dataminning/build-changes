import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dsy extends drv implements fai.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cvs d = cvs.k;
   private final cvz e = new cvz(this::k, this.aC_());

   public dsy(jf $$0, dus $$1) {
      super(drx.e, $$0, $$1);
   }

   public cvz j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aC_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aC_()) == this.m()) {
         this.o.a(this.aC_(), this.m().b(dlp.b, Boolean.valueOf($$0)), 2);
         this.o.a(dzp.c, this.aC_(), dzp.a.a(this.m()));
      }
   }

   public void t() {
      if (this.o != null && !this.o.B) {
         jf $$0 = this.aC_();
         cvs $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            eyw $$2 = eyw.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cvs $$3 = $$1.u();
            ckh $$4 = new ckh(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.q();
            this.o.b($$4);
         }
      }
   }

   public static void a(dej $$0, jf $$1, dus $$2, dsy $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cvy.a(this.o.G_(), this.d).map(jo::a).map(cvy::e).orElse(0);
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cvs.a($$1, (vd)$$0.p("RecordItem")).orElse(cvs.k);
      } else {
         this.d = cvs.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cvy.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cvs f() {
      return this.d;
   }

   @Override
   public cvs c(int $$0) {
      cvs $$1 = this.d;
      this.b(cvs.k);
      return $$1;
   }

   @Override
   public void b(cvs $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jo<cvy>> $$2 = cvy.a(this.o.G_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.o, $$2.get());
      } else {
         this.e.a(this.o, this.m());
      }
   }

   @Override
   public int al_() {
      return 1;
   }

   @Override
   public drv v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cvs $$1) {
      return $$1.b(ks.W) && this.a($$0).f();
   }

   @Override
   public boolean a(brl $$0, int $$1, cvs $$2) {
      return $$0.a_(cvs::f);
   }

   @VisibleForTesting
   public void c(cvs $$0) {
      this.d = $$0;
      cvy.a(this.o.G_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aC_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void w() {
      cvy.a(this.o.G_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jo<cvy>)$$0));
   }
}
