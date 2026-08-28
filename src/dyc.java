import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dyc extends dwx implements ffu.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cyy d = cyy.k;
   private final czf e = new czf(this::k, this.aw_());

   public dyc(iu $$0, dzz $$1) {
      super(dwz.e, $$0, $$1);
   }

   public czf j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.aw_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.aw_()) == this.m()) {
         this.n.a(this.aw_(), this.m().b(dqh.b, Boolean.valueOf($$0)), 2);
         this.n.a(eez.c, this.aw_(), eez.a.a(this.m()));
      }
   }

   public void s() {
      if (this.n != null && !this.n.C) {
         iu $$0 = this.aw_();
         cyy $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fei $$2 = fei.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            cyy $$3 = $$1.v();
            cnd $$4 = new cnd(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.j();
            this.n.b($$4);
         }
      }
   }

   public static void a(div $$0, iu $$1, dzz $$2, dyc $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cze.a(this.n.F_(), this.d).map(je::a).map(cze::e).orElse(0);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cyy.a($$1, (uw)$$0.p("RecordItem")).orElse(cyy.k);
      } else {
         if (!this.d.f()) {
            this.e.a(this.n, this.m());
         }

         this.d = cyy.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cze.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
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
   public cyy f() {
      return this.d;
   }

   @Override
   public cyy c(int $$0) {
      cyy $$1 = this.d;
      this.b(cyy.k);
      return $$1;
   }

   @Override
   public void b(cyy $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<je<cze>> $$2 = cze.a(this.n.F_(), this.d);
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
   public dwx t() {
      return this;
   }

   @Override
   public boolean b(int $$0, cyy $$1) {
      return $$1.c(kj.ae) && this.a($$0).f();
   }

   @Override
   public boolean a(btu $$0, int $$1, cyy $$2) {
      return $$0.a_(cyy::f);
   }

   @Override
   public void a(iu $$0, dzz $$1) {
      this.s();
   }

   @VisibleForTesting
   public void c(cyy $$0) {
      this.d = $$0;
      cze.a(this.n.F_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.aw_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      cze.a(this.n.F_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (je<cze>)$$0));
   }
}
