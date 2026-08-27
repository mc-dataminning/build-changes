import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dgt extends dgd implements bjs, emh {
   public static final String e = "sherds";
   public static final String f = "item";
   public static final int g = 1;
   public long h;
   @Nullable
   public dgt.b i;
   private dgt.a l;
   private cmh m = cmh.f;
   @Nullable
   protected agt j;
   protected long k;

   public dgt(hv $$0, dip $$1) {
      super(dgf.O, $$0, $$1);
      this.l = dgt.a.a;
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      this.l.a($$0);
      if (!this.d_($$0) && !this.m.b()) {
         $$0.a("item", this.m.b(new sj()));
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.l = dgt.a.b($$0);
      if (!this.c_($$0)) {
         if ($$0.b("item", 10)) {
            this.m = cmh.a($$0.p("item"));
         } else {
            this.m = cmh.f;
         }
      }
   }

   public yv k() {
      return yv.a(this);
   }

   @Override
   public sj ax_() {
      return this.q();
   }

   public ia l() {
      return this.r().c(djf.R);
   }

   public dgt.a m() {
      return this.l;
   }

   public void a(cmh $$0) {
      this.l = dgt.a.b(cka.a($$0));
   }

   public cmh w() {
      return a(this.l);
   }

   public static cmh a(dgt.a $$0) {
      cmh $$1 = cmk.eB.am_();
      sj $$2 = $$0.a(new sj());
      cka.a($$1, dgf.O, $$2);
      return $$1;
   }

   @Nullable
   @Override
   public agt az_() {
      return this.j;
   }

   @Override
   public void a(@Nullable agt $$0) {
      this.j = $$0;
   }

   @Override
   public long aA_() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public cmh x() {
      this.e_(null);
      return this.m;
   }

   @Override
   public cmh c(int $$0) {
      this.e_(null);
      cmh $$1 = this.m.a($$0);
      if (this.m.b()) {
         this.m = cmh.f;
      }

      return $$1;
   }

   @Override
   public void b(cmh $$0) {
      this.e_(null);
      this.m = $$0;
   }

   @Override
   public dgd y() {
      return this;
   }

   public void a(dgt.b $$0) {
      if (this.o != null && !this.o.y_()) {
         this.o.a(this.aB_(), this.r().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dgt.b.values().length) {
         this.h = this.o.W();
         this.i = dgt.b.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static record a(cmc b, cmc c, cmc d, cmc e) {
      public static final dgt.a a = new dgt.a(cmk.qI, cmk.qI, cmk.qI, cmk.qI);

      public sj a(sj $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            sp $$1 = new sp();
            this.a().forEach($$1x -> $$1.add(te.a(kb.h.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<cmc> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dgt.a b(@Nullable sj $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            sp $$1 = $$0.c("sherds", 8);
            return new dgt.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cmc a(sp $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cmk.qI;
         } else {
            tg $$2 = $$0.k($$1);
            return kb.h.a(agt.a($$2.t_()));
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
