import java.util.List;
import javax.annotation.Nullable;

public class dqv extends dqf implements bqy, eyh.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dqv.a h;
   private drk k;
   private cuo l;
   @Nullable
   protected akp<erq> i;
   protected long j;

   public dqv(jd $$0, dta $$1) {
      super(dqh.O, $$0, $$1);
      this.l = cuo.l;
      this.k = drk.a;
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.b_($$0) && !this.l.e()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.k = drk.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cuo.a($$1, (ux)$$0.p("item")).orElse(cuo.l);
         } else {
            this.l = cuo.l;
         }
      }
   }

   public aca j() {
      return aca.a(this);
   }

   @Override
   public ua a(jo.a $$0) {
      return this.e($$0);
   }

   public ji k() {
      return this.n().c(dtq.R);
   }

   public drk l() {
      return this.k;
   }

   public void c(cuo $$0) {
      this.a($$0);
   }

   public cuo u() {
      cuo $$0 = cur.eC.w();
      $$0.b(this.s());
      return $$0;
   }

   public static cuo a(drk $$0) {
      cuo $$1 = cur.eC.w();
      $$1.b(kq.aa, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public akp<erq> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable akp<erq> $$0) {
      this.i = $$0;
   }

   @Override
   public long ay_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.aa, this.k);
      $$0.a(kq.ab, cxm.a(List.of(this.l)));
   }

   @Override
   protected void a(dqf.b $$0) {
      super.a($$0);
      this.k = $$0.a(kq.aa, drk.a);
      this.l = $$0.a(kq.ab, cxm.a).a();
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cuo f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cuo c(int $$0) {
      this.e_(null);
      cuo $$1 = this.l.a($$0);
      if (this.l.e()) {
         this.l = cuo.l;
      }

      return $$1;
   }

   @Override
   public void b(cuo $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dqf v() {
      return this;
   }

   public void a(dqv.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.az_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dqv.a.values().length) {
         this.g = this.n.Z();
         this.h = dqv.a.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static enum a {
      a(7),
      b(10);

      public final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }
}
