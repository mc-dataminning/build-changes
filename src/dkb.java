import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dkb extends djl implements bmt, eqg.a {
   public static final String e = "sherds";
   public static final String f = "item";
   public static final int g = 1;
   public long h;
   @Nullable
   public dkb.b i;
   private dkb.a l;
   private cpq m = cpq.h;
   @Nullable
   protected ajc j;
   protected long k;

   public dkb(ib $$0, dme $$1) {
      super(djn.O, $$0, $$1);
      this.l = dkb.a.a;
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      this.l.a($$0);
      if (!this.b($$0) && !this.m.b()) {
         $$0.a("item", this.m.b(new sy()));
      }
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.l = dkb.a.b($$0);
      if (!this.c_($$0)) {
         if ($$0.b("item", 10)) {
            this.m = cpq.a($$0.p("item"));
         } else {
            this.m = cpq.h;
         }
      }
   }

   public aap j() {
      return aap.a(this);
   }

   @Override
   public sy a(in.a $$0) {
      return this.d($$0);
   }

   public ih k() {
      return this.n().c(dmu.R);
   }

   public dkb.a l() {
      return this.l;
   }

   public void b(cpq $$0) {
      this.l = dkb.a.b(cnl.a($$0));
   }

   public cpq s() {
      return a(this.l);
   }

   public static cpq a(dkb.a $$0) {
      cpq $$1 = cpt.eB.an_();
      sy $$2 = $$0.a(new sy());
      cnl.a($$1, djn.O, $$2);
      return $$1;
   }

   @Nullable
   @Override
   public ajc aB_() {
      return this.j;
   }

   @Override
   public void a(@Nullable ajc $$0) {
      this.j = $$0;
   }

   @Override
   public long aC_() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public cpq f() {
      this.e_(null);
      return this.m;
   }

   @Override
   public cpq c(int $$0) {
      this.e_(null);
      cpq $$1 = this.m.a($$0);
      if (this.m.b()) {
         this.m = cpq.h;
      }

      return $$1;
   }

   @Override
   public void a(cpq $$0) {
      this.e_(null);
      this.m = $$0;
   }

   @Override
   public djl t() {
      return this;
   }

   public void a(dkb.b $$0) {
      if (this.o != null && !this.o.y_()) {
         this.o.a(this.aD_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dkb.b.values().length) {
         this.h = this.o.X();
         this.i = dkb.b.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static record a(cpl b, cpl c, cpl d, cpl e) {
      public static final dkb.a a = new dkb.a(cpt.qK, cpt.qK, cpt.qK, cpt.qK);

      public sy a(sy $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            te $$1 = new te();
            this.a().forEach($$1x -> $$1.add(tt.a(kh.h.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<cpl> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dkb.a b(@Nullable sy $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            te $$1 = $$0.c("sherds", 8);
            return new dkb.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cpl a(te $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cpt.qK;
         } else {
            tv $$2 = $$0.k($$1);
            return kh.h.a(ajc.a($$2.t_()));
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
