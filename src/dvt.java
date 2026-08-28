import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dvt extends dup implements fde.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cxk d = cxk.k;
   private final cxr e = new cxr(this::k, this.aB_());

   public dvt(jh $$0, dxn $$1) {
      super(dur.e, $$0, $$1);
   }

   public cxr j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aB_()) == this.m()) {
         this.o.a(this.aB_(), this.m().b(doj.b, Boolean.valueOf($$0)), 2);
         this.o.a(ecj.c, this.aB_(), ecj.a.a(this.m()));
      }
   }

   public void t() {
      if (this.o != null && !this.o.C) {
         jh $$0 = this.aB_();
         cxk $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fbs $$2 = fbs.a($$0, 0.5, 1.01, 0.5).a(this.o.A, 0.7F);
            cxk $$3 = $$1.v();
            clw $$4 = new clw(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.s();
            this.o.b($$4);
         }
      }
   }

   public static void a(dha $$0, jh $$1, dxn $$2, dvt $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cxq.a(this.o.K_(), this.d).map(jq::a).map(cxq::e).orElse(0);
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cxk.a($$1, (vu)$$0.p("RecordItem")).orElse(cxk.k);
      } else {
         this.d = cxk.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cxq.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
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
   public cxk f() {
      return this.d;
   }

   @Override
   public cxk c(int $$0) {
      cxk $$1 = this.d;
      this.b(cxk.k);
      return $$1;
   }

   @Override
   public void b(cxk $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jq<cxq>> $$2 = cxq.a(this.o.K_(), this.d);
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
   public dup v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cxk $$1) {
      return $$1.b(ku.ab) && this.a($$0).f();
   }

   @Override
   public boolean a(bsx $$0, int $$1, cxk $$2) {
      return $$0.a_(cxk::f);
   }

   @VisibleForTesting
   public void c(cxk $$0) {
      this.d = $$0;
      cxq.a(this.o.K_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void w() {
      cxq.a(this.o.K_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jq<cxq>)$$0));
   }
}
