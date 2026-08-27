import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dkw extends dkg implements bnk, erc.a {
   public static final String e = "sherds";
   public static final String f = "item";
   public static final int g = 1;
   public long h;
   @Nullable
   public dkw.b i;
   private dkw.a l;
   private cqk m = cqk.h;
   @Nullable
   protected ajh j;
   protected long k;

   public dkw(ib $$0, dmz $$1) {
      super(dki.O, $$0, $$1);
      this.l = dkw.a.a;
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      this.l.a($$0);
      if (!this.b($$0) && !this.m.b()) {
         $$0.a("item", this.m.b(new ta()));
      }
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.l = dkw.a.b($$0);
      if (!this.c_($$0)) {
         if ($$0.b("item", 10)) {
            this.m = cqk.a($$0.p("item"));
         } else {
            this.m = cqk.h;
         }
      }
   }

   public aat j() {
      return aat.a(this);
   }

   @Override
   public ta a(in.a $$0) {
      return this.d($$0);
   }

   public ih k() {
      return this.n().c(dnp.R);
   }

   public dkw.a l() {
      return this.l;
   }

   public void b(cqk $$0) {
      this.l = dkw.a.b(cof.a($$0));
   }

   public cqk s() {
      return a(this.l);
   }

   public static cqk a(dkw.a $$0) {
      cqk $$1 = cqn.eB.am_();
      ta $$2 = $$0.a(new ta());
      cof.a($$1, dki.O, $$2);
      return $$1;
   }

   @Nullable
   @Override
   public ajh aA_() {
      return this.j;
   }

   @Override
   public void a(@Nullable ajh $$0) {
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
   public cqk f() {
      this.e_(null);
      return this.m;
   }

   @Override
   public cqk c(int $$0) {
      this.e_(null);
      cqk $$1 = this.m.a($$0);
      if (this.m.b()) {
         this.m = cqk.h;
      }

      return $$1;
   }

   @Override
   public void a(cqk $$0) {
      this.e_(null);
      this.m = $$0;
   }

   @Override
   public dkg t() {
      return this;
   }

   public void a(dkw.b $$0) {
      if (this.o != null && !this.o.x_()) {
         this.o.a(this.aC_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dkw.b.values().length) {
         this.h = this.o.X();
         this.i = dkw.b.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static record a(cqf b, cqf c, cqf d, cqf e) {
      public static final dkw.a a = new dkw.a(cqn.qK, cqn.qK, cqn.qK, cqn.qK);

      public ta a(ta $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            tg $$1 = new tg();
            this.a().forEach($$1x -> $$1.add(tv.a(ki.h.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<cqf> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dkw.a b(@Nullable ta $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            tg $$1 = $$0.c("sherds", 8);
            return new dkw.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cqf a(tg $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cqn.qK;
         } else {
            tx $$2 = $$0.k($$1);
            return ki.h.a(ajh.a($$2.s_()));
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
