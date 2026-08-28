import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dve extends dua implements fcn.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cwq d = cwq.j;
   private final cwx e = new cwx(this::k, this.aA_());

   public dve(ji $$0, dwy $$1) {
      super(duc.e, $$0, $$1);
   }

   public cwx j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.aA_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.aA_()) == this.m()) {
         this.n.a(this.aA_(), this.m().b(dns.b, Boolean.valueOf($$0)), 2);
         this.n.a(ebu.c, this.aA_(), ebu.a.a(this.m()));
      }
   }

   public void s() {
      if (this.n != null && !this.n.C) {
         ji $$0 = this.aA_();
         cwq $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fbb $$2 = fbb.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            cwq $$3 = $$1.v();
            cld $$4 = new cld(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.s();
            this.n.b($$4);
         }
      }
   }

   public static void a(dgj $$0, ji $$1, dwy $$2, dve $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cww.a(this.n.K_(), this.d).map(jr::a).map(cww::e).orElse(0);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cwq.a($$1, (un)$$0.p("RecordItem")).orElse(cwq.j);
      } else {
         if (!this.d.f()) {
            this.e.a(this.n, this.m());
         }

         this.d = cwq.j;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cww.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
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
   public cwq f() {
      return this.d;
   }

   @Override
   public cwq c(int $$0) {
      cwq $$1 = this.d;
      this.b(cwq.j);
      return $$1;
   }

   @Override
   public void b(cwq $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jr<cww>> $$2 = cww.a(this.n.K_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.n, $$2.get());
      } else {
         this.e.a(this.n, this.m());
      }
   }

   @Override
   public int an_() {
      return 1;
   }

   @Override
   public dua t() {
      return this;
   }

   @Override
   public boolean b(int $$0, cwq $$1) {
      return $$1.b(kv.ab) && this.a($$0).f();
   }

   @Override
   public boolean a(bse $$0, int $$1, cwq $$2) {
      return $$0.a_(cwq::f);
   }

   @VisibleForTesting
   public void c(cwq $$0) {
      this.d = $$0;
      cww.a(this.n.K_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.aA_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      cww.a(this.n.K_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (jr<cww>)$$0));
   }
}
