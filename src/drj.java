import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class drj extends dqh implements bqi, eyn.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cuq d = cuq.l;
   private final cuw e = new cuw(this::k, this.aD_());

   public drj(jd $$0, dtc $$1) {
      super(dqj.e, $$0, $$1);
   }

   public cuw j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.aD_(), this.n().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.aD_()) == this.n()) {
         this.n.a(this.aD_(), this.n().a(dkb.b, Boolean.valueOf($$0)), 2);
         this.n.a(dxz.c, this.aD_(), dxz.a.a(this.n()));
      }
   }

   public void l() {
      if (this.n != null && !this.n.B) {
         jd $$0 = this.aD_();
         cuq $$1 = this.f();
         if (!$$1.e()) {
            this.h();
            exc $$2 = exc.a($$0, 0.5, 1.01, 0.5).a(this.n.z, 0.7F);
            cuq $$3 = $$1.s();
            cjh $$4 = new cjh(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.n.b($$4);
         }
      }
   }

   public static void a(dcw $$0, jd $$1, dtc $$2, drj $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cuv.a(this.n.H_(), this.d).map(jm::a).map(cuv::e).orElse(0);
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cuq.a($$1, (uy)$$0.p("RecordItem")).orElse(cuq.l);
      } else {
         this.d = cuq.l;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cuv.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.f().e()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cuq f() {
      return this.d;
   }

   @Override
   public cuq c(int $$0) {
      cuq $$1 = this.d;
      this.b(cuq.l);
      return $$1;
   }

   @Override
   public void b(cuq $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.e();
      Optional<jm<cuv>> $$2 = cuv.a(this.n.H_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.n, $$2.get());
      } else {
         this.e.a(this.n, this.n());
      }
   }

   @Override
   public int al_() {
      return 1;
   }

   @Override
   public dqh v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cuq $$1) {
      return $$1.b(kq.R) && this.a($$0).e();
   }

   @Override
   public boolean a(bqk $$0, int $$1, cuq $$2) {
      return $$0.a_(cuq::e);
   }

   @VisibleForTesting
   public void c(cuq $$0) {
      this.d = $$0;
      cuv.a(this.n.H_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.aD_(), this.n().b());
      this.e();
   }

   @VisibleForTesting
   public void w() {
      cuv.a(this.n.H_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (jm<cuv>)$$0));
   }
}
