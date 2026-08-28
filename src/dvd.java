import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dvd extends dtz implements fcm.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cwp d = cwp.j;
   private final cww e = new cww(this::k, this.aA_());

   public dvd(ji $$0, dwx $$1) {
      super(dub.e, $$0, $$1);
   }

   public cww j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aA_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aA_()) == this.m()) {
         this.o.a(this.aA_(), this.m().b(dnr.b, Boolean.valueOf($$0)), 2);
         this.o.a(ebt.c, this.aA_(), ebt.a.a(this.m()));
      }
   }

   public void s() {
      if (this.o != null && !this.o.C) {
         ji $$0 = this.aA_();
         cwp $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fba $$2 = fba.a($$0, 0.5, 1.01, 0.5).a(this.o.A, 0.7F);
            cwp $$3 = $$1.v();
            clb $$4 = new clb(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.s();
            this.o.b($$4);
         }
      }
   }

   public static void a(dgi $$0, ji $$1, dwx $$2, dvd $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cwv.a(this.o.K_(), this.d).map(jr::a).map(cwv::e).orElse(0);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cwp.a($$1, (un)$$0.p("RecordItem")).orElse(cwp.j);
      } else {
         this.d = cwp.j;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cwv.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cwp f() {
      return this.d;
   }

   @Override
   public cwp c(int $$0) {
      cwp $$1 = this.d;
      this.b(cwp.j);
      return $$1;
   }

   @Override
   public void b(cwp $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jr<cwv>> $$2 = cwv.a(this.o.K_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.o, $$2.get());
      } else {
         this.e.a(this.o, this.m());
      }
   }

   @Override
   public int an_() {
      return 1;
   }

   @Override
   public dtz t() {
      return this;
   }

   @Override
   public boolean b(int $$0, cwp $$1) {
      return $$1.b(kv.ab) && this.a($$0).f();
   }

   @Override
   public boolean a(bsc $$0, int $$1, cwp $$2) {
      return $$0.a_(cwp::f);
   }

   @VisibleForTesting
   public void c(cwp $$0) {
      this.d = $$0;
      cwv.a(this.o.K_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aA_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      cwv.a(this.o.K_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jr<cwv>)$$0));
   }
}
