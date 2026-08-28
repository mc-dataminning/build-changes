import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dwa extends duw implements fdj.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cxo d = cxo.k;
   private final cxv e = new cxv(this::k, this.aB_());

   public dwa(jh $$0, dxu $$1) {
      super(duy.e, $$0, $$1);
   }

   public cxv j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aB_()) == this.m()) {
         this.o.a(this.aB_(), this.m().b(doq.b, Boolean.valueOf($$0)), 2);
         this.o.a(ecq.c, this.aB_(), ecq.a.a(this.m()));
      }
   }

   public void t() {
      if (this.o != null && !this.o.C) {
         jh $$0 = this.aB_();
         cxo $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fbx $$2 = fbx.a($$0, 0.5, 1.01, 0.5).a(this.o.A, 0.7F);
            cxo $$3 = $$1.v();
            cma $$4 = new cma(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.s();
            this.o.b($$4);
         }
      }
   }

   public static void a(dhh $$0, jh $$1, dxu $$2, dwa $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cxu.a(this.o.K_(), this.d).map(jq::a).map(cxu::e).orElse(0);
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cxo.a($$1, (vu)$$0.p("RecordItem")).orElse(cxo.k);
      } else {
         this.d = cxo.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cxu.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
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
   public cxo f() {
      return this.d;
   }

   @Override
   public cxo c(int $$0) {
      cxo $$1 = this.d;
      this.b(cxo.k);
      return $$1;
   }

   @Override
   public void b(cxo $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jq<cxu>> $$2 = cxu.a(this.o.K_(), this.d);
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
   public duw v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cxo $$1) {
      return $$1.b(ku.ab) && this.a($$0).f();
   }

   @Override
   public boolean a(btb $$0, int $$1, cxo $$2) {
      return $$0.a_(cxo::f);
   }

   @VisibleForTesting
   public void c(cxo $$0) {
      this.d = $$0;
      cxu.a(this.o.K_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void w() {
      cxu.a(this.o.K_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jq<cxu>)$$0));
   }
}
