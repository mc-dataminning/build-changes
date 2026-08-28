import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dzt extends dyo implements fho.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private dak d = dak.l;
   private final dar e = new dar(this::k, this.ax_());

   public dzt(iw $$0, ebq $$1) {
      super(dyq.e, $$0, $$1);
   }

   public dar j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.ax_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.ax_()) == this.m()) {
         this.n.a(this.ax_(), this.m().b(drw.b, Boolean.valueOf($$0)), 2);
         this.n.a(egq.c, this.ax_(), egq.a.a(this.m()));
      }
   }

   public void s() {
      if (this.n != null && !this.n.C) {
         iw $$0 = this.ax_();
         dak $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fgc $$2 = fgc.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            dak $$3 = $$1.v();
            coo $$4 = new coo(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.i();
            this.n.b($$4);
         }
      }
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, dzt $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return daq.a(this.n.J_(), this.d).map(jg::a).map(daq::e).orElse(0);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      alp<va> $$2 = $$1.a(uo.a);
      dak $$3 = $$0.<dak>a("RecordItem", dak.b, $$2).orElse(dak.l);
      if (!this.d.f() && !dak.c($$3, this.d)) {
         this.e.a(this.n, this.m());
      }

      this.d = $$3;
      $$0.f("ticks_since_song_started").ifPresent($$1x -> daq.a($$1, this.d).ifPresent($$1xx -> this.e.a($$1xx, $$1x)));
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         alp<va> $$2 = $$1.a(uo.a);
         $$0.a("RecordItem", dak.b, $$2, this.f());
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public dak f() {
      return this.d;
   }

   @Override
   public dak c(int $$0) {
      dak $$1 = this.d;
      this.b(dak.l);
      return $$1;
   }

   @Override
   public void b(dak $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jg<daq>> $$2 = daq.a(this.n.J_(), this.d);
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
   public dyo t() {
      return this;
   }

   @Override
   public boolean b(int $$0, dak $$1) {
      return $$1.c(kl.ae) && this.a($$0).f();
   }

   @Override
   public boolean a(buv $$0, int $$1, dak $$2) {
      return $$0.a_(dak::f);
   }

   @Override
   public void a(iw $$0, ebq $$1) {
      this.s();
   }

   @VisibleForTesting
   public void c(dak $$0) {
      this.d = $$0;
      daq.a(this.n.J_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.ax_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      daq.a(this.n.J_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (jg<daq>)$$0));
   }
}
