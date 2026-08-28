import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dsv extends drs implements fae.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cvp d = cvp.k;
   private final cvw e = new cvw(this::k, this.aB_());

   public dsv(je $$0, duo $$1) {
      super(dru.e, $$0, $$1);
   }

   public cvw j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aB_()) == this.m()) {
         this.o.a(this.aB_(), this.m().b(dlm.b, Boolean.valueOf($$0)), 2);
         this.o.a(dzl.c, this.aB_(), dzl.a.a(this.m()));
      }
   }

   public void t() {
      if (this.o != null && !this.o.B) {
         je $$0 = this.aB_();
         cvp $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            eys $$2 = eys.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cvp $$3 = $$1.u();
            cke $$4 = new cke(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.q();
            this.o.b($$4);
         }
      }
   }

   public static void a(deg $$0, je $$1, duo $$2, dsv $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cvv.a(this.o.F_(), this.d).map(jn::a).map(cvv::e).orElse(0);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cvp.a($$1, (vc)$$0.p("RecordItem")).orElse(cvp.k);
      } else {
         this.d = cvp.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cvv.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cvp f() {
      return this.d;
   }

   @Override
   public cvp c(int $$0) {
      cvp $$1 = this.d;
      this.b(cvp.k);
      return $$1;
   }

   @Override
   public void b(cvp $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jn<cvv>> $$2 = cvv.a(this.o.F_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.o, $$2.get());
      } else {
         this.e.a(this.o, this.m());
      }
   }

   @Override
   public int ak_() {
      return 1;
   }

   @Override
   public drs v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cvp $$1) {
      return $$1.b(kr.W) && this.a($$0).f();
   }

   @Override
   public boolean a(bri $$0, int $$1, cvp $$2) {
      return $$0.a_(cvp::f);
   }

   @VisibleForTesting
   public void c(cvp $$0) {
      this.d = $$0;
      cvv.a(this.o.F_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void w() {
      cvv.a(this.o.F_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jn<cvv>)$$0));
   }
}
