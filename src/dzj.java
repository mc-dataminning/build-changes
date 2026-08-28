import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dzj extends dye implements fhe.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private daa d = daa.k;
   private final dah e = new dah(this::k, this.aB_());

   public dzj(iw $$0, ebg $$1) {
      super(dyg.e, $$0, $$1);
   }

   public dah j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.aB_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.aB_()) == this.m()) {
         this.n.a(this.aB_(), this.m().b(drm.b, Boolean.valueOf($$0)), 2);
         this.n.a(egg.c, this.aB_(), egg.a.a(this.m()));
      }
   }

   public void s() {
      if (this.n != null && !this.n.C) {
         iw $$0 = this.aB_();
         daa $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            ffs $$2 = ffs.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            daa $$3 = $$1.v();
            coe $$4 = new coe(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.j();
            this.n.b($$4);
         }
      }
   }

   public static void a(djz $$0, iw $$1, ebg $$2, dzj $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return dag.a(this.n.J_(), this.d).map(jg::a).map(dag::e).orElse(0);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      ali<va> $$2 = $$1.a(uo.a);
      daa $$3 = $$0.<daa>a("RecordItem", daa.b, $$2).orElse(daa.k);
      if (!this.d.f() && !daa.c($$3, this.d)) {
         this.e.a(this.n, this.m());
      }

      this.d = $$3;
      $$0.f("ticks_since_song_started").ifPresent($$1x -> dag.a($$1, this.d).ifPresent($$1xx -> this.e.a($$1xx, $$1x)));
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         ali<va> $$2 = $$1.a(uo.a);
         $$0.a("RecordItem", daa.b, $$2, this.f());
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public daa f() {
      return this.d;
   }

   @Override
   public daa c(int $$0) {
      daa $$1 = this.d;
      this.b(daa.k);
      return $$1;
   }

   @Override
   public void b(daa $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jg<dag>> $$2 = dag.a(this.n.J_(), this.d);
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
   public dye t() {
      return this;
   }

   @Override
   public boolean b(int $$0, daa $$1) {
      return $$1.c(kl.ae) && this.a($$0).f();
   }

   @Override
   public boolean a(bum $$0, int $$1, daa $$2) {
      return $$0.a_(daa::f);
   }

   @Override
   public void a(iw $$0, ebg $$1) {
      this.s();
   }

   @VisibleForTesting
   public void c(daa $$0) {
      this.d = $$0;
      dag.a(this.n.J_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.aB_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      dag.a(this.n.J_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (jg<dag>)$$0));
   }
}
