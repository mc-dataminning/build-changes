import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dzh extends dyc implements fhc.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private czy d = czy.k;
   private final daf e = new daf(this::k, this.aB_());

   public dzh(iv $$0, ebe $$1) {
      super(dye.e, $$0, $$1);
   }

   public daf j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.aB_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.aB_()) == this.m()) {
         this.n.a(this.aB_(), this.m().b(drk.b, Boolean.valueOf($$0)), 2);
         this.n.a(ege.c, this.aB_(), ege.a.a(this.m()));
      }
   }

   public void s() {
      if (this.n != null && !this.n.C) {
         iv $$0 = this.aB_();
         czy $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            ffq $$2 = ffq.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            czy $$3 = $$1.v();
            coc $$4 = new coc(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.j();
            this.n.b($$4);
         }
      }
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dzh $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return dae.a(this.n.J_(), this.d).map(jf::a).map(dae::e).orElse(0);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      alg<uy> $$2 = $$1.a(un.a);
      czy $$3 = $$0.<czy>a("RecordItem", czy.b, $$2).orElse(czy.k);
      if (!this.d.f() && !czy.c($$3, this.d)) {
         this.e.a(this.n, this.m());
      }

      this.d = $$3;
      $$0.f("ticks_since_song_started").ifPresent($$1x -> dae.a($$1, this.d).ifPresent($$1xx -> this.e.a($$1xx, $$1x)));
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         alg<uy> $$2 = $$1.a(un.a);
         $$0.a("RecordItem", czy.b, $$2, this.f());
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public czy f() {
      return this.d;
   }

   @Override
   public czy c(int $$0) {
      czy $$1 = this.d;
      this.b(czy.k);
      return $$1;
   }

   @Override
   public void b(czy $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jf<dae>> $$2 = dae.a(this.n.J_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.n, $$2.get());
      } else {
         this.e.a(this.n, this.m());
      }
   }

   @Override
   public int ao_() {
      return 1;
   }

   @Override
   public dyc t() {
      return this;
   }

   @Override
   public boolean b(int $$0, czy $$1) {
      return $$1.c(kk.ae) && this.a($$0).f();
   }

   @Override
   public boolean a(buk $$0, int $$1, czy $$2) {
      return $$0.a_(czy::f);
   }

   @Override
   public void a(iv $$0, ebe $$1) {
      this.s();
   }

   @VisibleForTesting
   public void c(czy $$0) {
      this.d = $$0;
      dae.a(this.n.J_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.aB_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      dae.a(this.n.J_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (jf<dae>)$$0));
   }
}
