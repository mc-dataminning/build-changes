import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dyw extends dxr implements fgo.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private czn d = czn.k;
   private final czu e = new czu(this::k, this.ax_());

   public dyw(iv $$0, eat $$1) {
      super(dxt.e, $$0, $$1);
   }

   public czu j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.ax_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.ax_()) == this.m()) {
         this.n.a(this.ax_(), this.m().b(dqz.b, Boolean.valueOf($$0)), 2);
         this.n.a(eft.c, this.ax_(), eft.a.a(this.m()));
      }
   }

   public void s() {
      if (this.n != null && !this.n.C) {
         iv $$0 = this.ax_();
         czn $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            ffc $$2 = ffc.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            czn $$3 = $$1.v();
            cnr $$4 = new cnr(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.j();
            this.n.b($$4);
         }
      }
   }

   public static void a(djm $$0, iv $$1, eat $$2, dyw $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return czt.a(this.n.F_(), this.d).map(jf::a).map(czt::e).orElse(0);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      ale<uw> $$2 = $$1.a(un.a);
      czn $$3 = $$0.<czn>a("RecordItem", czn.b, $$2).orElse(czn.k);
      if (!this.d.f() && !czn.c($$3, this.d)) {
         this.e.a(this.n, this.m());
      }

      this.d = $$3;
      if ($$0.b("ticks_since_song_started", 4)) {
         czt.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.g("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         ale<uw> $$2 = $$1.a(un.a);
         $$0.a("RecordItem", czn.b, $$2, this.f());
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public czn f() {
      return this.d;
   }

   @Override
   public czn c(int $$0) {
      czn $$1 = this.d;
      this.b(czn.k);
      return $$1;
   }

   @Override
   public void b(czn $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jf<czt>> $$2 = czt.a(this.n.F_(), this.d);
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
   public dxr t() {
      return this;
   }

   @Override
   public boolean b(int $$0, czn $$1) {
      return $$1.c(kk.ae) && this.a($$0).f();
   }

   @Override
   public boolean a(btz $$0, int $$1, czn $$2) {
      return $$0.a_(czn::f);
   }

   @Override
   public void a(iv $$0, eat $$1) {
      this.s();
   }

   @VisibleForTesting
   public void c(czn $$0) {
      this.d = $$0;
      czt.a(this.n.F_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.ax_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      czt.a(this.n.F_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (jf<czt>)$$0));
   }
}
