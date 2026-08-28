import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dwq extends dvl implements feg.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cxy d = cxy.k;
   private final cyf e = new cyf(this::k, this.aw_());

   public dwq(jj $$0, dym $$1) {
      super(dvn.e, $$0, $$1);
   }

   public cyf j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.aw_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.aw_()) == this.m()) {
         this.n.a(this.aw_(), this.m().b(dpa.b, Boolean.valueOf($$0)), 2);
         this.n.a(edm.c, this.aw_(), edm.a.a(this.m()));
      }
   }

   public void s() {
      if (this.n != null && !this.n.C) {
         jj $$0 = this.aw_();
         cxy $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            fcu $$2 = fcu.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            cxy $$3 = $$1.v();
            cmn $$4 = new cmn(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.j();
            this.n.b($$4);
         }
      }
   }

   public static void a(dhp $$0, jj $$1, dym $$2, dwq $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cye.a(this.n.F_(), this.d).map(js::a).map(cye::e).orElse(0);
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cxy.a($$1, (ut)$$0.p("RecordItem")).orElse(cxy.k);
      } else {
         if (!this.d.f()) {
            this.e.a(this.n, this.m());
         }

         this.d = cxy.k;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cye.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cxy f() {
      return this.d;
   }

   @Override
   public cxy c(int $$0) {
      cxy $$1 = this.d;
      this.b(cxy.k);
      return $$1;
   }

   @Override
   public void b(cxy $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<js<cye>> $$2 = cye.a(this.n.F_(), this.d);
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
   public dvl t() {
      return this;
   }

   @Override
   public boolean b(int $$0, cxy $$1) {
      return $$1.c(kx.ad) && this.a($$0).f();
   }

   @Override
   public boolean a(btj $$0, int $$1, cxy $$2) {
      return $$0.a_(cxy::f);
   }

   @Override
   public void a(jj $$0, dym $$1) {
      this.s();
   }

   @VisibleForTesting
   public void c(cxy $$0) {
      this.d = $$0;
      cye.a(this.n.F_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.aw_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      cye.a(this.n.F_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (js<cye>)$$0));
   }
}
