import java.util.stream.Stream;
import javax.annotation.Nullable;

public class djn extends dix implements bme, epk {
   public static final String e = "sherds";
   public static final String f = "item";
   public static final int g = 1;
   public long h;
   @Nullable
   public djn.b i;
   private djn.a l;
   private cpd m = cpd.h;
   @Nullable
   protected aiy j;
   protected long k;

   public djn(hz $$0, dlj $$1) {
      super(diz.O, $$0, $$1);
      this.l = djn.a.a;
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
      this.l = djn.a.b($$0);
      if (!this.c_($$0)) {
         if ($$0.b("item", 10)) {
            this.m = cpd.a($$0.p("item"));
         } else {
            this.m = cpd.h;
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
      return this.r().c(dlz.R);
   }

   public djn.a m() {
      return this.l;
   }

   public void a(cpd $$0) {
      this.l = djn.a.b(cmw.a($$0));
   }

   public cpd w() {
      return a(this.l);
   }

   public static cpd a(djn.a $$0) {
      cpd $$1 = cpg.eB.ao_();
      sw $$2 = $$0.a(new sw());
      cmw.a($$1, diz.O, $$2);
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
   public cpd x() {
      this.e_(null);
      return this.m;
   }

   @Override
   public cpd c(int $$0) {
      this.e_(null);
      cpd $$1 = this.m.a($$0);
      if (this.m.b()) {
         this.m = cpd.h;
      }

      return $$1;
   }

   @Override
   public void b(cpd $$0) {
      this.e_(null);
      this.m = $$0;
   }

   @Override
   public dix y() {
      return this;
   }

   public void a(djn.b $$0) {
      if (this.o != null && !this.o.y_()) {
         this.o.a(this.aE_(), this.r().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < djn.b.values().length) {
         this.h = this.o.X();
         this.i = djn.b.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static record a(coy b, coy c, coy d, coy e) {
      public static final djn.a a = new djn.a(cpg.qK, cpg.qK, cpg.qK, cpg.qK);

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

      public Stream<coy> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static djn.a b(@Nullable sw $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            tc $$1 = $$0.c("sherds", 8);
            return new djn.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static coy a(tc $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cpg.qK;
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
