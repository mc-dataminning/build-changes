import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dxs extends dwn implements ffi.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cys d = cys.k;
   private final cyz e = new cyz(this::k, this.aw_());

   public dxs(iu $$0, dzo $$1) {
      super(dwp.e, $$0, $$1);
   }

   public cyz j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.aw_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.aw_()) == this.m()) {
         this.n.a(this.aw_(), this.m().b(dqa.b, Boolean.valueOf($$0)), 2);
         this.n.a(eeo.c, this.aw_(), eeo.a.a(this.m()));
      }
   }

   public void s() {
      if (this.n != null && !this.n.C) {
         iu $$0 = this.aw_();
         cys $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fdw $$2 = fdw.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            cys $$3 = $$1.v();
            cmx $$4 = new cmx(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.j();
            this.n.b($$4);
         }
      }
   }

   public static void a(dip $$0, iu $$1, dzo $$2, dxs $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cyy.a(this.n.F_(), this.d).map(je::a).map(cyy::e).orElse(0);
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cys.a($$1, (uu)$$0.p("RecordItem")).orElse(cys.k);
      } else {
         if (!this.d.f()) {
            this.e.a(this.n, this.m());
         }

         this.d = cys.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cyy.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cys f() {
      return this.d;
   }

   @Override
   public cys c(int $$0) {
      cys $$1 = this.d;
      this.b(cys.k);
      return $$1;
   }

   @Override
   public void b(cys $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<je<cyy>> $$2 = cyy.a(this.n.F_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.n, $$2.get());
      } else {
         this.e.a(this.n, this.m());
      }
   }

   @Override
   public int aj_() {
      return 1;
   }

   @Override
   public dwn t() {
      return this;
   }

   @Override
   public boolean b(int $$0, cys $$1) {
      return $$1.c(kj.ae) && this.a($$0).f();
   }

   @Override
   public boolean a(btr $$0, int $$1, cys $$2) {
      return $$0.a_(cys::f);
   }

   @Override
   public void a(iu $$0, dzo $$1) {
      this.s();
   }

   @VisibleForTesting
   public void c(cys $$0) {
      this.d = $$0;
      cyy.a(this.n.F_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.aw_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      cyy.a(this.n.F_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (je<cyy>)$$0));
   }
}
