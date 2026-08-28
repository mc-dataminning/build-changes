import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dyr extends dxm implements fgj.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private czk d = czk.k;
   private final czr e = new czr(this::k, this.ax_());

   public dyr(iv $$0, eao $$1) {
      super(dxo.e, $$0, $$1);
   }

   public czr j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.ax_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.ax_()) == this.m()) {
         this.n.a(this.ax_(), this.m().b(dqu.b, Boolean.valueOf($$0)), 2);
         this.n.a(efo.c, this.ax_(), efo.a.a(this.m()));
      }
   }

   public void s() {
      if (this.n != null && !this.n.C) {
         iv $$0 = this.ax_();
         czk $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fex $$2 = fex.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            czk $$3 = $$1.v();
            cno $$4 = new cno(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.j();
            this.n.b($$4);
         }
      }
   }

   public static void a(djh $$0, iv $$1, eao $$2, dyr $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return czq.a(this.n.F_(), this.d).map(jf::a).map(czq::e).orElse(0);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      ale<uw> $$2 = $$1.a(un.a);
      czk $$3 = $$0.<czk>a("RecordItem", czk.b, $$2).orElse(czk.k);
      if (!this.d.f() && !czk.c($$3, this.d)) {
         this.e.a(this.n, this.m());
      }

      this.d = $$3;
      if ($$0.b("ticks_since_song_started", 4)) {
         czq.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.g("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         ale<uw> $$2 = $$1.a(un.a);
         $$0.a("RecordItem", czk.b, $$2, this.f());
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public czk f() {
      return this.d;
   }

   @Override
   public czk c(int $$0) {
      czk $$1 = this.d;
      this.b(czk.k);
      return $$1;
   }

   @Override
   public void b(czk $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jf<czq>> $$2 = czq.a(this.n.F_(), this.d);
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
   public dxm t() {
      return this;
   }

   @Override
   public boolean b(int $$0, czk $$1) {
      return $$1.c(kk.ae) && this.a($$0).f();
   }

   @Override
   public boolean a(btz $$0, int $$1, czk $$2) {
      return $$0.a_(czk::f);
   }

   @Override
   public void a(iv $$0, eao $$1) {
      this.s();
   }

   @VisibleForTesting
   public void c(czk $$0) {
      this.d = $$0;
      czq.a(this.n.F_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.ax_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      czq.a(this.n.F_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (jf<czq>)$$0));
   }
}
