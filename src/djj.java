import java.util.stream.Stream;
import javax.annotation.Nullable;

public class djj extends dit implements bmc, epd {
   public static final String e = "sherds";
   public static final String f = "item";
   public static final int g = 1;
   public long h;
   @Nullable
   public djj.b i;
   private djj.a l;
   private coz m = coz.h;
   @Nullable
   protected aiy j;
   protected long k;

   public djj(hz $$0, dlf $$1) {
      super(div.O, $$0, $$1);
      this.l = djj.a.a;
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      this.l.a($$0);
      if (!this.d_($$0) && !this.m.b()) {
         $$0.a("item", this.m.b(new sw()));
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.l = djj.a.b($$0);
      if (!this.c_($$0)) {
         if ($$0.b("item", 10)) {
            this.m = coz.a($$0.p("item"));
         } else {
            this.m = coz.h;
         }
      }
   }

   public aan k() {
      return aan.a(this);
   }

   @Override
   public sw aA_() {
      return this.q();
   }

   public ie l() {
      return this.r().c(dlv.R);
   }

   public djj.a m() {
      return this.l;
   }

   public void a(coz $$0) {
      this.l = djj.a.b(cms.a($$0));
   }

   public coz w() {
      return a(this.l);
   }

   public static coz a(djj.a $$0) {
      coz $$1 = cpc.eB.ao_();
      sw $$2 = $$0.a(new sw());
      cms.a($$1, div.O, $$2);
      return $$1;
   }

   @Nullable
   @Override
   public aiy aC_() {
      return this.j;
   }

   @Override
   public void a(@Nullable aiy $$0) {
      this.j = $$0;
   }

   @Override
   public long aD_() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public coz x() {
      this.e_(null);
      return this.m;
   }

   @Override
   public coz c(int $$0) {
      this.e_(null);
      coz $$1 = this.m.a($$0);
      if (this.m.b()) {
         this.m = coz.h;
      }

      return $$1;
   }

   @Override
   public void b(coz $$0) {
      this.e_(null);
      this.m = $$0;
   }

   @Override
   public dit y() {
      return this;
   }

   public void a(djj.b $$0) {
      if (this.o != null && !this.o.y_()) {
         this.o.a(this.aE_(), this.r().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < djj.b.values().length) {
         this.h = this.o.X();
         this.i = djj.b.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static record a(cou b, cou c, cou d, cou e) {
      public static final djj.a a = new djj.a(cpc.qK, cpc.qK, cpc.qK, cpc.qK);

      public sw a(sw $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            tc $$1 = new tc();
            this.a().forEach($$1x -> $$1.add(tr.a(kf.h.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<cou> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static djj.a b(@Nullable sw $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            tc $$1 = $$0.c("sherds", 8);
            return new djj.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cou a(tc $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cpc.qK;
         } else {
            tt $$2 = $$0.k($$1);
            return kf.h.a(aiy.a($$2.t_()));
         }
      }
   }

   public static enum b {
      a(7),
      b(10);

      public final int c;

      private b(int $$0) {
         this.c = $$0;
      }
   }
}
