import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dvb extends dtx implements fck.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cwn d = cwn.j;
   private final cwu e = new cwu(this::k, this.aA_());

   public dvb(ji $$0, dwv $$1) {
      super(dtz.e, $$0, $$1);
   }

   public cwu j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aA_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aA_()) == this.m()) {
         this.o.a(this.aA_(), this.m().b(dnp.b, Boolean.valueOf($$0)), 2);
         this.o.a(ebr.c, this.aA_(), ebr.a.a(this.m()));
      }
   }

   public void s() {
      if (this.o != null && !this.o.C) {
         ji $$0 = this.aA_();
         cwn $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fay $$2 = fay.a($$0, 0.5, 1.01, 0.5).a(this.o.A, 0.7F);
            cwn $$3 = $$1.v();
            cla $$4 = new cla(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.s();
            this.o.b($$4);
         }
      }
   }

   public static void a(dgg $$0, ji $$1, dwv $$2, dvb $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cwt.a(this.o.K_(), this.d).map(jr::a).map(cwt::e).orElse(0);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cwn.a($$1, (un)$$0.p("RecordItem")).orElse(cwn.j);
      } else {
         this.d = cwn.j;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cwt.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
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
   public cwn f() {
      return this.d;
   }

   @Override
   public cwn c(int $$0) {
      cwn $$1 = this.d;
      this.b(cwn.j);
      return $$1;
   }

   @Override
   public void b(cwn $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jr<cwt>> $$2 = cwt.a(this.o.K_(), this.d);
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
   public dtx t() {
      return this;
   }

   @Override
   public boolean b(int $$0, cwn $$1) {
      return $$1.b(kv.ab) && this.a($$0).f();
   }

   @Override
   public boolean a(bsb $$0, int $$1, cwn $$2) {
      return $$0.a_(cwn::f);
   }

   @VisibleForTesting
   public void c(cwn $$0) {
      this.d = $$0;
      cwt.a(this.o.K_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aA_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      cwt.a(this.o.K_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jr<cwt>)$$0));
   }
}
