import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhl extends dgv implements bki, ene {
   public static final String e = "sherds";
   public static final String f = "item";
   public static final int g = 1;
   public long h;
   @Nullable
   public dhl.b i;
   private dhl.a l;
   private cmy m = cmy.f;
   @Nullable
   protected ahg j;
   protected long k;

   public dhl(hx $$0, djh $$1) {
      super(dgx.O, $$0, $$1);
      this.l = dhl.a.a;
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      this.l.a($$0);
      if (!this.d_($$0) && !this.m.b()) {
         $$0.a("item", this.m.b(new sn()));
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.l = dhl.a.b($$0);
      if (!this.c_($$0)) {
         if ($$0.b("item", 10)) {
            this.m = cmy.a($$0.p("item"));
         } else {
            this.m = cmy.f;
         }
      }
   }

   public zh k() {
      return zh.a(this);
   }

   @Override
   public sn ax_() {
      return this.q();
   }

   public ic l() {
      return this.r().c(djx.R);
   }

   public dhl.a m() {
      return this.l;
   }

   public void a(cmy $$0) {
      this.l = dhl.a.b(ckr.a($$0));
   }

   public cmy w() {
      return a(this.l);
   }

   public static cmy a(dhl.a $$0) {
      cmy $$1 = cnb.eB.am_();
      sn $$2 = $$0.a(new sn());
      ckr.a($$1, dgx.O, $$2);
      return $$1;
   }

   @Nullable
   @Override
   public ahg az_() {
      return this.j;
   }

   @Override
   public void a(@Nullable ahg $$0) {
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
   public cmy x() {
      this.e_(null);
      return this.m;
   }

   @Override
   public cmy c(int $$0) {
      this.e_(null);
      cmy $$1 = this.m.a($$0);
      if (this.m.b()) {
         this.m = cmy.f;
      }

      return $$1;
   }

   @Override
   public void b(cmy $$0) {
      this.e_(null);
      this.m = $$0;
   }

   @Override
   public dgv y() {
      return this;
   }

   public void a(dhl.b $$0) {
      if (this.o != null && !this.o.y_()) {
         this.o.a(this.aB_(), this.r().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dhl.b.values().length) {
         this.h = this.o.X();
         this.i = dhl.b.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static record a(cmt b, cmt c, cmt d, cmt e) {
      public static final dhl.a a = new dhl.a(cnb.qI, cnb.qI, cnb.qI, cnb.qI);

      public sn a(sn $$0) {
         if (this.equals(a)) {
            return $$0;
         } else {
            st $$1 = new st();
            this.a().forEach($$1x -> $$1.add(ti.a(kd.h.b($$1x).toString())));
            $$0.a("sherds", $$1);
            return $$0;
         }
      }

      public Stream<cmt> a() {
         return Stream.of(this.b, this.c, this.d, this.e);
      }

      public static dhl.a b(@Nullable sn $$0) {
         if ($$0 != null && $$0.b("sherds", 9)) {
            st $$1 = $$0.c("sherds", 8);
            return new dhl.a(a($$1, 0), a($$1, 1), a($$1, 2), a($$1, 3));
         } else {
            return a;
         }
      }

      private static cmt a(st $$0, int $$1) {
         if ($$1 >= $$0.size()) {
            return cnb.qI;
         } else {
            tk $$2 = $$0.k($$1);
            return kd.h.a(ahg.a($$2.t_()));
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
