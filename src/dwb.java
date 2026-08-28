import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dwb extends dux implements fdk.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cxp d = cxp.j;
   private final cxw e = new cxw(this::k, this.aB_());

   public dwb(jh $$0, dxv $$1) {
      super(duz.e, $$0, $$1);
   }

   public cxw j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aB_()) == this.m()) {
         this.o.a(this.aB_(), this.m().b(dor.b, Boolean.valueOf($$0)), 2);
         this.o.a(ecr.c, this.aB_(), ecr.a.a(this.m()));
      }
   }

   public void t() {
      if (this.o != null && !this.o.C) {
         jh $$0 = this.aB_();
         cxp $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fby $$2 = fby.a($$0, 0.5, 1.01, 0.5).a(this.o.A, 0.7F);
            cxp $$3 = $$1.v();
            cmb $$4 = new cmb(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.s();
            this.o.b($$4);
         }
      }
   }

   public static void a(dhi $$0, jh $$1, dxv $$2, dwb $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cxv.a(this.o.K_(), this.d).map(jq::a).map(cxv::e).orElse(0);
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cxp.a($$1, (vu)$$0.p("RecordItem")).orElse(cxp.j);
      } else {
         this.d = cxp.j;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cxv.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cxp f() {
      return this.d;
   }

   @Override
   public cxp c(int $$0) {
      cxp $$1 = this.d;
      this.b(cxp.j);
      return $$1;
   }

   @Override
   public void b(cxp $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jq<cxv>> $$2 = cxv.a(this.o.K_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.o, $$2.get());
      } else {
         this.e.a(this.o, this.m());
      }
   }

   @Override
   public int ao_() {
      return 1;
   }

   @Override
   public dux v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cxp $$1) {
      return $$1.b(ku.ab) && this.a($$0).f();
   }

   @Override
   public boolean a(btc $$0, int $$1, cxp $$2) {
      return $$0.a_(cxp::f);
   }

   @VisibleForTesting
   public void c(cxp $$0) {
      this.d = $$0;
      cxv.a(this.o.K_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void w() {
      cxv.a(this.o.K_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jq<cxv>)$$0));
   }
}
