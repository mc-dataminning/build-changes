import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dsh extends dre implements ezp.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cvl d = cvl.k;
   private final cvr e = new cvr(this::k, this.aD_());

   public dsh(je $$0, dua $$1) {
      super(drg.e, $$0, $$1);
   }

   public cvr j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aD_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aD_()) == this.m()) {
         this.o.a(this.aD_(), this.m().b(dky.b, Boolean.valueOf($$0)), 2);
         this.o.a(dyx.c, this.aD_(), dyx.a.a(this.m()));
      }
   }

   public void t() {
      if (this.o != null && !this.o.B) {
         je $$0 = this.aD_();
         cvl $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            eye $$2 = eye.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cvl $$3 = $$1.u();
            cjz $$4 = new cjz(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.q();
            this.o.b($$4);
         }
      }
   }

   public static void a(dds $$0, je $$1, dua $$2, dsh $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cvq.a(this.o.F_(), this.d).map(jn::a).map(cvq::e).orElse(0);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cvl.a($$1, (vc)$$0.p("RecordItem")).orElse(cvl.k);
      } else {
         this.d = cvl.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cvq.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
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
   public cvl f() {
      return this.d;
   }

   @Override
   public cvl c(int $$0) {
      cvl $$1 = this.d;
      this.b(cvl.k);
      return $$1;
   }

   @Override
   public void b(cvl $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jn<cvq>> $$2 = cvq.a(this.o.F_(), this.d);
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
   public dre v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cvl $$1) {
      return $$1.b(kr.T) && this.a($$0).f();
   }

   @Override
   public boolean a(brd $$0, int $$1, cvl $$2) {
      return $$0.a_(cvl::f);
   }

   @VisibleForTesting
   public void c(cvl $$0) {
      this.d = $$0;
      cvq.a(this.o.F_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aD_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void w() {
      cvq.a(this.o.F_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jn<cvq>)$$0));
   }
}
