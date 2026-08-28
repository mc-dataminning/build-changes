import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class drh extends dqf implements bqh, eyh.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cuo d = cuo.l;
   private final cuu e = new cuu(this::k, this.az_());

   public drh(jd $$0, dta $$1) {
      super(dqh.e, $$0, $$1);
   }

   public cuu j() {
      return this.e;
   }

   public void k() {
      this.n.a(this.az_(), this.n().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.n != null && this.n.a_(this.az_()) == this.n()) {
         this.n.a(this.az_(), this.n().a(djz.b, Boolean.valueOf($$0)), 2);
         this.n.a(dxw.c, this.az_(), dxw.a.a(this.n()));
      }
   }

   public void l() {
      if (this.n != null && !this.n.B) {
         jd $$0 = this.az_();
         cuo $$1 = this.f();
         if (!$$1.e()) {
            this.h();
            eww $$2 = eww.a($$0, 0.5, 1.01, 0.5).a(this.n.z, 0.7F);
            cuo $$3 = $$1.s();
            cjf $$4 = new cjf(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.n.b($$4);
         }
      }
   }

   public static void a(dcu $$0, jd $$1, dta $$2, drh $$3) {
      $$3.e.b($$0, $$2);
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cuo.a($$1, (ux)$$0.p("RecordItem")).orElse(cuo.l);
      } else {
         this.d = cuo.l;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cut.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.f().e()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cuo f() {
      return this.d;
   }

   @Override
   public cuo c(int $$0) {
      cuo $$1 = this.d;
      this.b(cuo.l);
      return $$1;
   }

   @Override
   public void b(cuo $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.e();
      Optional<jm<cut>> $$2 = cut.a(this.n.H_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.n, $$2.get());
      } else {
         this.e.a(this.n, this.n());
      }
   }

   @Override
   public int ah_() {
      return 1;
   }

   @Override
   public dqf v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cuo $$1) {
      return $$1.b(kq.R) && this.a($$0).e();
   }

   @Override
   public boolean a(bqj $$0, int $$1, cuo $$2) {
      return $$0.a_(cuo::e);
   }

   @VisibleForTesting
   public void c(cuo $$0) {
      this.d = $$0;
      cut.a(this.n.H_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.n.a(this.az_(), this.n().b());
      this.e();
   }

   @VisibleForTesting
   public void u() {
      cut.a(this.n.H_(), this.f()).ifPresent($$0 -> this.e.a(this.n, (jm<cut>)$$0));
   }
}
