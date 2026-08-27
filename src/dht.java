import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dht extends dhd implements bkk, enn {
   public static final String e = "sherds";
   public static final String f = "item";
   public static final int g = 1;
   public long h;
   @Nullable
   public dht.b i;
   private dht.a l;
   private cng m = cng.f;
   @Nullable
   protected ahh j;
   protected long k;

   public dht(hx $$0, djp $$1) {
      super(dhf.O, $$0, $$1);
      this.l = dht.a.a;
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      this.l.a($$0);
      if (!this.d_($$0) && !this.m.b()) {
         $$0.a("item", this.m.b(new so()));
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.l = dht.a.b($$0);
      if (!this.c_($$0)) {
         if ($$0.b("item", 10)) {
            this.m = cng.a($$0.p("item"));
         } else {
            this.m = cng.f;
         }
      }
   }

   public zi k() {
      return zi.a(this);
   }

   @Override
   public so aA_() {
      return this.q();
   }

   public ic l() {
      return this.r().c(dkf.R);
   }

   public dht.a m() {
      return this.l;
   }

   public void a(cng $$0) {
      this.l = dht.a.b(cla.a($$0));
   }

   public cng w() {
      return a(this.l);
   }

   public static cng a(dht.a $$0) {
      cng $$1 = cnj.eB.ao_();
      so $$2 = $$0.a(new so());
      cla.a($$1, dhf.O, $$2);
      return $$1;
   }

   @Nullable
   @Override
   public ahh aC_() {
      return this.j;
   }

   @Override
   public void a(@Nullable ahh $$0) {
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
   public cng x() {
      this.e_(null);
      return this.m;
   }

   @Override
   public cng c(int $$0) {
      this.e_(null);
      cng $$1 = this.m.a($$0);
      if (this.m.b()) {
         this.m = cng.f;
      }

      return $$1;
   }

   @Override
   public void b(cng $$0) {
      this.e_(null);
      this.m = $$0;
   }

   @Override
   public dhd y() {
      return this;
   }

   public void a(dht.b $$0) {
      if (this.o != null && !this.o.y_()) {
         this.o.a(this.aE_(), this.r().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dht.b.values().length) {
         this.h = this.o.X();
         this.i = dht.b.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static record a(cnb b, cnb c, cnb d, cnb e) {
      public static final dht.a a = new dht.a(cnj.qK, cnj.qK, cnj.qK, cnj.qK);

      public so a(so $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            su $$1 = new su();
            this.a().forEach($$1x -> $$1.add(tj.a(kd.h.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<cnb> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dht.a b(@Nullable so $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            su $$1 = $$0.c("sherds", 8);
            return new dht.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cnb a(su $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cnj.qK;
         } else {
            tl $$2 = $$0.k($$1);
            return kd.h.a(ahh.a($$2.t_()));
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
