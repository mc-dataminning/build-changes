import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dyk extends dxf implements fgc.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private czd d = czd.k;
   private final czk e = new czk(this::k, this.ax_());

   public dyk(iu $$0, eah $$1) {
      super(dxh.e, $$0, $$1);
   }

   public czk j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.ax_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.ax_()) == this.m()) {
         this.n.a(this.ax_(), this.m().b(dqn.b, Boolean.valueOf($$0)), 2);
         this.n.a(efh.c, this.ax_(), efh.a.a(this.m()));
      }
   }

   public void s() {
      if (this.n != null && !this.n.C) {
         iu $$0 = this.ax_();
         czd $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            feq $$2 = feq.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            czd $$3 = $$1.v();
            cnh $$4 = new cnh(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.j();
            this.n.b($$4);
         }
      }
   }

   public static void a(dja $$0, iu $$1, eah $$2, dyk $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return czj.a(this.n.F_(), this.d).map(je::a).map(czj::e).orElse(0);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = czd.a($$1, (uw)$$0.p("RecordItem")).orElse(czd.k);
      } else {
         if (!this.d.f()) {
            this.e.a(this.n, this.m());
         }

         this.d = czd.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         czj.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public czd f() {
      return this.d;
   }

   @Override
   public czd c(int $$0) {
      czd $$1 = this.d;
      this.b(czd.k);
      return $$1;
   }

   @Override
   public void b(czd $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<je<czj>> $$2 = czj.a(this.n.F_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.n, $$2.get());
      } else {
         this.e.a(this.n, this.m());
      }
   }

   @Override
   public int ak_() {
      return 1;
   }

   @Override
   public dxf t() {
      return this;
   }

   @Override
   public boolean b(int $$0, czd $$1) {
      return $$1.c(kj.ae) && this.a($$0).f();
   }

   @Override
   public boolean a(btw $$0, int $$1, czd $$2) {
      return $$0.a_(czd::f);
   }

   @Override
   public void a(iu $$0, eah $$1) {
      this.s();
   }

   @VisibleForTesting
   public void c(czd $$0) {
      this.d = $$0;
      czj.a(this.n.F_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.ax_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      czj.a(this.n.F_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (je<czj>)$$0));
   }
}
