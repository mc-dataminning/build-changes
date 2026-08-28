import java.util.List;
import javax.annotation.Nullable;

public class dsw extends dsg implements bse, fat.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dsw.a h;
   private dtm k;
   private cvx l = cvx.k;
   @Nullable
   protected alg<eub> i;
   protected long j;

   public dsw(jg $$0, dvd $$1) {
      super(dsi.O, $$0, $$1);
      this.k = dtm.a;
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.k = dtm.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cvx.a($$1, (vg)$$0.p("item")).orElse(cvx.k);
         } else {
            this.l = cvx.k;
         }
      }
   }

   public ack j() {
      return ack.a(this);
   }

   @Override
   public uj a(jr.a $$0) {
      return this.e($$0);
   }

   public jl k() {
      return this.m().c(dvt.R);
   }

   public dtm t() {
      return this.k;
   }

   public void c(cvx $$0) {
      this.a($$0);
   }

   public cvx u() {
      cvx $$0 = cwb.eC.o();
      $$0.b(this.r());
      return $$0;
   }

   public static cvx a(dtm $$0) {
      cvx $$1 = cwb.eC.o();
      $$1.b(kt.aj, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alg<eub> ay_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alg<eub> $$0) {
      this.i = $$0;
   }

   @Override
   public long aB_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(kp.a $$0) {
      super.a($$0);
      $$0.a(kt.aj, this.k);
      $$0.a(kt.ak, cyn.a(List.of(this.l)));
   }

   @Override
   protected void a(dsg.b $$0) {
      super.a($$0);
      this.k = $$0.a(kt.aj, dtm.a);
      this.l = $$0.a(kt.ak, cyn.a).a();
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cvx f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cvx c(int $$0) {
      this.e_(null);
      cvx $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cvx.k;
      }

      return $$1;
   }

   @Override
   public void b(cvx $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dsg v() {
      return this;
   }

   public void a(dsw.a $$0) {
      if (this.o != null && !this.o.y_()) {
         this.o.a(this.aC_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dsw.a.values().length) {
         this.g = this.o.aa();
         this.h = dsw.a.values()[$$1];
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
