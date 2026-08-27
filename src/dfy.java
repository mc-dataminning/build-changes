import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dfy extends dfi implements bji, elf {
   public static final String e = "sherds";
   public static final String f = "item";
   public static final int g = 1;
   public long h;
   @Nullable
   public dfy.b i;
   private dfy.a l;
   private clo m = clo.b;
   @Nullable
   protected agm j;
   protected long k;

   public dfy(hx $$0, dhn $$1) {
      super(dfk.O, $$0, $$1);
      this.l = dfy.a.a;
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      this.l.a($$0);
      if (!this.d_($$0) && !this.m.b()) {
         $$0.a("item", this.m.b(new sd()));
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.l = dfy.a.b($$0);
      if (!this.c_($$0)) {
         if ($$0.b("item", 10)) {
            this.m = clo.a($$0.p("item"));
         } else {
            this.m = clo.b;
         }
      }
   }

   public yo k() {
      return yo.a(this);
   }

   @Override
   public sd ay_() {
      return this.q();
   }

   public ib l() {
      return this.r().c(did.R);
   }

   public dfy.a m() {
      return this.l;
   }

   public void a(clo $$0) {
      this.l = dfy.a.b(cjh.a($$0));
   }

   public clo w() {
      return a(this.l);
   }

   public static clo a(dfy.a $$0) {
      clo $$1 = clr.eB.an_();
      sd $$2 = $$0.a(new sd());
      cjh.a($$1, dfk.O, $$2);
      return $$1;
   }

   @Nullable
   @Override
   public agm aA_() {
      return this.j;
   }

   @Override
   public void a(@Nullable agm $$0) {
      this.j = $$0;
   }

   @Override
   public long aB_() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public clo x() {
      this.e_(null);
      return this.m;
   }

   @Override
   public clo c(int $$0) {
      this.e_(null);
      clo $$1 = this.m.a($$0);
      if (this.m.b()) {
         this.m = clo.b;
      }

      return $$1;
   }

   @Override
   public void b(clo $$0) {
      this.e_(null);
      this.m = $$0;
   }

   @Override
   public dfi y() {
      return this;
   }

   public void a(dfy.b $$0) {
      if (this.o != null && !this.o.y_()) {
         this.o.a(this.aC_(), this.r().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dfy.b.values().length) {
         this.h = this.o.W();
         this.i = dfy.b.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static record a(clj b, clj c, clj d, clj e) {
      public static final dfy.a a = new dfy.a(clr.qI, clr.qI, clr.qI, clr.qI);

      public sd a(sd $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            sj $$1 = new sj();
            this.a().forEach($$1x -> $$1.add(sy.a(kc.i.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<clj> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dfy.a b(@Nullable sd $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            sj $$1 = $$0.c("sherds", 8);
            return new dfy.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static clj a(sj $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return clr.qI;
         } else {
            ta $$2 = $$0.k($$1);
            return kc.i.a(agm.a($$2.t_()));
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
