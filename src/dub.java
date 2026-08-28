import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dub extends dsy implements fbk.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cwm d = cwm.k;
   private final cwt e = new cwt(this::k, this.aA_());

   public dub(jh $$0, dvv $$1) {
      super(dta.e, $$0, $$1);
   }

   public cwt j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aA_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aA_()) == this.m()) {
         this.o.a(this.aA_(), this.m().b(dms.b, Boolean.valueOf($$0)), 2);
         this.o.a(ear.c, this.aA_(), ear.a.a(this.m()));
      }
   }

   public void t() {
      if (this.o != null && !this.o.C) {
         jh $$0 = this.aA_();
         cwm $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            ezy $$2 = ezy.a($$0, 0.5, 1.01, 0.5).a(this.o.A, 0.7F);
            cwm $$3 = $$1.v();
            clc $$4 = new clc(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.n();
            this.o.b($$4);
         }
      }
   }

   public static void a(dfm $$0, jh $$1, dvv $$2, dub $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cws.a(this.o.J_(), this.d).map(jq::a).map(cws::e).orElse(0);
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cwm.a($$1, (vi)$$0.p("RecordItem")).orElse(cwm.k);
      } else {
         this.d = cwm.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cws.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cwm f() {
      return this.d;
   }

   @Override
   public cwm c(int $$0) {
      cwm $$1 = this.d;
      this.b(cwm.k);
      return $$1;
   }

   @Override
   public void b(cwm $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jq<cws>> $$2 = cws.a(this.o.J_(), this.d);
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
   public dsy v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cwm $$1) {
      return $$1.b(ku.ab) && this.a($$0).f();
   }

   @Override
   public boolean a(bsd $$0, int $$1, cwm $$2) {
      return $$0.a_(cwm::f);
   }

   @VisibleForTesting
   public void c(cwm $$0) {
      this.d = $$0;
      cws.a(this.o.J_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aA_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void w() {
      cws.a(this.o.J_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jq<cws>)$$0));
   }
}
