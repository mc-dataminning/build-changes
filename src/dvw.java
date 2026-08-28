import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dvw extends dus implements fdj.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cxh d = cxh.k;
   private final cxo e = new cxo(this::k, this.aA_());

   public dvw(ji $$0, dxq $$1) {
      super(duu.e, $$0, $$1);
   }

   public cxo j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.aA_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.aA_()) == this.m()) {
         this.n.a(this.aA_(), this.m().b(dok.b, Boolean.valueOf($$0)), 2);
         this.n.a(ecp.c, this.aA_(), ecp.a.a(this.m()));
      }
   }

   public void s() {
      if (this.n != null && !this.n.C) {
         ji $$0 = this.aA_();
         cxh $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fbx $$2 = fbx.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            cxh $$3 = $$1.v();
            clw $$4 = new clw(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.j();
            this.n.b($$4);
         }
      }
   }

   public static void a(dgz $$0, ji $$1, dxq $$2, dvw $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cxn.a(this.n.F_(), this.d).map(jr::a).map(cxn::e).orElse(0);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cxh.a($$1, (un)$$0.p("RecordItem")).orElse(cxh.k);
      } else {
         if (!this.d.f()) {
            this.e.a(this.n, this.m());
         }

         this.d = cxh.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cxn.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cxh f() {
      return this.d;
   }

   @Override
   public cxh c(int $$0) {
      cxh $$1 = this.d;
      this.b(cxh.k);
      return $$1;
   }

   @Override
   public void b(cxh $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jr<cxn>> $$2 = cxn.a(this.n.F_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.n, $$2.get());
      } else {
         this.e.a(this.n, this.m());
      }
   }

   @Override
   public int an_() {
      return 1;
   }

   @Override
   public dus t() {
      return this;
   }

   @Override
   public boolean b(int $$0, cxh $$1) {
      return $$1.b(kv.ad) && this.a($$0).f();
   }

   @Override
   public boolean a(bsr $$0, int $$1, cxh $$2) {
      return $$0.a_(cxh::f);
   }

   @Override
   public void a(ji $$0, dxq $$1, boolean $$2) {
      this.s();
   }

   @VisibleForTesting
   public void c(cxh $$0) {
      this.d = $$0;
      cxn.a(this.n.F_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.aA_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      cxn.a(this.n.F_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (jr<cxn>)$$0));
   }
}
