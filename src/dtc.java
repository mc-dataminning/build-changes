import java.util.List;
import javax.annotation.Nullable;

public class dtc extends dsm implements bsj, faz.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dtc.a h;
   private dts k;
   private cwb l = cwb.k;
   @Nullable
   protected alh<euh> i;
   protected long j;

   public dtc(jh $$0, dvj $$1) {
      super(dso.O, $$0, $$1);
      this.k = dts.a;
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.k = dts.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cwb.a($$1, (vh)$$0.p("item")).orElse(cwb.k);
         } else {
            this.l = cwb.k;
         }
      }
   }

   public acl j() {
      return acl.a(this);
   }

   @Override
   public uk a(js.a $$0) {
      return this.e($$0);
   }

   public jm k() {
      return this.m().c(dvz.R);
   }

   public dts t() {
      return this.k;
   }

   public void c(cwb $$0) {
      this.a($$0);
   }

   public cwb u() {
      cwb $$0 = cwf.eC.o();
      $$0.b(this.r());
      return $$0;
   }

   public static cwb a(dts $$0) {
      cwb $$1 = cwf.eC.o();
      $$1.b(ku.ak, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alh<euh> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alh<euh> $$0) {
      this.i = $$0;
   }

   @Override
   public long aA_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.ak, this.k);
      $$0.a(ku.al, cyt.a(List.of(this.l)));
   }

   @Override
   protected void a(dsm.b $$0) {
      super.a($$0);
      this.k = $$0.a(ku.ak, dts.a);
      this.l = $$0.a(ku.al, cyt.a).a();
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cwb f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cwb c(int $$0) {
      this.e_(null);
      cwb $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cwb.k;
      }

      return $$1;
   }

   @Override
   public void b(cwb $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dsm v() {
      return this;
   }

   public void a(dtc.a $$0) {
      if (this.o != null && !this.o.y_()) {
         this.o.a(this.aB_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dtc.a.values().length) {
         this.g = this.o.aa();
         this.h = dtc.a.values()[$$1];
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
