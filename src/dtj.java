import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dtj extends dsg implements fat.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cvx d = cvx.k;
   private final cwe e = new cwe(this::k, this.aC_());

   public dtj(jg $$0, dvd $$1) {
      super(dsi.e, $$0, $$1);
   }

   public cwe j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aC_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aC_()) == this.m()) {
         this.o.a(this.aC_(), this.m().b(dma.b, Boolean.valueOf($$0)), 2);
         this.o.a(eaa.c, this.aC_(), eaa.a.a(this.m()));
      }
   }

   public void t() {
      if (this.o != null && !this.o.C) {
         jg $$0 = this.aC_();
         cvx $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            ezh $$2 = ezh.a($$0, 0.5, 1.01, 0.5).a(this.o.A, 0.7F);
            cvx $$3 = $$1.v();
            ckq $$4 = new ckq(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.q();
            this.o.b($$4);
         }
      }
   }

   public static void a(dev $$0, jg $$1, dvd $$2, dtj $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cwd.a(this.o.H_(), this.d).map(jp::a).map(cwd::e).orElse(0);
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cvx.a($$1, (vg)$$0.p("RecordItem")).orElse(cvx.k);
      } else {
         this.d = cvx.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cwd.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cvx f() {
      return this.d;
   }

   @Override
   public cvx c(int $$0) {
      cvx $$1 = this.d;
      this.b(cvx.k);
      return $$1;
   }

   @Override
   public void b(cvx $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jp<cwd>> $$2 = cwd.a(this.o.H_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.o, $$2.get());
      } else {
         this.e.a(this.o, this.m());
      }
   }

   @Override
   public int am_() {
      return 1;
   }

   @Override
   public dsg v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cvx $$1) {
      return $$1.b(kt.aa) && this.a($$0).f();
   }

   @Override
   public boolean a(brr $$0, int $$1, cvx $$2) {
      return $$0.a_(cvx::f);
   }

   @VisibleForTesting
   public void c(cvx $$0) {
      this.d = $$0;
      cwd.a(this.o.H_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aC_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void w() {
      cwd.a(this.o.H_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jp<cwd>)$$0));
   }
}
