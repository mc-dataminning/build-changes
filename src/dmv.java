import javax.annotation.Nullable;

public class dmv extends dmf implements boi, etl.a {
   public static final String e = "sherds";
   public static final String f = "item";
   public static final int g = 1;
   public long h;
   @Nullable
   public dmv.a i;
   private dnj l;
   private crj m = crj.i;
   @Nullable
   protected ajt j;
   protected long k;

   public dmv(ib $$0, doz $$1) {
      super(dmh.O, $$0, $$1);
      this.l = dnj.a;
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      this.l.a($$0);
      if (!this.b_($$0) && !this.m.d()) {
         $$0.a("item", this.m.a($$1));
      }
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.l = dnj.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.m = crj.a($$1, (uj)$$0.p("item")).orElse(crj.i);
         } else {
            this.m = crj.i;
         }
      }
   }

   public abf j() {
      return abf.a(this);
   }

   @Override
   public tm a(in.a $$0) {
      return this.d($$0);
   }

   public ih k() {
      return this.n().c(dpp.R);
   }

   public dnj l() {
      return this.l;
   }

   public void b(crj $$0) {
      this.a($$0.a());
   }

   public crj t() {
      crj $$0 = crm.eB.x();
      $$0.a(this.s());
      return $$0;
   }

   public static crj a(dnj $$0) {
      crj $$1 = crm.eB.x();
      $$1.b(jp.P, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public ajt ay_() {
      return this.j;
   }

   @Override
   public void a(@Nullable ajt $$0) {
      this.j = $$0;
   }

   @Override
   public long az_() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public void a(jl.a $$0) {
      $$0.a(jp.P, this.l);
   }

   @Override
   public void a(jl $$0) {
      this.l = $$0.a(jp.P, dnj.a);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      $$0.r("sherds");
   }

   @Override
   public crj f() {
      this.e_(null);
      return this.m;
   }

   @Override
   public crj c(int $$0) {
      this.e_(null);
      crj $$1 = this.m.a($$0);
      if (this.m.d()) {
         this.m = crj.i;
      }

      return $$1;
   }

   @Override
   public void a(crj $$0) {
      this.e_(null);
      this.m = $$0;
   }

   @Override
   public dmf u() {
      return this;
   }

   public void a(dmv.a $$0) {
      if (this.o != null && !this.o.x_()) {
         this.o.a(this.aA_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dmv.a.values().length) {
         this.h = this.o.Y();
         this.i = dmv.a.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static enum a {
      a(7),
      b(10);

      public final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }
}
