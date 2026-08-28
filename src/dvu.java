import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dvu extends duq implements fdd.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cxg d = cxg.j;
   private final cxn e = new cxn(this::k, this.aB_());

   public dvu(jh $$0, dxo $$1) {
      super(dus.e, $$0, $$1);
   }

   public cxn j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aB_()) == this.m()) {
         this.o.a(this.aB_(), this.m().b(doi.b, Boolean.valueOf($$0)), 2);
         this.o.a(eck.c, this.aB_(), eck.a.a(this.m()));
      }
   }

   public void s() {
      if (this.o != null && !this.o.C) {
         jh $$0 = this.aB_();
         cxg $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fbr $$2 = fbr.a($$0, 0.5, 1.01, 0.5).a(this.o.A, 0.7F);
            cxg $$3 = $$1.v();
            cls $$4 = new cls(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.s();
            this.o.b($$4);
         }
      }
   }

   public static void a(dgz $$0, jh $$1, dxo $$2, dvu $$3) {
      $$3.e.b($$0, $$2);
   }

   public int t() {
      return cxm.a(this.o.K_(), this.d).map(jq::a).map(cxm::e).orElse(0);
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cxg.a($$1, (vj)$$0.p("RecordItem")).orElse(cxg.j);
      } else {
         this.d = cxg.j;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cxm.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cxg f() {
      return this.d;
   }

   @Override
   public cxg c(int $$0) {
      cxg $$1 = this.d;
      this.b(cxg.j);
      return $$1;
   }

   @Override
   public void b(cxg $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jq<cxm>> $$2 = cxm.a(this.o.K_(), this.d);
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
   public duq u() {
      return this;
   }

   @Override
   public boolean b(int $$0, cxg $$1) {
      return $$1.b(ku.ab) && this.a($$0).f();
   }

   @Override
   public boolean a(bst $$0, int $$1, cxg $$2) {
      return $$0.a_(cxg::f);
   }

   @VisibleForTesting
   public void c(cxg $$0) {
      this.d = $$0;
      cxm.a(this.o.K_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aB_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      cxm.a(this.o.K_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jq<cxm>)$$0));
   }
}
