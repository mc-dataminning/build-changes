import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dtu extends dsr implements fbd.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cwf d = cwf.k;
   private final cwm e = new cwm(this::k, this.aB_());

   public dtu(jh $$0, dvo $$1) {
      super(dst.e, $$0, $$1);
   }

   public cwm j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aB_()) == this.m()) {
         this.o.a(this.aB_(), this.m().b(dml.b, Boolean.valueOf($$0)), 2);
         this.o.a(eak.c, this.aB_(), eak.a.a(this.m()));
      }
   }

   public void t() {
      if (this.o != null && !this.o.C) {
         jh $$0 = this.aB_();
         cwf $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            ezr $$2 = ezr.a($$0, 0.5, 1.01, 0.5).a(this.o.A, 0.7F);
            cwf $$3 = $$1.v();
            ckz $$4 = new ckz(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.q();
            this.o.b($$4);
         }
      }
   }

   public static void a(dff $$0, jh $$1, dvo $$2, dtu $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cwl.a(this.o.H_(), this.d).map(jq::a).map(cwl::e).orElse(0);
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cwf.a($$1, (vk)$$0.p("RecordItem")).orElse(cwf.k);
      } else {
         this.d = cwf.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cwl.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cwf f() {
      return this.d;
   }

   @Override
   public cwf c(int $$0) {
      cwf $$1 = this.d;
      this.b(cwf.k);
      return $$1;
   }

   @Override
   public void b(cwf $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jq<cwl>> $$2 = cwl.a(this.o.H_(), this.d);
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
   public dsr v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cwf $$1) {
      return $$1.b(ku.ab) && this.a($$0).f();
   }

   @Override
   public boolean a(bsa $$0, int $$1, cwf $$2) {
      return $$0.a_(cwf::f);
   }

   @VisibleForTesting
   public void c(cwf $$0) {
      this.d = $$0;
      cwl.a(this.o.H_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void w() {
      cwl.a(this.o.H_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jq<cwl>)$$0));
   }
}
