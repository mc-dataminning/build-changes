import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dtp extends dsm implements faz.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cwb d = cwb.k;
   private final cwi e = new cwi(this::k, this.aB_());

   public dtp(jh $$0, dvj $$1) {
      super(dso.e, $$0, $$1);
   }

   public cwi j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aB_()) == this.m()) {
         this.o.a(this.aB_(), this.m().b(dmg.b, Boolean.valueOf($$0)), 2);
         this.o.a(eag.c, this.aB_(), eag.a.a(this.m()));
      }
   }

   public void t() {
      if (this.o != null && !this.o.C) {
         jh $$0 = this.aB_();
         cwb $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            ezn $$2 = ezn.a($$0, 0.5, 1.01, 0.5).a(this.o.A, 0.7F);
            cwb $$3 = $$1.v();
            ckv $$4 = new ckv(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.q();
            this.o.b($$4);
         }
      }
   }

   public static void a(dfb $$0, jh $$1, dvj $$2, dtp $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cwh.a(this.o.H_(), this.d).map(jq::a).map(cwh::e).orElse(0);
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cwb.a($$1, (vh)$$0.p("RecordItem")).orElse(cwb.k);
      } else {
         this.d = cwb.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cwh.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cwb f() {
      return this.d;
   }

   @Override
   public cwb c(int $$0) {
      cwb $$1 = this.d;
      this.b(cwb.k);
      return $$1;
   }

   @Override
   public void b(cwb $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jq<cwh>> $$2 = cwh.a(this.o.H_(), this.d);
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
   public dsm v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cwb $$1) {
      return $$1.b(ku.ab) && this.a($$0).f();
   }

   @Override
   public boolean a(brw $$0, int $$1, cwb $$2) {
      return $$0.a_(cwb::f);
   }

   @VisibleForTesting
   public void c(cwb $$0) {
      this.d = $$0;
      cwh.a(this.o.H_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void w() {
      cwh.a(this.o.H_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jq<cwh>)$$0));
   }
}
